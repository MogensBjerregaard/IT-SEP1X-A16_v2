package autoBus;

import java.io.Serializable;
import java.util.ArrayList;

public class Tour implements Serializable{

	private static final long serialVersionUID = 1L;
		String destination;
		ArrayList<String> pickUpPlaces;
		double pricePerPassenger;
		Services services;
		Chauffeur chauffeur;
		Bus bus;
		DateInterval dateInterval;
		
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
