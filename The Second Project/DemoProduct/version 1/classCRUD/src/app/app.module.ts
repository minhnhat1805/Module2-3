import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { ReactiveFormsModule } from "@angular/forms";
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { ModalModule } from 'ngx-bootstrap/modal';
import { NgxPaginationModule } from 'ngx-pagination';
import { AddClassComponent } from './add-class/add-class.component';
import { ListClassComponent } from './list-class/list-class.component';
import { ClassroomService } from './classroom.service';
import { UpdateClassComponent } from './update-class/update-class.component';
import { ClassFilterPipe } from './list-class/class-filter.pipe';



@NgModule({
  declarations: [
    AppComponent,
    AddClassComponent,
    ListClassComponent,
    UpdateClassComponent,
    ClassFilterPipe,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule, NgbModule, ModalModule.forRoot(), NgxPaginationModule,


  ],

  providers: [ClassroomService],
  bootstrap: [AppComponent],

})
export class AppModule { }
