package autoBus;

import java.io.Serializable;

public class Date implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int month, day, year;
	
	/**
	 * This constructs a new Date with: month, day, year
	 * @param month - month of this Date
	 * @param day - day of this Date
	 * @param year - year of this Date
	 */
	public Date(int month, int day, int year){
		this.month=month;
		if (day<1){
			this.day=1;
		} else if(day>getLengthOfMonth()){
			this.day=getLengthOfMonth();
		} else {
			this.day=day;
		}	
		this.year=year;
	}
	/**
	 * This returns if the year is leap
	 * @return true if the year is leap and false if year isn't leap
	 */
	public boolean isLeapYear(){
		if (this.year%4==0&&this.year%100!=0||this.year%400==0){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * This returns the length of the month
	 * @return 31 if this month equals to 1 or 3 or 5 or 7 or 8 or 10 or 12. Else 30 if this month equals to 4, 6, 9, 11. Else 29 if this month equals to 2 and is leap year equals true. Else 28
	 */
	public int getLengthOfMonth(){
		if (this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12){
			return 31;
		} else if (this.month==4||this.month==6||this.month==9||this.month==11) {
			return 30;
		} else if(this.month==2&&isLeapYear()==true){
			return 29;
		} else {
			return 28;
		}
	}
	
	/**
	 * This add plus one more day and makes changes for month and year
	 */
	public void goToNextDay(){
		if (this.day++<getLengthOfMonth()){
			this.day++;
		} else if(this.month!=12){
			this.day=1;
			this.month++;
		} else {
			this.day=1;
			this.month=1;
			this.year++;
		}
	}
	
	/**
	 * This calls goToNextDay() method
	 * @param days - amount of days
	 */
	public void advanceDays(int days){
		for (int i=0;i<days;i++){
			goToNextDay();
		}
	}
	
	/**
	 * This sets month for this Date
	 * @param month - month for this Date
	 */
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		if (day<1){
			this.day=1;
		} else if(day>getLengthOfMonth()){
			this.day=getLengthOfMonth();
		} else {
			this.day=day;
		}	
	}
	
	/**
	 * This sets year for this Date
	 * @param year - year for this Date
	 */
	public void setYear(int year){
		this.year=year;
	}
	
	/**
	 * This returns month of this Date
	 * @return month of this Date
	 */
	public int getMonth(){
		return this.month;
	}
	
	/**
	 * This returns day of this Date
	 * @return day of this Date
	 */
	public int getDay(){
		return this.day;
	}
	
	/**
	 * This returns year of this Date
	 * @return year of this Date
	 */
	public int getYear(){
		return this.year;
	}
	
	/**
	 * This displays a String that contains day, month and year of this Date
	 * @return String with the information of this Date
	 */
	public String displayDate(){
		String date=day+"/"+month+"/"+year;
		return date;
	}
	/**
	 * This compares otherDate with thisDate
	 * @param otherDate - compared Date
	 * @return if the dates are equal
	 */
	public boolean equals(Date otherDate){
		return this.day==otherDate.day
				&& this.month==otherDate.month
				&& this.year==otherDate.year;
	}
	/**
	 *  This returns new Date with month, day and year of this Date
	 * @return new Date with month, day and year of this Date
	 */
	public Date copy(){
		return new Date(this.month, this.day, this.year);
	}
	
}
