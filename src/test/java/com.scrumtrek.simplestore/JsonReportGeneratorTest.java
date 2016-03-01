package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.formatter.JsonReportFormatter;
import com.scrumtrek.simplestore.model.Customer;
import org.junit.Test;

/**
 * Created by askryl on 01.03.16.
 */
public class JsonReportGeneratorTest {
    @Test
    public void testFullJsonReport() {
        //region Given
        Customer sut = new Customer("Test customer");
        ReportGenerator reportGenerator = new ReportGenerator();
        //endregion

        //region When
        String result = reportGenerator.createReport(sut, new JsonReportFormatter()).toString();
        System.out.println(result);
    }
}
