package main.java.view;

import java.util.List;

import main.java.domain.AllPay;
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

	public static void printPayResult(AllPay allPay) {
		System.out.print("## ���� ���� �ݾ���");
		int point = InputView.intputPoint();
		int isCredit = InputView.getCreditOrCash();
		System.out.println(allPay.getTotalCost(point, isCredit) + "�Դϴ�.");
		System.out.println("## ���Ÿ� �Ϸ��߽��ϴ�.");
	}


}