package Tests.morning_test.day6_27;

public class Q17 {

  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");

    Printer.println("10");
    Printer.println("true");
    Printer.println("5.7");
    Printer.println("홍길동");
  }
}
