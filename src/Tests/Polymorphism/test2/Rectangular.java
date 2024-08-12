package Tests.Polymorphism.test2;

public class Rectangular extends Shape{

  private double width;
  private String hight;

  public Rectangular(double width, String hight) {
    this.width = width;
    this.hight = hight;
  }

  @Override
  public void calculationArea() {
    setArea(width * Double.parseDouble(hight));
    System.out.println("직사각형의 면적은 " + getArea());
  }
}
