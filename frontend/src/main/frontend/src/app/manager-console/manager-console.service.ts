import { Injectable } from '@angular/core';
import { Http, Response, URLSearchParams } from '@angular/http';
import { BaseService } from '../shared/service/base.service';
import { AuthService } from '../shared/auth/auth.service';
import { Module } from '../shared/model/module.model';
import { Observable } from 'rxjs';
import { ManagerConsoleModel } from '../manager-console/manager-console.model';
@Injectable()
export class ManagerConsoleService extends BaseService<Module> {

  constructor(_authService: AuthService,
    _http: Http) {
    super('/api', _authService, _http);
  }

  getAccountStorebyUserID(userID :string):Observable<ManagerConsoleModel[]>{
    let params: URLSearchParams = new URLSearchParams();
      
    if (userID !== undefined) {
      params.set('userID', userID);
    } else {
      params.set('userID', '');
    }

    return this._http.get(this._baseUrl + '/accountStores/getAccountStorebyUserID', {
      headers: this._authService.getAuthorizationHeaders(),
      search: params
    })
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }


 getUserCourseStats(userID :string):Observable<ManagerConsoleModel[]>{
    let params: URLSearchParams = new URLSearchParams();
      
    if (userID !== undefined) {
      params.set('userID', userID);
    } else {
      params.set('userID', '');
    }

    return this._http.get(this._baseUrl + '/reports/getUserCourseStats', {
      headers: this._authService.getAuthorizationHeaders(),
      search: params
    })
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }


}
