package Tests.InterfaceTest.test1;

public class AnimalTest {

  public static void main(String[] args) {
    Animal dog = new Dog(8);
    Animal chicken = new Chicken(3);
    Chicken cheatableChicken = new Chicken(5);

    //chicken.fly();          ---> x
    //cheatableChicken.fly(); ---> o

    checkCheatable(chicken);          // ---> x라 생각했지만 o
    checkCheatable(cheatableChicken); // ---> o

    //answer
    if(cheatableChicken instanceof Cheatable) {
      cheatableChicken.fly();
    }

    for (int i = 1; i <= 3; i++) {
      System.out.println(i + "시간 후");
      dog.run(i);
      System.out.println("개의 이동거리 = " + dog.getDistance());
      chicken.run(i);
      System.out.println("닭의 이동거리 = " + chicken.getDistance());
      cheatableChicken.run(i);
      System.out.println("날으는 닭의 이동 거리 = " + cheatableChicken.getDistance());
    }
  }

  public static void checkCheatable(Animal animal) {
    if(animal instanceof Cheatable cheatable) {
      cheatable.fly();
    } else {
      //날개 잃은 치킨
    }
  }
}










