package Tests.ArrayTest3;

public class Prob5 {
  public static int getValue(int[] values, boolean isMax) {
    /*if(isMax) {
      return Arrays.stream(values).max().getAsInt();
    } else {
      return Arrays.stream(values).min().getAsInt();
    }*/
    // int 타입 배열의 최대값 또는 최소값을 리턴한다.
    int maxValue = 0, minValue= 100;
    if(isMax) {
      for(int i=0; i<values.length; i++) {
        if( values[i] > maxValue) {
          maxValue = values[i];
        }
      }
      return maxValue;
    } else {
      for(int i=0; i<values.length; i++) {
        if( values[i] < minValue) {
          minValue = values[i];
        }
      }
      return minValue;
    }
  }

  public static void main(String[] args) {
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최대값 = " + maxValue);
    System.out.println("최소값 = " + minValue);

  }
}
