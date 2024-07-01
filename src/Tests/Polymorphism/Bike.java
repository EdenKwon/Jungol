package Tests.Polymorphism;

public class Bike extends Wheeler{

  public Bike() {

  }

  public Bike(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
    System.out.println("자전거 : 바퀴 " + wheelNumber + "개입니다.");
  }

  @Override
  public void speedUp(int speed) {
    this.velocity += speed * 5;
    if(velocity > 40) {
      this.velocity = 40;
      System.out.println("자전거의 최고속도위반으로 속도를 40으로 내립니다.");
    }
  }

  @Override
  public void speedDown(int speed) {
    this.velocity -= speed * 5;
    if(velocity < 10) {
      this.velocity = 10;
      System.out.println("자전거의 최저속도위반으로 속도를 10으로 올립니다.");
    }
  }
}
