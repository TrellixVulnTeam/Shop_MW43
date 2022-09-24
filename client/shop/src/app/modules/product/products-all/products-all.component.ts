import {Component, OnInit} from '@angular/core';
import { UserService } from 'src/app/services/user/user.service';
import {ProductService} from "../../../services/product/product.service";
import {Product} from "../../../models/product/Product";

@Component({
  selector: 'app-products-all',
  templateUrl: './products-all.component.html',
  styleUrls: ['./products-all.component.scss']
})
export class ProductsAllComponent implements OnInit {

  products: any;

  constructor(private productService: ProductService, private userService: UserService) {
  }

  ngOnInit(): void {
    this.productService.getAll().subscribe(data => {
      this.products = data;
    });
    console.log(window.sessionStorage.getItem("auth_pass"));
  }

}
