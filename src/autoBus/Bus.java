package autoBus;

import java.io.Serializable;
import java.util.*;


public class Bus implements Serializable{

	private static final long serialVersionUID = 1L;
	private  ArrayList<java.util.Date[]> listOfStartEndDates;
	private int datePointer; /*an util field which helps to add new item to listOfStartEndDates in right place*/
	private int maxNumberOfSeats;
	private String vehicleID;
	private double pricePerHour;
	private String model;
	private boolean availableForTours;

	/**
	 * This returns listOfStartEndDates
	 * @return List of start end dates for this Bus
	 */
	public  ArrayList<java.util.Date[]> getListOfStartEndDates() {
		return this.listOfStartEndDates;
	}
	
	/**
	 * This returns datePointer
	 * @return An util field which helps to add new item to listOfStartEndDates in right place
	 */
	public int getDatePointer() {
		return datePointer;
	}

	/**
	 * This returns a String that contains: startMonth, startDay, startYear, startHour and startMinute
	 * @return Earliest departure date string of this Bus
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
	 * This constructs a Bus with a specified maxNumberOfSeats, vehicleID, pricePerHour and model
	 * @param maxNumberOfSeats - the maximum number of seats of the Bus
	 * @param vehicleID the ID - of the Bus
	 * @param pricePerHour - the price per hour for the Bus
	 * @param model - the model of the Bus
	 */
	public Bus(int maxNumberOfSeats, String vehicleID, double pricePerHour, String model){
		this.maxNumberOfSeats=maxNumberOfSeats;
		this.vehicleID=vehicleID;
		this.pricePerHour=pricePerHour;
		this.model=model;
		this.availableForTours=true;
		this.datePointer = 0;
		this.listOfStartEndDates = new ArrayList<>();
	}
	/**
	 * This sets the datePointer for this Bus
	 * @param datePointer - an util field which helps to add new item to listOfStartEndDates in right place
	 */
	public void setDatePointer(int datePointer) {
		this.datePointer = datePointer;
	}

	/**
	 * This checks if this Bus is available with this startDate and this durationInHours
	 * @param startDate - start date of the trip
	 * @param durationInHours - duration of the trip in hours
	 * @return if this Bus is available for the trip
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
	 * This adds newStartEndDate in listOfStartEndDates
	 * @param newStartEndDate - start and end date of the new reservation
	 */
	public void addNewReservationPeriod(java.util.Date[] newStartEndDate){
		listOfStartEndDates.add(datePointer, newStartEndDate);
	}
	
	/**
	 * This returns vehicleId, model and maxNumberOfSeats of this Bus
	 */
	public String toString(){
		return "Bus ID#: "+vehicleID+", Type: "+model+", Seats: "+maxNumberOfSeats;
	}
	
	/**
	 * This returns naxNumberOfSeats of this Bus
	 * @return maximum number of seats of this Bus
	 */
	public int getMaxNumberOfSeats() {
		return maxNumberOfSeats;
	}
	
	/**
	 * This sets maxNumberOfSeats for this Bus
	 * @param maxNumberOfSeats - maximum number of seats for this Bus
	 */
	public void setMaxNumberOfSeats(int maxNumberOfSeats) {
		this.maxNumberOfSeats = maxNumberOfSeats;
	}


	/**
	 * This returns vehicleID of this Bus
	 * @return ID of this Bus
	 */
	public String getVehicleID() {
		return vehicleID;
	}

	/**
	 * This sets vehicleID for this Bus
	 * @param vehicleID for this Bus
	 */
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	/**
	 * This returns pricePerHour of this Bus
	 * @return price per hour of this Bus
	 */
	public double getPricePerHour() {
		return pricePerHour;
	}

	/**
	 * This sets pricePerHour for this Bus
	 * @param  pricePerHour per hour for this Bus
	 */
	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	/**
	 * This returns model of this Bus
	 * @return model of this Bus
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * This returns model.toString() of this Bus
	 * @return string model of this Bus
	 */
	public String getModelString() {
		return model.toString();
	}

	/**
	 * This sets model for this Bus
	 * @param model of this Bus
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * This returns availableForTours for this Bus
	 * @return available for tours for this Bus
	 */
	public boolean isAvailableForTours() {
		return availableForTours;
	}

	/**
	 * This sets availableForTours for this Bus
	 * @param availableForTours - available for tours for this Bus
	 */

	
	
}
