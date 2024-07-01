package Tests.Polymorphism;

public class Truck extends Wheeler{

  public Truck() {

  }

  public Truck(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
    System.out.println("트럭 : 바퀴 " + wheelNumber + "개입니다.");
  }

  @Override
  public void speedUp(int speed) {
    this.velocity += speed * 5;
    if(velocity > 100) {
      this.velocity = 100;
      System.out.println("트럭의 최고속도위반으로 속도를 100으로 내립니다.");
    }
  }

  @Override
  public void speedDown(int speed) {
    this.velocity -= speed * 5;
    if(velocity < 50) {
      this.velocity = 50;
      System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
    }
  }
}
