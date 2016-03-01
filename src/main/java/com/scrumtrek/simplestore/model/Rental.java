package com.scrumtrek.simplestore.model;

import java.util.Arrays;
import java.util.List;

public class Rental {
	private List<Movie> movies;
	private int m_DaysRented;

	public Rental(List<Movie> movies, int m_DaysRented) {
		this.movies = movies;
		this.m_DaysRented = m_DaysRented;
	}

	public Rental(Movie movie, int m_DaysRented) {
		this.movies = Arrays.asList(movie);
		this.m_DaysRented = m_DaysRented;
	}

	public int getDaysRented() {
		return m_DaysRented;
	}

	public List<Movie> getMovies() {
		return movies;
	}
}

