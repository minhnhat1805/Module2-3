import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { ComponentsComponent } from './components/components.component';
import { LandingComponent } from './examples/landing/landing.component';
import { LoginComponent } from './examples/login/login.component';
import { ProfileComponent } from './examples/profile/profile.component';
import { NucleoiconsComponent } from './components/nucleoicons/nucleoicons.component';
import { AddClassComponent } from './add-class/add-class.component';
import { UpdateClassComponent } from './update-class/update-class.component';
import { ReactiveFormsModule } from '@angular/forms';

const routes: Routes = [
    { path: '', redirectTo: 'index', pathMatch: 'full' },
    { path: 'index', component: ComponentsComponent },
    { path: 'nucleoicons', component: NucleoiconsComponent },
    { path: 'examples/landing', component: LandingComponent },
    { path: 'examples/login', component: LoginComponent },
    { path: 'examples/profile', component: ProfileComponent },

    // { path: '', component:ListClassComponent, pathMatch: 'full' },
    { path: 'add-class', component: AddClassComponent },
    { path: 'update-class', component: UpdateClassComponent }
];

@NgModule({
    imports: [
        CommonModule,
        BrowserModule,
        RouterModule.forRoot(routes),
        ReactiveFormsModule
    ],
    exports: [
        RouterModule, ReactiveFormsModule
    ],
})
export class AppRoutingModule { }
