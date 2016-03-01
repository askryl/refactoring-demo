package com.scrumtrek.simplestore.model;

import com.scrumtrek.simplestore.pricecodes.PriceCodes;

public class Movie {
	private String title;
	private PriceCodes priceCode;
	private int daysRented;

	public Movie(String title, PriceCodes priceCode, int daysRented) {
		this.title = title;
		this.priceCode = priceCode;
		this.daysRented = daysRented;
	}

	public PriceCodes getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(PriceCodes value) {
		priceCode = value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
}

