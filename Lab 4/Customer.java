public class Customer {
	private int customerID;
	private String name;
	private String phoneNo;
	private String licenseNo;	
	
	//Getter
	public int getCustomerID() {
		return customerID;
	}
	
	public String getName() {
		return name;
	}
	
	public String phoneNo() {
		return phoneNo;
	}
	
	public String licenseNo() {
		return licenseNo;
	}
	
	//Setter
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo();
	}
}