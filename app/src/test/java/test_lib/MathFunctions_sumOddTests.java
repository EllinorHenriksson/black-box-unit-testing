package test_lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

// This is the test class for the sumOdd function in MathFunctions
class MathFunctions_sumOddTests {

  @Test void sumOddTest() {
    final int expected = 4;
    int[] numbers = {0, 1, 2, 3};
    final int actual = MathFunctions.sumOdd(numbers);
    
    assertEquals(expected, actual, "Sum of odd numbers in: " + Arrays.toString(numbers) + " should be " + expected);
  }

  // TODO: Implement more unit tests
}