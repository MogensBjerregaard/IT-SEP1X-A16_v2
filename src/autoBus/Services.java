package autoBus;

import java.io.Serializable;

public class Services implements Serializable{

	private static final long serialVersionUID = 1L;
	private boolean breakfastIncluded;
	private boolean lunchIncluded;
	private boolean allInclusive;
	private boolean entranceTickets;
	private PriceList priceList;
	
	/**
	 * This is a Constructor for this Services
	 * @throws Exception
	 */
	public Services() throws Exception {
		this.breakfastIncluded=false;
		this.lunchIncluded=false;
		this.allInclusive=false;
		this.entranceTickets=false;
		this.priceList = new PriceList();
	}

	/**
	 * This returns breakfastIncluded
	 * @return breakfast included
	 */
	public boolean isBreakfastIncluded() {
		return breakfastIncluded;
	}

	/**
	 * This sets breakfastIncluded
	 * @param breakfastIncluded - breakfast Included
	 */
	public void setBreakfastIncluded(boolean breakfastIncluded) {
		this.breakfastIncluded = breakfastIncluded;
	}

	/**
	 * This returns lunchIncluded
	 * @return lunch included
	 */
	public boolean isLunchIncluded() {
		return lunchIncluded;
	}

	/**
	 * This sets lunchIncluded
	 * @param lunchIncluded - lunch included
	 */
	public void setLunchIncluded(boolean lunchIncluded) {
		this.lunchIncluded = lunchIncluded;
	}

	/**
	 * This returns allInclusive
	 * @return all inclusive
	 */
	public boolean isAllInclusive() {
		return allInclusive;
	}

	/**
	 * This sets allInclusive
	 * @param allInclusive - all inclusive
	 */
	public void setAllInclusive(boolean allInclusive) {
		this.allInclusive = allInclusive;
	}

	/**
	 * This returns entranceTickets
	 * @return entrance tickets
	 */
	public boolean isEntranceTickets() {
		return entranceTickets;
	}

	/**
	 * This sets entranceTickets
	 * @param entranceTickets - entrance tickets
	 */
	public void setEntranceTickets(boolean entranceTickets) {
		this.entranceTickets = entranceTickets;
	}
	
	/**
	 * This returns getPriceBreakfast()
	 * @return pricer for breakfast
	 */
	public double getPriceBreakfast() {
		return priceList.getPriceBreakfast();
	}
	
	/**
	 * This returns getPriceLunch()
	 * @return price for lunch
	 */
	public double getPriceLunch() {
		return priceList.getPriceLunch();
	}
	
	/**
	 * This returns getPriceAllInclusive()
	 * @return price for all inclusive
	 */
	public double getPriceAllInclusive() {
		return priceList.getPriceAllInclusive();
	}
	
	/**
	 * This returns getPriceEntranceTickets()
	 * @return price for entrance tickets
	 */
	public double getPriceEntranceTickets() {
		return priceList.getPriceEntranceTickets();
	}
	
	/**
	 * This returns total price for all services that there included
	 * @return for all included services
	 */
	public double getTotalPrice(){
		double total = 0;
		if (breakfastIncluded){
			total += getPriceBreakfast();
		}
		if (lunchIncluded){
			total += getPriceLunch();
		}
		if (allInclusive) {
			total += getPriceAllInclusive();
		}
		if (entranceTickets) {
			total += getPriceEntranceTickets();
		}
		return total;
	}
	
	/**
	 * This returns str that contains information
	 * @return String that contains information according to services selected
	 */
	public String getServicesString(){
		String str = new String();
		if (allInclusive) {
			str+= "All inclusive, ";
		}
		if (breakfastIncluded) {
			str+= "Breakfast, ";
		}
		if (lunchIncluded) {
			str+= "Lunch, ";
		}
		if (entranceTickets) {
			str+= "Entrance tickets";
		}
		return str;
	}

}
