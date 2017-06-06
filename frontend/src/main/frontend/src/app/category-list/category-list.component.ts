import {Component, OnInit, OnDestroy} from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';
import {Subscription} from 'rxjs';
import { EducationModulesService } from '../education-modules/education-modules.service';
import { CategoryListModel } from './category-list.model';
@Component({
  selector: 'categorylist',
  templateUrl: './category-list.component.html'
})
export class CategoriesListComponent implements OnInit, OnDestroy {
  paramSub: Subscription;
  categories:  CategoryListModel[];
  constructor(private _route: ActivatedRoute,
              private _router: Router,
              private educationModulesService: EducationModulesService) {
  }
  ngOnInit() {
     this.educationModulesService.getCategoryList().subscribe(
          categories => {
            this.categories = categories;
            console.log("inside this.CategoriesListComponent.getCategoryList()");
            console.log(categories[1].vName);

          },
          err => {
            console.log(err);
          });

  }
 ngOnDestroy() {
   // this.paramSub.unsubscribe();
  }
}
