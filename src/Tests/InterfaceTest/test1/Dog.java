package Tests.InterfaceTest.test1;

public class Dog extends Animal{

  public Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    setDistance(getSpeed() * hours / 2);
  }

}
