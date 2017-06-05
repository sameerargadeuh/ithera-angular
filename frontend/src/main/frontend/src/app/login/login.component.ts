import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {AuthService} from '../shared/auth/auth.service';
import {FormBuilder, Validators, FormGroup} from '@angular/forms';

console.log('`Login` component loaded asynchronously');

@Component({
  selector: 'login',
  templateUrl: './login.component.html'
})
export class LoginComponent implements OnInit {

  username = 'admin';
  password = 'xxxxxx';
  message = '';

  private loginForm: FormGroup;

  constructor(private _authService: AuthService,
              private _router: Router,
              private _formBuilder: FormBuilder) {
    this.loginForm = _formBuilder.group({
      'username': ['', Validators.required],
      'password': ['', Validators.required]
    });
  }

  login() {
    console.log('login call executed');
    this._authService
      .authenticate(this.loginForm.value.username, this.loginForm.value.password)
      .catch(errorMessage => this.message = errorMessage)
      .then(() => {
        if (this._authService.isAuthenticated()) {
          this._router.navigate(['/educationmodules, {view:Featured}']);
        }
      });

  }

   myAutologin() {
    this._authService
      .authenticate('tabish@unityhealth.com.au', 'password')
      .catch(errorMessage => this.message = errorMessage)
      .then(() => {
        if (this._authService.isAuthenticated()) {
          this._router.navigate(['/educationmodules']);
        }
      });

  }

  ngOnInit(): any {
   // this.myAutologin();
  }

}
