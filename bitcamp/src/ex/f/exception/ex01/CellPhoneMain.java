package ex.f.exception.ex01;

//Exception / try, catch, throws, throw
//equals method

public class CellPhoneMain {

    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone("SCH-600");

        myPhone.charge(20);
        myPhone.printBattery();

        myPhone.call(300);
        myPhone.printBattery();

        myPhone.charge(50);
        myPhone.printBattery();

        myPhone.call(40);
        myPhone.printBattery();

        try {
            myPhone.call(-20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        CellPhone yourPhone = new CellPhone("SCH-600");

        if (myPhone.equals(yourPhone)) {
            System.out.println("same model");
        } else {
            System.out.println("different model");
        }
    }
}
