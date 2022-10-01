import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccountPageComponent } from './account-page/account-page.component';
import {UserRoutingModule} from "./user-routing.module";
import { UserEditComponent } from './user-edit/user-edit.component';



@NgModule({
  declarations: [
    AccountPageComponent,
    UserEditComponent
  ],
  imports: [
    CommonModule,
    UserRoutingModule
  ]
})
export class UserModule { }
