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
	
	public Reservation (int reservationNumber, double discount, Customer customer){
		this.reservationNumber=reservationNumber;
		this.discount=discount;
		this.passengers = new ArrayList<>();
		this.customer = customer;
		this.totalPrice = 0;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getReservationNumber() {
		return reservationNumber;
	}
	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	
	public String getPassengersString(){
		String str = new String();
		for (int i =0; i< passengers.size(); i++){
			str += passengers.get(i).getName() +" "+passengers.get(i).getPhonenumber()+", \n";
		}
		return str;
	}
	
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	public void addPassenger(Passenger passenger){
		this.passengers.add(passenger);
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
