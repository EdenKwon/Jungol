package Tests.ObjectString.StringEx3;

public class FindCharacters {

  public static void main(String[] args) {
    FindCharacters fc = new FindCharacters();
    int count = fc.countChar("Boys, be ambitious", 'b');
    System.out.println(count);

  }

  public int countChar(String str, char c) {
    return str.split(String.valueOf(c), -1).length - 1;
  }
}
