import {NgModule} from '@angular/core';
import { CategoriesListComponent } from './category-list.component';
import { EducationModulesService } from '../education-modules/education-modules.service';
import {CommonModule} from '@angular/common';

import {CategoriesListRoutingModule} from './category-list-routing.module';

@NgModule({
  declarations: [CategoriesListComponent],
  providers: [EducationModulesService],
  imports: [CommonModule, CategoriesListRoutingModule]
})
export default class CategoriesListModule {
}
