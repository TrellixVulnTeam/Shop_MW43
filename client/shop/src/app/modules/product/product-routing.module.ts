import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductsAllComponent} from "./products-all/products-all.component";
import {ProductsByTypeComponent} from "./products-by-type/products-by-type.component";

const routes: Routes = [
  {path: '', component: ProductsAllComponent},
  {path: 'type/:idType', component: ProductsByTypeComponent, pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule { }
