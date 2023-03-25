import { HttpClient, HttpEventType, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { map, tap } from 'rxjs/operators';
import { Post } from './post.model';

@Injectable({
  providedIn: 'root'
})
export class PostsService {
  error = new Subject<String>();

  constructor(private http: HttpClient) { }
  createAndStorePost(title: string, content: string) {
    const postData = { title: title, content: content }
    this.http
      .post<{ name: string }>(
        'https://angular-http-13c5b-default-rtdb.firebaseio.com/posts.json',
        postData,
        {
          observe: 'response'
        }
      )
      .subscribe(responseData => {
        console.log(responseData);
      },
        error => {
          this.error.next(error.message)
        }
      );
  }
  fetchPosts() {
    //want to set multiple query params
    let searchParams = new HttpParams();
    searchParams = searchParams.append('print', 'pretty');
    searchParams = searchParams.append('custom', 'key');
    return this.http.get<{ [key: string]: Post }>
      ("https://angular-http-13c5b-default-rtdb.firebaseio.com/posts.json", {
        headers: new HttpHeaders({ 'Custom-Header': 'Hello' }),
        //params:new HttpParams().set('print','pretty')
        params: searchParams,
        responseType: 'json'
      })
      .pipe(map(responseData => {
        const postsArray: Post[] = [];
        for (const key in responseData) {
          if (responseData.hasOwnProperty(key)) {
            postsArray.push({ ...responseData[key], id: key });
          }
        }
        return postsArray;
      }))
  }
  deletePosts() {
    return this.http.delete('https://angular-http-13c5b-default-rtdb.firebaseio.com/posts.json',
      {
        observe: 'events',
        responseType: 'text'
      })
      .pipe(
        tap(event => {
          console.log(event)
          if (event.type === HttpEventType.Sent) {
            //...
          }
          if (event.type === HttpEventType.Response) {
            console.log(event.body)
          }
        })
      )
  }
}
