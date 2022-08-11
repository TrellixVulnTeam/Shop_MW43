import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  public getById(): Observable<any> {
    return this.httpClient.get("api/users/1", {headers: {Authorization: "Bearer_eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuaWtpdG9zIiwicm9sZXMiOlsiQURNSU4iLCJVU0VSIl0sImlhdCI6MTY2MDIyMzc2MCwiZXhwIjoxNjYwMjI3MzYwfQ.6SBsAjGg_WCMm4MgZ0OVizHQp1UCIT_hE_IFVUuWzGo"}});
  }

  constructor(private httpClient: HttpClient) { }
}
