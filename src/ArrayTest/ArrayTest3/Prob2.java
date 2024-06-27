package ArrayTest.ArrayTest3;

import java.util.Arrays;

public class Prob2 {

  public static void main(String[] args) {
    int randNumArr[] = new int[10];
    generateRandom(randNumArr);

    System.out.println("<< 생성된 난수 >>");
    for (int i : randNumArr) {
      System.out.print(i + ", ");
    }

    System.out.println();
    System.out.println("=========================");
    System.out.println("배열에서 가장 큰 숫자 : " + getmaxNum(randNumArr));
  }

  public static int[] generateRandom(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 30) + 1;
    }
    return arr;
  }

  public static int getmaxNum(int arr[]) {
    int max = 0;
    for(int i=0; i<arr.length; i++) {
      if(arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
    //return Arrays.stream(arr).max().getAsInt();
  }
}
