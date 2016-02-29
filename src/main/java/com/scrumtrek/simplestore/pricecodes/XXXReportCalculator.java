package com.scrumtrek.simplestore.pricecodes;

import com.scrumtrek.simplestore.Rental;
import com.scrumtrek.simplestore.Report;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class XXXReportCalculator  extends MovieReportCalculator {

    @Override
    public Report.MovieReport calculate(Rental rental) {
        double thisAmount = 2;
        if (rental.getDaysRented() > 1)
        {
            thisAmount += (rental.getDaysRented() - 1) * 1.5;
        }
        return new Report.MovieReport(rental.getMovie().getTitle(), thisAmount);
    }
}
