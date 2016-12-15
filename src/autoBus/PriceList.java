package autoBus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PriceList implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Double> priceList; //index 0 = Breakfast, index 1 = Lunch, index 2 = All inclusive, index 3 = Entrance tickets

	
	/**
	 * This is a constructor for PriceList
	 * @throws Exception
	 */
	public PriceList() throws Exception {
		this.priceList = new ArrayList<Double>();		
	}
	
	/**
    * This returns a boolean if the file exists
    * @return path of this file
    */
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\PriceList.dat");
		return (Files.exists(path));
	}
	
	/**
    * This creates a new file
    * @throws Exception
    */
	public void createFile() throws Exception{
		priceList.add(0.0);
		priceList.add(0.0);
		priceList.add(0.0);
		priceList.add(0.0);
		savePriceList();
	}
	
	/**
    * This saves priceList after changes have been made
    * @throws Exception
    */
	public void savePriceList() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\PriceList.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(priceList);
		} finally {
			objectOutputStream.close();
		}
	}
	
	/**
    * This loads already existing priceList
    * @throws Exception
    */
	@SuppressWarnings("unchecked")
	public void loadPriceList() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\PriceList.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Double> otherPriceList = (ArrayList<Double>)objectInputStream.readObject();//how to check if instance of ArrayList<Double>??
			this.priceList=otherPriceList;
		} finally {
			objectInputStream.close();
		}
	}
	
	/**
	 * This returns double with price for Breakfast
	 * @return price for Breakfast
	 */
	public double getPriceBreakfast() {
		return priceList.get(0);
	}

	/**
	 * This sets price for Breakfast
	 * @param priceBreakfast - price for Breakfast
	 */
	public void setPriceBreakfast(double priceBreakfast) {
		priceList.set(0, priceBreakfast);
	}

	/**
	 * This returns double with price for Lunch
	 * @return price for Lunch
	 */
	public double getPriceLunch() {
		return priceList.get(1);
	}

	/**
	 * This sets price for Lunch
	 * @param priceLunch - price for Lunch
	 */
	public void setPriceLunch(double priceLunch) {
		priceList.set(1, priceLunch);
	}

	/**
	 * This returns double with price for All Inclusive
	 * @return price for All Inclusive
	 */
	public double getPriceAllInclusive() {
		return priceList.get(2);
	}

	/**
	 * This sets price for All Inclusive
	 * @param priceAllInclusive - price for All Inclusive
	 */
	public void setPriceAllInclusive(double priceAllInclusive) {
		priceList.set(2, priceAllInclusive);
	}
	
	/**
	 * This returns double with price for EntranceTickets
	 * @return price for EntranceTickets
	 */
	public double getPriceEntranceTickets() {
		return priceList.get(3);
	}

	/**
	 * This sets price for EntranceTickets
	 * @param priceEntranceTickets - price for Entrance Tickets
	 */
	public void setPriceEntranceTickets(double priceEntranceTickets) {
		priceList.set(3, priceEntranceTickets);
	}
		
	
}
