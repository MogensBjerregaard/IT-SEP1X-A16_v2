package autoBus;

import java.io.Serializable;

public class Passenger implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String address;
	private Date birthday;
	private String phonenumber;
	
	/**
	 * This constructs a new Passenger with: name, email, address, birthday and phonenumber
	 * @param name - name of this Passenger
	 * @param email - email of this Passenger
	 * @param address - address of this Passenger
	 * @param birthday - birthday of this Passenger
	 * @param phonenumber - phone number of this Passenger
	 */
	public Passenger(String name, String email, String address, Date birthday, String phonenumber) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
	}

	/**
	 * This returns name of this Passenger
	 * @return name of this Passenger
	 */
	public String getName() {
		return name;
	}

	/**
	 * This sets name for this Passenger
	 * @param name - name for this Passenger
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This returns email of this Passenger
	 * @return email of this Passenger
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This sets email for this Passenger
	 * @param email - email for this Passenger
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * This returns address of this Passenger
	 * @return address of this Passenger
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This sets address for this Passenger
	 * @param address - address for this Passenger
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This returns birthday of this Passenger
	 * @return birthday of this Passenger
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * This sets birthday for this Passenger
	 * @param birthday - birthday for this Passenger
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * This returns phonenumber of this Passenger
	 * @return phone number of this Passenger
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * This sets phonenumber for this Passenger
	 * @param phonenumber - phone number for this Passenger
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
