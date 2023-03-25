import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'task2';
  customer1:Customer=new Customer(1,"Gaurav",24);
  customer2:Customer=new Customer(2,"Rohan",13);
  customer3:Customer=new Customer(3,"Sohan",17);
  customer4:Customer=new Customer(4,"Eda",19);
  customer5:Customer=new Customer(5,"Salman",18);
  customerArr:Customer[]=[this.customer1,this.customer2,this.customer3,this.customer4,this.customer5]
}
class Customer{
  public constructor(public id:number,public name:string,public age:number){}
}
