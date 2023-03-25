import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'attributedirective-demo',
  templateUrl: './attributedirective-demo.component.html',
  styleUrls: ['./attributedirective-demo.component.css']
})
export class AttributedirectiveDemoComponent{

   num:number=11;
   backgroundColorValue="blue";
   colorValue="white";
   paddingValue="10%"
   styleObj={'background-color':this.backgroundColorValue,'color':this.colorValue,'padding':this.paddingValue};
}
