package Tests.InheritanceTest;

public class Drink {

  String name;
  int price;
  int count;

  public Drink() {

  }

  public Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public int getTotalPrice() {
    return price * count;
  }

  public static void printTitle() {
    System.out.println("상품명\t단가\t수량\t금액\t");
  }

  public void printData() {
    System.out.println(name + "\t\t" + price + "\t\t" + count + "\t\t" + getTotalPrice());
  }
}
