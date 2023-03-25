import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthResponseData, AuthService } from './auth.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent implements OnInit {
  isLoading=false;
  isLoginMode=false;
  error:string=null;

  constructor(private authService:AuthService,private router:Router) { }
  ngOnInit(): void {
  }
  
  onSwitchMode(){
    this.isLoginMode=!this.isLoginMode;
  }

  onSubmit(authForm:NgForm){
    //console.log(authForm.value);
    if(!authForm.valid){
      return;
    }
    const email=authForm.value.email;
    const password=authForm.value.password;
    let authObs:Observable<AuthResponseData>;
    this.isLoading=true;
    if(this.isLoginMode){
      authObs= this.authService.login(email,password)
    }
    else{
      authObs=this.authService.signup(email,password)
    }
    authObs.subscribe(
      resData=>{
        console.log(resData)
        this.isLoading=false
        this.router.navigate(['/recipes'])
      },
      errorMsg=>{
        this.error=errorMsg
        this.isLoading=false;
      }
    )
    
    authForm.reset()
  }

}
