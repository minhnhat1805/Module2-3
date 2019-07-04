import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Classroom } from './Classroom'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ClassroomService {

  constructor(private http:HttpClient) { }
  baseurl: string = "http://localhost:8080/api/classRooms";
  getAllClasses(): Observable<any>{
    return this.http.get(this.baseurl);
  }
  getClassById(id :string){
    return this.http.get<Classroom>(this.baseurl + '/' + id);
  }
  addClass(classroom:Classroom){
    return this.http.post(this.baseurl,classroom);
  }
  deleteClass(id:string){
    return this.http.delete(this.baseurl + '/' + id);
  }
  updateClass(classroom :Classroom){
    return this.http.put(this.baseurl +'/' +classroom.id , classroom);
  }
}
