package autoBus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;


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
	
	/**
	 * This constructs a new Chauffeur with: name, email, address, month, day, year, phonenumber, emplyoeeNumber, externalEmployee, onlyOneDayTrips
	 * @param name - name for this Chauffeur
	 * @param email - email for this Chauffeur
	 * @param address - address for this Chauffeur
	 * @param month - month of the birthday
	 * @param day - day of the birthday
	 * @param year - year of the birthday
	 * @param phonenumber - phone number for this Chauffeur
	 * @param employeeNumber - employee number for this Chauffeur
	 * @param externalEmployee - if the chauffeur is external
	 * @param onlyOneDayTrips - if the chauffeur in only available for one day trips
	 */
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

	/**
	 * This returns int with dateInterval of this Chauffeur
	 * @return date interval of this Chauffeur
	 */
	public int getDatePointer() {
		return datePointer;
	}

	/**
	 * This sets dateInterval for this Chauffeur
	 * @param datePointer - date interval for this Chauffeur
	 */
	public void setDatePointer(int datePointer) {
		this.datePointer = datePointer;
	}

	/**
    * This returns a String that contains: startMonth, startDay, startYear, startHour and startMinute
    * @return Earliest departure String of this Chauffeur
    */
	public String getEarliestDepartureString(){
		java.util.Date now = new java.util.Date();
		Calendar cal = Calendar.getInstance();
		if(this.listOfStartEndDates.isEmpty() || now.after(listOfStartEndDates.get(listOfStartEndDates.size() -1)[1])) {
			return "no tours";
		}
		if (now.before(listOfStartEndDates.get(0)[0])) {
			cal.setTime(listOfStartEndDates.get(0)[0]);
		}
		for (int j = 0; j < listOfStartEndDates.size() - 1; j++) {
			if (now.after(listOfStartEndDates.get(j)[1]) && now.before(listOfStartEndDates.get(j + 1)[0])) {
				cal.setTime(listOfStartEndDates.get(j + 1)[0]);
				break;
			}
		}
		String startMonth = String.valueOf(cal.get(Calendar.MONTH) + 1);
		String startDay = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		String startYear = String.valueOf(cal.get(Calendar.YEAR));
		String startHour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
		String startMinute = String.valueOf(cal.get(Calendar.MINUTE));
		return startMonth + "/" + startDay + "/" + startYear + "  " + startHour + ":" + startMinute;
	}

	/**
	 * This adds a new reservation period in list of start end dates 
	 */
	public void addNewReservationPeriod(java.util.Date[] newStartEndDate){
		listOfStartEndDates.add(datePointer, newStartEndDate);
	}
	/**
	 * This returns listOfStartEndDates ArrayList
	 * @return list of start end dates
	 */
	public  ArrayList<java.util.Date[]> getListOfStartEndDates() {
		return listOfStartEndDates;
	}

	/**
    * This checks if this Chauffeur is available with this startDate and this durationInHours
    * @param startDate - start date of the trip
    * @param durationInHours - duration of the trip in hours
    * @return if this Chauffeur is available for the trip
    */
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
				return ((listOfStartEndDates.get(j + 1)[0].getTime() - startDate.getTime()) / 3600000 > durationInHours + 24
						&&
						(startDate.getTime() - listOfStartEndDates.get(j)[1].getTime()) / 3600000 > 24);
			}
		}
		datePointer = listOfStartEndDates.size();
		return startDate.after(listOfStartEndDates.get(listOfStartEndDates.size() -1)[1]);
		
	}
	
	/**
	 * This returns String that contains employee's number and name
	 */
	public String toString(){
		return "#"+employeeNumber+" "+name;
	}
	
	/**
	 * This returns String with phonenumber of this Chauffeur
	 * @return phone number of this Chauffeur
	 */
	public String getPhonenumber(){
		return phonenumber;
	}
	
	/**
	 * This sets phone number for this Chauffeur
	 * @param phonenumber - phone number for this Chauffeur
	 */
	public void setPhonenumber(String phonenumber){
		this.phonenumber=phonenumber;
	}

	/**
	 * This returns employeeNumber of this Chauffeur
	 * @return employee number of the thus Chauffeur
	 */
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * This sets employeeNumber for this Chauffeur
	 * @param employeeNumber - employee number for this Chauffeur
	 */
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * This returns boolean externalEmployee for this Chauffeur
	 * @return external employee for this Chauffeur
	 */
	public boolean isExternalEmployee() {
		return externalEmployee;
	}

	/**
	 * This sets externalEmployee for this Chauffeur
	 * @param externalEmployee - external employee for this Chauffeur
	 */
	public void setExternalEmployee(boolean externalEmployee) {
		this.externalEmployee = externalEmployee;
	}


	/**
	 * This returns boolean available for this Chauffeur
	 * @return available for this Chauffeur
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * This sets available for this Chauffeur
	 * @param available - available for this Chauffeur
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}


	/**
	 * This returns boolean onlyOneDayTrips for this Chauffeur
	 * @return only one day trips for this Chauffeurs
	 */
	public boolean isOnlyOneDayTrips() {
		return onlyOneDayTrips;
	}

	/**
	 * This sets onlyOneDayTrips for this Chauffeur
	 * @param onlyOneDayTrips - only one day trips for this Chauffeur
	 */
	public void setOnlyOneDayTrips(boolean onlyOneDayTrips) {
		this.onlyOneDayTrips = onlyOneDayTrips;
	}

	/**
	 * This returns serialVersionUID
	 * @return serial version UID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * This returns String with name of this Chauffeur
	 * @return name of this Chauffeur
	 */
	public String getName() {
		return name;
	}

	/**
	 * This sets name for this Chauffeur
	 * @param name - name for this Chauffeur
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This returns String with email of this Chauffeur
	 * @return email of this Chauffeur
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This sets email for this Chauffeur
	 * @param email - email for this Chauffeur
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This returns String with address for this Chauffeur
	 * @return address for this Chauffeur
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This sets address for this Chauffeur
	 * @param address - address for this Chauffeur
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This returns birthday of this Chauffeur with Date type
	 * @return birthday of this Chauffeur
	 */
	public Date getBirthday() {
		return birthday;
	}
	
	/**
	 * This returns String with birthday.displayDate() of this Chauffeur
	 * @return String that contains date, month and year of this Chauffeur
	 */
	public String getBirthDay(){
		return birthday.displayDate();
	}

	/**
	 * This sets birthday for this Chauffeur
	 * @param birthday - birthday for this Chauffeur
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
