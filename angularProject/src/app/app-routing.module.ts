import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { TimelinesComponent } from './timelines/timelines.component';

const routes: Routes = [
  {
    path: 'movie', component: MoviesComponent
  },
  {
    path: 'timelines',
    component: TimelinesComponent
  }
];


@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],

  exports: [RouterModule]
})
export class AppRoutingModule { }
