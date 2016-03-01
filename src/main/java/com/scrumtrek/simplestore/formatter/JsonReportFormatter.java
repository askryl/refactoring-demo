package com.scrumtrek.simplestore.formatter;

import com.scrumtrek.simplestore.Report;

/**
 * Created by askryl on 01.03.16.
 */
public class JsonReportFormatter extends ReportFormatter {
    @Override
    public Object formatReport(Report report, int reportType) {
        return super.formatReport(report, reportType);
    }

    @Override
    protected Object formatHeader(Report report) {
        return "\tcustomer: " + report.getCustomerName() + "\n" ;
    }

    @Override
    protected Object formatBody(Report report) {
        StringBuilder sb = new StringBuilder("\trentals: {");

        for (Report.RentalReport rr : report.getRentalReports()) {
            sb.append("\n\t\trental: {");
            for (Report.MovieReport mr : rr.getMovieReports()) {
                sb.append("\n\t\t\tmovie: " + mr.getMovieTitle());
            }
            sb.append("\n\t\t\tamount: " + rr.getAmount());
            sb.append("\n\t\t}");
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override
    protected Object formatBodyHeaders(Report report) {
        return "";
    }

    @Override
    protected Object formatFooter(Report report) {
        return "\t}\n\tamount: " + report.getTotalAmount();
    }

    @Override
    protected Object formatReport(Object... reportParts) {
        String result = "{\n";
        for (Object reportPart: reportParts) {
            result += reportPart.toString() ;
        }
        result += "\n}\n";
        return result;
    }
}
