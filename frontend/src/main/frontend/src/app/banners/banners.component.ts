import {Component, OnInit, OnDestroy} from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';
import { Banner } from './banner.model';
import {Subscription} from 'rxjs';
import { BannersService } from './banners.service';
@Component({
  selector: 'banners',
  templateUrl: './banners.component.html'
})
export class BannersComponent implements OnInit, OnDestroy {
 paramSub: Subscription;
 banners: Banner[];
 view:string;
 brandId:string;
 categoryId:string;
 constructor(private _route: ActivatedRoute,
              private _router: Router,
              private bannersService: BannersService) {
  }

   ngOnInit() {
 this.paramSub = this._route.params.subscribe(params => {


      // this.view = params['view'];
      // this.brandId = params['brandId'];
      // this.categoryId = params['categoryId'];
      // console.log('value for view' + this.view);
      //  console.log('value for brandId' + this.brandId);
      //   console.log('value for brandId' + this.categoryId);
      this.bannersService.getBanners().subscribe(
          banners => {
            this.banners = banners;
            console.log("inside this.bannersService.getBanners()");
            console.log(banners[1].vImage);

          },
          err => {
            console.log(err);
          });
 });

 }

   ngOnDestroy() {
   // this.paramSub.unsubscribe();
  }
}
