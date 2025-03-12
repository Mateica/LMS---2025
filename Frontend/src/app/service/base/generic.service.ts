import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
  })
export abstract class GenericService<T> {
  constructor(protected http : HttpClient, protected baseUrl : string) {}

  getAll(): Observable<T[]> {
    return this.http.get<T[]>(this.baseUrl);
  }

  getById(id : number): Observable<T> {
    return this.http.get<T>(`${this.baseUrl}/${id}`);
  }


  create(entity: T): Observable<T> {
    return this.http.post<T>(this.baseUrl, entity);
  }

  update(id: number, entity: T): Observable<T> {
    return this.http.put<T>(`${this.baseUrl}/${id}`, entity);
  }

 delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
