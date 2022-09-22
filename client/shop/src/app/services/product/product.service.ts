import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {Type} from "../../models/type/Type";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public getAll(): Observable<any> {
    return this.httpClient.get<any>("api/products");
  }

  public getProductsByType(type: number) {
    return this.httpClient.get<any>("api/products/type/" + type);
  }

  constructor(private httpClient: HttpClient) { }
}
