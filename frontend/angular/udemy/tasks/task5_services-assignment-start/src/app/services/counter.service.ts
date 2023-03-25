import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CounterService {

  constructor() { }
  activeToInactiveCounter=0;
  inactiveToActiveCounter=0;

  incrementActiveToInactive(){
    this.activeToInactiveCounter++;
    console.log(this.activeToInactiveCounter)
  }
  incrementInactiveToActive(){
    this.inactiveToActiveCounter++;
    console.log(this.inactiveToActiveCounter)
  }

}
