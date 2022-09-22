import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderLayoutComponent } from './header-layout/header-layout.component';
import {RouterModule} from "@angular/router";



@NgModule({
    declarations: [
        HeaderLayoutComponent
    ],
    exports: [
        HeaderLayoutComponent
    ],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class CoreModule { }
