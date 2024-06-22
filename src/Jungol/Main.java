package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Main {

  public static void main(String[] args) throws IOException {
    ex08();
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void ex01() throws IOException {
    char word = br.readLine().charAt(0);
    for (int i = 0; i < 20; i++) {
      System.out.println(word);
    }
  }

  public static void ex02() throws IOException {
    for (int i = 10; i <= 20; i++) {
      System.out.print(i + " ");
    }
  }

  public static void ex03() throws IOException {
    int num = Integer.parseInt(br.readLine());
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static void ex04() throws IOException {
    int num = Integer.parseInt(br.readLine());
    int sum = 0;

    for (int i = num; i <= 100; i++) {
      sum += i;
    }

    System.out.println(sum);
  }

  public static void ex05() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count3 = 0, count5 = 0;

    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(st.nextToken());

      if (num % 3 == 0) {
        count3++;
      }
      if (num % 5 == 0) {
        count5++;
      }
    }

    System.out.println("Multiples of 3 : " + count3);
    System.out.println("Multiples of 5 : " + count5);
  }

  public static void ex06() throws IOException {
    int num = Integer.parseInt(br.readLine());
    int sum = 0;
    double avg = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= num; i++) {
      sum += Integer.parseInt(st.nextToken());
    }
    avg = (double) sum / num;
    System.out.printf("avg : %.1f \n", avg);

    if (avg >= 80) {
      System.out.println("pass");
    } else {
      System.out.println("fail");
    }
  }

  public static void ex07() throws IOException {
    for (int i = 2; i <= 6; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(i + j + " ");
      }
      System.out.println();
    }
  }

  public static void ex08() throws IOException {
    for (int i = 2; i <= 4; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.printf("%d * %d = %2d   ", i, j, i * j);
      }
      System.out.println();
    }
  }
}