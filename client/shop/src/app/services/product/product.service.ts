import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public getAll(): Observable<any> {
    return this.httpClient.get<any>("api/products");
  }

  constructor(private httpClient: HttpClient) { }
}
