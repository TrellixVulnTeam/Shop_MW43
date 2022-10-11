import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  public getById(): Observable<any> {
    return this.httpClient.get("api/users/1", {headers: {Authorization: "Bearer_eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuaWtpdG9zIiwicm9sZXMiOlsiQURNSU4iLCJVU0VSIl0sImlhdCI6MTY2MDIyMzc2MCwiZXhwIjoxNjYwMjI3MzYwfQ.6SBsAjGg_WCMm4MgZ0OVizHQp1UCIT_hE_IFVUuWzGo"}});
  }

  public auth(username: string, password: string) {
    return this.httpClient.post("api/auth/login", {"username": username, "password": password});
  }

  public getByToken(token: string): Observable<any> {
    return this.httpClient.get(`api/users/token/${token}`);
  }

  public register(username: string, firstname: string, lastname: string, patronymic: string, telephone: string, birthday: string, description: string, email: string, password: string) {
    return this.httpClient.post("api/users/register", {
          "username": username,
          "firstName": firstname,
          "lastName": lastname,
          "patronymic": patronymic,
          "telephone": telephone,
          "birthday": birthday,
          "description": description,
          "email": email,
          "password": password
    })
  }

  constructor(private httpClient: HttpClient) {
  }
}
