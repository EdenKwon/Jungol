package Tests.InheritanceTest.LunchTest;

public class CheckingAccount extends Account{

  private String cardNo;

  public CheckingAccount() {

  }

  public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
    super(accId, balance, ownerName);
    this.cardNo = cardNo;
  }

  public void pay(String cardNo, long amount) {
    if(!checkCardNo(this.cardNo, cardNo) || !evalBal(getBalance(), amount)) {
      System.out.println("지불이 불가능합니다.");
    } else {
        withdraw(amount);
    }
  }

  public boolean checkCardNo(String thisCardNo, String cardNo) {
    if(thisCardNo.equals(cardNo)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean evalBal(long balance, long amount) {
    if(balance >= amount) {
      return true;
    } else {
      return false;
    }
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }



  @Override
  public void calcRate() {

  }
}
