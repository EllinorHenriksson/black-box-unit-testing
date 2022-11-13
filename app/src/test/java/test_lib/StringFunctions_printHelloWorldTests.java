package test_lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;
import java.io.PrintStream;

public class StringFunctions_printHelloWorldTests {
  @Test void printHelloWorld() {

    // In this test case you need to check that the function under test actually
    // calls the println(String x) method on the supplied PrintStream object.
    // To do this you need to create a mock PrintStream class so you can override the println method.
    // The Outpustream.nullOutPutStream() can provide an valid outputstream object that does nothing.
    // For example:
    // StringFunctions.printHelloWorld(new PrintStream(OutputStream.nullOutputStream()));
    
    // TODO: Assert that the string "Hello World!" is actually printed.
  }
}
