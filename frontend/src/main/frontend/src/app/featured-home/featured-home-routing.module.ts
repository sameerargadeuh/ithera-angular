import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { FeaturedHomeComponent } from './featured-home.component';
import { AuthenticatedGuard } from '../shared/guards/authenticated.guard';


export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    component: FeaturedHomeComponent,
    canActivate: [AuthenticatedGuard]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class FeaturedHomeRoutingModule {
}
