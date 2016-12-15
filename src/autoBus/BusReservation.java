package autoBus;

import java.util.Calendar;

public class BusReservation extends Reservation{

	private static final long serialVersionUID = 1L;
	private Chauffeur chauffeur;
	private Bus bus;
	private Services services;
	private DateInterval dateInterval;
	private double price;
	private java.util.Date[] newDateInterval;
	private double totalPrice;
	

	/**
	 * This constructs a new Bus Reservation with: reservation number, discount, customer, chauffeur, bus, services, dateInterval and price 
	 * @param reservationNumber - reservation Number for this Bus Reservation
	 * @param discount - discount  for this Bus Reservation
	 * @param customer-  customer  for this Bus Reservation
	 * @param chauffeur - chauffeur  for this Bus Reservation
	 * @param bus - bus  for this Bus Reservation
	 * @param services -  services  for this Bus Reservation
	 * @param dateInterval - date interval  for this Bus Reservation
	 * @param price - price  for this Bus Reservation
	 */
	public BusReservation(int reservationNumber, double discount, Customer customer, Chauffeur chauffeur, Bus bus,
			Services services, DateInterval dateInterval, double price) {
		super(reservationNumber, discount, customer);
		this.chauffeur = chauffeur;
		this.bus = bus;
		this.services = services;
		this.dateInterval = dateInterval;
		this.price=price;
		this.newDateInterval = new java.util.Date[2];
		this.totalPrice = 0;
	}

	/**
	 * This returns a String that contains: startDate(month, day, year) and endDate(month, day, year)
	 * @return departure date for this Bus Reservation
	 */
	public String getDepartureDate(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(newDateInterval[0]);
		String month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		String day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		String year = String.valueOf(cal.get(Calendar.YEAR));
		String hour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
		String minute = String.valueOf(cal.get(Calendar.MINUTE));
		String startDate = month + "/" + day + "/" + year + "  " + hour + ":" + minute;

		cal.setTime(newDateInterval[1]);
		month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		year = String.valueOf(cal.get(Calendar.YEAR));
		hour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
		minute = String.valueOf(cal.get(Calendar.MINUTE));
		String endDate= month + "/" + day + "/" + year + "  " + hour + ":" + minute;
		return startDate + " - " + endDate;
	}

	/**
	 * This returns double with totalPrice of this Bus Reservation
	 */
	@Override
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * This sets totalPrice for this Bus Reservation
	 */
	@Override
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * This returns newDateInterval of this Bus Reservation
	 */
	public java.util.Date[] getNewDateInterval() {
		return newDateInterval;
	}

	/**
	 * This sets newDateInterval for this Bus Reservation
	 * @param newDateInterval - new date interval for this Bus Reservation
	 */
	public void setNewDateInterval(java.util.Date[] newDateInterval) {
		this.newDateInterval = newDateInterval;
	}

	/**
	 * This returns double with price of this Bus Reservation
	 * @return price of this Bus Reservation
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * This sets price for this Bus Reservation
	 * @param price - price for this Bus Reservation
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This constructs a new Bus Reservation with: reservationNumber, discount and customer
	 * @param reservationNumber - reservation number for this Bus Reservation
	 * @param discount - discount for this Bus Reservation
	 * @param customer - customer for this Bus Reservation
	 */
	public BusReservation(int reservationNumber, int discount, Customer customer) {
		super(reservationNumber, discount, customer);

	}

	/**
	 * This returns chauffeur of this Bus Reservation
	 * @return chauffeur of this Bus Reservation
	 */
	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	/**
	 * This sets chauffeur for this Bus Reservation
	 * @param chauffeur - chauffeur for this Bus Reservation
	 */
	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

	/**
	 * This returns Bus of this Bus Reservation
	 * @return bus of this Bus Reservation
	 */
	public Bus getBus() {
		return bus;
	}

	/**
	 * This sets bus for this Bus Reservation
	 * @param bus - bus for this Bus Reservation
	 */
	public void setBus(Bus bus) {
		this.bus = bus;
	}

	/**
	 * This returns services of this Bus Reservation
	 * @return services of this Bus Reservation
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * This sets services for this Bus Reservation
	 * @param services - services for this Bus Reservation
	 */
	public void setServices(Services services) {
		this.services = services;
	}

	/**
	 * This returns dateInterval for this Bus Reservation
	 * @return date interval for this Bus Reservation
	 */
	public DateInterval getDateInterval() {
		return dateInterval;
	}
	
	/**
	 * This returns String that contains: dateInterval.getStartDateString() and dateInterval.getEndDateString() of this Bus Reservation
	 * @return start and end dates of this Bus Reservation
	 */
	public String getDateIntervalString(){
		return dateInterval.getStartDateString()+ " - " + dateInterval.getEndDateString();
	}

	/**
	 * This sets dateInterval for this Bus Reservation
	 * @param dateInterval - date interval for this Bus Reservation
	 */
	public void setDateInterval(DateInterval dateInterval) {
		this.dateInterval = dateInterval;
	}
	
	

}
