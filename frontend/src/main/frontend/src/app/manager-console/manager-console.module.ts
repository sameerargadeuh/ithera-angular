import {NgModule} from '@angular/core';
import { ManagerConsoleComponent } from './manager-console.component';
import {CommonModule} from '@angular/common';

import {ManagerConsoleRoutingModule} from './manager-console-routing.module';
import {ManagerConsoleService} from './manager-console.service';


@NgModule({
  declarations: [ManagerConsoleComponent],
  providers: [ManagerConsoleService],
  imports: [CommonModule, ManagerConsoleRoutingModule]
})
export default class ManagerConsoleModule {
}
