package com.scrumtrek.simplestore.pricecodes;

import com.scrumtrek.simplestore.model.Rental;
import com.scrumtrek.simplestore.model.Report;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class ChildrenRentalCalculator  extends MovieReportCalculator {

    @Override
    public Report.MovieReport calculate(Rental rental) {
        double thisAmount = 1.5;
        if (rental.getDaysRented() > 3)
        {
            thisAmount += (rental.getDaysRented() - 3) * 1.5;
        }
        return new Report.MovieReport(rental.getMovie().getTitle(), thisAmount);
    }
}