package autoBus;

import java.io.Serializable;
import java.util.ArrayList;


public class Chauffeur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private  ArrayList<java.util.Date[]> listOfStartEndDates;
	private int datePointer;/*an util field which helps to add new item to listOfStartEndDates in right place*/
	private String email;
	private String address;
	private Date birthday;
	private String phonenumber;
	private String employeeNumber;
	private boolean externalEmployee;
	private boolean available;
	private boolean onlyOneDayTrips;
	
	public Chauffeur(String name, String email, String address, int month, int day, int year, String phonenumber, String employeeNumber,
			boolean externalEmployee, boolean onlyOneDayTrips) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = new Date(month, day, year);
		this.phonenumber = phonenumber;
		this.employeeNumber = employeeNumber;
		this.externalEmployee = externalEmployee;
		this.available = true;
		this.onlyOneDayTrips = onlyOneDayTrips;
		this.datePointer = 0;
		this.listOfStartEndDates = new ArrayList<>();
	}

	public int getDatePointer() {
		return datePointer;
	}

	public void setDatePointer(int datePointer) {
		this.datePointer = datePointer;
	}

	public void addNewReservationPeriod(java.util.Date[] newStartEndDate){
		listOfStartEndDates.add(datePointer, newStartEndDate);
	}
	public  ArrayList<java.util.Date[]> getListOfStartEndDates() {
		return listOfStartEndDates;
	}

	public boolean isAvailable(java.util.Date startDate, int durationInHours) {
		if(this.listOfStartEndDates.isEmpty()) {
				datePointer = 0;
				return true;
		}
			if (startDate.before(listOfStartEndDates.get(0)[0])) {
				datePointer = 0;
				return (listOfStartEndDates.get(0)[0].getTime() - startDate.getTime()) / 3600000 > durationInHours + 24;
			}
			for (int j = 0; j < listOfStartEndDates.size() - 1; j++) {
				if (startDate.after(listOfStartEndDates.get(j)[1]) && startDate.before(listOfStartEndDates.get(j + 1)[0])) {
					datePointer = j+1;
					return (listOfStartEndDates.get(j + 1)[0].getTime() - startDate.getTime()) / 3600000 > durationInHours + 48;
				}
			}
			datePointer = listOfStartEndDates.size();
			return startDate.after(listOfStartEndDates.get(listOfStartEndDates.size() -1)[1]);
		
	}
	
	public String toString(){
		return "#"+employeeNumber+" "+name;
	}
	
	public String getPhonenumber(){
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber){
		this.phonenumber=phonenumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public boolean isExternalEmployee() {
		return externalEmployee;
	}

	public void setExternalEmployee(boolean externalEmployee) {
		this.externalEmployee = externalEmployee;
	}


	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}


	public boolean isOnlyOneDayTrips() {
		return onlyOneDayTrips;
	}

	public void setOnlyOneDayTrips(boolean onlyOneDayTrips) {
		this.onlyOneDayTrips = onlyOneDayTrips;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
	
	public String getBirthDay(){
		return birthday.displayDate();
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
