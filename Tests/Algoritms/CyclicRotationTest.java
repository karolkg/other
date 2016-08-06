package Algoritms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {
  CyclicRotation cr;
  int[] tab = {1,2,3,4,5,6,7,8,9};
  int k = 3;

  @Before
  public void setUp() throws Exception {
    cr = new CyclicRotation();   
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSolution() {
   int[] result = cr.solution(tab, k);
   
   Assert.assertArrayEquals("int", new int[]{7,8,9,1,2,3,4,5,6}, result );
  }

}
