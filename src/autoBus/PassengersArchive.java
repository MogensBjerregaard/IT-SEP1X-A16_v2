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
	
	public PassengersArchive(){
		passengersArchive = new ArrayList<>();
	}
	
	public int size(){
		return passengersArchive.size();
	}
	
	public Passenger get(int index){
		return passengersArchive.get(index);
	}
	
	public void addPassenger(Passenger passenger){
		passengersArchive.add(passenger);
	}
	
	public void removePassenger(int index){
		passengersArchive.remove(index);
	}
	
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\PassengersArchive.dat");
		return (Files.exists(path));
	}
	
	public void createFile() throws Exception{
		passengersArchive.add(new Passenger("", "", "", new Date(0, 0, 0), ""));
		savePassengersArchive();
		passengersArchive.remove(0);
		savePassengersArchive();
	}
	
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
