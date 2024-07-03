package Tests.InterfaceTest.test2;

public abstract class Factory {
  private int openHour;
  private int closeHour;
  private String name;

  public Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  public String getFactoryName() {
    return name;
  }

  public int getWorkingTime() {
    return closeHour - openHour; // 수정
  }

  public abstract int makeProduct(char skill);
}
