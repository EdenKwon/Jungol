package ClassTest.Account;

public class Account {
  private String accNo;
  private int balance;

  public Account() {
    
  }
  
  public Account(String accNo) {
    this.accNo = accNo;
    System.out.println(accNo + " 계좌가 개설되었습니다.");
  }

  public void save(int money) {
    balance += money;
    System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
  }

  public void deposit(int money) {
    if(!checkBalance(balance, money)) {
      System.out.println("계좌 잔액이 부족합니다. 출금 금액을 다시 설정해주세요.");
    } else {
      balance -= money;
      System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
    }
  }

  public boolean checkBalance(int balance, int money) {
    if(balance >= money) {
      return true;
    } else {
      return false;
    }
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public String getAccNo() {
    return accNo;
  }

  public int getBalance() {
    return balance;
  }
}
