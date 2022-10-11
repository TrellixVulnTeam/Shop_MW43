import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {JWTUtils} from "../../utils/JWT/JWTUtils";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class BasketService {

  constructor(private httpClient: HttpClient) { }

  public getBasketByUser(token: string): any {
    return this.httpClient.get<any>("api/basket/user/" + token);
  }

  public addToBasket(amount: number, idProduct: string): any{
    return this.httpClient.post("api/basket/user/addProduct", {
      "idProduct": idProduct,
      "amount": amount,
      "token": JWTUtils.getToken()
    });
  }

  public clearBasket(token: string): Observable<any> {
    return this.httpClient.delete("api/basket/user/clearBasket", { body: { "token": token }});
  }
}


