package ex.d.inheritance.ex03;

public class SmartPhone extends CellPhone{
	
	//field
	private boolean ismonthlyFixedFee = false;
	private int monthlyFixedFee = 0;
	
	
	//constructor
	public SmartPhone() {
		super();
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	public SmartPhone(String phoneNumber, int feePerCallTime, 
		boolean ismonthlyFixedFee, int monthlyFixedFee) {
		
		super(phoneNumber, feePerCallTime);
		this.ismonthlyFixedFee = ismonthlyFixedFee;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	//getter setter method
	public boolean isIsmonthlyFixedFee() {
		return ismonthlyFixedFee;
	}
	public void setIsmonthlyFixedFee(boolean ismonthlyFixedFee) {
		this.ismonthlyFixedFee = ismonthlyFixedFee;
	}
	
	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}
	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	//method
	public void calculateTotalFee() {
		
//		setTotalFee( getFeePerCallTime()*getTotalCallTime() + monthlyFixedFee);
//		
//		
//		if(ismonthlyFixedFee != false) {
//			System.out.println("������ " + getTotalFee() + " ���� ������Դϴ�.");
//		}else {
//			System.out.println();
//			
//		}
		
		if(ismonthlyFixedFee) {
			setTotalFee(monthlyFixedFee);
		}else {
			super.calculateTotalFee();
		}
		
		
	}

}
