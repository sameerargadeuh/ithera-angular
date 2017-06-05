import {NgModule} from '@angular/core';
import { EducationModulesComponent } from './education-modules.component';
import { EducationModulesService } from './education-modules.service';
import {CommonModule} from '@angular/common';

import {EducationModulesRoutingModule} from './education-modules-routing.module';

@NgModule({
  declarations: [EducationModulesComponent],
  providers: [EducationModulesService],
  imports: [CommonModule, EducationModulesRoutingModule]
})
export default class EducationModulesModule {
}
