import {Component, OnInit} from '@angular/core';
import {UserService} from "../../services/user/user.service";
import {FormBuilder, FormControl, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  form: any = {
    username: null,
    password: null
  };
  isLoginFailed = false;
  errorMessage = '';
  userForm = new FormGroup({
    username: new FormControl(''),
    password: new FormControl('')
  });

  constructor(private userService: UserService, private formBuilder: FormBuilder, private router: Router) {
  }

  ngOnInit(): void {
    this.userForm = this.formBuilder.group({
      username: "",
      password: ""
    });
  }

  onSubmit(): void {
    this.userService.auth(this.userForm.get("username")?.getRawValue(), this.userForm.get("password")?.getRawValue()).subscribe((data: any) => {
        if (data === null) {
          this.errorMessage = "Bad credentials";
        } else {
          this.errorMessage = "";
          window.sessionStorage.setItem("auth_pass", "Bearer_" + data.token);
          this.router.navigate(["web/products"]);
        }
      },
      err => {
        this.errorMessage = err.error.message;
        this.isLoginFailed = true;
        console.log("error");
      }
    );
  }

}
