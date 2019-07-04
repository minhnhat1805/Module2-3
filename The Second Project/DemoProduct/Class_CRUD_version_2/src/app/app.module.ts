import { BrowserAnimationsModule } from '@angular/platform-browser/animations'; // this is needed!
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app.routing';
import { ComponentsModule } from './components/components.module';
import { ReactiveFormsModule } from "@angular/forms";
import { ExamplesModule } from './examples/examples.module';

import { ModalModule, BsModalRef } from 'ngx-bootstrap/modal';
import { AddClassComponent } from './add-class/add-class.component';

import { ClassroomService } from './classroom.service';
import { UpdateClassComponent } from './update-class/update-class.component';
import { NgxPaginationModule} from 'ngx-pagination'; 
import { ClassFilterPipe } from './components/class-filter.pipe';




import { AppComponent } from './app.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { ComponentsComponent } from './components/components.component';


@NgModule({ 
    declarations: [
        AppComponent,
        NavbarComponent,
        UpdateClassComponent,
        AddClassComponent,
        ClassFilterPipe,
        ComponentsComponent

    ],
    imports: [
        BrowserAnimationsModule,
        NgbModule.forRoot(),
        FormsModule,
        RouterModule,
        AppRoutingModule,
        ComponentsModule,
        ExamplesModule,ReactiveFormsModule, NgxPaginationModule,ModalModule,HttpClientModule ,BrowserModule,  ModalModule.forRoot()
    ],
    providers: [ClassroomService,BsModalRef],
    bootstrap: [AppComponent]
})
export class AppModule { }
