package com.scrumtrek.simplestore.pricecodes;

import com.scrumtrek.simplestore.Rental;
import com.scrumtrek.simplestore.Report;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class NewReleaseRentalCalculator extends MovieReportCalculator {

    @Override
    public Report.MovieReport calculate(Rental rental) {
        double thisAmount = rental.getDaysRented() * 3;
        return new Report.MovieReport(rental.getMovie().getTitle(), thisAmount);
    }
}
