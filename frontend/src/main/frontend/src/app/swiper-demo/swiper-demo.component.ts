import { Component, OnInit } from '@angular/core';


@Component({
    selector: 'swiperdemo',
    templateUrl: './swiper-demo.component.html'
})
export class SwiperDemoComponent implements OnInit {

   config: any = {
            pagination: '.swiper-pagination',
            paginationClickable: true,
            nextButton: '.swiper-button-next',
            prevButton: '.swiper-button-prev',
            slidesPerView: 3,
            slidesPerColumn: 2,
            spaceBetween: 30

        };
          constructor() { }

    ngOnInit() {
}
}
