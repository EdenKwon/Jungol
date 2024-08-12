package Tests.Polymorphism.test3_1;

public class Tea extends Beverage{

  public static int amount;

  public Tea(String name) {
    super(name);
    calcPrice();
    amount ++;
  }

  @Override
  void calcPrice() {
    switch (getName()) {
      case "lemonTea":
        this.price = 1500;
        break;
      case "ginsengTea":
        this.price = 2000;
        break;
      case "redginsengTea":
        this.price = 2500;
        break;
      default:
        System.out.println("메뉴판에 없어요");
    }
  }
}
