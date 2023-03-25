import { Component, ElementRef, EventEmitter, OnDestroy, OnInit, Output, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Subscription } from 'rxjs';
import { Ingredient } from 'src/app/shared/Ingredient.model';
import { ShoppingListService } from '../shopping-list.service';

@Component({
  selector: 'app-shopping-edit',
  templateUrl: './shopping-edit.component.html',
  styleUrls: ['./shopping-edit.component.css']
})
export class ShoppingEditComponent implements OnInit,OnDestroy {
  constructor(private shoppingListService:ShoppingListService) { }
  subscription:Subscription;
  editMode=false;
  editedItemIndex:number;
  editedItem:Ingredient;
  @ViewChild('f') shoppingListForm;

  ngOnInit(): void {
    this.subscription=this.shoppingListService.startedEditing.subscribe(
      (index:number)=>{
        this.editedItemIndex=index;
        this.editMode=true;
        this.editedItem=this.shoppingListService.getIngredient(index)
        this.shoppingListForm.setValue({
          name:this.editedItem.name,
          amount:this.editedItem.amount
        })
      }
    );
  }
  onSubmit(form:NgForm){
    const value=form.value
     let ingredient:Ingredient=new Ingredient(value.name,value.amount);
     if(this.editMode){
      this.shoppingListService.updateIngredient(this.editedItemIndex,ingredient)
     }
     else{
      this.shoppingListService.addIngredient(ingredient);
     }
     this.editMode=false;
     form.reset()
  }
  onClear(){
    this.shoppingListForm.reset()
    this.editMode=false
  }
  onDelete(){
    this.shoppingListService.deleteIngredient(this.editedItemIndex)
    this.onClear()
  }
  ngOnDestroy(): void {
      this.subscription.unsubscribe()
  }

}
