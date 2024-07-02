package Tests.Polymorphism.test2;

public class TestShape {
  public static void main(String[] args) {
    Shape [] shape = new Shape[2];

    shape[0] = new Circle(10.0);
    shape[1] = new Rectangular(20, "10");

    shape[0].calculationArea();
    shape[1].calculationArea();
  }
}