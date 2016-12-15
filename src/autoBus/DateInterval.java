package autoBus;

import java.io.Serializable;

public class DateInterval implements Serializable{

	private static final long serialVersionUID = 1L;
	private Date startDate;
	private Date endDate;
	
	/**
	 * This constructs a new DateInterval with: startDate and endDate
	 * @param startDate - start date for this DateInterval
	 * @param endDate - end date for this DateInterval
	 */
	public DateInterval(Date startDate, Date endDate){
		this.startDate=startDate;
		this.endDate=endDate;
	}
	
	/**
	 * This constructs a new Date Interval with empty: startDate and endDate
	 */
	public DateInterval(){
		this.startDate = new Date(0, 0, 0);
		this.endDate = new Date(0, 0, 0);
	}

	/**
	 * This returns startDate of this DateInterval with type Date
	 * @return start date of this Date Interval
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * This sets startDate for this DateInterval
	 * @param startDate - start date for this DateInterval
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * This returns endDate of this DateInterval with Date type
	 * @return end date of this date Interval
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * This sets endDate for this DateInterval
	 * @param endDate - end date for this DateInterval
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	/**
	 * This returns String with: startDateString.displayDate() of this DateInterval
	 * @return displayed start date of this DateInterval
	 */
	public String getStartDateString(){
		return startDate.displayDate();
	}
	
	/**
	 * This returns String with: endDate.displayDate() of this DateInterval
	 * @return displayed end date of this DateInterval
	 */
	public String getEndDateString(){
		return endDate.displayDate();
	}
}
