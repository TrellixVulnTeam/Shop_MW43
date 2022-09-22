import {Component, OnInit} from '@angular/core';
import {ProductService} from "../../../services/product/product.service";
import {ActivatedRoute, NavigationEnd, Router} from "@angular/router";

@Component({
  selector: 'app-products-by-type',
  templateUrl: './products-by-type.component.html',
  styleUrls: ['./products-by-type.component.scss']
})
export class ProductsByTypeComponent implements OnInit {

  products: any;

  constructor(private productService: ProductService, private activateRoute: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.productService.getProductsByType(Number.parseInt(<string>this.activateRoute.snapshot.paramMap.get("idType"))).subscribe(data => {
      this.products = data;
    });
  }

}
