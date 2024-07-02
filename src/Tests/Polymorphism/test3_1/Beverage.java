package Tests.Polymorphism.test3_1;

public abstract class Beverage {

  private String name;
  protected int price;

  public Beverage(String name) {
    this.name = name;
  }

  abstract void calcPrice();

  public void print() {
    System.out.println("음료 판매 정보를 출력해요");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
