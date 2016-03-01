package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.model.Movie;
import com.scrumtrek.simplestore.model.Rental;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class ReportCalculator {

    public Report calculate(List<Rental> rentals) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        List<Report.RentalReport> rentalReports = new ArrayList<>();

        for(Rental rental: rentals) {
            List<Report.MovieReport> movieReports = new ArrayList<>();
            double rentalAmount = 0;
            for (Movie movie: rental.getMovies()) {
                Report.MovieReport movieReport = movie.getPriceCode().getCalculator().calculate(movie);
                movieReports.add(movieReport);
                rentalAmount += movieReport.getAmount();
            }
            Report.RentalReport rentalReport = new Report.RentalReport(rentalAmount, movieReports);
            rentalReports.add(rentalReport);
            totalAmount += rentalReport.getAmount();

            // Determine amounts for rental line
//            Report.RentalReport report = rental.getMovie().getPriceCode().getCalculator().calculate(rental);

            // Add frequent renter points
//            frequentRenterPoints++;

            // Add bonus for a two-day new-release rental
//            if ((rental.getMovie().getPriceCode() == PriceCodes.NewRelease) && (rental.getDaysRented() > 1))
//            {
//                frequentRenterPoints ++;
//            }

            // Show figures for this rental

//            movieReports.add(report);
//            totalAmount += report.getAmount();
        }


        return new Report(totalAmount, frequentRenterPoints, rentalReports);
    }
}
