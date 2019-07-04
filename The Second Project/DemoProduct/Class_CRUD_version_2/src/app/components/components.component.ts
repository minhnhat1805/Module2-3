import { Component, OnInit, Renderer, OnDestroy, TemplateRef } from '@angular/core';
import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { NgbAccordionConfig } from '@ng-bootstrap/ng-bootstrap';
import * as Rellax from 'rellax';
import { Router } from "@angular/router";
import {Classroom } from '../Classroom';
import {ClassroomService } from '../classroom.service'
import { Observable } from 'rxjs';
import { BsModalRef, BsModalService } from 'ngx-bootstrap/modal';

@Component({
    selector: 'app-components',
    templateUrl: './components.component.html',
    styles: [`
    ngb-progressbar {
        margin-top: 5rem;
    }
    `]
})

export class ComponentsComponent implements OnInit, OnDestroy {
    classrooms :Observable<Classroom>;
    searchTerm: string;
  
    modalRef: BsModalRef;
    data : Date = new Date();

    page = 4;
    page1 = 5;
    page2 = 3;
    focus;
    focus1;
    focus2;

    date: {year: number, month: number};
    model: NgbDateStruct;

    public isCollapsed = true;
    public isCollapsed1 = true;
    public isCollapsed2 = true;

    state_icon_primary = true;

    constructor( private renderer : Renderer, config: NgbAccordionConfig,private classService:ClassroomService, private router:Router,private modalService: BsModalService) {
        config.closeOthers = true;
        config.type = 'info';
    }
    isWeekend(date: NgbDateStruct) {
        const d = new Date(date.year, date.month - 1, date.day);
        return d.getDay() === 0 || d.getDay() === 6;
    }

    isDisabled(date: NgbDateStruct, current: {month: number}) {
        return date.month !== current.month;
    }

    ngOnInit() {
        this.getAllClasses();
      var rellaxHeader = new Rellax('.rellax-header');

        var navbar = document.getElementsByTagName('nav')[0];
        navbar.classList.add('navbar-transparent');
        var body = document.getElementsByTagName('body')[0];
        body.classList.add('index-page');
    }
    ngOnDestroy(){
        var navbar = document.getElementsByTagName('nav')[0];
        navbar.classList.remove('navbar-transparent');
        var body = document.getElementsByTagName('body')[0];
        body.classList.remove('index-page');
    }
    getAllClasses():void{
        this.classService.getAllClasses().subscribe((data)=>{
          this.classrooms = data; 
          console.log(this.classrooms);
        });
      };
      addClass():void {
        this.router.navigate(['add-class']);
      }
      deleteClass(classroom: Classroom){
       // console.log("CLASS",classroom);
        this.classService.deleteClass(classroom.id).subscribe(data=>{
          console.log(data);
          this.getAllClasses();
          this.modalRef.hide();
        });
      }
      updateClass(classroom:Classroom){
        localStorage.removeItem("classId")
        localStorage.setItem("classId",classroom.id);
        this.router.navigate(['update-class']);
      }
      
      openModal1(template: TemplateRef<any>) {
        this.modalRef = this.modalService.show(template);
      }
      
      openModal(template1: TemplateRef<any>) {
        this.modalRef = this.modalService.show(template1);
      }
      
      decline(): void {
        this.modalRef.hide();
      }
      
}
