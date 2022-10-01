export class JWTUtils {

  public static getToken(): string {
    let token = window.sessionStorage.getItem("auth_pass");
    return token == null ? "" : token;
  }

}
