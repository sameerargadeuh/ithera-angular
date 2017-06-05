  import {Component} from '@angular/core';
import {AuthService} from '../auth/auth.service';
import {FormBuilder, Validators, FormGroup} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'ithera-topnav',
  templateUrl: './top-navigation.component.html'
})
export class TopNavComponent {

  // loginForm: FormGroup;
  // searchForm: FormGroup;
  message: string = '';

  constructor(private _authService: AuthService,
              private _router: Router,
              private _formBuilder: FormBuilder) {
    // this.loginForm = _formBuilder.group({
    //   'username': ['', Validators.required],
    //   'password': ['', Validators.required]
    // });

    // this.searchForm = _formBuilder.group({
    //   'searchStr': ['', Validators.required]
    // });

  }

  // login() {
  //   console.log(this.loginForm.valueOf());
  //   this._authService
  //     .authenticate(this.loginForm.value.username, this.loginForm.value.password)
  //     .catch(errorMessage => this.message = errorMessage)
  //     .then(() => {
  //       if (this._authService.isAuthenticated()) {
  //         this._router.navigate(['/members']);
  //       }
  //     });
  // }

  // search() {
  //   //need to change the logic for search this._router.navigate(['/searchresults', {searchStr: this.searchForm.value.searchStr}])
  // }

  // logout() {
  //   //this._authService.logout();
  //   // this._router.navigate(['/home']);
  // }

}
