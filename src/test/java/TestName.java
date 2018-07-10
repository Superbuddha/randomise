import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestName {

    private Name testnames;

    @Before
    public void before() {
        testnames = new Name();
    }

    @Test
    public void hasNames() {
        assertEquals(6, testnames.getNames().size());
    }


    @Test
    public void testRandomise() {
        Name acceptedvalues = new Name();
        String result = acceptedvalues.randomise();
        assertEquals(true, acceptedvalues.getNames().contains(result));
    }
}