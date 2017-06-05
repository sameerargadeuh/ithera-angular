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
 constructor(private _route: ActivatedRoute,
              private _router: Router,
              private educationModulesService: EducationModulesService) {
  }
 ngOnInit() {
 this.paramSub = this._route.params.subscribe(params => {


      this.view = params['view'];
      console.log('value for view' + this.view);
      this.educationModulesService.getHomeModules(this.view).subscribe(
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
    this.paramSub.unsubscribe();
  }
}
