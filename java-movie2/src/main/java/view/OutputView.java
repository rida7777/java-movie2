package main.java.view;

import java.util.List;

import main.java.domain.AllPay;
import main.java.domain.Movie;
import main.java.domain.MovieRepository;

public class OutputView {
    public static void printMovies(List<Movie> movies) {
    	System.out.println("## 상영영화 목록");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

	public static void printPlaySchedule(int movieId) {
		System.out.println(MovieRepository.getWantMovie(movieId));
	}

	public static void printPayResult(AllPay allPay) {
		System.out.print("## 최종 결제 금액은");
		int point = InputView.intputPoint();
		int isCredit = InputView.getCreditOrCash();
		System.out.println(allPay.getTotalCost(point, isCredit) + "입니다.");
		System.out.println("## 예매를 완료했습니다.");
	}


}