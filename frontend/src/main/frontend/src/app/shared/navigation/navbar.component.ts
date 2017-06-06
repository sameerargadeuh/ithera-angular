import {Component} from '@angular/core';
import {AuthService} from '../auth/auth.service';



@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html'
})
export class NavbarComponent {
  
  constructor(private _authService: AuthService, ) {

              
              
          }
            
            
}
