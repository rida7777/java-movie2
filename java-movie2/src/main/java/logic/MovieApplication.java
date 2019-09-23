package main.java.logic;

import main.java.domain.Movie;
import main.java.domain.MovieRepository;
import main.java.view.InputView;
import main.java.view.OutputView;

import java.util.List;

public class MovieApplication {
    public static void main(String[] args) {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);

        int movieId = InputView.inputMovieId();
        OutputView.printPlaySchedule(movieId);
    }
}