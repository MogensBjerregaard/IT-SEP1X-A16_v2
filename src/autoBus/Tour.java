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

	public java.util.Date[] getNewDateInterval() {
		return newDateInterval;
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

	public Bus getBus() {
		return bus;
	}

	public void setNewDateInterval(Date[] newDateInterval) {
		this.newDateInterval = newDateInterval;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

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

	public Tour(String destination) throws Exception{
			this.destination=destination;
			pickUpPlaces = new ArrayList<>();
			pricePerPassenger = 0;
			services = null;
			chauffeur = null;
			bus = null;
			dateInterval = null;
		}
		
		public void setBus(Bus bus){
			this.bus = bus;
		}
		
		public String getBusAndType(){
			return (String)"#"+bus.getVehicleID()+" "+bus.getModel()+" "+bus.getMaxNumberOfSeats()+" seats";
		}
		
		public void setChauffeur(Chauffeur chauffeur){
			this.chauffeur = chauffeur;
		}

		public Chauffeur getChauffeursObject(){
			return this.chauffeur;
		}
		
		public String getChauffeur(){
			return "#"+chauffeur.getEmployeeNumber()+" "+chauffeur.getName();
		}
		
		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public ArrayList<String> getPickUpPlaces() {
			return pickUpPlaces;
		}
		
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

		public void clearPickUpPlaces(){
			this.pickUpPlaces.clear();
		}

		public void setPickUpPlaces(String pickUpPlace) {
			this.pickUpPlaces.add(pickUpPlace);
		}

		public double getPricePerPassenger() {
			return pricePerPassenger;
		}
		
		public String getPricePerPassengerString(){
			return Double.toString(pricePerPassenger);
		}

		public void setPricePerPassenger(double pricePerPassenger) {
			this.pricePerPassenger = pricePerPassenger;
		}

		public Services getServices() {
			return services;
		}
		
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

		public void setServices(Services services) {
			this.services = services;
		}

		public DateInterval getDateInterval() {
			return dateInterval;
		}
		
		public String getDateIntervalString(){
			return dateInterval.getStartDateString()+" -\n"+dateInterval.getEndDateString();
		}

		public void setDateInterval(DateInterval dateInterval) {
			this.dateInterval = dateInterval;
		}
		
		

}
