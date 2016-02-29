package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.pricecodes.PriceCodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class ReportCalculator {

    public Report calculate(List<Rental> rentals) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        List<Report.MovieReport> movieReports = new ArrayList<>();

        for(Rental each: rentals) {
            // Determine amounts for each line
            Report.MovieReport report = each.getMovie().getPriceCode().getCalculator().calculate(each);

            // Add frequent renter points
            frequentRenterPoints++;

            // Add bonus for a two-day new-release rental
            if ((each.getMovie().getPriceCode() == PriceCodes.NewRelease) && (each.getDaysRented() > 1))
            {
                frequentRenterPoints ++;
            }

            // Show figures for this rental

            movieReports.add(report);
            totalAmount += report.getAmount();
        }


        return new Report(totalAmount, frequentRenterPoints, movieReports);
    }
}
