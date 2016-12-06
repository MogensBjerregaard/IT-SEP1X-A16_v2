package autoBus;

import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class Bus implements Serializable{

	private static final long serialVersionUID = 1L;
	private  ArrayList<java.util.Date[]> listOfStartEndDates;
	private int datePointer; /*an util field which helps to add new item to listOfStartEndDates in right place*/
	private int maxNumberOfSeats;
	private int seatsAvailable;
	private String vehicleID;
	private double pricePerHour;
	private String model;
	private boolean availableForTours;

	public  ArrayList<Date[]> getListOfStartEndDates() {
		return this.listOfStartEndDates;
	}

	public int getDatePointer() {
		return datePointer;
	}

	public Bus(int maxNumberOfSeats, String vehicleID, double pricePerHour, String model){
		this.maxNumberOfSeats=maxNumberOfSeats;
		this.seatsAvailable=maxNumberOfSeats;
		this.vehicleID=vehicleID;
		this.pricePerHour=pricePerHour;
		this.model=model;
		this.availableForTours=true;
		this.datePointer = 0;
		this.listOfStartEndDates = new ArrayList<>();
	}

	public void setDatePointer(int datePointer) {
		this.datePointer = datePointer;
	}

	public boolean isAvailable(Date startDate, int durationInHours) {
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

	public void addNewReservationPeriod(java.util.Date[] newStartEndDate){
		listOfStartEndDates.add(datePointer, newStartEndDate);
	}

	public String toString(){
		return "Bus ID#: "+vehicleID+", Type: "+model+", Seats: "+maxNumberOfSeats;
	}
	
	public int getMaxNumberOfSeats() {
		return maxNumberOfSeats;
	}

	public void setMaxNumberOfSeats(int maxNumberOfSeats) {
		this.maxNumberOfSeats = maxNumberOfSeats;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	public void removeSeat(){
		if (seatsAvailable>0){
			seatsAvailable--;
		}
	}
	
	public void addSeat(){
		if (seatsAvailable<maxNumberOfSeats){
			seatsAvailable++;
		}
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public String getModel() {
		return model;
	}
	
	public String getModelString() {
		return model.toString();
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isAvailableForTours() {
		return availableForTours;
	}

	public void setAvailableForTours(boolean availableForTours) {
		this.availableForTours = availableForTours;
	}	
	
	
}
