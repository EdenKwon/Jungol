package Tests.morning_test.day6_27;

public class ShopService {
  private static ShopService singleton = new ShopService();
  private ShopService() {}

  static ShopService getInstance() {
    return singleton;
  }
}
