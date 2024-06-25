package ArrayTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayTest2 {

  public static void main(String[] args) {
    ex02();
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void ex01() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numArr[] = new int[5];
    double rateArr[] = new double[5];
    int sum = 0;

    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = Integer.parseInt(st.nextToken());
      sum += numArr[i];
    }

    for (int i = 0; i < rateArr.length; i++) {
      rateArr[i] = (double) numArr[i] / sum * 100;
      for (int j = 0; j < (int) rateArr[i]; j++) {
        System.out.print("*");
      }
      System.out.println("(" + rateArr[i] + ")");
    }
  }

  public static void ex02() {

    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start;
        start++;
      }
    }
    //2.원본 배열 출력
    System.out.println("\t\t\t\t\t\t원본 배열");
    System.out.println("===================================");

    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j] + "\t\t\t\t");
      }
      System.out.println();
    }
    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        if (i == j) {
          alphabet[i][j] = '*';
        }
      }
      System.out.println();
    }
    //4. 수정된 배열 출력
    System.out.println("\t\t\t\t\t\t수정된 배열");
    System.out.println("===================================");

    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j] + "\t\t\t\t");
      }
      System.out.println();
    }
  }
}
