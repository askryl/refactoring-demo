package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.formatter.ReportFormatter;
import com.scrumtrek.simplestore.formatter.StringReportFormatter;
import com.scrumtrek.simplestore.model.Customer;

/**
 * Created by AnnaEeePC on 01.03.2016.
 */
public class ReportGenerator {

    public Object createReport(Customer customer, ReportFormatter formatter) {
        Report report = new ReportCalculator().calculate(customer);
        return formatter.formatReport(report, 1).toString();
    }
}
