package main.java.domain;

public class Reservation {
	private final int movieId;
	private final int scheduleNumber;
    private final int buyCount;
    
	public Reservation(int movieId, int scheduleNumber, int buyCount) {
		this.movieId = movieId;
		this.scheduleNumber = scheduleNumber;
		this.buyCount = buyCount;
		setMovieRepository();
	}

	private void setMovieRepository() {
		//movieId를 인자로 Movie를 찾고
		//playschedule에서 capacity제거
		MovieRepository.buyMovieTickets(movieId, scheduleNumber, buyCount);
	}
    
}
