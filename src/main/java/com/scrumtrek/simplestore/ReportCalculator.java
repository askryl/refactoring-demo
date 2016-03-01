package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.model.Customer;
import com.scrumtrek.simplestore.model.Movie;
import com.scrumtrek.simplestore.model.Rental;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class ReportCalculator {

    public Report calculate(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        List<Report.RentalReport> rentalReports = new ArrayList<>();

        for(Rental rental: customer.getM_Rentals()) {
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
        }


        return new Report(totalAmount, frequentRenterPoints, rentalReports, customer.getName());
    }
}
