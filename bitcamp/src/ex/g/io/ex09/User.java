package ex.g.io.ex09;

public class User {

    //field
    private String name;
    private String address;
    private String cellularNumber;
    private boolean male;

    //constructor
    public User() {
        super();
    }

    public User(String name, String address, String cellularNumber, boolean male) {
        this.name = name;
        this.address = address;
        this.cellularNumber = cellularNumber;
        this.male = male;
    }

    //method
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellularNumber() {
        return cellularNumber;
    }
    public void setCellularNumber(String cellularNumber) {
        this.cellularNumber = cellularNumber;
    }

    public boolean isMale() {
        return male;
    }
    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "이름" + getName() + "핸드폰" + getCellularNumber() + "성별" + isMale() + "주소" + getAddress();
    }
}
