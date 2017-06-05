import {NgModule} from '@angular/core';
import { BrandsListComponent } from './brands-list.component';
import { EducationModulesService } from '../education-modules/education-modules.service';
import {CommonModule} from '@angular/common';

import {BrandsListRoutingModule} from './brands-list-routing.module';

@NgModule({
  declarations: [BrandsListComponent],
  providers: [EducationModulesService],
  imports: [CommonModule, BrandsListRoutingModule]
})
export default class BrandsListModule {
}
