import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ShoppingService {

  constructor(private httpClient:HttpClient) { }
  addShoppingData(data:any){
    return this.httpClient.post<any>("http://localhost:8585/shoppingitem/add", data);
  }
  getShoppingData(){
    return this.httpClient.get<any>("http://localhost:8585/shoppingitem/findall");
  }
  deleteShoppingData(id:any){
    return this.httpClient.delete<any>(`http://localhost:8585/shoppingitem/deletebyid/${id}`)
  }
}
