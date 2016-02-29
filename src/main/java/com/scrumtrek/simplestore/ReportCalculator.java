package com.scrumtrek.simplestore;

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
            double thisAmount = 0;

            // Determine amounts for each line
            switch(each.getMovie().getPriceCode()) {
                case Regular:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                    {
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    }
                    break;

                case NewRelease:
                    thisAmount += each.getDaysRented() * 3;
                    break;

                case Childrens:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                    {
                        thisAmount = (each.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }

            // Add frequent renter points
            frequentRenterPoints++;

            // Add bonus for a two-day new-release rental
            if ((each.getMovie().getPriceCode() == PriceCodes.NewRelease) && (each.getDaysRented() > 1))
            {
                frequentRenterPoints ++;
            }

            // Show figures for this rental

            movieReports.add(new Report.MovieReport(each.getMovie().getTitle(), thisAmount));
            totalAmount += thisAmount;
        }


        return new Report(totalAmount, frequentRenterPoints, movieReports);
    }
}
