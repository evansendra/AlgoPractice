package sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class BogoSortTest {

    @Test
    public void testSort() throws Exception {
        assertArrayEquals(new int[]{1,2,3}, BogoSort.sort(new int[]{2,1,3}));
        assertArrayEquals(new int[]{1,2,3}, BogoSort.sort(new int[]{1,2,3}));
        assertArrayEquals(new int[]{3,3,3}, BogoSort.sort(new int[]{3,3,3}));
        assertArrayEquals(new int[]{1,2}, BogoSort.sort(new int[]{2,1}));
        assertArrayEquals(new int[]{1}, BogoSort.sort(new int[]{1}));
        assertArrayEquals(new int[]{}, BogoSort.sort(new int[]{}));
    }

}