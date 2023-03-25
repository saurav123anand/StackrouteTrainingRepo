import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { exhaustMap, map, take, tap } from 'rxjs/operators';
import { AuthService } from '../auth/auth.service';
import { Recipe } from '../recipes/model/recipe.model';
import { RecipeService } from '../recipes/recipe.service';

@Injectable({
  providedIn: 'root'
})
export class DataStorageService {

  constructor(private http:HttpClient,private recipeSevice:RecipeService,private authService:AuthService) { }

  storeRecipes(){
    const recipes=this.recipeSevice.getRecipes();
    this.http.put("https://fir-76cf4-default-rtdb.firebaseio.com/recipes.json",recipes).subscribe(
      response=>{
         console.log(response)
      }
    )
  }
  // fetchRecipes(){
  //   return this.http.get<Recipe[]>("https://fir-76cf4-default-rtdb.firebaseio.com/recipes.json")
  //   .pipe(map(recipes=>{
  //     return recipes.map(recipe=>{
  //       return {...recipe,ingredients: recipe.ingredients ? recipe.ingredients : []}
  //     })
  //   })
  //   ,tap((recipes:Recipe[])=>{
  //     this.recipeSevice.setRecipes(recipes)
  //   })
  //   )
    
  // }

  fetchRecipes() {
    return this.http.get<Recipe[]>("https://fir-76cf4-default-rtdb.firebaseio.com/recipes.json"
    ).pipe(
      map(recipes => {
        return recipes.map(recipe => {
          return { ...recipe, ingredients: recipe.ingredients ? recipe.ingredients : [] }
        })
      })
      , tap((recipes: Recipe[]) => {
        this.recipeSevice.setRecipes(recipes)
      }))
  }
}
