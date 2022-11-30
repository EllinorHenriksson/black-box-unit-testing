package test_lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MenuTests {
  public class PrintStreamMock extends PrintStream {
    public String printedMessage;
    public PrintStreamMock(OutputStream outputStream) {
      super(outputStream);
    }

    public void println(String input) {
      printedMessage = input;
    }
  }
  @Test void doMenuShouldReturnDoStuffFor1() {
    final Scanner scan = new Scanner("1");
    final PrintStreamMock mock = new PrintStreamMock(OutputStream.nullOutputStream());
    Menu menu = new Menu(mock, scan);

    final Menu.Action expected = Menu.Action.DoStuff;
    final Menu.Action actual = menu.doMenu();
    
    assertEquals(expected, actual, "Menu action for input 1 should be " + expected);
  }

  @Test void doMenuShouldReturnQuitFor0() {
    final Scanner scan = new Scanner("0");
    final PrintStreamMock mock = new PrintStreamMock(OutputStream.nullOutputStream());
    Menu menu = new Menu(mock, scan);

    final Menu.Action expected = Menu.Action.Quit;
    final Menu.Action actual = menu.doMenu();
    
    assertEquals(expected, actual, "Menu action for input 0 should be " + expected);
  }
}
