import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccountPageComponent } from './account-page/account-page.component';
import {UserRoutingModule} from "./user-routing.module";
import { UserEditComponent } from './user-edit/user-edit.component';
import { BasketComponent } from './basket/basket.component';



@NgModule({
  declarations: [
    AccountPageComponent,
    UserEditComponent,
    BasketComponent
  ],
  imports: [
    CommonModule,
    UserRoutingModule
  ]
})
export class UserModule { }
