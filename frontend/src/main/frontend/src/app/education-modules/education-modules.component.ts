import {Component, OnInit, OnDestroy} from '@angular/core';
//import {FormBuilder} from '@angular/forms';
import {Router, ActivatedRoute} from '@angular/router';
import { Module } from '../shared/model/module.model';
// import {PatientInformation} from '../patient-information-list/model/patient-information.model';
// import {PatientInformationDetailsService} from './service/patient-information-details.service';
import {Subscription} from 'rxjs';
import { EducationModulesService } from './education-modules.service';
@Component({
  selector: 'educationmodules',
  templateUrl: './education-modules.component.html'
})
export class EducationModulesComponent implements OnInit, OnDestroy {
 paramSub: Subscription;
 modules: Module[];
 view:string;
 brandId:string;
 categoryId:string;
 constructor(private _route: ActivatedRoute,
              private _router: Router,
              private educationModulesService: EducationModulesService) {
  }
 ngOnInit() {
 this.paramSub = this._route.params.subscribe(params => {


      this.view = params['view'];
      this.brandId = params['brandId'];
      this.categoryId = params['categoryId'];
      console.log('value for view' + this.view);
       console.log('value for brandId' + this.brandId);
        console.log('value for brandId' + this.categoryId);
      this.educationModulesService.getHomeModules(this.view,this.brandId,this.categoryId).subscribe(
          modules => {
            this.modules = modules;
            console.log("inside this.educationModulesService.getHomeModules()");
            console.log(modules[1].vimage);

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
