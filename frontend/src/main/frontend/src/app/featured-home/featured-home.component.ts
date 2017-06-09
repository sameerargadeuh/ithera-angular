import { Component, OnInit, OnDestroy } from '@angular/core';
//import {FormBuilder} from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import { Module } from '../shared/model/module.model';
// import {PatientInformation} from '../patient-information-list/model/patient-information.model';
// import {PatientInformationDetailsService} from './service/patient-information-details.service';
import { Subscription } from 'rxjs';
import { FeaturedHomeService } from './featured-home.service';
@Component({
  selector: 'featuredhomemodules',
  templateUrl: './featured-home.component.html'
})
export class FeaturedHomeComponent implements OnInit, OnDestroy {
  paramSub: Subscription;
  modules: Module[];
  config: any = {
    pagination: '.swiper-pagination',
    paginationClickable: true,
    nextButton: '.swiper-button-next',
    prevButton: '.swiper-button-prev',
    slidesPerView: 4,
    slidesPerColumn: 2,
    spaceBetween: 30

  };

  constructor(private _route: ActivatedRoute,
    private _router: Router,
    private featuredHomeService: FeaturedHomeService) {
  }
  ngOnInit() {
    this.featuredHomeService.getHomeModules().subscribe(
      modules => {
        this.modules = modules;
        console.log("inside this.featuredHomeService.getHomeModules()");
        console.log(modules[1].vimage);

      },
      err => {
        console.log(err);
      });


  }

  ngOnDestroy() {
    //this.paramSub.unsubscribe();
  }
}
