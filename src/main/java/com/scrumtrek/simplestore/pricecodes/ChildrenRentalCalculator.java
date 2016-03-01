package com.scrumtrek.simplestore.pricecodes;

import com.scrumtrek.simplestore.model.Movie;
import com.scrumtrek.simplestore.Report;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class ChildrenRentalCalculator  extends MovieReportCalculator {

    @Override
    public Report.MovieReport calculate(Movie movie) {
        double thisAmount = 1.5;
        if (movie.getDaysRented() > 3)
        {
            thisAmount += (movie.getDaysRented() - 3) * 1.5;
        }
        return new Report.MovieReport(movie.getTitle(), thisAmount);
    }
}