package ArrayTest.ArrayTest3;


import java.util.Arrays;

public class SortUtil {

  public static void main(String[] args) {
    int[] inputNumbers = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
    inputNumbers = ascending(inputNumbers);

    for(int i=0; i<inputNumbers.length; i++) {
      System.out.print(inputNumbers[i] + " ");
    }

  }

  public static int[] ascending(int[] inputNumbers) {
    int[] ascArr = new int[inputNumbers.length];

    for(int i=0;i<inputNumbers.length;i++) {
      int ascMin = inputNumbers[i];
      for(int j=i;j<inputNumbers.length; j++) {
        if(ascMin > inputNumbers[j]) {
          int temp = 0;
          temp = ascMin;
          ascMin = inputNumbers[j];
          inputNumbers[j] = temp;
        }
      }
      ascArr[i] = ascMin;
    }

    return ascArr;
    //return Arrays.stream(inputNumbers).sorted().toArray();
  }
}

