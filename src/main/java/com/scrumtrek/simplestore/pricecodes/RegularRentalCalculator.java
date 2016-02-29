package com.scrumtrek.simplestore.pricecodes;

import com.scrumtrek.simplestore.model.Rental;
import com.scrumtrek.simplestore.model.Report;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class RegularRentalCalculator extends MovieReportCalculator {

    @Override
    public Report.MovieReport calculate(Rental rental) {
        double thisAmount = 2;
        if (rental.getDaysRented() > 2)
        {
            thisAmount += (rental.getDaysRented() - 2) * 1.5;
        }
        return new Report.MovieReport(rental.getMovie().getTitle(), thisAmount);
    }
}
