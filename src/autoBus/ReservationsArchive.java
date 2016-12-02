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

public class ReservationsArchive implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Reservation> reservationsArchive;

	public ArrayList<Reservation> getReservationsArchive() {
		return reservationsArchive;
	}

	public ReservationsArchive(){
		reservationsArchive=new ArrayList<Reservation>();
	}
	
	public int size(){
		return reservationsArchive.size();
	}
	
	public Reservation get(int index){
		return reservationsArchive.get(index);
	}
	
	public void addReservation(Reservation reservation){
		reservationsArchive.add(reservation);
	}
	
	public void removeReservation(int index){
		reservationsArchive.remove(index);
	}
	
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\ReservationsArchive.dat");
		return (Files.exists(path));
	}
	
	public Reservation getReservationByReservationNumber(int reservationNumber){
		for (int i=0; i< reservationsArchive.size(); i++){
			if (reservationsArchive.get(i).getReservationNumber()==reservationNumber) {
				return reservationsArchive.get(i);
			}
		}
		return null;
	}
	
	public void createFile() throws Exception{
		reservationsArchive.add(new BusReservation(0, 0, new Customer("", "", "", "", new Date(0, 0, 0), "", "")));
		reservationsArchive.add(new TourReservation(0, 0, new Customer("", "", "", "", new Date(0, 0, 0), "", "")));
		saveReservationsArchive();
		reservationsArchive.remove(0);
		reservationsArchive.remove(0);
		saveReservationsArchive();
	}
	
	public void saveReservationsArchive() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\ReservationsArchive.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(reservationsArchive);
		} finally {
			objectOutputStream.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadReservationsArchive() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\ReservationsArchive.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Reservation> otherReservationsArchive = (ArrayList<Reservation>)objectInputStream.readObject();//how to check if instance of ArrayList<Reservation>??
			this.reservationsArchive=otherReservationsArchive;
		} finally {
			objectInputStream.close();
		}
	}

}
