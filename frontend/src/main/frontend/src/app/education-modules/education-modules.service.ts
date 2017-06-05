import { Injectable } from '@angular/core';
import { Http, Response, URLSearchParams } from '@angular/http';
import { BaseService } from '../shared/service/base.service';
import { AuthService } from '../shared/auth/auth.service';
import { Module } from '../shared/model/module.model';
import { Observable } from 'rxjs';
import { Brand } from '../brands-list/brands.model';
import { CategoryListModel } from '../category-list/category-list.model';
@Injectable()
export class EducationModulesService extends BaseService<Module> {

  constructor(_authService: AuthService,
    _http: Http) {
    super('/api/modules', _authService, _http);
  }

  getHomeModules(view: string): Observable<Module[]> {
    let params: URLSearchParams = new URLSearchParams();

    if (view !== undefined) {
      params.set('view', view);
    } else {
      params.set('view', 'Featured');
    }


    return this._http.get(this._baseUrl + '/getHomeFeaturedModules', {
      headers: this._authService.getAuthorizationHeaders(),
      search: params
    })
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  getBrandsList():Observable<Brand[]> {
      let params: URLSearchParams = new URLSearchParams();
    return this._http.get(this._baseUrl + '/getAllBrands', {
      headers: this._authService.getAuthorizationHeaders(),
      search: params
    })
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

  getCategoryList():Observable<CategoryListModel[]> {
      let params: URLSearchParams = new URLSearchParams();
    return this._http.get(this._baseUrl + '/getAllCategories', {
      headers: this._authService.getAuthorizationHeaders(),
      search: params
    })
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }

}
