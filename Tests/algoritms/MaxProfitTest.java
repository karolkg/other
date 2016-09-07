package algoritms;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MaxProfitTest {
  MaxProfit m;
  int MAX_ARRAY = 400000;
  int MAX_VAL = 200000;

  @Before
  public void setUp() throws Exception {
    m = new MaxProfit();
  }

  @Test
  public void testEmptyArray() {
    int[] a = {};
    assertEquals(0,m.solution(a));
  }
  
   
  @Test
  public void testShortCorrectArray() {
    int[] a = {2,2,1,2,3};
    assertEquals(2, m.solution(a));
  }
  
  @Test
  public void testMaxLoss() {
    int[] a = { 200000,1,0};
    assertEquals(0, m.solution(a));
  }
  
  @Test
  public void testMaxProfit() {
    int[] a = { 0,1, MAX_VAL};
    assertEquals(MAX_VAL, m.solution(a));
  }
  
  @Test
  public void testMaxArray() {
    int[] a = new int[MAX_ARRAY];
    Random  r = new Random();
    
    a[0] = 0;
    for(int i = 1; i < MAX_ARRAY - 1; i++) {
      a[i] = r.nextInt(MAX_VAL);      
    }
    a[MAX_ARRAY - 1] = MAX_VAL;
    
    assertEquals(MAX_VAL, m.solution(a));    
  }
  
  @Test
  public void testMinElementAray() {
    int[] a = {0};
    assertEquals(0, m.solution(a));
  }
  
  @Test
  public void max_profit_after_max_and_before_min() {
    int[] a = {MAX_VAL,1,4,0,1,1,1};
    assertEquals(3, m.solution(a));
  }

}
