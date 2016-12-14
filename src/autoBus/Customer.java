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
	private double discount;
	private double moneySpent;
	
	/**
	 * This constructs a new Customer with: name, organisationName, email, address, birthday, phonenumber, organisationType
	 * @param name - name of this Customer
	 * @param organisationName - prganisation name of this Customer
	 * @param email - email of this Customer
	 * @param address - address of this Customer
	 * @param birthday - birthday of this Customer
	 * @param phonenumber - phone number of this Customer
	 * @param organisationType - organisation type of this Customer
	 */
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

	/**
	 * This returns moneySpent of this Customer
	 * @return money spent of this Customer
	 */
	public double getMoneySpent() {
		return moneySpent;
	}

	/**
	 * This sets moneySpent for this Customer
	 * @param moneySpent - money spent for this Customer
	 */
	public void setMoneySpent(double moneySpent) {
		this.moneySpent = moneySpent;
	}

	/**
	 * This returns discount of this Customer
	 * @return discount of this Customer
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * This sets discount for this Customer
	 * @param discount - discount for this Customer
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * This returns organisationName of this Customer
	 * @return organisation name of this customer
	 */
	public String getOrganisationName() {
		return organisationName;
	}

	/**
	 * This sets organisationName for this Customer
	 * @param organisationName - organisation name for this Customer
	 */
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	/**
	 * This returns name of this Customer
	 * @return name of this Customer
	 */
	public String getName() {
		return name;
	}

	/**
	 * This sets name for this Customer
	 * @param name - name for this Customer
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This returns email of this Customer
	 * @return email of this Customer
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This sets email for this Customer
	 * @param email - email for this Customer
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This returns address of this customer
	 * @return address of this Customer
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This sets address for this Customer
	 * @param address - address for this Customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This returns birthday of this Customer
	 * @return birthday of this Customer
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * This sets birthday for this Customer
	 * @param birthday - birthday for this Customer
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * This returns phoneNumber of this Customer
	 * @return phone number of this Customer
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * This sets phoneNumber for this Customer
	 * @param phonenumber - phone number for this Customer
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * This returns organisationType of this Customer's organisation
	 * @return organisation type of this Customer's organisation
	 */
	public String getOrganisationType() {
		return organisationType;
	}

	/**
	 * This sets organisationType for this Customer's organisation
	 * @param organisationType - organisation type for this Customer's organisation
	 */
	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}	
	
}
