import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by DY on 14-6-21.
 */
public class CompareNumberTest {

    private CompareNumber compareNumber;
    @Before
    public void setUp() {
        compareNumber = new CompareNumber();
    }



    @Test
    public void should_return_2A2B() {
        assertEquals("2A2B", compareNumber.calculateMatch("1234", "1432"));
        assertEquals("2A2B", compareNumber.calculateMatch("1234", "2134"));
        assertEquals("2A2B", compareNumber.calculateMatch("1234", "1324"));
    }

    @Test
    public void should_return_0A0B() {
        assertEquals("0A0B", compareNumber.calculateMatch("1234", "6789"));
        assertEquals("0A0B", compareNumber.calculateMatch("1234", "6789"));
        assertEquals("0A0B", compareNumber.calculateMatch("1234", "6789"));
    }


    @Test
    public void should_return_4A0B() {
        assertEquals("4A0B", compareNumber.calculateMatch("1234", "1234"));
    }

    @Test
    public void should_return_0A4B() {
        assertEquals("0A4B", compareNumber.calculateMatch("1234", "4321"));
    }

}
