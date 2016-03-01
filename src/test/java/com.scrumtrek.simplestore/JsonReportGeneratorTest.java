package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.formatter.JsonReportFormatter;
import com.scrumtrek.simplestore.model.Customer;
import com.scrumtrek.simplestore.model.Movie;
import com.scrumtrek.simplestore.model.Rental;
import com.scrumtrek.simplestore.pricecodes.PriceCodes;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("MovieTitle1", PriceCodes.NewRelease, 3));
        list.add(new Movie("MovieTitle2", PriceCodes.NewRelease, 3));
        Rental r = new Rental(list);
        sut.addRental(r);
        //region When
        String result = reportGenerator.createReport(sut, new JsonReportFormatter()).toString();

        String expectedResult = "{\n" +
                "\tcustomer: Test customer\n" +
                "\trentals: {\n" +
                "\t\trental: {\n" +
                "\t\t\tmovie: MovieTitle1\n" +
                "\t\t\tmovie: MovieTitle2\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tamount: 18.0\n" +
                "}\n";
        Assert.assertEquals(expectedResult, result);

    }
}
