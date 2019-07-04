import { Component, OnInit, TemplateRef } from '@angular/core';
import { Router } from "@angular/router";
import { Classroom } from '../Classroom';
import { ClassroomService } from '../classroom.service'
import { Observable } from 'rxjs';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';


@Component({
  selector: 'app-list-class',
  templateUrl: './list-class.component.html',
  styleUrls: ['./list-class.component.scss']
})

export class ListClassComponent implements OnInit {
  classrooms: Observable<Classroom>;
  searchTerm: string;

  modalRef: BsModalRef;


  constructor(private classService: ClassroomService, private router: Router, private modalService: BsModalService) { }

  ngOnInit() {
    this.getAllClasses();
  }
  getAllClasses(): void {
    this.classService.getAllClasses().subscribe((data) => {
      this.classrooms = data;
      console.log(this.classrooms);
    });
  };
  addClass(): void {
    this.router.navigate(['add-class']);
  }
  deleteClass(classroom: Classroom) {
   // console.log("CLASS", classroom);
    this.classService.deleteClass(classroom.id).subscribe(data => {
     // console.log(data);
      this.getAllClasses();
      this.modalRef.hide();
    });
  }
  updateClass(classroom: Classroom) {
     //localStorage.removeItem("classId")
    localStorage.setItem("classId", classroom.id);
   // console.log(localStorage.getItem('classId'));

    this.router.navigate(['update-class']);
  }

  openModal(template: TemplateRef<any>) {
    this.modalRef = this.modalService.show(template);
  }

  decline(): void {
    this.modalRef.hide();
  }


}
