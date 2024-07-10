package Tests.ObjectString.ObjectEx1;

public class Vehicle {

  private Owner owner;
  private int price;

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Vehicle) {
      if (this.owner.getName().equals(owner.getName())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    String str = "소유주정보 : 이름은 " + owner.getName() + "이고, 핸드폰 번호는 " + owner.getCellPhone() + "입니다.\n"
        + "차량정보 : 가격은 " + price + "입니다.";

    return str;
  }
}
