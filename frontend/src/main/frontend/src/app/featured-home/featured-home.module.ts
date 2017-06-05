import {NgModule} from '@angular/core';
import { FeaturedHomeComponent } from './featured-home.component';
import { FeaturedHomeService } from './featured-home.service';
import {CommonModule} from '@angular/common';

import {FeaturedHomeRoutingModule} from './featured-home-routing.module';

@NgModule({
  declarations: [FeaturedHomeComponent],
  providers: [FeaturedHomeService],
  imports: [CommonModule, FeaturedHomeRoutingModule]
})
export default class FeaturedHomeModule {
}
