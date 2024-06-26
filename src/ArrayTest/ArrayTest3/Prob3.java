package ArrayTest.ArrayTest3;

import java.util.Arrays;

public class Prob3 {
  public static void main(String[] args) {
    int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
    System.out.println("<< 중복되지 않은 숫자 >>");
    printUniqueNumber(array);
  }

  private static void printUniqueNumber(int[] array) {
    StringBuilder sb = new StringBuilder();
    int checkArray[] = new int[array.length];

    for(int i=0; i<array.length; i++) {
      for(int j=i+1; j<array.length; j++) {
        if(array[i] == array[j]) {
          checkArray[i]++;
          checkArray[j]++;
        }
      }
    }

    for(int i=0; i<checkArray.length; i++) {
      if(checkArray[i] == 0) {
        sb.append(array[i] + ", ");
      }
    }

    if(sb.length() != 0) {
      sb.delete(sb.length()-2, sb.length());
    }

    System.out.println(sb);
  }
}
