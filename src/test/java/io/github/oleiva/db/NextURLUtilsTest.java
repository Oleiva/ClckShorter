package io.github.oleiva.db;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**

 */
public class NextURLUtilsTest {


    public void assertNextShortURL(String currentUrl, String expectedNextShortUrl) {

        String actualNextShortURL = NextURLUtils.getNextUrl(currentUrl);
        assertEquals(expectedNextShortUrl, actualNextShortURL);
    }

    @Test
    public void testNextURLAquisition() {
        assertNextShortURL("a", "b");
        assertNextShortURL("z", "A");
        assertNextShortURL("A", "B");
        assertNextShortURL("Z", "0");
        assertNextShortURL("9", "aa");
        assertNextShortURL("aa", "ab");
        assertNextShortURL("999", "aaaa");

    }

}
