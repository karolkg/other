package algoritms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
  Triangle t;

  @Before
  public void setUp() throws Exception {
    t = new Triangle();
  }

  @Test
  public void testQuickSortArray() {
    int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    t.solution(a);
    assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, a);
  }
  
  @Test
  public void testNoTriangleInArray() {
    int[] a = {10, 5, 1, 20};
    assertEquals(0, t.solution(a));
  }
  
  @Test
  public void testTriangleInArray() {
    int[] a = {10, 5, 8};
    assertEquals(1, t.solution(a));
  }
  
  @Test
  public void testEmptyArray() {
    int[] a = {};
    assertEquals(0, t.solution(a));
  }
  
  @Test
  public void test1ElementArray() {
    int[] a = {1};
    assertEquals(0, t.solution(a));
  }
  
  @Test
  public void test2ElementsArray() {
    int[] a = {1,2};
    assertEquals(0, t.solution(a));
  }
  
  @Test
  public void testMaxInt() {
    int x = Integer.MAX_VALUE;
    int[] a = {x,x,x};
    assertEquals(1, t.solution(a));
  }

}
