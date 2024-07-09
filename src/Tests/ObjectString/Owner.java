package Tests.ObjectString;

public class Owner {
  private String name;
  private String cellPhone;

  public Owner(String name, String cellPhone) {
    this.name = name;
    this.cellPhone = cellPhone;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Owner owner) {
      if(this.name.equals(owner.name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    String str = "이름은 " + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다.";
    return str;
  }

  public String getName() {
    return name;
  }

  public String getCellPhone() {
    return cellPhone;
  }
}
