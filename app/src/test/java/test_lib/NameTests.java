package test_lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test cases for the name class - focus on exceptions thrown by the constructor
public class NameTests {
  @Test void constructor() {
    assertDoesNotThrow(() -> new Name("Allan"));
  }

  @Test void constructorNullArgument_positive() {
    assertThrows(NullPointerException.class, () -> new Name(null)); // fancy lambda expression to wrap Executable functional interface
  }

  @Test void constructorIllegalCharacters_positive() {
    assertThrows(IllegalArgumentException.class, () -> new Name("411an")); // fancy lambda expression to wrap Executable functional interface
  }

  @Test void constructorToShort_positive() {
    assertThrows(IllegalArgumentException.class, () -> new Name("A")); // fancy lambda expression to wrap Executable functional interface
  }
}