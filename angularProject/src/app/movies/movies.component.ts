import { Component, OnInit } from '@angular/core';
import { Movie } from '../../models/movie';
//import{ fakeMovies} from '../fake-movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.scss']
})
export class MoviesComponent implements OnInit {

  //movies = fakeMovies;
  movies: Movie[];
  constructor(private movieService: MovieService) { }


  getMoviesFromService(): void {
    //this.movies = this.movieService.getMovies();
    this.movieService.getMovies().subscribe(
      (updatedMovies) => {
        this.movies = updatedMovies;
        console.log(`this.movies = ${JSON.stringify(this.movies)}`);
      }
    );
  }

  ngOnInit() {
    this.getMoviesFromService();
  }

  selectedMovie: Movie;

  onSelect(movie: Movie): void {
    this.selectedMovie = movie;
    console.log(`selectedMovie= ${JSON.stringify(this.selectedMovie)}`);

  }
}
