package com.scrumtrek.simplestore;

import org.junit.Test;

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
}
