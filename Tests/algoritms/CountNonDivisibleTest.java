package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountNonDivisibleTest {
  CountNonDivisible c;

  @Before
  public void setUp() throws Exception {
    c = new CountNonDivisible();
  }

  @Test
  public void test() {
    int[] a = {3,1,2,3,6};
    assertArrayEquals(new int[]{2, 4, 3, 2, 0}, c.solution(a));
  }

}
