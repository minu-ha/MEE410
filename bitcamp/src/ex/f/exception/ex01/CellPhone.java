package ex.f.exception.ex01;

public class CellPhone {

    //field
    String model;
    double battery;

    //constructor
    public CellPhone(String model) {
        this.model = model;
    }

    //method
    public void call(int time) throws IllegalArgumentException{
        if (time < 0) throw new IllegalArgumentException("통화시간입력오류");
        System.out.println("call time = " + time);
        battery -= time * 0.5;
    }
    public void charge(int time) throws IllegalArgumentException{
            if (time < 0) {
                throw new IllegalArgumentException("충전시간입력오류");
            }else{
                battery += time * 3;
            }
        System.out.println("charge time = " + time);
    }
    public void printBattery() {
        if (battery < 0) {
            battery = 0;
        } else if (battery > 100) {
            battery = 100;
        }
        System.out.println("battery time = " + battery);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof CellPhone cellPhone) {
//            CellPhone phone = (CellPhone) o;
//            return model.equals(cellPhone.model);
//        }
//        return false;
//    }
}
