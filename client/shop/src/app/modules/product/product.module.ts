import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductRoutingModule } from './product-routing.module';
import { ProductsAllComponent } from './products-all/products-all.component';
import { ProductsByTypeComponent } from './products-by-type/products-by-type.component';


@NgModule({
  declarations: [
    ProductsAllComponent,
    ProductsByTypeComponent
  ],
  imports: [
    CommonModule,
    ProductRoutingModule
  ]
})
export class ProductModule { }
