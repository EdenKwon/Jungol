package Tests.InterfaceTest.test2;

public class TVFactory extends Factory implements IWorkingTogether{

  public TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  public int makeProduct(char skill) {
    switch (skill) {
      case 'A':
        return 8 * getWorkingTime();
      case 'B':
        return 5 * getWorkingTime();
      case 'C':
        return 3 * getWorkingTime();
      default:
        return 1 * getWorkingTime();
    }
  }

  @Override
  public int workingTogether(IWorkingTogether partner) {
    return makeProduct('C');
  }
}
