package com.scrumtrek.simplestore;

import java.util.List;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class Report {

    private double totalAmount = 0;
    private int frequentRenterPoints = 0;
    private List<RentalReport> rentalReports;
    private String customerName;

    public Report(double totalAmount, int frequentRenterPoints, List<RentalReport> movieReports, String customerName) {
        this.totalAmount = totalAmount;
        this.frequentRenterPoints = frequentRenterPoints;
        this.rentalReports = movieReports;
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public void setFrequentRenterPoints(int frequentRenterPoints) {
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public List<RentalReport> getRentalReports() {
        return rentalReports;
    }

    public void setRentalReports(List<RentalReport> rentalReports) {
        this.rentalReports = rentalReports;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public static class RentalReport {
        private double amount;
        private List<MovieReport> movieReports;

        public RentalReport(double amount, List<MovieReport> movieReports) {
            this.amount = amount;
            this.movieReports = movieReports;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public List<MovieReport> getMovieReports() {
            return movieReports;
        }

        public void setMovieReports(List<MovieReport> movieReports) {
            this.movieReports = movieReports;
        }
    }

    public static class MovieReport {
        private String movieTitle;
        private double amount;

        public MovieReport(String movieTitle, double amount) {
            this.movieTitle = movieTitle;
            this.amount = amount;
        }

        public String getMovieTitle() {
            return movieTitle;
        }

        public void setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }
}
