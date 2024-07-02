package Tests.Polymorphism.test3_1;

public class Coffee extends Beverage {

  public static int amount;

  public Coffee(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  void calcPrice() {
    switch (getName()) {
      case "Americano":
        this.price = 1500;
        break;
      case "CafeLatte":
        this.price = 2500;
        break;
      case "Cappuccino":
        this.price = 3000;
        break;
      default:
        System.out.println("메뉴판에 없어요");
    }
  }

  @Override
  public void print() {
    System.out.println("");
  }
}
