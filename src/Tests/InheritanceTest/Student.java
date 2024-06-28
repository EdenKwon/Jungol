package Tests.InheritanceTest;

public class Student {
  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public Student () {}

  public Student (String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee() {
    switch(subject) {
      case "javaprogram" :
        returnFee = fee * 0.25;
        break;
      case "jspprogram" :
        returnFee = fee * 0.2;
        break;
      default:
        System.out.println("그런 과정명은 없습니다.");
        break;
    }
  }

  public void print() {
    System.out.println(name+"씨의 과정명은 " + subject + " 이고 교육비는 " + fee + " 이며 환급금은 " + returnFee + " 입니다.");
  }




  //----------------실행부----------------

  public static void main(String args[]){
    Student stu = new Student("차은우", "jspprogram",
        500000);
    stu.calcReturnFee();
    stu.print();
  }
}
