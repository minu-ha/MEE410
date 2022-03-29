package ex.d.inheritance.ex03;

public class CellPhone {
	
	//field
	private String phoneNumber = null;
	private int totalCallTime = 0;
	private int totalFee = 0;
	private int feePerCallTime = 0;
	
	//constructor
	public CellPhone() {
		super();
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		super();
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	
	//getter setter method
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getTotalCallTime() {
		return totalCallTime;
	}
	
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime += totalCallTime;
	}
	
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	//method
	public void call(String phoneNumber, int totalCallTime) {
		
		System.out.println(phoneNumber + "��ȣ�� " + totalCallTime + "��ȭ��");
		setTotalCallTime(totalCallTime);
		
	}

	public void calculateTotalFee() {
		setTotalFee( feePerCallTime*totalCallTime );
		
	}
}
