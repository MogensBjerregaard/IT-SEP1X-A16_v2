package autoBus;

public class TourReservation extends Reservation{

	private static final long serialVersionUID = 1L;
	private Tour tour;
	
	public TourReservation(int reservationNumber, int discount, Customer customer, Tour tour) {
		super(reservationNumber, discount, customer);
		this.tour = tour;
	}

	public TourReservation(int reservationNumber, int discount, Customer customer) {
		super(reservationNumber, discount, customer);
		// TODO Auto-generated constructor stub
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}
	
	
	
}
