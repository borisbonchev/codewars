package java_FIXME_static_electrickery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTests {
    
  @Test
  void test() {
    assertEquals(123, Dinglemouse.INST.plus100(23));
    // Err... was that right?
  }
    
}