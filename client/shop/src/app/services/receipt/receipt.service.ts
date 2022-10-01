import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ReceiptService {

  constructor(private httpClient: HttpClient) { }

  public getAll(): any {
    return this.httpClient.get("api/receipts/");
  }

  public getByIdUser(idUser: number): any {
    return this.httpClient.get("api/receipts/user/" + idUser);
  }

  public getById(id: number): any {
    return this.httpClient.get("api/receipts/" + id);
  }

}
