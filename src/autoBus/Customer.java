package autoBus;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String organisationName;
	private String email;
	private String address;
	private Date birthday;
	private String phonenumber;
	private String organisationType; //PRIVATE, COMPANY, SCHOOL
	private int discount;
	private double moneySpent;
	
	public Customer(String name, String organisationName, String email, String address, Date birthday, String phonenumber,
			String organisationType) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
		this.organisationType = organisationType;
		this.organisationName=organisationName;
		this.discount=0;
		this.moneySpent = 0;
	}

	public double getMoneySpent() {
		return moneySpent;
	}

	public void setMoneySpent(double moneySpent) {
		this.moneySpent = moneySpent;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getOrganisationType() {
		return organisationType;
	}

	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}	
	
}
