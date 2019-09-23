package main.java.domain;

public class Reservation {
	private final int movieId;
	private final int scheduleNumber;
    private final int buyCount;
    private final Movie movie;
    
	public Reservation(int movieId, int scheduleNumber, int buyCount) {
		this.movieId = movieId;
		this.scheduleNumber = scheduleNumber;
		this.buyCount = buyCount;
		setMovieRepository();
		movie = MovieRepository.getWantMovie(movieId);
	}

	public Movie getMovie() {
		return movie;
	}

	public int getBuyCount() {
		return buyCount;
	}
	
	private void setMovieRepository() {
		//movieId�� ���ڷ� Movie�� ã��
		//playschedule���� capacity����
		MovieRepository.buyMovieTickets(movieId, scheduleNumber, buyCount);
	}
}
