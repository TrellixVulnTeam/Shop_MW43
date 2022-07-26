import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductsAllComponent} from "./products-all/products-all.component";

const routes: Routes = [
  {path: '', component: ProductsAllComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule { }
