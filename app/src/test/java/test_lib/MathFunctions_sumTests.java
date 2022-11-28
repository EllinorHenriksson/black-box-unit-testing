package test_lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// This is the test class for the sumOdd function in MathFunctions
public class MathFunctions_sumTests {
  @Test void sumTest() {
    final int expected = 3;
    final int actual = MathFunctions.sum(3, 0);
    
    assertEquals(expected, actual, "Sum of 3 and 0 should be " + expected);
  }

  @Test void sumShouldReturnZeroForZeros() {
    final int expected = 0;
    final int actual = MathFunctions.sum(0, 0);
    
    assertEquals(expected, actual, "Sum of 0 and 0 should be " + expected);
  }
}
