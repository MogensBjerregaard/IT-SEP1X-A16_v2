package autoBus;

public class TourReservation extends Reservation{

	private static final long serialVersionUID = 1L;
	private Tour tour;
	
	/**
	 * This construct a new TourReservation with: reservation number, discount, customer, tour
	 * @param reservationNumber - reservation number of this TourReservation
	 * @param discount - discount of this TourReservation
	 * @param customer - customer of this TourReservation
	 * @param tour - tour of this TourReservation
	 */
	public TourReservation(int reservationNumber, int discount, Customer customer, Tour tour) {
		super(reservationNumber, discount, customer);
		this.tour = tour;
	}

	/**
	 * This construct a new TourReservation with: reservation number, discount, customer, tour
    * @param reservationNumber - reservation number of this TourReservation
    * @param discount - discount of this TourReservation
    * @param customer - customer of this TourReservation
	 */
	public TourReservation(int reservationNumber, int discount, Customer customer) {
		super(reservationNumber, discount, customer);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This returns tour of this TourReservation
	 * @return tour of this Tour Reservation
	 */
	public Tour getTour() {
		return tour;
	}

	/**
	 * This sets tour for this TourReservation
	 * @param tour for this Tour Reservation
	 */
	public void setTour(Tour tour) {
		this.tour = tour;
	}
	
	
	
}
