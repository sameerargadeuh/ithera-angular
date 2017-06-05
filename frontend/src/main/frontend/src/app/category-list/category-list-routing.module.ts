import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CategoriesListComponent } from './category-list.component';
import { AuthenticatedGuard } from '../shared/guards/authenticated.guard';


export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    component: CategoriesListComponent,
    canActivate: [AuthenticatedGuard]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class CategoriesListRoutingModule {
}
