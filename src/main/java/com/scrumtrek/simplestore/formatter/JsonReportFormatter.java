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
        return "\tcustomer: " + report.getCustomerName() + ",\n" ;
    }

    @Override
    protected Object formatBody(Report report) {
        return "\trentals: {\n";
    }

    @Override
    protected Object formatBodyHeaders(Report report) {
        return "";
    }

    @Override
    protected Object formatFooter(Report report) {
        return "\t},\n\tamount: " + report.getTotalAmount();
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
