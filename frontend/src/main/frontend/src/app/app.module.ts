import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';

import {AppRoutingModule} from './app-routing.module';

import { SwiperDemoModule } from './swiper-demo/swiper-demo.module';
import {HeaderComponent} from './shared/header/header.component';
import {TopNavComponent} from './shared/top-navigation/top-navigation.component';
import {NavbarComponent} from './shared/navigation/navbar.component';
import {LoginModule} from './login/login.module';
import {AuthService} from './shared/auth/auth.service';
import {AuthenticatedGuard} from './shared/guards/authenticated.guard';
import {UnauthenticatedGuard} from './shared/guards/unauthenticated.guard';
import {HomeComponent} from './home/home.component';
@NgModule({
  declarations: [
    AppComponent, HeaderComponent, TopNavComponent,NavbarComponent,HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    SwiperDemoModule,
    LoginModule
  ],
  providers: [AuthService, AuthenticatedGuard,
        UnauthenticatedGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
