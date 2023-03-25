import { Component, OnInit } from '@angular/core';
import { FormArray, FormControl, FormGroup, Validators } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  genders = ['male', 'female'];
  signupForm:FormGroup;
  forbiddenUserNames=['chris','anna']
  ngOnInit(): void {
    this.signupForm=new FormGroup({
      'userData':new FormGroup({
        'username':new FormControl(null,[Validators.required,this.forbiddenNames.bind(this)]),
        'email':new FormControl(null,[Validators.required,Validators.email],
          this.forbiddenEmails)
      }),
      'gender':new FormControl('male'),
      'hobbies':new FormArray([])
    });
    // this.signupForm.valueChanges.subscribe(
    //   (value)=>console.log(value)
    // )
    this.signupForm.statusChanges.subscribe(
      (status)=>console.log(status)
    )
    this.signupForm.setValue({
      'userData':{
        'username':"admin",
        'email':"admin@admin.com"
      },
      'gender':"male",
      'hobbies':[]
    })
    this.signupForm.patchValue({
      'userData':{
        'username':"testadmin",
      }
    })

  }
  onSubmit(){
    console.log(this.signupForm)
    this.signupForm.reset()
  }
  onAddHobby(){
    const control=new FormControl(null,Validators.required);
      (<FormArray>this.signupForm.get('hobbies')).push(control)
  }
  //if validation is successfull we have to return null like below not false
  forbiddenNames(control:FormControl):{[s:string]:boolean}{
    if(this.forbiddenUserNames.indexOf(control.value)!==-1){ //(-1 refers true)
      return {'nameIsForbidden':true}
    }
    return null;
  }
  forbiddenEmails(control:FormControl):Promise<any> | Observable<any>{
    const promise=new Promise<any>((resolve,reject)=>{
      setTimeout(() => {
        if(control.value==="test@test.com"){
          resolve({'emailForbidden':true})
        }
        else{
          resolve(null)
        }
      }, 1500);
    })
    return promise;
  }
}
