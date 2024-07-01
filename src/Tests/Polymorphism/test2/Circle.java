package Tests.Polymorphism.test2;

public class Circle extends Shape{

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void calculationArea() {
    setArea(radius * radius * Math.PI );
    System.out.printf("원의 면적은 %.13f\n", getArea());
  }
}
