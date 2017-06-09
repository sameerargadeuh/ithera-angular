import {NgModule} from '@angular/core';
import { FeaturedHomeComponent } from './featured-home.component';
import { FeaturedHomeService } from './featured-home.service';
import {CommonModule} from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { SwiperModule } from '../../../node_modules/angular2-useful-swiper';
//import {FeaturedHomeRoutingModule} from './featured-home-routing.module';

@NgModule({
  declarations: [FeaturedHomeComponent],
  providers: [FeaturedHomeService],
  imports: [CommonModule,BrowserModule,// FeaturedHomeRoutingModule,
  SwiperModule],
  exports: [FeaturedHomeComponent]
})
export  class FeaturedHomeModule {
}
