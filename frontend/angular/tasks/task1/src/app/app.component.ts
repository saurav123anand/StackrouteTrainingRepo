import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'task1';
  customer=new Customer("","",0,"");
  addCustomer(fname:string,lname:string,age:any,balance:string,details:any){
     this.customer.firstname=fname;
     this.customer.lastname=lname;
     this.customer.age=age;
     this.customer.balance=balance;
     details.innerHTML=`
     <h2>Details entered </h2>
     <h5>Firstname is ${this.customer.firstname}</h5>
     <h5>lastname is ${this.customer.lastname}</h5>
     <h5>Age is ${this.customer.age}</h5>
     <h5>Balance is ${this.customer.balance}</h5>
     `
  }
}
class Customer{
  public constructor(public firstname:string,public lastname:string,public age:number,
    public balance:string){}
}
