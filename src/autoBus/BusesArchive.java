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

public class BusesArchive implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Bus> busesArchive;
	
	/**
	 * Constructor for BusesArchive
	 */
	public BusesArchive(){
		busesArchive=new ArrayList<Bus>();
	}
	
	/**
	 * This returns busesArchive.size()
	 * @return size of this buses archive
	 */
	public int size(){
		return busesArchive.size();
	}
	
	/**
	 * This returns specified Bus from busesArchive
	 * @param index - index of this Bus
	 * @return specified Bus from buses archive
	 */
	public Bus get(int index){
		return busesArchive.get(index);
	}
	
	/**
	 * This adds Bus in busesArchive
	 * @param bus - bus that is added in buses Archive
	 */
	public void addBus(Bus bus){
		busesArchive.add(bus);
	}
	
	/**
	 * This removes specified bus from busesArchive
	 * @param index - index of this Bus
	 */
	public void removeBus(int index){
		busesArchive.remove(index);
	}
	
	/**
	 * This returns a boolean if the file exists
	 * @return path of this file
	 */
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\BusesArchive.dat");
		return (Files.exists(path));
	}
	
	/**
	 * This creates a new file
	 * @throws Exception
	 */
	public void createFile() throws Exception{
		addBus(new Bus(0, "", 0, ""));
		saveBusesArchive();
		busesArchive.remove(0);
		saveBusesArchive();
	}
	
	/**
	 * This saves busesArchive after changes
	 * @throws Exception
	 */
	public void saveBusesArchive() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\BusesArchive.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(busesArchive);
		} finally {
			objectOutputStream.close();
		}
	}
	
	/**
	 * This loads busesArchive 
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void loadBusesArchive() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\BusesArchive.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Bus> otherBusesArchive = (ArrayList<Bus>)objectInputStream.readObject();//how to check if instance of ArrayList<Bus>??
			this.busesArchive=otherBusesArchive;
		} finally {
			objectInputStream.close();
		}
	}
	
	/**
	 * This returns specified Bus from busesArchive
	 * @param id - id of this Bus
	 * @return this Bus from the buses Archive
	 */
	public Bus getBusById(String id){
		for (int i = 0; i < busesArchive.size(); i++) {
			if (busesArchive.get(i).getVehicleID().equalsIgnoreCase(id)) {
				return busesArchive.get(i);
			}
		}
		return null;
	}
	
	
}
