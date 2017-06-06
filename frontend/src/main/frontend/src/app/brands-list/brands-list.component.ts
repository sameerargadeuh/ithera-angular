import {Component, OnInit, OnDestroy} from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';
import {Subscription} from 'rxjs';
import { EducationModulesService } from '../education-modules/education-modules.service';
import { Brand } from './brands.model';
@Component({
  selector: 'brandslist',
  templateUrl: './brands-list.component.html'
})
export class BrandsListComponent implements OnInit, OnDestroy {
  paramSub: Subscription;
  brands:  Brand[];
  constructor(private _route: ActivatedRoute,
              private _router: Router,
              private educationModulesService: EducationModulesService) {
  }
  ngOnInit() {
     this.educationModulesService.getBrandsList().subscribe(
          brands => {
            this.brands = brands;
            console.log("inside this.BrandsListComponent.getBrandsList()");
            console.log(brands[1].vName);

          },
          err => {
            console.log(err);
          });

  }
 ngOnDestroy() {
   // this.paramSub.unsubscribe();
  }
}
