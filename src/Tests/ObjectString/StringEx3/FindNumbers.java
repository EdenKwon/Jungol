package Tests.ObjectString.StringEx3;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindNumbers {

  public static void main(String[] args) {
    FindNumbers fn=new FindNumbers();

    long number = 228754462;
    System.out.println( "입력 숫자 = " + number );
    System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
    System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
  }

  public static int countNumber(long number, int findNum) {
    String str = String.valueOf(number);
    int count = 0;

    for(int i=0; i<str.length(); i++) {
      if (String.valueOf(str.charAt(i)) == String.valueOf(findNum) )
        count++;
    }

    return str.split(String.valueOf(findNum), -1).length-1; // split 두번째 파라미터에 -1을 주면 문자열 뒤에 오늘 모든 빈 문자열 가져옴

    //return count;
    //return (int) str.chars().filter(x -> x == findNum + '0').count();

    /*
    String str = String.valueOf(number);
    char targetChar = Character.forDigit(findNum, 10);
    int originalLength = str.length();
    int newLength = str.replace(String.valueOf(targetChar), "").length();
    return originalLength - newLength;
    */
  }
}

