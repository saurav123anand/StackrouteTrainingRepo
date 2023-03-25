import { HttpEvent, HttpEventType, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class LoggingInterceptorService implements HttpInterceptor{

  constructor() { }
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    console.log("outgoing request")
    console.log(req.url)
    console.log(req.headers)
    return next.handle(req).pipe(tap(event=>{
      if(event.type===HttpEventType.Response){
        console.log("incoming request")
        console.log(event.body)
      }
    }))
  }
}
