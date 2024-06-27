package morning_test.day6_27;

import java.io.*;

public class BankApplication {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private AccountInfo[] account = new AccountInfo[100];
  int accNum = 0;

  public void setAccount() throws IOException {
    System.out.println("--------------------");
    System.out.println("계좌 생성");
    System.out.println("--------------------");

    AccountInfo ac = new AccountInfo();
    System.out.print("계좌 번호");
    ac.setAccNum(br.readLine());

    System.out.print("계좌 주");
    ac.setName(br.readLine());

    System.out.print("초기입금액");
    ac.setInitDeposit(Integer.parseInt(br.readLine()));

    this.account[accNum] = ac;
    accNum++;
    System.out.println("결과 : 계좌가 생성되었습니다.");
  }

  public void getAccountList() {
    System.out.println("--------------------");
    System.out.println("계좌 목록");
    System.out.println("--------------------");

    for(int i=0; i<100; i++) {
      if(account[i] != null) {
        System.out.print(account[i].getAccNum() +"\t");
        System.out.print(account[i].getName() +"\t");
        System.out.print(account[i].getInitDeposit() +"\n");
      }
    }
  }

  public void deposit() throws IOException {
    AccountInfo currentAcc;
    String accNum;
    int depositMoney;

    System.out.println("--------------------");
    System.out.println("예금");
    System.out.println("--------------------");

    System.out.print("계좌 번호: ");
    accNum = br.readLine();
    System.out.print("예금액: ");
    depositMoney = Integer.parseInt(br.readLine());

    currentAcc = getCurrentAcc(accNum);
    currentAcc.depositAcc(depositMoney);

    System.out.println("입금이 완료되었습니다.");
  }

  public void withdrawal() throws IOException {
    //잔액 부족 추가해야함
    AccountInfo currentAcc;
    String accNum;
    int withdrawalMoney, balance;

    System.out.println("--------------------");
    System.out.println("출금");
    System.out.println("--------------------");

    System.out.print("계좌 번호: ");
    accNum = br.readLine();
    System.out.print("출금액: ");
    withdrawalMoney = Integer.parseInt(br.readLine());

    //계좌번호로 계좌 정보 불러오기
    currentAcc = getCurrentAcc(accNum);
    balance = currentAcc.getInitDeposit();

    if(checkWithdrawal(balance, withdrawalMoney)) {
      currentAcc.withdrawalAcc(withdrawalMoney);
      System.out.println("출금이 완료되었습니다.");
    } else {
      System.out.println("잔액이 부족합니다. 출금액을 확인해주세요.");
    }
  }

  public void byeBye() {
    System.out.println("프로그램 종료");
  }

  public AccountInfo getCurrentAcc(String accNum) throws IOException {
    try {
      for(int i=0; i<100; i++) {
        if(this.account[i].getAccNum().equals(accNum)) {
          return this.account[i];
        }
      }
    } catch (NullPointerException e) {
      System.out.println("계좌가 조회되지 않습니다.");
      Q20.startMenu();
    }
    return null;
  }

  public boolean checkWithdrawal(int balance, int withdrawalMoney) {
    if (balance > withdrawalMoney) {
      return true;
    } else {
      return false;
    }
  }
}
