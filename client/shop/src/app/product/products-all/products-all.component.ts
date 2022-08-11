import {Component, OnInit} from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import {ProductService} from "../../services/product/product.service";

@Component({
  selector: 'app-products-all',
  templateUrl: './products-all.component.html',
  styleUrls: ['./products-all.component.scss']
})
export class ProductsAllComponent implements OnInit {

  constructor(private productService: ProductService, private userService: UserService) {
  }

  ngOnInit(): void {
    this.productService.getAll().subscribe(data => {
      console.log(data);
    })
    this.userService.getById().subscribe(data=>{
      console.log(data);
    })
  }

}
