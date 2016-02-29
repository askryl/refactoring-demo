package com.scrumtrek.simplestore;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.fest.assertions.Assertions.*;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class CustomerTest {

    @Test
    public void shouldTotalAmountIs0WhenNoRentalRecord() {

        //region Given
        Customer sut = new Customer("Test customer");
        //endregion

        //region When
        String result = sut.Statement();
        //endregion

        //region Then
        assertThat(result).contains("Amount owed is 0");
        //endregion
    }

    @Test
    public void shouldRegularMovieAmountAndFreqPointsWhenGetStatementDays1() {

        //region Given
        Customer sut = new Customer("Test customer");
        sut.addRental(new Rental(new Movie("MovieTitle", PriceCodes.Regular), 1));
        //endregion

        //region When
        String result = sut.Statement();
        //endregion

        //region Then
        assertThat(result).contains("Amount owed is 2");
        assertThat(result).contains("You earned 1 frequent renter points.");
        //endregion
    }

    @Test
    public void shouldRegularMovieAmountAndFreqPointsWhenGetStatementDays3() {

        //region Given
        Customer sut = new Customer("Test customer");
        sut.addRental(new Rental(new Movie("MovieTitle", PriceCodes.Regular), 3));
        //endregion

        //region When
        String result = sut.Statement();
        //endregion

        //region Then
        assertThat(result).contains("Amount owed is 3.5");
        assertThat(result).contains("You earned 1 frequent renter points.");
        //endregion
    }
}
