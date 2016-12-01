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

	
	public PriceList() throws Exception {
		this.priceList = new ArrayList<Double>();		
	}
	
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\PriceList.dat");
		return (Files.exists(path));
	}
	
	public void createFile() throws Exception{
		priceList.add(0.0);
		priceList.add(0.0);
		priceList.add(0.0);
		priceList.add(0.0);
		savePriceList();
	}
	
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
	
	public double getPriceBreakfast() {
		return priceList.get(0);
	}

	public void setPriceBreakfast(double priceBreakfast) {
		priceList.set(0, priceBreakfast);
	}

	public double getPriceLunch() {
		return priceList.get(1);
	}

	public void setPriceLunch(double priceLunch) {
		priceList.set(1, priceLunch);
	}

	public double getPriceAllInclusive() {
		return priceList.get(2);
	}

	public void setPriceAllInclusive(double priceAllInclusive) {
		priceList.set(2, priceAllInclusive);
	}

	public double getPriceEntranceTickets() {
		return priceList.get(3);
	}

	public void setPriceEntranceTickets(double priceEntranceTickets) {
		priceList.set(3, priceEntranceTickets);
	}
		
	
}
