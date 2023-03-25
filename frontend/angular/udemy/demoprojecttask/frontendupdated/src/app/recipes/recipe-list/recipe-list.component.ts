import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Recipe } from '../recipe.model';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
  @Output() recipeWasSelected=new EventEmitter<Recipe>();
  recipes: Recipe[] = [
    new Recipe("A Test Recipe", "This is simply a test",
     "https://cdn.pixabay.com/photo/2018/03/28/20/32/food-3270461_960_720.jpg"),
     new Recipe("Another Test Recipe", "This is simply a test",
     "https://cdn.pixabay.com/photo/2018/03/28/20/32/food-3270461_960_720.jpg")
  ];
  
  onRecipeSelected(recipe:Recipe){
     this.recipeWasSelected.emit(recipe)
  }
  constructor() { }

  ngOnInit(): void {
  }

}
