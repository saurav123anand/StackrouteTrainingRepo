import { Component, EventEmitter, OnDestroy, OnInit, Output } from '@angular/core';
import { Subscription } from 'rxjs';
import { AuthService } from '../auth/auth.service';
import { DataStorageService } from '../shared/data-storage.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit,OnDestroy {
  constructor(private dataStorageService:DataStorageService,private authService:AuthService) { }
  isAuthenticated=false;
  private userSub:Subscription;
  ngOnInit(): void {
    this.authService.user.subscribe(user=>{
       this.isAuthenticated=!user ? false : true;
    })
  }
  onSaveData(){
     this.dataStorageService.storeRecipes();
  }
  onFetchData(){
    this.userSub=this.dataStorageService.fetchRecipes().subscribe()
  }
  onLogout(){
    this.authService.logout();
  }
  toggler(menus:any){
    menus.classList.toggle('open')
  }
  ngOnDestroy(): void {
    this.userSub.unsubscribe()
  }

}
