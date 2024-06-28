package Tests.ClassTest.School;

public class Student {
  private String name;
  private int age;
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void print() {
    System.out.println("이   름 : " + name + "\t\t나   이 : " + age + "\t\t학    번 : " + id);
  }
}
