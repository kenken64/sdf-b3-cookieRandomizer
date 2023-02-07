package sg.edu.nus.iss.app;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import sg.edu.nus.iss.app.server.Cookie;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testCookieContainsValue() throws IOException {
        List<String> result = Cookie
                .getDataFromText("/Users/kennethphang/Projects/workshop4/cookies_file.txt");
        assertTrue(result.size() > 0);
    }

    @Test
    public void testCookieIsNotNull() throws IOException {
        List<String> result = Cookie
                .getDataFromText("/Users/kennethphang/Projects/workshop4/cookies_file.txt");
        assertTrue(result != null);
    }

   
}
