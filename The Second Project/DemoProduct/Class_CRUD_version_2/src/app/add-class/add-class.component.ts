import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ClassroomService } from '../classroom.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-class',
  templateUrl: './add-class.component.html',
  styleUrls: ['./add-class.component.scss']
})
export class AddClassComponent implements OnInit {

  constructor( private formBuilder:FormBuilder,private router:Router,private classService:ClassroomService) { }
   addForm:FormGroup;
   submitted = false;
  ngOnInit() { 
    this.addForm = this.formBuilder.group({
      id:[],
      name: ['',Validators.required],
      deleted:[],
      startDay:['',Validators.required],
      endDay : ['',Validators.required],
      learningStatus: ['',Validators.required],
    })
  }
  onSubmit(){
    this.submitted = true;
    if(this.addForm.valid){
      this.classService.addClass(this.addForm.value).subscribe(data =>{
        console.log(data);
        this.router.navigate(['']);
      })
    }
  }
get f(){return this.addForm.controls;}
}
