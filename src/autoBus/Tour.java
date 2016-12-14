package autoBus;

import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class Tour implements Serializable{

	private static final long serialVersionUID = 1L;
		String destination;
		ArrayList<String> pickUpPlaces;
		double pricePerPassenger;
		Services services;
		Chauffeur chauffeur;
		Bus bus;
		private int seatsAvailable;
		DateInterval dateInterval;
		java.util.Date[] newDateInterval;
		private double totalPrice;

	/**
	 * This returns newDateInterval for this Tour
	 * @return new date interval for this Tour
	 */
		public java.util.Date[] getNewDateInterval() {
		return newDateInterval;
	}

	/**
	 * This returns a String that contains: startDate and endDate
    * @return departure date string of this Bus
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
	 * This returns bus for this Tour
	 * @return bus for this Tour
	 */
	public Bus getBus() {
		return bus;
	}

	/**
	 * This sets newDateInterval for this Tour
	 * @param newDateInterval - new date interval for this Tour
	 */
	public void setNewDateInterval(Date[] newDateInterval) {
		this.newDateInterval = newDateInterval;
	}

	/**
	 * This returns totalPrice for this Tour
	 * @return total price for this Tour
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * This sets totalPrice for this Tour
	 * @param totalPrice - total price for this Tour
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * This returns seatsAvailable for this Tour
	 * @return seats available for this Tour
	 */
	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	/**
	 * This sets seatsAvailable for this Tour
	 * @param seatsAvailable - seats available for this Tour
	 */
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	/**
	 * This constructs a new Tour with: destination, pickUpPlaces, pricePerPassenger, services, chauffeur, bus, dateInterval
	 * @param destination - destination for this Tour
	 * @param pickUpPlaces - pick up places for this Tour
	 * @param pricePerPassenger - price per passenger for this Tour
	 * @param services - services for this Tour
	 * @param chauffeur - chauffeur for this Tour
	 * @param bus - bus for this Tour
	 * @param dateInterval - date interval for this Tour
	 */
	public Tour(String destination, ArrayList<String> pickUpPlaces, double pricePerPassenger, Services services, Chauffeur chauffeur, Bus bus, DateInterval dateInterval) {
		this.destination = destination;
		this.pickUpPlaces = pickUpPlaces;
		this.pricePerPassenger = pricePerPassenger;
		this.services = services;
		this.chauffeur = chauffeur;
		this.bus = bus;
		this.dateInterval = dateInterval;
		this.newDateInterval = new java.util.Date[2];
		this.totalPrice = 0;
		this.seatsAvailable = this.bus.getMaxNumberOfSeats();
	}

	/**
	 * This constructs a new Tour with empty information
	 * @param destination - destination for this Tour
	 * @throws Exception
	 */
	public Tour(String destination) throws Exception{
			this.destination=destination;
			pickUpPlaces = new ArrayList<>();
			pricePerPassenger = 0;
			services = null;
			chauffeur = null;
			bus = null;
			dateInterval = null;
		}
		
	   /**
	    * This sets a Bus for this Tour
	    * @param bus - bus for this Tour
	    */
		public void setBus(Bus bus){
			this.bus = bus;
		}
		
		/**
		 * This returns a String with the information about the Bus of this Tour
		 * @return a String that contains vehicle ID, model and maximum number of seats of Bus for this Tour
		 */
		public String getBusAndType(){
			return "#"+bus.getVehicleID()+" "+bus.getModel()+" "+bus.getMaxNumberOfSeats()+" seats";
		}
		
		/**
		 * This sets Chauffeur for this Tour
		 * @param chauffeur - Chauffeur for this Tour
		 */
		public void setChauffeur(Chauffeur chauffeur){
			this.chauffeur = chauffeur;
		}
		
		/**
		 * This returns Chauffeur of this Tour
		 * @return Chauffeur of this Tour
		 */
		public Chauffeur getChauffeursObject(){
			return this.chauffeur;
		}
		
		/**
		 * This returns a String that contains information about Chauffeur of this Tour
		 * @return A String that contains employee number and name of Chauffeur of this Tour
		 */
		public String getChauffeur(){
			return "#"+chauffeur.getEmployeeNumber()+" "+chauffeur.getName();
		}
		
		/**
		 * This returns destination of this Tour
		 * @return destination of this Tour
		 */
		public String getDestination() {
			return destination;
		}

		/**
		 * This sets destination for this Tour
		 * @param destination - destination for this Tour
		 */
		public void setDestination(String destination) {
			this.destination = destination;
		}

		/**
		 * This returns pickUpPlaces of this Tour
		 * @return pick up places of this Tour
		 */
		public ArrayList<String> getPickUpPlaces() {
			return pickUpPlaces;
		}
		
		/**
		 * This returns a String that contains pickUpPlaces for this Tour
		 * @return a String that contains pick up places for this Tour
		 */
		public String getPickUpPlacesString(){
			String str = new String("");
			for (String string : pickUpPlaces) {
				str += string + " - ";
			}
			if (!str.equalsIgnoreCase("")) {
				return str;
			} else {
				return null;
			}
		}

		/**
		 * This clears all pickUpPlaces for this Tour
		 */
		public void clearPickUpPlaces(){
			this.pickUpPlaces.clear();
		}

		/**
		 * This sets pickUpPlaces for this Tour
		 * @param pickUpPlace - pick up places for this Tour
		 */
		public void setPickUpPlaces(String pickUpPlace) {
			this.pickUpPlaces.add(pickUpPlace);
		}

		/**
		 * This returns pricePerPassenger of this Tour
		 * @return price per passenger of this Tour
		 */
		public double getPricePerPassenger() {
			return pricePerPassenger;
		}
		
		/**
		 * This returns a String that contains pricePerPassenger of this Tour
		 * @return a String that contains price per passenger in this Tour
		 */
		public String getPricePerPassengerString(){
			return Double.toString(pricePerPassenger);
		}

		/**
		 * This sets pricePerPasssenger for this Tour
		 * @param pricePerPassenger - price per passenger for this Tour
		 */
		public void setPricePerPassenger(double pricePerPassenger) {
			this.pricePerPassenger = pricePerPassenger;
		}

		/**
		 * This returns services of this Tour
		 * @return services of this Tour
		 */
		public Services getServices() {
			return services;
		}
		
		/**
		 * This returns a String that contains information about Services of this Tour
		 * @return a String that contains information about Services according to the selected Services of this Tour
		 */
		public String getServicesString(){
			String str = new String("");
			if (services.isEntranceTickets()) {
				str+="Entrance tickets -";
			}
			if (services.isAllInclusive()) {
				str+="All inclusive";
				return str;
			}
			if (services.isBreakfastIncluded()) {
				str+="Breakfast -";
			}
			if (services.isLunchIncluded()) {
				str+="Lunch";
			} 
			return str;
		}

		/**
		 * Thus sets services for this Tour
		 * @param services - services for this Tour
		 */
		public void setServices(Services services) {
			this.services = services;
		}

		/**
		 * This returns dateInterval for this Tour
		 * @return date interval for this Tour
		 */
		public DateInterval getDateInterval() {
			return dateInterval;
		}
		
		/**
		 * This returns a String that contains getStartDateString() and getEndDateString() of dateInterval this Tour
		 * @return  start and end dates of date interval of this Tour
		 */
		public String getDateIntervalString(){
			return dateInterval.getStartDateString()+" -\n"+dateInterval.getEndDateString();
		}

		/**
		 * Thus sets dateInterval for this Tour
		 * @param dateInterval - date interval for this Tour
		 */
		public void setDateInterval(DateInterval dateInterval) {
			this.dateInterval = dateInterval;
		}
		
		

}
