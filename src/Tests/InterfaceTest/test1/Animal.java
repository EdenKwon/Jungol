package Tests.InterfaceTest.test1;

public abstract class Animal {
  private int speed;
  private double distance;

  public Animal(int speed) {
    this.speed = speed;
  }

  abstract void run(int hours);

  public double getDistance() {
    return distance;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }
}
