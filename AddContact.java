package Day10;

public class AddContact {
	private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailId;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	@Override
	public String toString() {
		return "\nPerson Info [first Name= " + firstName + ", last Name= " + lastName + ", Email id= " + emailId +
            ", address= " + address + "," + " city= " + city + ", state= " + state + ", zipcode= " + zipCode + ", " +
            "phoneNumber= " + phoneNumber + "]\n";
}
}
