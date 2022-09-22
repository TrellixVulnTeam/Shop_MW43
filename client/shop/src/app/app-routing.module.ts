import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AppComponent} from "./app.component";
import {CommonModule} from "@angular/common";

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'web/products'
  },
  {
    path: 'web/products',
    loadChildren: () => import('./modules/product/product.module').then(m => m.ProductModule)
  },
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes, {onSameUrlNavigation: "reload"})
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
