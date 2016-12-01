package autoBus;

public class BusReservation extends Reservation{

	private static final long serialVersionUID = 1L;
	private Chauffeur chauffeur;
	private Bus bus;
	private Services services;
	private DateInterval dateInterval;
	private double price;
	

	public BusReservation(int reservationNumber, int discount, Customer customer, Chauffeur chauffeur, Bus bus,
			Services services, DateInterval dateInterval, double price) {
		super(reservationNumber, discount, customer);
		this.chauffeur = chauffeur;
		this.bus = bus;
		this.services = services;
		this.dateInterval = dateInterval;
		this.price=price;
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
