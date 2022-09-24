import { Component, OnInit } from '@angular/core';
import {TypeService} from "../../services/type/type.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-header-layout',
  templateUrl: './header-layout.component.html',
  styleUrls: ['./header-layout.component.scss']
})
export class HeaderLayoutComponent implements OnInit {

  types: any;

  constructor(private typeService: TypeService, private router: Router) {
    router.onSameUrlNavigation = 'reload';
  }

  ngOnInit(): void {
    this.typeService.getAll().subscribe(data => {
      this.types = data;
    })
  }

}
