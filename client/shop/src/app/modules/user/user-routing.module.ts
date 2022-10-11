import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AccountPageComponent} from "./account-page/account-page.component";
import {UserEditComponent} from "./user-edit/user-edit.component";
import {BasketComponent} from "./basket/basket.component";

const routes: Routes = [
  {
    path: "account",
    component: AccountPageComponent
  },
  {
    path: "edit",
    component: UserEditComponent
  },
  {
    path: "basket",
    component: BasketComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
