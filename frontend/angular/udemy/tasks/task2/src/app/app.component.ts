import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  username:string="";
  updateUsername(){
    
    if(this.username!=""){
      this.username="";
    }
  }
  
}
