package autoBus;

import java.io.Serializable;

public class Passenger implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String address;
	private Date birthday;
	private String phonenumber;
	
	public Passenger(String name, String email, String address, Date birthday, String phonenumber) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
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
	
	
}
