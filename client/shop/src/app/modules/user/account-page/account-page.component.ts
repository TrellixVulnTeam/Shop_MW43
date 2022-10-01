import { Component, OnInit } from '@angular/core';
import {UserService} from "../../../services/user/user.service";
import {Router} from "@angular/router";
import {JWTUtils} from "../../../utils/JWT/JWTUtils";
import {DatePipe} from "@angular/common";

@Component({
  selector: 'app-account-page',
  templateUrl: './account-page.component.html',
  styleUrls: ['./account-page.component.scss']
})
export class AccountPageComponent implements OnInit {

  user: any;

  constructor(private userService: UserService, private router: Router, private datePipe: DatePipe) { }

  ngOnInit(): void {

    this.userService.getByToken(JWTUtils.getToken()).subscribe((data) => {
      this.user = data;
      this.user.birthday = this.datePipe.transform(this.user.birthday, "yyyy-MM-dd");
      console.log(data);
    });
  }

}
