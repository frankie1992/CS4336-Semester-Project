/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import ejb.MovieEJB;
import entity.Movie;

/**
 *
 * @author Francisco
 */
@Named(value = "movieManagedBean")
@SessionScoped
public class movieManagedBean implements Serializable{
    
    @Inject
    MovieEJB movieEJB;
    
    private Long MovieId;
    private Long currentTheater;
    private Movie selectedMovie;
    private List<Movie> allMovies;
    
    public movieManagedBean() {
    }

    public MovieEJB getMovieEJB() {
        return movieEJB;
    }

    public void setMovieEJB(MovieEJB movieEJB) {
        this.movieEJB = movieEJB;
    }

    public Long getMovieId() {
        return MovieId;
    }

    public void setMovieId(Long MovieId) {
        this.MovieId = MovieId;
    }

    public Movie getSelectedMovie() {
        return selectedMovie;
    }

    public void setSelectedMovie(Movie selectedMovie) {
        this.selectedMovie = selectedMovie;
    }

    public Long getCurrentTheater() {
        return currentTheater;
    }

    public void setCurrentTheater(Long currentTheater) {
        this.currentTheater = currentTheater;
    }
    
    public List<Movie> getAllMovies() {
        return allMovies;
    }

    public void setAllMovies(List<Movie> allMovies) {
        this.allMovies = allMovies;
    }
    
    public List<Movie> getAll(){
        return allMovies = movieEJB.getAll();
    }
    
    public List<Movie> getAllTheaterMovies(){
        return movieEJB.getAllTheaterMovies(currentTheater);
    }
    
    public String searchID(){
        selectedMovie = movieEJB.searchByID(MovieId);
        return "movieDescription";
    }
}
