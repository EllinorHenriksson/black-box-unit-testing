package test_lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;
import java.io.PrintStream;

public class StringFunctions_printHelloWorldTests {
  public class PrintStreamMock extends PrintStream {
    public String printedMessage;
    public PrintStreamMock(OutputStream outputStream) {
      super(outputStream);
    }

    public void println(String input) {
      printedMessage = input;
    }
  }
  @Test void printHelloWorld() {

    // In this test case you need to check that the function under test actually
    // calls the println(String x) method on the supplied PrintStream object.
    // To do this you need to create a mock PrintStream class so you can override the println method.
    // The Outpustream.nullOutPutStream() can provide an valid outputstream object that does nothing.
    // For example:
    // StringFunctions.printHelloWorld(new PrintStream(OutputStream.nullOutputStream()));
    //
    // Likely you will need to inherit from PrintStream and override println to create your
    // mock class.
    
    // TODO: Assert that the string "Hello World!" is actually printed.

    PrintStreamMock mock = new PrintStreamMock(OutputStream.nullOutputStream());
    StringFunctions.printHelloWorld(mock);

    final String expected = "Hello World!";
    final String actual = mock.printedMessage;
    
    assertEquals(expected, actual, "Printed message should be " + expected);
  }
}
