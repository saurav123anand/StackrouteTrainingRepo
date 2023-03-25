import { Component, OnInit } from '@angular/core';
import { Product } from '../models/Product';

@Component({
  selector: 'product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent {
  product:Product=new Product("samsung",10000);
}
