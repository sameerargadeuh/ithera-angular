import {NgModule} from '@angular/core';
import {SwiperDemoComponent} from './swiper-demo.component';
import {CommonModule} from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { SwiperModule } from '../../../node_modules/angular2-useful-swiper';
@NgModule({
  declarations: [SwiperDemoComponent],
  imports: [CommonModule,BrowserModule,SwiperModule],
  exports: [SwiperDemoComponent]
 })
export class SwiperDemoModule {
}

