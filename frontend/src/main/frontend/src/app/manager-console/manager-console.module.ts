import {NgModule} from '@angular/core';
import { ManagerConsoleComponent } from './manager-console.component';
import {CommonModule} from '@angular/common';

import {ManagerConsoleRoutingModule} from './manager-console-routing.module';


@NgModule({
  declarations: [ManagerConsoleComponent],
  imports: [CommonModule, ManagerConsoleRoutingModule]
})
export default class ManagerConsoleModule {
}
