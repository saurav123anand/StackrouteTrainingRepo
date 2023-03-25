import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  showSecret=false;
  logData:any=[];
  onToggleDetails(){
    this.showSecret=!this.showSecret
    //this.logData.push(this.logData.length+1); 
    this.logData.push(new Date())
  }
  
}
