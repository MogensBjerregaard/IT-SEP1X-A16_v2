package autoBus;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Reservation implements Serializable{
	private static final long serialVersionUID = 1L;
	private int reservationNumber;
	private double discount;
	private ArrayList<Passenger> passengers;
	private Customer customer;
	private double totalPrice;
	
	/**
	 * This constructs a new Reservation with: reservationNumber, discount and customer
	 * @param reservationNumber - reservation number for this Reservation
	 * @param discount - discount for this Reservation
	 * @param customer - customer for this Reservation 
	 */
	public Reservation (int reservationNumber, double discount, Customer customer){
		this.reservationNumber=reservationNumber;
		this.discount=discount;
		this.passengers = new ArrayList<>();
		this.customer = customer;
		this.totalPrice = 0;
	}

	/**
	 * This returns double totalPrice of this Reservation
	 * @return total price of this Reservation
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * This sets totalPrice for this Reservation 
	 * @param totalPrice - total Price for this Reservation
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * This returns int with reservationNumber of this Reservation
	 * @return reservation number of this Reservation
	 */
	public int getReservationNumber() {
		return reservationNumber;
	}
	
	/**
	 * This sets reservationsNumber for this Reservation
	 * @param reservationNumber - reservation number for this Reservation
	 */
	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	
	/**
	 * This returns double discount of this Reservation
	 * @return discount of this Reservation
	 */
	public double getDiscount() {
		return discount;
	}
	
	/**
	 * This sets discount for this Reservation
	 * @param discount - discount for this Reservation
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * This returns passengers of this Reservation with ArrayLIst<Pasenger> type
	 * @return passengers of this Reservation
	 */
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	
	/**
	 * This returns String that contains information about all the Passengers of this Reservation
	 * @return name and phone number of each Passenger of this Reservation
	 */
	public String getPassengersString(){
		String str = new String();
		for (int i =0; i< passengers.size(); i++){
			str += passengers.get(i).getName() +" "+passengers.get(i).getPhonenumber()+", \n";
		}
		return str;
	}
	
	/**
	 * This sets passengers for this Reservation
	 * @param passengers - passengers for this Reservation
	 */
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	/**
	 * This adds a Passenger to this Reservation
	 * @param passenger - a Passenger to this Reservation
	 */
	public void addPassenger(Passenger passenger){
		this.passengers.add(passenger);
	}
	
	/**
	 * This returns Customer of this Reservation with Customer type
	 * @return Customer of this Reservation
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * This sets Customer for this Reservation
	 * @param customer - Customer for this Reservation
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
