import {Component, OnInit} from '@angular/core';
import {ProductService} from "../../services/product/product.service";

@Component({
  selector: 'app-products-all',
  templateUrl: './products-all.component.html',
  styleUrls: ['./products-all.component.scss']
})
export class ProductsAllComponent implements OnInit {

  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.productService.getAll().subscribe(data => {
      console.log(data);
    })
  }

}
