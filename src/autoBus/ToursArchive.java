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

public class ToursArchive implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Tour> toursArchive;
	
	public ToursArchive(){
		toursArchive=new ArrayList<Tour>();
	}
	
	public int size(){
		return toursArchive.size();
	}
	
	public Tour get(int index){
		return toursArchive.get(index);
	}
	
	public ArrayList<Tour> getTours(){
		return toursArchive;
	}
	
	public String getDateInterval(int index){
		return toursArchive.get(index).getDateIntervalString();
	}
	
	public String getPickUpPlaces(int index){
		return toursArchive.get(index).getPickUpPlacesString();
	}
	
	public String getServices(int index){
		return toursArchive.get(index).getServicesString();
	}
	
	public String getPricePerPassengerString(int index){
		return toursArchive.get(index).getPricePerPassengerString();
	}
	
	public String getBusIdAndType(int index){
		return toursArchive.get(index).getBusAndType();
	}
	
	public String getChauffeur(int index){
		return toursArchive.get(index).getChauffeur();
	}
	
	public void addTour(Tour tour){
		toursArchive.add(tour);
	}
	
	public void removeTour(int index){
		toursArchive.remove(index);
	}
	
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\ToursArchive.dat");
		return (Files.exists(path));
	}
	
	public void createFile() throws Exception{
		addTour(new Tour(""));
		saveToursArchive();
		toursArchive.remove(0);
		saveToursArchive();
	}
	
	public void saveToursArchive() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\ToursArchive.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(toursArchive);
		} finally {
			objectOutputStream.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public void loadToursArchive() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\ToursArchive.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Tour> otherToursArchive = (ArrayList<Tour>)objectInputStream.readObject();//how to check if instance of ArrayList<Tour>??
			this.toursArchive=otherToursArchive;
		} finally {
			objectInputStream.close();
		}
	}
	
	
}
