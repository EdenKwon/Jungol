package Tests.InheritanceTest;

public class Alcohol extends Drink {

  double alcper;

  public Alcohol() {

  }

  public Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.alcper = alcper;
  }

  public static void printTitle() {
    System.out.println("상품명(도수[%])\t단가\t수량\t금액\t");
  }

  @Override
  public void printData() {
    System.out.println(
        name + "(" + alcper + ")\t\t\t" + price + "\t\t" + count + "\t\t" + getTotalPrice());
  }

}
