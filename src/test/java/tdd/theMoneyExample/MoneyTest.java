package tdd.theMoneyExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
  public void test Multiplication(){
      Dollar five = new Dollar(5);

      five.times(2);
      assertEquals(10, five.amount);
  }

}
