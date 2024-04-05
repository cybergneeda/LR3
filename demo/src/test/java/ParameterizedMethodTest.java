import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.example.Methods;

@RunWith(Parameterized.class)
public class ParameterizedMethodTest {
    int[][] matrix;

    public ParameterizedMethodTest(int[][] matrix) {
        this.matrix = matrix;
    }
    @Parameters
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]
        {
           {new int[][]{{1,4,7},{3,3,4},{1,3,4}}},
           {new int[][]{{4,9,2},{6,1,5},{4,1,2}}},
           {new int[][]{{7,4,9},{1,4,1},{1,4,1}}},
           {new int[][]{{5,4,9},{9,2,3},{5,2,3}}},
           {new int[][]{{9,9,1},{3,4,8},{5,8,3}}},
        });
    }
    @Test
    public void testLeastOfPairs()
    {
        Assert.assertArrayEquals(matrix[2], Methods.leastOfPairs(matrix[0], matrix[1]));
    }
}
