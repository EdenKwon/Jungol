package Tests.Polymorphism.test1;

public abstract class Wheeler {
  protected int velocity;
  protected String carName;
  protected int wheelNumber;

  abstract public void speedUp(int speed);

  abstract public void speedDown(int speed);

  public void stop(){
    velocity = 0;
    System.out.println("정지상태로 속도를 0으로 초기화합니다.");
  }

  public void getVelocity() {
    System.out.println(carName + "의 현재 속도는 "+ velocity + " 입니다.");
  }

  public String getCarName() {
    return carName;
  }

  public int getWheelNumber() {
    return wheelNumber;
  }
}

