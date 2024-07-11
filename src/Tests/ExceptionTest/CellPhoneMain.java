package Tests.ExceptionTest;



public class CellPhoneMain {

  public static void main(String[] args) {
    CellPhone myPhone = new CellPhone("SCH-600");

    myPhone.charge( 20 );  //20분간 충전을 한다.
    myPhone.printBattery();

    myPhone.call( 300 );  //300분간 통화를 한다.
    myPhone.printBattery();

    myPhone.charge( 50 );  //50분간 충전을 한다.
    myPhone.printBattery();

    myPhone.call( 40 );  //40분간 통화를 한다.
    myPhone.printBattery();


    myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
    
  }
}

