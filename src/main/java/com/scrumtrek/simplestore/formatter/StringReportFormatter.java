package com.scrumtrek.simplestore.formatter;

import com.scrumtrek.simplestore.Report;

/**
 * Created by AnnaEeePC on 01.03.2016.
 */
public class StringReportFormatter extends ReportFormatter {

    @Override
    protected Object formatHeader(Report report) {
        return "Rental record for " + report.getCustomerName() + "\n";
    }

    @Override
    protected Object formatBody(Report report) {
        String result = "";
        for (Report.RentalReport rentalReport: report.getRentalReports()) {
            for (Report.MovieReport movieReport: rentalReport.getMovieReports()) {
                result += "\t" + movieReport.getMovieTitle() + "\t" + movieReport.getAmount() + "\n";
            }
        }
        return result;
    }

    @Override
    protected Object formatBodyHeaders(Report report) {
        return "";
    }

    @Override
    protected Object formatFooter(Report report) {
        String result = "";
        result += "Amount owed is " + report.getTotalAmount() + "\n";
        result += "You earned " + report.getFrequentRenterPoints() + " frequent renter points.";
        return result;
    }

    @Override
    protected Object formatReport(Object... reportParts) {
        String result = "";
        for (Object reportPart: reportParts) {
            result += reportPart.toString() + "\n";
        }
        return result;
    }
}
