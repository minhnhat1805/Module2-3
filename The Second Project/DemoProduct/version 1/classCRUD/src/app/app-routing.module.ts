import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { ListClassComponent } from './list-class/list-class.component';
import { AddClassComponent } from './add-class/add-class.component'
import { UpdateClassComponent } from './update-class/update-class.component';
import { ReactiveFormsModule } from '@angular/forms';
const routes: Routes = [
  { path: '', component:ListClassComponent, pathMatch: 'full' },
  { path: 'add-class', component:AddClassComponent },
  { path: 'update-class', component:UpdateClassComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes),ReactiveFormsModule],
  exports: [RouterModule , ReactiveFormsModule]
})
export class AppRoutingModule { }
