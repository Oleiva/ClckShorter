package io.github.oleiva.db;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.github.oleiva.rest.BaseRestTest;
import io.github.oleiva.rest.client.URLClient;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

/**
 */
public class LimitsTest extends BaseRestTest {

    DBHelper dbHelper;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();

        dbHelper = DBHelper.getInstance();
        dbHelper.setIgnoreLocalHost(true);
    }

    @Test
    public void testLimitsUpload() throws Exception{
        ArrayList<String> resultUrls = new ArrayList<>();

        try {
            for (int i = 0; i < 200; i++) {
                String fullUrl = "http://test245" + i + ".in.ua";
                String shortULR = URLClient.postUrlToRest(fullUrl);
                resultUrls.add(shortULR);
            }
        } catch (RuntimeException e) {
            assertNotNull(e);
            return;
        } finally {
            for (String shortURL : resultUrls) {
                dbHelper.removeShortUrl(shortURL);
            }
        }

        assertNotNull(null);
    }

    @Override
    @After
    public void tearDown() throws Exception {
        super.tearDown();
        DBHelper.getInstance().setIgnoreLocalHost(false);
    }

}
