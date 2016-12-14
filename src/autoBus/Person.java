package autoBus;

public abstract class Person{
	private String name;
	private String email;
	private String address;
	private Date birthday;
	
	/**
	 * This constructs a Person with: name, email, address, birthday
	 * @param name - name of this Person
	 * @param email - email of this Person
	 * @param address - address of this Person
	 * @param birthday - birthday of this Person
	 */
	public Person(String name, String email, String address, Date birthday) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
	}

	/**
	 * This returns name of this Person
	 * @return name of this Person
	 */
	public String getName() {
		return name;
	}

	/**
	 * This sets name for this Person
	 * @param name - name for this Person
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This sets email of this Person
	 * @return email of this Person
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This sets email for this Person
	 * @param email for this Person
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This returns address of this Person
	 * @return address of this Person
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This sets address for this Person
	 * @param address - address for this Person
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This gets birthday of this Person
	 * @return birthday of this Person
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * This sets birthday for this Person
	 * @param birthday - birthday for this Person
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
