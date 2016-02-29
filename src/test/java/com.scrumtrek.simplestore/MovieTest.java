package com.scrumtrek.simplestore;

import com.scrumtrek.simplestore.pricecodes.PriceCodes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public class MovieTest {

    @Test
    public void shouldSetTitleAndPriceCodeWhenCreateMovie() {

        //region When
        Movie sut = new Movie("Test title", PriceCodes.NewRelease);
        //endregion

        //region Then
        assertEquals("Test title", sut.getTitle());
        assertEquals(PriceCodes.NewRelease, sut.getPriceCode());
        //endregion
    }

}
