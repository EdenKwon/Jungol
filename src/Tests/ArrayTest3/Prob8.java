package Tests.ArrayTest3;

public class Prob8 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.printf("%3d", i * 5 - j);
      }
      System.out.println();
    }
  }
}
