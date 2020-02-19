import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LackOfNameTest {

    private LackOfName lackOfName;
    @Before
    public void setUp() throws Exception {
        lackOfName = new LackOfName();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void lengthOfString() {
        int result = lackOfName.lengthOfString("We tired!");
        Assert.assertEquals(18,result);
    }

    @Test
    public void multiply() {
        int result = lackOfName.multiply(4,5);
        Assert.assertEquals(29, result);
    }
}