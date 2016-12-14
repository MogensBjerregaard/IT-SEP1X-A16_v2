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

	/**
	 * This returns this ReservationArchive
	 * @return this Reservation Archive
	 */
	public ArrayList<Reservation> getReservationsArchive() {
		return reservationsArchive;
	}

	/**
	 * This is a Constructor for ReservationArchive
	 */
	public ReservationsArchive(){
		reservationsArchive=new ArrayList<Reservation>();
	}
	
	/**
	 * This returns size of this ReservationArchive
	 * @return size of this Reservation Archive
	 */
	public int size(){
		return reservationsArchive.size();
	}
	
	/**
	 * This returns specified Reservation from ReservationsArchive
	 * @param index - index of the Reservation
	 * @return specified Reservation from Reservations Archive
	 */
	public Reservation get(int index){
		return reservationsArchive.get(index);
	}
	
	/**
	 * This adds a Reservation into ReservationsArchive
	 * @param reservation - reservation that is being added
	 */
	public void addReservation(Reservation reservation){
		reservationsArchive.add(reservation);
	}
	
	/**
	 * This removes specified Reservation from this ReservationsArchive
	 * @param index - index of this Reservation
	 */
	public void removeReservation(int index){
		reservationsArchive.remove(index);
	}
	
	/**
    * This returns a boolean if the file exists
    * @return path of this file
    */
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\ReservationsArchive.dat");
		return (Files.exists(path));
	}
	
	/**
	 * This returns Reservation from this ReservationNumber by specified reservationNumber
	 * @param reservationNumber - reservation number by which the Reservation is going to be searched
	 * @return
	 */
	public Reservation getReservationByReservationNumber(int reservationNumber){
		for (int i=0; i< reservationsArchive.size(); i++){
			if (reservationsArchive.get(i).getReservationNumber()==reservationNumber) {
				return reservationsArchive.get(i);
			}
		}
		return null;
	}
	
	/**
    * This creates a new file
    * @throws Exception
    */
	public void createFile() throws Exception{
		reservationsArchive.add(new BusReservation(0, 0, new Customer("", "", "", "", new Date(0, 0, 0), "", "")));
		reservationsArchive.add(new TourReservation(0, 0, new Customer("", "", "", "", new Date(0, 0, 0), "", "")));
		saveReservationsArchive();
		reservationsArchive.remove(0);
		reservationsArchive.remove(0);
		saveReservationsArchive();
	}
	
	/**
    * This saves reservationsArchive after changes
    * @throws Exception
    */
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
	
	/**
    * This loads reservationsArchive 
    * @throws Exception
    */
	@SuppressWarnings("unchecked")
	public void loadReservationsArchive() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\ReservationsArchive.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			this.reservationsArchive= (ArrayList<Reservation>)objectInputStream.readObject();;
			for (int i = 0; i < reservationsArchive.size(); i++) {
				Reservation thisReservation = reservationsArchive.get(i);
				Customer oldCustomer = thisReservation.getCustomer();
				ArrayList<Passenger> oldListOfPassengers = thisReservation.getPassengers();

				if(reservationsArchive.get(i) instanceof TourReservation) {
					TourReservation thisTourReservation = (TourReservation) reservationsArchive.get(i);
					Tour oldTour = thisTourReservation.getTour();
					for (int j = 0; j < Autobus.frame.toursArchive.size(); j++) {
						if (oldTour.getDepartureDate().equals(Autobus.frame.toursArchive.get(j).getDepartureDate())
								&& oldTour.getBus().getVehicleID().equals(Autobus.frame.toursArchive.get(j).getBus().getVehicleID())) {
							thisTourReservation.setTour(Autobus.frame.toursArchive.get(j));
							break;
						}
					}
				}
				else{
					BusReservation thisBusReservation = (BusReservation) reservationsArchive.get(i);
					Bus oldBus = thisBusReservation.getBus();
					Chauffeur oldChauffeur = thisBusReservation.getChauffeur();
					for (int j = 0; j < Autobus.frame.busesArchive.size(); j++) {
						if(oldBus.getVehicleID().equals(Autobus.frame.busesArchive.get(j).getVehicleID())
								&& oldBus.getModelString().equals(Autobus.frame.busesArchive.get(j).getModelString())) {
							thisBusReservation.setBus(Autobus.frame.busesArchive.get(j));
							break;
						}
					}
					for (int j = 0; j < Autobus.frame.chauffeursArchive.size(); j++) {
						if(oldChauffeur.getName().equals(Autobus.frame.chauffeursArchive.get(j).getName())
								&& oldChauffeur.getPhonenumber().equals(Autobus.frame.chauffeursArchive.get(j).getPhonenumber())){
							thisBusReservation.setChauffeur(Autobus.frame.chauffeursArchive.get(j));
							break;
						}
					}
				}
				for (int j = 0; j < Autobus.frame.customersArchive.size(); j++) {
					if(oldCustomer.getName().equals(Autobus.frame.customersArchive.get(j).getName())
							&& oldCustomer.getPhonenumber().equals(Autobus.frame.customersArchive.get(j).getPhonenumber())){
						thisReservation.setCustomer(Autobus.frame.customersArchive.get(j));
						break;
					}
				}
				for (int j = 0; j < oldListOfPassengers.size(); j++) {
					Passenger oldPassenger = oldListOfPassengers.get(j);
					for (int k = 0; k < Autobus.frame.passengersArchive.size(); k++) {
						if(oldPassenger.getName().equals(Autobus.frame.passengersArchive.get(k).getName())
								&& oldPassenger.getPhonenumber().equals(Autobus.frame.passengersArchive.get(k).getPhonenumber())){
							oldListOfPassengers.set(j, Autobus.frame.passengersArchive.get(k));
							break;
						}
					}
				}

			}
		} finally {
			objectInputStream.close();
		}
	}

	/**
	 * This returns index of Reservation from this ReservationsArchive
	 * @param reservation - reservation by which the index is going to be searched
	 * @return
	 */
	public int getIndexOfReservation(Reservation reservation){
		for (int i = 0; i < reservationsArchive.size(); i++) {
			if(reservationsArchive.get(i).equals(reservation))
				return i;
		}
		return -1;
	}
}
