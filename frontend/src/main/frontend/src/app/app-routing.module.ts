import {Routes, RouterModule} from '@angular/router';
// import {NotFound} from './not-found';
//import {AuthenticatedGuard, UnauthenticatedGuard} from './shared/guards';
import {LoginComponent} from './login/login.component';
import {NgModule} from '@angular/core';
import {HomeComponent} from './home/home.component';
// import {Home} from './home/home.component';
// import {Members} from './members/members.component';

export const routes: Routes = [
  {
    path: '',
    pathMatch: 'prefix',
    redirectTo: 'home'
  },
  {
    path: 'home',
    pathMatch: 'prefix',
    component: HomeComponent
  //  canActivate: [AuthenticatedGuard]
  },
  {
    path: 'login',
    pathMatch: 'prefix',
    component: LoginComponent
    //canActivate: [UnauthenticatedGuard]
  },
//   {
//     path: 'members',
//     pathMatch: 'prefix',
//     //component: Members,
//     //canActivate: [AuthenticatedGuard]
//   },
//   {
//     path: 'about',
//     pathMatch: 'prefix',
//     loadChildren: 'app/about/about.module',
//   },
//   {
//     path: 'newsdetails',
//     pathMatch: 'prefix',
//    // loadChildren: 'app/news-details/news-details.module'
//   },
//   {
//     path: 'newslist',
//     pathMatch: 'prefix',
//   //  loadChildren: 'app/news-list/news-list.module'
//   },
//   {
//     path: 'product',
//     pathMatch: 'prefix',
//    // loadChildren: 'app/product/product.module'
//   },
//   {
//     path: 'productdirectory',
//     pathMatch: 'prefix',
//   //  loadChildren: 'app/product-directory/product-directory.module'
//   },
//   {
//     path: 'productlist',
//     pathMatch: 'full',
//    // loadChildren: 'app/product-list/product-list.module'
//   },
//   {
//     path: 'productdetail',
//     pathMatch: 'full',
//   //  loadChildren: 'app/product-details/product-details.module'
//   },
//   {
//     path: 'patientinformation',
//     pathMatch: 'prefix',
//   //  loadChildren: 'app/patient-information/patient-information.module'
//   },
//   {
//     path: 'patientinformationlist',
//     pathMatch: 'prefix',
//  //   loadChildren: 'app/patient-information-list/patient-information-list.module'
//   },
//   {
//     path: 'patientinformationdetails',
//     pathMatch: 'prefix',
//   //  loadChildren: 'app/patient-information-details/patient-information-details.module'
//   },
//   {
//     path: 'searchresults',
//     pathMatch: 'full',
//  //   loadChildren: 'app/search-results/search-results.module'
//   },
//   {
//     path: 'interactions',
//     pathMatch: 'prefix',
//  //   loadChildren: 'app/interactions/interactions.module'
//   },
//   {
//     path: 'research',
//     pathMatch: 'prefix',
// //    loadChildren: 'app/research/research-db.module'
//   },
//   {
//     path: 'researchdblist',
//     pathMatch: 'prefix',
//  //   loadChildren: 'app/research-list/research-db-list.module'
//   },
//   {
//     path: 'researchdbdetails',
//     pathMatch: 'prefix',
//  //   loadChildren: 'app/research-details/research-db-details.module'
//   },
//   {
//     path: 'privacy',
//     pathMatch: 'prefix',
//  //   loadChildren: 'app/privacy/privacy.module',
//   },
//   {
//     path: 'disclaimer',
//     pathMatch: 'prefix',
//  //   loadChildren: 'app/disclaimer/disclaimer.module',
//   },
//   {
//     path: 'contactus',
//     pathMatch: 'prefix',
//   //  loadChildren: 'app/contact-us/contact-us.module'
//   },
//   {
//     path: 'accessDenied',
//     pathMatch: 'prefix',
//  //   loadChildren: 'app/access-denied/access-denied.module'
//   },
//   {
//     path: '404',
//     pathMatch: 'prefix',
//    // component: NotFound
//   },
//   {
//     path: '**',
//     pathMatch: 'prefix',
//     redirectTo: '404'
//   },

   {
    path: 'educationmodules',
    pathMatch: 'prefix',
    loadChildren: 'app/education-modules/education-modules.module',
  },
  {
    path: 'categorylist',
    pathMatch: 'prefix',
    loadChildren: 'app/category-list/category-list.module',
  },
   {
    path: 'brandslist',
    pathMatch: 'prefix',
    loadChildren: 'app/brands-list/brands-list.module',
  },
  {
    path: 'managerconsole',
    pathMatch: 'prefix',
   loadChildren: 'app/manager-console/manager-console.module',
    },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule {
}
