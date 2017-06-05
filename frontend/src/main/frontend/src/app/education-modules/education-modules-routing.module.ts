import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { EducationModulesComponent } from './education-modules.component';
import { AuthenticatedGuard } from '../shared/guards/authenticated.guard';


export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    component: EducationModulesComponent,
    canActivate: [AuthenticatedGuard]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class EducationModulesRoutingModule {
}
