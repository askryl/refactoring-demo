package com.scrumtrek.simplestore.formatter;

import com.scrumtrek.simplestore.Report;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by AnnaEeePC on 01.03.2016.
 */
public abstract class ReportFormatter {

    public Object formatReport(Report report, int reportType) {
        Object header = formatHeader(report);
        Object body = formatBody(report);
        Object footer = formatFooter(report);

        return formatReport(header, body, footer);
    }

    protected abstract Object formatHeader(Report report);
    protected abstract Object formatBody(Report report);
    protected abstract Object formatBodyHeaders(Report report);
    protected abstract Object formatFooter(Report report);

    protected abstract Object formatReport(Object... reportParts);
}
