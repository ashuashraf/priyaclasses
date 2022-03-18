package io.sagepractice.moviecatalog.model;

public class Movie {
	private String movidId;
	private String name;
	public String getMovidId() {
		return movidId;
	}
	public void setMovidId(String movidId) {
		this.movidId = movidId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie(String movidId, String name) {
		super();
		this.movidId = movidId;
		this.name = name;
	}
	public Movie() {
		
	}
	

}
