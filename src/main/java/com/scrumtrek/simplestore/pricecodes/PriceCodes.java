package com.scrumtrek.simplestore.pricecodes;

import com.scrumtrek.simplestore.pricecodes.*;

public enum PriceCodes {
	Regular(new RegularRentalCalculator()),
	NewRelease(new NewReleaseRentalCalculator()),
	Childrens(new ChildrenRentalCalculator()),
	XXX(new XXXReportCalculator());

	private MovieReportCalculator calculator;

	PriceCodes(MovieReportCalculator calculator) {
		this.calculator = calculator;
	}

	public MovieReportCalculator getCalculator() {
		return calculator;
	}
}
