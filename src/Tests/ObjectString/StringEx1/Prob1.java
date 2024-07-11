package Tests.ObjectString.StringEx1;

public class Prob1 {

  public static void main(String args[]) {

    Prob1 prob1 = new Prob1();

    System.out.println( prob1.leftPad("SSG", 6, '#') );
    System.out.println( prob1.leftPad("SSG", 5, '$') );
    System.out.println( prob1.leftPad("SSG", 2, '&') );

  }

  public String leftPad(String str, int size, char padChar) {
    StringBuilder sb = new StringBuilder();

    if(str.length() >= size) {
      System.out.println(str);
    } else {
      sb.append(String.valueOf(padChar).repeat(size-str.length())).append(str);
    }

    return sb.toString();
  }

}
