package main.java.view;

import java.util.List;

import main.java.domain.Movie;
import main.java.domain.MovieRepository;

public class OutputView {
    public static void printMovies(List<Movie> movies) {
    	System.out.println("## �󿵿�ȭ ���");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

	public static void printPlaySchedule(int movieId) {
		System.out.println(MovieRepository.getWantMovie(movieId));
	}


}