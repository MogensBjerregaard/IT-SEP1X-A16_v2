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

public class ReservationNumber implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Integer> reservationNumber;
	private int count;
	
	public ReservationNumber(){
		this.reservationNumber = new ArrayList<>();
		this.count=1;
	}
	
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\ReservationNumber.dat");
		return (Files.exists(path));
	}
	
	public void createFile() throws Exception{
		reservationNumber.add(1);
		saveReservationNumber();
	}
	
	public void saveReservationNumber() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\ReservationNumber.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(reservationNumber);
		} finally {
			objectOutputStream.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadReservationNumber() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\ReservationNumber.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Integer> otherReservationNumber = (ArrayList<Integer>)objectInputStream.readObject();//how to check if instance of ArrayList<Integer>??
			this.reservationNumber=otherReservationNumber;
			this.count=reservationNumber.get(0);
		} finally {
			objectInputStream.close();
		}
	}
	
	
	public int getReservationNumber() throws Exception{
		int number = reservationNumber.get(0);
		count++;
		reservationNumber.set(0,count);
		saveReservationNumber();
		return number;
	}
	
	public void cancelReservationNumber() throws Exception{
		count--;
		reservationNumber.set(0,count);
		saveReservationNumber();
	}
		
	
}
