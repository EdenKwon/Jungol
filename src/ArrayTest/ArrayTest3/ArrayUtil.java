package ArrayTest.ArrayTest3;

public class ArrayUtil {

  public static void main(String[] args) {
    char[] s1 = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    printString(reverseString(s1, 0, 3));

    char[] s2 = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    printString(reverseString(s2, 4, 7));

    char[] s3 = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    printString(reverseString(s3, 8, 10));

    char[] s4 = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    printString(reverseString(s4, 0, 10));
  }

  public static char[] reverseString(char[] s, int start, int end) {
    char temp[] = new char[end - start + 1];

    for (int i = 0; i <= end - start; i++) {
      temp[i] = s[end - i];
    }

    for (int i = 0; i <= end - start; i++) {
      s[start + i] = temp[i];
    }

    return s;
  }

  public static void printString(char[] s) {
    for (char c : s) {
      System.out.print(c);
    }
    System.out.println();
  }
}
