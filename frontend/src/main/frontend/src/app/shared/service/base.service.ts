import {AuthService} from '../../shared/auth/auth.service';
import {Observable} from 'rxjs';
import {Http, Response} from '@angular/http';

export abstract class BaseService<T> {

  constructor(protected _baseUrl: string,
              protected _authService: AuthService,
              protected _http: Http) {
  }

  findAll(): Observable<T[]> {
    return this._http.get(this._baseUrl, {headers: this._authService.getAuthorizationHeaders()})
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  findOne(id: any): Observable<T> {
    let requestUrl = this._baseUrl + '/' + id;
    return this._http.get(requestUrl, {headers: this._authService.getAuthorizationHeaders()})
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

}
