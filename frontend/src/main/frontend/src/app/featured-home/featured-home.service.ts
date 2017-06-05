import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {BaseService} from '../shared/service/base.service';
import {AuthService} from '../shared/auth/auth.service';
import { Module } from '../shared/model/module.model';
import {Observable} from 'rxjs';
@Injectable()
export class FeaturedHomeService extends BaseService<Module> {

  constructor(_authService: AuthService,
              _http: Http) {
    super('/api/modules', _authService, _http);
  }

  getHomeModules(): Observable<Module[]> {
    let params: URLSearchParams = new URLSearchParams();


    //params.set('piId', piId);


    return this._http.get(this._baseUrl + '/getHomeFeaturedModules', {
      headers: this._authService.getAuthorizationHeaders(),
      search: params
    })
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

}
