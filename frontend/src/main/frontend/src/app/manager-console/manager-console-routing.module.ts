import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { ManagerConsoleComponent } from './manager-console.component';
import { AuthenticatedGuard } from '../shared/guards/authenticated.guard';


export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    component: ManagerConsoleComponent,
    canActivate: [AuthenticatedGuard]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class ManagerConsoleRoutingModule {
}
