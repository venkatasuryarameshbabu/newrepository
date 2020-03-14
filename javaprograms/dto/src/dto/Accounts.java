package dto;

public class Accounts {
	String accountNumber;
	String accountType;
	String customername;
	float balnace;
	public Accounts(String accountNumber, String accountType, String customername, float balnace) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.customername = customername;
		this.balnace = balnace;
	}
	@Override
	public String toString() {
		return "Accounts [accountNumber=" + accountNumber + ", accountType=" + accountType + ", customername="
				+ customername + ", balnace=" + balnace + "]";
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public float getBalnace() {
		return balnace;
	}
	public void setBalnace(float balnace) {
		this.balnace = balnace;
	}
	

}
