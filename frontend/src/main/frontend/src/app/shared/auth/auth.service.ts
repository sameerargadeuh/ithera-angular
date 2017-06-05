import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {LocalStorage} from 'ng2-webstorage';

import {Scheduler, Subscription} from 'rxjs';

@Injectable()
export class AuthService {

  private authenticated: boolean = false;
  private tokenExpirationDate: Date = null;
  private userData: any = null;

  @LocalStorage()
  private tokenData: Oauth2TokenData;

  private refreshSub: Subscription;

  public static decodeAccessToken(access_token: string) {
    return JSON.parse(window.atob(access_token.split('.')[1]));
  }

  constructor(public http: Http) {
    if (this.tokenData && this.tokenData.access_token) {
      this.authenticated = true;
      this.userData = AuthService.decodeAccessToken(this.tokenData.access_token);
      this.tokenExpirationDate = new Date(this.userData.exp * 1000);
      if (this.authenticated && this.tokenExpirationDate < new Date()) {
        console.log('Session timeout');
        this.logout();
      } else {
       // this.scheduleTokenRefresh();
      }
    }
  }

  public isAuthenticated(): boolean {
    this.checkTokenExpirationDate();
    return this.authenticated;
  }

  public authenticate(username: string, password: string): Promise<string> {

    console.log('Authentication pending...');

    return new Promise<string>((resolve, reject) => {

      if (!username.trim()) {
        reject('Username cannot be blank');
      }
      if (!password.trim()) {
        reject('Password cannot be blank');
      }

      var basicAuthHeader = btoa(`acme:acmesecret`);

      var headers = new Headers();
      headers.append('Authorization', `Basic  ${basicAuthHeader}`);
      headers.append('Accept', `application/json`);
      headers.append('Content-Type', `application/x-www-form-urlencoded`);

      var data = 'username=' + encodeURIComponent(username) + '&password='
        + encodeURIComponent(password) + '&grant_type=password';

      this.http
        .post('/oauth/token', data, {headers: headers})
        .subscribe(
          data => {
            this.tokenData = data.json();
            this.authenticated = true;
            this.userData = AuthService.decodeAccessToken(this.tokenData.access_token);
            console.log(this.userData);
            this.tokenExpirationDate = new Date(this.userData.exp * 1000);
            //this.scheduleTokenRefresh();
            resolve('OK');
          },
          err => {
            console.log(err);
            reject('Username and password doesn\'t match');
          }
        );

    });
  }

  private scheduleTokenRefresh() {
    let now: number = new Date().valueOf();
    let delay: number = ((this.userData.exp * 1000) - now) - 1000;

    console.log('Calculated delay is: ' + delay);

    if (this.refreshSub && !this.refreshSub.closed) {
      this.refreshSub.unsubscribe();
    }

    this.refreshSub = Scheduler.async.schedule(() => {
      console.log('Refreshing token...');
      this.refreshToken();
    }, delay);

    //this.tokenData.expires_in
  }

  public refreshToken() {
    if (this.isAuthenticated()) {

      var basicAuthHeader = btoa(`acme:acmesecret`);

      var headers = new Headers();
      headers.append('Authorization', `Basic  ${basicAuthHeader}`);
      headers.append('Accept', `application/json`);
      headers.append('Content-Type', `application/x-www-form-urlencoded`);

      var data = 'grant_type=refresh_token&refresh_token=' + encodeURIComponent(this.tokenData.refresh_token);

      this.http
        .post('/oauth/token', data, {headers: headers})
        .subscribe(
          data => {
            this.tokenData = data.json();
            this.authenticated = true;
            this.userData = AuthService.decodeAccessToken(this.tokenData.access_token);
            this.tokenExpirationDate = new Date(this.userData.exp * 1000);
            //this.scheduleTokenRefresh();
          },
          err => {
            console.log(err);
          }
        );
    }
  }

  public logout(): any {
    if (this.refreshSub && !this.refreshSub.closed) {
      this.refreshSub.unsubscribe();
    }
    this.tokenData = new Oauth2TokenData();
    this.userData = null;
    this.authenticated = false;
    this.tokenExpirationDate = null;
  }

  public getUserData(): any {
    return this.userData;
  }

  public getTokenExpirationDate(): Date {
    return this.tokenExpirationDate;
  }

  public hasRole(role: string): boolean {
    if (this.isAuthenticated()) {
      return this.getUserData()['authorities'].indexOf(role) >= 0;
    }
    return false;
  }

  public hasAnyRole(roles: string[]): boolean {
    var ok = false;
    roles.forEach(role => {
      if (this.hasRole(role)) {
        ok = true;
      }
    });
    return ok;
  }

  // public canView(view: AppMenuItem): boolean {
  //   var ok = false;
  //   if (!view.roles) {
  //     ok = true;
  //   } else {
  //     ok = this.hasAnyRole(view.roles);
  //   }
  //   return ok;
  // }

  public getAuthorizationHeaders(): Headers {
    var authorizationHeaders = new Headers();
    if (this.authenticated) {
      authorizationHeaders.append('Authorization', `Bearer ${this.tokenData.access_token}`);
    }
    return authorizationHeaders;
  }

  private checkTokenExpirationDate() {
    if (this.authenticated && this.tokenExpirationDate < new Date()) {
      console.log('Session timeout');
      this.logout();
    }
  }

  private fetchUserData() {
    this.http.get('/api/user', {headers: this.getAuthorizationHeaders()})
      .subscribe(
        data => {
          this.userData = data.json();
        },
        err => this.authenticated = false
      );
  }

}

class Oauth2TokenData {
  access_token: string = null;
  token_type: string = null;
  expires_in: number = null;
  scope: string = null;
  jti: string = null;
  refresh_token: string = null;

  constructor() {
  }
}
