import { Component, OnInit } from '@angular/core';
import { Product } from '../models/Product';

@Component({
  selector: 'structuraldirective-demo',
  templateUrl: './structuraldirective-demo.component.html',
  styleUrls: ['./structuraldirective-demo.component.css']
})
export class StructuraldirectiveDemoComponent{
  num:number=10;
  products:Product[]=[
    new Product("samsung",10000),
    new Product("motorolla",15000),
    new Product("iphone",20000)
  ]

}
