package ArrayTest;

public class ArrayTest {

  public static void main(String[] args) {
    ex02();
  }

  public static void ex01() {
    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    System.out.println("( 배열ia )");
    printOddEven(ia);
    System.out.println("( 배열ib )");
    printOddEven(ib);
  }

  public static void printOddEven(int arr[]) {
    int oddSum = 0, evenSum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {

        evenSum += arr[i];
      } else {
        oddSum += arr[i];
      }
    }

    System.out.println("홀수의 합 : " + oddSum);
    System.out.println("짝수의 합 : " + evenSum);
  }

  public static void ex02() {
    int arr[] = new int[5];

    for(int i=0; i<arr.length; i++) {
      arr[i] = (int)(Math.random() * 100) + 1;
    }

    for(int i : arr) {
      System.out.print(i + " ");
    }
  }
}
