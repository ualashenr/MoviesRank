package com.ualashenr.movieranks.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
	
	@JsonProperty("Title")
	private String title;
	@JsonProperty("Year")
	private Integer year;
	@JsonProperty("Released")
	private String released;
	@JsonProperty("Runtime")
	private String runtime;
	@JsonProperty("Genre")
	private String genre;
	@JsonProperty("Writer")
	private String writer;
	@JsonProperty("Plot")
	private String plot;
	@JsonProperty("Language")
	private String language;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Awards")
	private String awards;
	@JsonProperty("Ratings")
	private Ratings[] rating;
	@JsonProperty("Type")
	private String type;
	
	public Movie(){
	}

	public Movie(String title, Integer year, String released, String runtime, String genre, String writer, String plot,
			String language, String country, String awards, Ratings[] rating, String type) {
		this.title = title;
		this.year = year;
		this.released = released;
		this.runtime = runtime;
		this.genre = genre;
		this.writer = writer;
		this.plot = plot;
		this.language = language;
		this.country = country;
		this.awards = awards;
		this.rating = rating;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getReleased() {
		return released;
	}

	public void setReleased(String released) {
		this.released = released;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public Ratings[] getRating() {
		return rating;
	}

	public void setRating(Ratings[] rating) {
		this.rating = rating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
