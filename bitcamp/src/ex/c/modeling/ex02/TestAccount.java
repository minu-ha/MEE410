package ex.c.modeling.ex02;

public class TestAccount{
    public static void main(String[] args){

        String accNo = null;
        int balance;

        Account accObj = new Account("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println( new StringBuilder().append( accNo ).append( "계좌의 잔고는" ).append( balance ).append( "만원입니다." ).toString() );

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo() + "계좌의 잔고는" + balance + "만원입니다.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo + "계좌의 잔고는" + balance + "만원입니다.");
    }
}