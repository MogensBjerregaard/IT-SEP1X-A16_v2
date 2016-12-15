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

public class PassengersArchive implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Passenger> passengersArchive;

	/**
	 * This returns this passengersArchive ArrayList
	 * @return this passengersArchive
	 */
	public ArrayList<Passenger> getPassengersArchive() {
		return passengersArchive;
	}

	/**
	 * This is a constructor for passengersArchive
	 */
	public PassengersArchive(){
		passengersArchive = new ArrayList<>();
	}
	
	/**
	 * This returns size of this passengersArchive ArrayList
	 * @return size of this passengersArchive
	 */
	public int size(){
		return passengersArchive.size();
	}
	
	/**
	 * This returns a specified Passenger from passengersArchive ArrayList
	 * @param index - index of this Passenger
	 * @return Specified Passenger from passengers archive
	 */
	public Passenger get(int index){
		return passengersArchive.get(index);
	}
	
	/**
	 * This adds a new Passenger into passengersArchive ArrayList
	 * @param passenger - Passenger that is being added
	 */
	public void addPassenger(Passenger passenger){
		passengersArchive.add(passenger);
	}
	
	/**
	 * This removes specified Passenger from passengersArchive ArrayList
	 * @param index - index of Passenger
	 */
	public void removePassenger(int index){
		passengersArchive.remove(index);
	}
	
	/**
    * This returns a boolean if the file exists
    * @return path of this file
    */
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\PassengersArchive.dat");
		return (Files.exists(path));
	}
	
	/**
    * This creates a new file
    * @throws Exception
    */
	public void createFile() throws Exception{
		passengersArchive.add(new Passenger("", "", "", new Date(0, 0, 0), ""));
		savePassengersArchive();
		passengersArchive.remove(0);
		savePassengersArchive();
	}
	
	/**
    * This saves passengersArchive after changes have been made
    * @throws Exception
    */
	public void savePassengersArchive() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\PassengersArchive.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(passengersArchive);
		} finally {
			objectOutputStream.close();
		}
	}
	
	/**
    * This loads already existing passengersArchive 
    * @throws Exception
    */
	@SuppressWarnings("unchecked")
	public void loadPassengersArchive() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\PassengersArchive.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Passenger> otherPassengersArchive = (ArrayList<Passenger>)objectInputStream.readObject();//how to check if instance of ArrayList<Passenger>??
			this.passengersArchive=otherPassengersArchive;
		} finally {
			objectInputStream.close();
		}
	}
}
