package morning_test.day6_27;

public class AccountInfo {
  private String accNum;
  private String name;
  private int initDeposit;

  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getInitDeposit() {
    return initDeposit;
  }

  public void setInitDeposit(int initDeposit) {
    this.initDeposit = initDeposit;
  }

  public void depositAcc(int depositMoney) {
    this.initDeposit += depositMoney;
  }

  public void withdrawalAcc(int withdrawalMoney) {
    this.initDeposit -= withdrawalMoney;
  }
}
