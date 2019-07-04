import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators } from "@angular/forms";
import { ClassroomService } from '../classroom.service';
import { Router } from "@angular/router";


@Component({
  selector: 'app-update-class',
  templateUrl: './update-class.component.html',
  styleUrls: ['./update-class.component.scss']
})
export class UpdateClassComponent implements OnInit {

  editForm: FormGroup;
  submitted = false;

  constructor(private formBuilder: FormBuilder, private router: Router, private classroomService: ClassroomService) { }

  ngOnInit() {
    let classId = localStorage.getItem("classId");
    if(!classId){
      alert("Something wrong!");
      this.router.navigate(['']);
      return;
    }

    this.editForm = this.formBuilder.group({
      id:[],
      name: ['',Validators.required],
      deleted:[],
      startDay:['',Validators.required],
      endDay : ['',Validators.required],
      learningStatus: ['',Validators.required],
    });

    this.classroomService.getClassById(classId).subscribe(data=>{
    this.editForm.patchValue(data);
    });
  }
     
    

  // get the form short name to access the form fields
  get f() { return this.editForm.controls; }

  onSubmit(){
    this.submitted = true;
     if (this.editForm.valid){
      this.classroomService.updateClass(this.editForm.value)
      .subscribe(data=> {
        console.log(data);
        this.router.navigate(['']);
      });
  }
  }

}
