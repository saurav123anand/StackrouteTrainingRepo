import { Component, ElementRef, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';
import { ShoppingService } from 'src/app/service/shopping.service';
import { Ingredient } from 'src/app/shared/ingredient.model';

@Component({
  selector: 'app-shopping-edit',
  templateUrl: './shopping-edit.component.html',
  styleUrls: ['./shopping-edit.component.css']
})
export class ShoppingEditComponent implements OnInit {

  @Output() ingredientAdded=new EventEmitter<Ingredient[]>();
  @ViewChild("nameInput") nameInputRef:ElementRef;
  @ViewChild("amountInput") amountInputRef:ElementRef;
  constructor(private shoppingService:ShoppingService) { }

  //fetchedData:any[]=[];

  ngOnInit(): void {
    this.getItem();
  }
  onAddItem(){
    const newIngredient=new Ingredient(this.nameInputRef.nativeElement.value,
      this.amountInputRef.nativeElement.value);
     this.shoppingService.addShoppingData(newIngredient).subscribe(
      data=>{console.log(data)
        this.getItem()
      }
     )
  }
  getItem(){
    this.shoppingService.getShoppingData().subscribe(
      data=>{
        //this.fetchedData=data;
        this.ingredientAdded.emit(data);
      }
    );
  }

}
