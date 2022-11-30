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

  @Test void sumOddShouldNotModifyOriginalArray() {
    int[] numbers = {0, 1, 2, 3};
    final int[] expected = numbers.clone();

    MathFunctions.sumOdd(numbers);

    final int[] actual = numbers; 
    
    assertEquals(expected, actual, "The original array should be " + Arrays.toString(expected) + " after passing it to sumOdd");
  }

  @Test void sumOddShouldReturnSumForNegativeIntegers() {
    final int expected = -4;
    int[] numbers = {0, -1, -2, -3};
    final int actual = MathFunctions.sumOdd(numbers);
    
    assertEquals(expected, actual, "Sum of odd numbers in: " + Arrays.toString(numbers) + " should be " + expected);
  }

  @Test void sumOddShouldReturnSumForIntegersInRandomOrder() {
    final int expected = 4;
    int[] numbers = {1, 0, 3, 2};
    final int actual = MathFunctions.sumOdd(numbers);
    
    assertEquals(expected, actual, "Sum of odd numbers in: " + Arrays.toString(numbers) + " should be " + expected);
  }

  @Test void sumOddShouldReturnZeroForEmptyArray() {
    final int expected = 0;
    int[] numbers = {};
    final int actual = MathFunctions.sumOdd(numbers);
    
    assertEquals(expected, actual, "Sum of odd numbers in: " + Arrays.toString(numbers) + " should be " + expected);
  }
}