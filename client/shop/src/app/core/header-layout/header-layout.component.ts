import { Component, OnInit } from '@angular/core';
import {TypeService} from "../../services/type/type.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-header-layout',
  templateUrl: './header-layout.component.html',
  styleUrls: ['./header-layout.component.scss']
})
export class HeaderLayoutComponent implements OnInit {

  isLoggedIn: boolean;
  types: any;
  role: any;

  constructor(private typeService: TypeService, private router: Router) {
    this.isLoggedIn = window.sessionStorage.getItem("auth_pass") != null;
  }

  ngOnInit(): void {
    this.typeService.getAll().subscribe(data => {
      this.types = data;
    })
    this.role = window.sessionStorage.getItem("role");
    console.log("ROLE " + this.role);
  }

  logout (): void {
    window.sessionStorage.removeItem("auth_pass");
    window.sessionStorage.removeItem("role");
    this.router.navigate(["login"]);
    location.reload();
  }

}
