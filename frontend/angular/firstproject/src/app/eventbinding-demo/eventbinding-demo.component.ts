import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'eventbinding-demo',
  templateUrl: './eventbinding-demo.component.html',
  styleUrls: ['./eventbinding-demo.component.css']
})
export class EventbindingDemoComponent {
  username:string="";
  counter:number=0;
  increment(){
    this.counter++;
    console.log("counter="+this.counter)
  }
  changeUsername(event:any){
    this.username=event.target.value;
    console.log("new name="+this.username)
  }

}
