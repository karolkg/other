package algoritms;

import static org.junit.Assert.*;

import javax.naming.directory.InvalidAttributeValueException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algoritms.CyclicRotation;

public class CyclicRotationTest {
  CyclicRotation cr;
  protected int[] tab = {1,2,3,4,5,6,7,8,9};
  protected int k = 3;

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
   Assert.assertArrayEquals( new int[]{7,8,9,1,2,3,4,5,6}, result );
  }
 
  @Test
  public void testEmptyArray() {
    int[] array = new int[0];
    Assert.assertArrayEquals(array, cr.solution(array, k));
  }
  
  @Test
  public void testover1000() {
    int[] ar = {1,2,3,-1001,5,6,7,8,9,1001};
    Assert.assertArrayEquals(new int[]{8,9,1000,1,2,3,-1000,5,6,7}, cr.solution(ar, k));
  }

}
