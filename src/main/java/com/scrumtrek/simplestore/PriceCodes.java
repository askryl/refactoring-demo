package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.pricecodes.ChildrenRentalCalculator;
import com.scrumtrek.simplestore.pricecodes.MovieReportCalculator;
import com.scrumtrek.simplestore.pricecodes.NewReleaseRentalCalculator;
import com.scrumtrek.simplestore.pricecodes.RegularRentalCalculator;

public enum PriceCodes {
	Regular(new RegularRentalCalculator()),
	NewRelease(new NewReleaseRentalCalculator()),
	Childrens(new ChildrenRentalCalculator());

	private MovieReportCalculator calculator;

	PriceCodes(MovieReportCalculator calculator) {
		this.calculator = calculator;
	}

	public MovieReportCalculator getCalculator() {
		return calculator;
	}
}
