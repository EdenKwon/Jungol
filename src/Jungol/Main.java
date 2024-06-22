package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Main {

  public static void main(String[] args) throws IOException {
    ex07();
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void ex01() throws IOException {
    int num = Integer.parseInt(br.readLine());
    int count = 0, sum = 0, odd = 1;

    while (true) {
      if (sum >= num) {
        System.out.println(count + " " + sum);
        break;
      }
      sum += odd;
      odd += 2;
      count++;
    }
  }

  public static void ex02() throws IOException {
    int num = Integer.parseInt(br.readLine());

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex03() throws IOException {
    int num = Integer.parseInt(br.readLine());

    for (int i = 1; i <= num; i++) {
      for (int j = num; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex04() throws IOException {
    int num = Integer.parseInt(br.readLine());

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      for (int j = num; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex05() throws IOException {
    int num = Integer.parseInt(br.readLine());
    for (int i = num; i > 0; i--) {

      for (int j = num; j > i; j--) {
        System.out.print(" ");
      }

      for (int j = 2 * i - 1; j > 0; j--) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void ex06() throws IOException {
    int num = Integer.parseInt(br.readLine());
    char alpha = 'A';

    for(int i=num; i>0; i--) {
      for(int j=0; j<i; j++) {
        System.out.print(alpha);
        alpha = (char) (alpha + 1);
      }
      System.out.println();
    }
  }

  public static void ex07() throws IOException {
    int num = Integer.parseInt(br.readLine());
    int count = 1;
    char alpha = 'A';

    for (int i = 0; i < num; i++) {
      for (int j = num; j > i; j--) {
        System.out.print(count + " ");
        count++;
      }

      for (int j = 0; j <= i; j++) {
        System.out.print(alpha + " ");
        alpha = (char) (alpha + 1);
      }
      System.out.println();
    }
  }
}