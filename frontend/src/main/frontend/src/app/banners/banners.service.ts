import { Injectable } from '@angular/core';
import { Http, Response, URLSearchParams } from '@angular/http';
import { BaseService } from '../shared/service/base.service';
import { AuthService } from '../shared/auth/auth.service';
import { Banner } from './banner.model';
import { Observable } from 'rxjs';

@Injectable()
export class BannersService extends BaseService<Banner> {
  constructor(_authService: AuthService,
    _http: Http) {
    super('/api/slideshow', _authService, _http);
  }
   getBanners(): Observable<Banner[]> {
        let params: URLSearchParams = new URLSearchParams();
        return this._http.get(this._baseUrl + '/getBanners', {
      headers: this._authService.getAuthorizationHeaders(),
      search: params
    })
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }
   }


