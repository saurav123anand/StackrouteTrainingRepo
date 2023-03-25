import { Component, OnInit } from '@angular/core';
import { ShoppingService } from '../service/shopping.service';
import { Ingredient } from '../shared/ingredient.model';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {
   ingredients:Ingredient[]=[];
   onIngredientAdded(ingredients:Ingredient[]){
    this.ingredients=ingredients
   }
  constructor(private shoppingService:ShoppingService) { }

  ngOnInit(): void {
  }

  deleteItem(id:any){
     this.shoppingService.deleteShoppingData(id).subscribe(data=>{
       this.shoppingService.getShoppingData().subscribe(data=>{
        console.log(data)
        this.ingredients=data
       })
     });
  }

}
