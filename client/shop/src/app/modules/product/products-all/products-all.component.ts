import {Component, OnInit} from '@angular/core';
import {UserService} from 'src/app/services/user/user.service';
import {ProductService} from "../../../services/product/product.service";
import {BasketService} from "../../../services/basket/basket.service";

@Component({
  selector: 'app-products-all',
  templateUrl: './products-all.component.html',
  styleUrls: ['./products-all.component.scss']
})
export class ProductsAllComponent implements OnInit {

  products: any;

  constructor(private productService: ProductService, private userService: UserService, private basketService: BasketService) {
  }

  ngOnInit(): void {
    this.productService.getAll().subscribe(data => {
      this.products = data;
    });
  }

  addToBasket(idProduct: string): void {
    console.log("calling");
    this.basketService.addToBasket(1, idProduct).subscribe((data: any) => {
      console.log("data " + data);
    }, (err: any) => {
      console.log("err " + err);
    });
  }

}
