package com.scrumtrek.simplestore.model;

import java.util.Arrays;
import java.util.List;

public class Rental {
	private List<Movie> movies;

	public Rental(List<Movie> movies) {
		this.movies = movies;
	}

	public Rental(Movie movie) {
		this.movies = Arrays.asList(movie);
	}

	public List<Movie> getMovies() {
		return movies;
	}
}

