import {Component, OnInit, OnDestroy} from '@angular/core';
import { Module } from '../shared/model/module.model';
import {Subscription} from 'rxjs';
import {ManagerConsoleModel} from './manager-console.model';
import {ManagerConsoleService} from './manager-console.service';
import {AuthService} from '../shared/auth/auth.service';

@Component({
    selector: 'managerconsole',
    templateUrl: './manager-console.component.html'
})

export class ManagerConsoleComponent implements OnInit, OnDestroy  {

    paramSub: Subscription;
  accountStores:  ManagerConsoleModel[];
  userID: string;
  

  constructor(  private managerConsoleService: ManagerConsoleService,
                private _authService: AuthService) {
  }

     ngOnInit() {

         this.userID = this._authService.getUserData().user_ID;

     this.managerConsoleService.getAccountStorebyUserID(this.userID).subscribe(
          accountStores => {
            this.accountStores = accountStores;
            console.log("inside this.managerConsoleComponent.ManagerConsoleService.getAccountStorebyUserID()");
            console.log(accountStores);

          },
          err => {
            console.log(err);
          });

    this.managerConsoleService.getUserCourseStats(this.userID).subscribe(
          accountStores => {
            this.accountStores = accountStores;
            console.log("inside this.managerConsoleComponent.ManagerConsoleService.getUserCourseStats()");
            console.log(accountStores);

          },
          err => {
            console.log(err);
          });


  }
 ngOnDestroy() {
   // this.paramSub.unsubscribe();
  }

}

