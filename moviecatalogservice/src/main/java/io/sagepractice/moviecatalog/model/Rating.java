package io.sagepractice.moviecatalog.model;

public class Rating {
	private String MovieId;
	private int rate;
	public String getMovieId() {
		return MovieId;
	}
	public void setMovieId(String movieId) {
		MovieId = movieId;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Rating(String movieId, int rate) {
		super();
		MovieId = movieId;
		this.rate = rate;
	}
	
}
