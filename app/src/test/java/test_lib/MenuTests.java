package test_lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MenuTests {
  public class PrintStreamMock extends PrintStream {
    public boolean hasPrinted;
    public PrintStreamMock(OutputStream outputStream) {
      super(outputStream);
      hasPrinted = false;
    }

    public void println(String input) {
      hasPrinted = true;
    }
  }

  @Test void doMenuShouldPrintMenu() {
    final Scanner scan = new Scanner("1");
    final PrintStreamMock mock = new PrintStreamMock(OutputStream.nullOutputStream());
    Menu menu = new Menu(mock, scan);

    final boolean expected = true;
    menu.doMenu();
    final boolean actual = mock.hasPrinted;
    
    assertEquals(expected, actual, "Menu has been printed should be " + expected);
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

  @Test void doMenuShouldReturnActionForInvalidInputFollowedByValidInput() {
    final Scanner scan = new Scanner("2\n0");
    final PrintStreamMock mock = new PrintStreamMock(OutputStream.nullOutputStream());
    Menu menu = new Menu(mock, scan);

    final Menu.Action expected = Menu.Action.Quit;
    final Menu.Action actual = menu.doMenu();
    
    assertEquals(expected, actual, "Menu action for invalid input followed by 0 should be " + expected);
  }
}
