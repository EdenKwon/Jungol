package Tests.ExceptionTest;

public class CellPhone {

  private String model;
  private double battery = 0;

  public CellPhone(String model) {
    this.model = model;
  }

  public void call(int time) {
    try {
      if (time < 0) {
        throw new IllegalArgumentException("통화시간입력오류");
      }
      battery -= time * 0.5;

      if (battery < 0) {
        battery = 0;
      }
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("통화 시간 : " + time + "분");
  }

  public void charge(int time) {
    try {
      if (time < 0) {
        throw new IllegalArgumentException("충전시간입력오류");
      }

      battery += time * 3;

      if (battery > 100) {
        battery = 100;
      }
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("충전 시간 : " + time + "분");
  }

  public void printBattery() {
    System.out.println("남은 배터리 양 : " + battery);
  }
}
