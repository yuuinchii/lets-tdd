package tdd.theMoneyExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

  @Test
  public void testMultiplication(){
      Dollar five = new Dollar(5);
      assertEquals(new Dollar(10), five.times(2));
      assertEquals(new Dollar(10), five.times(3));
  }

  @Test
  public void testEquality(){
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
  }

  @Test
  public void testFrancMultiplication(){
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(10), five.times(3));
  }

}
