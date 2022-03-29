package ex.c.modeling.ex02;

public class Account{

    //field
    private String accNo = null;
    private int balance = 0;

    //constructor
    public Account(){
    }
    public Account(String accNo) {
        this.accNo = accNo;
    }

    //getter setter method
    public String getAccNo() {
        return accNo;
    }
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //method
    public void save(int m){
        balance += m;
    }
    public void deposit(int m){
        balance -= m;
    }
}