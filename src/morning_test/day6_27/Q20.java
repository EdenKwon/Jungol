package morning_test.day6_27;

import java.io.*;

public class Q20 {

  public static void main(String[] args) throws IOException {
    startMenu();
  }

  public static void startMenu() throws IOException {
    Account account = new Account();
    BankApplication bankApp = new BankApplication();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      printMenu();
      int menu = Integer.parseInt(br.readLine());
      switch (menu) {
        case 1:
          bankApp.setAccount();
          break;
        case 2:
          bankApp.getAccountList();
          break;
        case 3:
          bankApp.deposit();
          break;
        case 4:
          bankApp.withdrawal();
          break;
        case 5:
          bankApp.byeBye();
          System.exit(0);
      }
    }
  }

  public static void printMenu() {
    System.out.println("-------------------------------------");
    System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
    System.out.println("-------------------------------------");
    System.out.print("선택> ");
  }

}