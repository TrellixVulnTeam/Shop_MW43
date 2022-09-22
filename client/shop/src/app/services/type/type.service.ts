import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TypeService {

  public getAll(): Observable<any>{
    return this.httpClient.get<any>("api/types");
  }

  constructor(private httpClient: HttpClient) { }
}
