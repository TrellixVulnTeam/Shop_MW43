import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderLayoutComponent } from './header-layout/header-layout.component';
import {RouterModule} from "@angular/router";
import { LoginComponent } from './login/login.component';
import {CoreRoutingModule} from "./core-routing.module";
import {ReactiveFormsModule} from "@angular/forms";



@NgModule({
    declarations: [
        HeaderLayoutComponent,
        LoginComponent
    ],
    exports: [
        HeaderLayoutComponent
    ],
  imports: [
    CommonModule,
    RouterModule,
    CoreRoutingModule,
    ReactiveFormsModule
  ]
})
export class CoreModule { }
