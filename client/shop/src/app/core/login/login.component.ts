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
    console.log(window.sessionStorage.getItem("auth_pass"));
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
          console.log(data);
          this.errorMessage = "";
          window.sessionStorage.setItem("auth_pass", "Bearer_" + data.token);
          window.sessionStorage.setItem("role", data.roles.filter((r: any) => r.name == 'ROLE_ADMIN').length > 0 ? "ROLE_ADMIN": "ROLE_USER");
          this.router.navigate(["web/products"]).then(r => location.reload());
        }
      },
      err => {
        this.errorMessage = err.error.message;
        this.isLoginFailed = true;
      }
    );
  }

}
