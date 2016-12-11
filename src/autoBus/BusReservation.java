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

	@Override
	public double getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public java.util.Date[] getNewDateInterval() {
		return newDateInterval;
	}

	public void setNewDateInterval(java.util.Date[] newDateInterval) {
		this.newDateInterval = newDateInterval;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public BusReservation(int reservationNumber, int discount, Customer customer) {
		super(reservationNumber, discount, customer);

	}

	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public DateInterval getDateInterval() {
		return dateInterval;
	}
	
	public String getDateIntervalString(){
		return dateInterval.getStartDateString()+ " - " + dateInterval.getEndDateString();
	}

	public void setDateInterval(DateInterval dateInterval) {
		this.dateInterval = dateInterval;
	}
	
	

}
