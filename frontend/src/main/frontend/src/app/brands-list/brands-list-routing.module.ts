import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { BrandsListComponent } from './brands-list.component';
import { AuthenticatedGuard } from '../shared/guards/authenticated.guard';


export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    component: BrandsListComponent,
    canActivate: [AuthenticatedGuard]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class BrandsListRoutingModule {
}
