package sh.power;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestHello {

  @Test
  public void testMyHandler() {
    Hello h = new Hello();
    String result = h.myHandler();
    assertEquals("namaste", result);
  }

}
