package com.scrumtrek.simplestore;

import java.util.List;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class Report {

    private double totalAmount = 0;
    private int frequentRenterPoints = 0;
    private List<MovieReport> movieReports;

    public Report(double totalAmount, int frequentRenterPoints, List<MovieReport> movieReports) {
        this.totalAmount = totalAmount;
        this.frequentRenterPoints = frequentRenterPoints;
        this.movieReports = movieReports;
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

    public List<MovieReport> getMovieReports() {
        return movieReports;
    }

    public void setMovieReports(List<MovieReport> movieReports) {
        this.movieReports = movieReports;
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
