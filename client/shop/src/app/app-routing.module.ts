import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

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
  {
    path: 'login',
    loadChildren: () => import("./core/core.module").then(m => m.CoreModule)
  },
  {
    path: "web/user",
    loadChildren: () => import("./modules/user/user.module").then(m => m.UserModule)
  }
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes, { onSameUrlNavigation: "reload" })
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
