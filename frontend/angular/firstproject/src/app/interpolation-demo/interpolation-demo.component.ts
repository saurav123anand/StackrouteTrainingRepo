import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';

@Component({
  selector: 'interpolation-demo',
  templateUrl: './interpolation-demo.component.html',
  styleUrls: ['./interpolation-demo.component.css']
})
export class InterpolationDemoComponent  {
  getDescription(): string {
    let msg: string = "i love angular framework";
    return msg;
  }
  user = { name: "saurav", age: 23 };
  user2 = new User("Keshav", 22);
  user3 = new User("Rohan", 19);
  users = [this.user2, this.user3]

}
