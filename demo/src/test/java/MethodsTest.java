import org.junit.Assert;
import org.junit.Test;

import com.example.Methods;
public class MethodsTest {
    Methods object = new Methods();
    @Test
    public void testLeastOfPairs1()
    {      
       Assert.assertArrayEquals(new int[]{1,3,4}, Methods.leastOfPairs(new int[]{1,4,7}, new int[]{3,3,4}));
    }

    @Test
    public void testLeastOfPairs2()
    {      
       Assert.assertArrayEquals(new int[]{2,3,4}, Methods.leastOfPairs(new int[]{1,4,7}, new int[]{3,3,4}));
    }

    @Test
    public void testIsSingleWord1()
    {
        Assert.assertTrue(object.isSingleWord(" волк "));
    }

    @Test
    public void testIsSingleWord2()
    {
        Assert.assertTrue(object.isSingleWord(" если волк молчит "));
    }
}
