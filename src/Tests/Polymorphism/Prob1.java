package Tests.Polymorphism;

public class Prob1 {
  public static void main(String[] args) {
    Truck 트럭 = new Truck("트럭", 100, 4);
    Bike 자전거 = new Bike("자전거", 25, 2);

    트럭.getVelocity();
    자전거.getVelocity();

    트럭.speedDown(15);
    자전거.speedUp(50);

    트럭.stop();
    자전거.stop();
  }
}
