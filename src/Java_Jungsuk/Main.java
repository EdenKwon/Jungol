package Java_Jungsuk;

import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    ex04_10();
  }

  public static boolean ex04_1(int x) {
    if (x > 10 && x < 20) { //1번
      return true;
    }
    if (x % 400 == 0 || (x % 4 == 0 && x % 100 != 0)) { //6번
      return true;
    } else {
      return false;
    }
  }

  public static boolean ex04_1(char ch) {
    if (ch != ' ' && ch != '\t') { //2번 ?
      return true;
    }
    if (ch == 'x' || ch == 'X') { //3번
      return true;
    }
    if (ch - '0' >= 0 && ch - '0' <= 9) { //4번
      return true;
    }
    if ((ch - 'a' >= 0 && ch - 'a' < 27) || (ch - 'A' >= 0 && ch - 'A' < 27)) { //5번
      return true;
    } else {
      return false;
    }
  }

  public static boolean ex04_1(boolean powerOn) {
    if (!powerOn) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean ex04_1(String str) {
    if (str.equals("yes")) {
      return true;
    } else {
      return false;
    }
  }

  public static void ex04_2() {
    int sum = 0;

    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0 && i % 3 != 0) {
        sum += i;
      }
    }

    System.out.println(sum);
  }

  public static void ex04_3() {
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
    }

    System.out.println(sum);
  }

  public static void ex04_4() {
    int sum = 0, i = 1;

    while (true) {
      if (i % 2 != 0) {
        sum += i;
      } else {
        sum += -i;
      }

      if (sum == 100) {
        break;
      }

      i++;

    }
    System.out.println(i);
  }

  public static void ex04_5() { //수정
    int i = 0, j = 0;
    while (i <= 10) {
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      j = 1;
      i++;
    }
  }

  public static void ex04_6() {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i + j == 6) {
          System.out.println("(" + i + ", " + j + ")");
        }
      }
    }
  }

  public static void ex04_7() {
    String str = "12345";
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      sum += Integer.parseInt(String.valueOf(str.charAt(i)));
    }

    System.out.println("sum=" + sum);
  }

  public static void ex04_8() {
    int value = (int) (Math.random() * 6) + 1;

    System.out.println("value:" + value);
  }

  public static void ex04_9() {
    int num = 12345;
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      sum += num % 10;
      num /= 10;
    }

    System.out.println("sum=" + sum);
  }

  public static boolean isNumber(String input) {
    return Pattern.matches("^[0-9]*$", input);
  }

  public static void ex04_10() {
    int answer = (int) (Math.random() * 100) + 1; //1~100까지의 랜덤한 수
    String input = ""; // 사용자 입력 값
    int count = 0; // 시도한 횟수

    java.util.Scanner s = new java.util.Scanner(System.in);

    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 :");
      input = s.next();

      if (!isNumber(input)) {
        System.out.println("다시 입력해주세요. 형식이 맞지 않습니다.");
      } else {
        if (Integer.parseInt(input) > answer) {
          System.out.println("더 작은 수를 입력하세요.");
        } else if (Integer.parseInt(input) < answer) {
          System.out.println("더 큰 수를 입력하세요.");
        } else {
          System.out.println("맞췄습니다.");
          System.out.println("시도횟수는 " + count + "번입니다.");
          break;
        }
      }
    }
    while (true);
  }



  public static void ex04_10_bu() {
    int answer = (int) (Math.random() * 100) + 1; //1~100까지의 랜덤한 수
    int input = 0; // 사용자 입력 값
    int count = 0; // 시도한 횟수

    java.util.Scanner s = new java.util.Scanner(System.in);

    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 :");
      input = s.nextInt();

      if (!isNumber(String.valueOf(input))) {
        System.out.println("다시 입력해주세요. 형식이 맞지 않습니다.");
      } else {
        if (input > answer) {
          System.out.println("더 작은 수를 입력하세요.");
        } else if (input < answer) {
          System.out.println("더 큰 수를 입력하세요.");
        } else {
          System.out.println("맞췄습니다.");
          System.out.println("시도횟수는 " + count + "번입니다.");
          break;
        }
      }
    }
    while (true);
  }
}


