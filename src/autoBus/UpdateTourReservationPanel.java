package autoBus;

import javax.swing.*;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class UpdateTourReservationPanel extends JPanel {
	private final JLabel lblCancelButtonInUpdateTourRes;
	private final JLabel lblSaveUpdatedTourResButton;
	private JLabel selectedCustomerInUpdTourRes;
	private final JLabel lblSearchForPassengerInUpdTourRes;
	private final JLabel lblClearAllPassengersButtonInUpdTourRes;
	private final JLabel lblRemovePassengerButtonInUpdTourRes;
	private final JLabel selectedTourInUpdTourRes;
	private TourReservation currentlyUpdatingTourReservation;
	private final JLabel lblAddNewCustomerButtonInUpdTourRes;
	private final JLabel lblClearCustomerButtonInUpdTourRes;
	private final JRadioButton radioButtonCompanyInUpdTourRes;
	private final JRadioButton radioButtonSchoolInUpdTourRes;
	private final JRadioButton radioButtonPriateInUpdTourRes;
	private final JCheckBox boxIsAPassengerInUpdTourRes;
	private final JLabel lblAddNewPassengerButtonInUpdTourRes;
	private final JList<String> listOfSelectedPassengersInUpdTourRes;
	private final JLabel lblClearButtonInUpdTourRes;
	private JTextField customersPhoneInUpdTourRes;
	private JTextField customerNameInUpdTourRes;
	private JTextField customerOrganisationInUpdTourRes;
	private JTextField customerEmailInUpdTourRes;
	private JTextField customerAddressInUpdTourRes;
	private JTextField customerMonthInUpdTourRes;
	private JTextField customerDayInUpdTourRes;
	private JTextField customerYearInUpdTourRes;
	private JTextField searchCustomerTextFieldInUpdTourRes;
	private JTextField passengerEmailInUpdTourRes;
	private JTextField passengerAddressInUpdTourRes;
	private JTextField passengerPhoneInUpdTourRes;
	private JTextField passengerNameInUpdTourRes;
	private JTextField passengerMonthInUpdTourRes;
	private JTextField passengerDayInUpdTourRes;
	private JTextField passengerYearInUpdTourRes;
	private JTextField searchForTourInUpdTourRes;
	private JTable tableCustomerInUpdTourRes;
	private JTable tablePassengersInUpdTourRes;
	private JTable tableToursInUpdTourRes;

	/**
	 * Create the panel.
	 */
	
	public void createEventsForUpdateTouReservationPanel(){

		lblSaveUpdatedTourResButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String str = "";
				if(tablePassengersInUpdTourRes.getRowCount() == 0)
					str += "\nYou did not add any passengers to the list!";

				if(str.equals("")){
					Customer selectedCustomer = null;
					try {
						 selectedCustomer = Autobus.frame.customersArchive.getListOfCustomers().get(tableCustomerInUpdTourRes.getSelectedRow());

					}
					catch(ArrayIndexOutOfBoundsException ex){
						JOptionPane.showMessageDialog(null, "You need first to select one of the Customers!");
						return;
					}
					ArrayList<Passenger> listOfSelectedPassengers= new ArrayList<>();
					/*try {
						reservationNumber=reservationNumberGenerator.getReservationNumber();
					} catch (Exception e1) {
						e1.printStackTrace();
					}*/
					int passengersTableRowCount= tablePassengersInUpdTourRes.getRowCount();
					for (int i = 0; i < passengersTableRowCount; i++) {
						String passengersPhoneNumber = (String) tablePassengersInUpdTourRes.getModel().getValueAt(i,2);
						String passengersName = (String) tablePassengersInUpdTourRes.getModel().getValueAt(i,0);

						for (int j = 0; j < Autobus.frame.passengersArchive.size(); j++) {
							if(Autobus.frame.passengersArchive.getPassengersArchive().get(j).getPhonenumber().equals(passengersPhoneNumber) &&
							   Autobus.frame.passengersArchive.getPassengersArchive().get(j).getName().equals(passengersName)){
									listOfSelectedPassengers.add(Autobus.frame.passengersArchive.getPassengersArchive().get(j));
									break;

							}
						}
					}
					Tour selectedTour = null;
					try {
						selectedTour = Autobus.frame.toursArchive.getToursArchive().get(tableToursInUpdTourRes.getSelectedRow());
					}
					catch(ArrayIndexOutOfBoundsException ex){
						JOptionPane.showMessageDialog(null, "You need first to select one of the Tours");
						return;
					}
                 /*DO NOT FORGET TO IMPEMENT RESERVATION ID AND DISCOUNT */
					TourReservation updatedTourReservation =new TourReservation(currentlyUpdatingTourReservation.getReservationNumber(),0,selectedCustomer,selectedTour);
					updatedTourReservation.setPassengers(listOfSelectedPassengers);
					Autobus.frame.reservationsArchive.getReservationsArchive().set(Autobus.frame.reservationsArchive.getIndexOfReservation(currentlyUpdatingTourReservation),updatedTourReservation);
					try {
						Autobus.frame.reservationsArchive.saveReservationsArchive();
					}
					catch (Exception ex){
						ex.printStackTrace();
					}
					//Autobus.frame.updateListTourReservations((TourReservation) Autobus.frame.reservationsArchive.getReservationsArchive().get(Autobus.frame.reservationsArchive.size() -1));
					JOptionPane.showMessageDialog(null, "The changes you have made were saved");
					Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableTourReservations.getModel());
					Autobus.frame.listTourReservations();
					Autobus.frame.hideAllPanels();
					Autobus.frame.panelTourReservations.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null,
							"It seems you form was filled incorrectly" + str);
				}

			}
		});

		lblCancelButtonInUpdateTourRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
					Autobus.frame.hideAllPanels();
					Autobus.frame.panelTourReservations.setVisible(true);
			}


		});

		tableToursInUpdTourRes.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent event) {
				int index = tableToursInUpdTourRes.getSelectedRow();
				selectedTourInUpdTourRes.setText(Autobus.frame.toursArchive.getToursArchive().get(index).getDestination()
						+ " " + Autobus.frame.toursArchive.getToursArchive().get(index).getDateInterval().getStartDate().displayDate());
			}
		});

		tableCustomerInUpdTourRes.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent event) {
				int index = tableCustomerInUpdTourRes.getSelectedRow();
				selectedCustomerInUpdTourRes.setText(Autobus.frame.customersArchive.getListOfCustomers().get(index).getName());
			}
		});

		lblRemovePassengerButtonInUpdTourRes.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent event){
				int index = tablePassengersInUpdTourRes.getSelectedRow();
				DefaultTableModel tablePassengersModelInNewTourReservation = (DefaultTableModel)tablePassengersInUpdTourRes.getModel();
				if (index!=-1){
					if (Autobus.okOrCancel("Are you sure you want to remove this passenger from the list?")==0) {
						tablePassengersModelInNewTourReservation.removeRow(index);
						DefaultListModel<String> listModel = (DefaultListModel<String>) listOfSelectedPassengersInUpdTourRes.getModel();
						listModel.removeElementAt(index);
					}
				} else {
					JOptionPane.showMessageDialog(null, "You need first to select the passenger you wish to remove!");
				}
			}
		});

		lblClearAllPassengersButtonInUpdTourRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				DefaultTableModel tablePassengersModelInNewTourReservation = (DefaultTableModel)tablePassengersInUpdTourRes.getModel();
				tablePassengersModelInNewTourReservation.setRowCount(0);
				DefaultListModel<String> listModel = (DefaultListModel<String>) listOfSelectedPassengersInUpdTourRes.getModel();
				listModel.removeAllElements();
				boxIsAPassengerInUpdTourRes.setSelected(false);
			}
		});

		lblSearchForPassengerInUpdTourRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String phoneNumber = passengerPhoneInUpdTourRes.getText();
				for (int i = 0; i < Autobus.frame.passengersArchive.size(); i++) {
					if(Autobus.frame.passengersArchive.getPassengersArchive().get(i).getPhonenumber().equals(phoneNumber)){
						updateListPassengers(Autobus.frame.passengersArchive.getPassengersArchive().get(i));
						DefaultListModel<String> listModel = (DefaultListModel<String>) listOfSelectedPassengersInUpdTourRes.getModel();
						listModel.addElement(Autobus.frame.passengersArchive.getPassengersArchive().get(i).getName() + " " +
								Autobus.frame.passengersArchive.getPassengersArchive().get(i).getPhonenumber());
						return;
					}
				}
				JOptionPane.showMessageDialog(null, "The passenger with entered phone number could not be found");
			}
		});

		lblClearButtonInUpdTourRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				passengerPhoneInUpdTourRes.setText("");
				passengerNameInUpdTourRes.setText("");
				passengerAddressInUpdTourRes.setText("");
				passengerEmailInUpdTourRes.setText("");
				passengerMonthInUpdTourRes.setText("");
				passengerDayInUpdTourRes.setText("");
				passengerYearInUpdTourRes.setText("");
			}
		});

		lblAddNewPassengerButtonInUpdTourRes.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e) {
				String str="";
				int month = 0;
				int day = 0;
				int year = 0;
				Calendar timeNow = Calendar.getInstance();
				int currentYear = timeNow.get(Calendar.YEAR);
				try {
					int phone = Integer.parseInt(passengerPhoneInUpdTourRes.getText());
					if (!(10000000<phone&&phone<=99999999)) {
						str+= "\nPhone number does not have 8 digits!";
					}
				} catch (Exception e3) {
					str+= "\nEntered phone number does not appear to be digits!";
				}
				if (passengerNameInUpdTourRes.getText().equalsIgnoreCase("")){
					str+= "\nName cannot be empty!";
				}
				if (passengerAddressInUpdTourRes.getText().equalsIgnoreCase("")) {
					str+= "\nAddress cannot be empty!";
				}

				if (!(passengerEmailInUpdTourRes.getText().contains("@")&&passengerEmailInUpdTourRes.getText().contains("."))){
					str+= "\nEmail appears to be either empty or incorrect format!";
				}

				try {
					month = Integer.parseInt(passengerMonthInUpdTourRes.getText());
					if (month>12||month<1) str = str + "\nMonth does not seem to be a number between 1-12!";
				} catch (NumberFormatException e1) {
					str = str + "\nMonth does not seem to be a number between 1-12!";
				}
				try {
					day = Integer.parseInt(passengerDayInUpdTourRes.getText());
					if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
						if (!(1<=day&&day<=31)) {
							str = str + "\nDay does not seem to be a number between 1-31!";
						}
					} else if (month==2){
						if (!(1<=day&&day<=28)) {
							str = str + "\nDay does not seem to be a number between 1-28!";
						}
					} else if (month==4||month==6||month==9||month==11){
						if (!(1<=day&&day<=30)) {
							str = str + "\nDay does not seem to be a number between 1-30!";
						}
					}
				} catch (NumberFormatException e1) {
					str = str + "\nDay does not seem to be a number between 1-31!";
				}
				try {
					year = Integer.parseInt(passengerYearInUpdTourRes.getText());
					if (year>currentYear||year<currentYear-120) str = str + "\nYear does not appear to be a valid number!";
				} catch (NumberFormatException e1) {
					str = str + "\nYear does not appear to be a valid number!";
				}

				if (str.equalsIgnoreCase("")) {
					Autobus.frame.passengersArchive.addPassenger(new Passenger(passengerNameInUpdTourRes.getText(),passengerEmailInUpdTourRes.getText(), passengerAddressInUpdTourRes.getText(),new Date(month,day,year), passengerPhoneInUpdTourRes.getText()));
					Autobus.frame.updateListPassengers(Autobus.frame.passengersArchive.getPassengersArchive().get(Autobus.frame.passengersArchive.getPassengersArchive().size() -1));
					updateListPassengers(Autobus.frame.passengersArchive.getPassengersArchive().get(Autobus.frame.passengersArchive.getPassengersArchive().size() -1));
					DefaultListModel<String> listModel = (DefaultListModel<String>) listOfSelectedPassengersInUpdTourRes.getModel();
					listModel.addElement(Autobus.frame.passengersArchive.getPassengersArchive().get(Autobus.frame.passengersArchive.size() -1).getName() + " " +
							Autobus.frame.passengersArchive.getPassengersArchive().get(Autobus.frame.passengersArchive.size() -1).getPhonenumber());


					try {
						Autobus.frame.passengersArchive.savePassengersArchive();
					} catch (Exception ex) {

						ex.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
				}
			}
		});

		lblClearCustomerButtonInUpdTourRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				customerNameInUpdTourRes.setText("");
				customerOrganisationInUpdTourRes.setText("");
				customerAddressInUpdTourRes.setText("");
				customerEmailInUpdTourRes.setText("");
				customerMonthInUpdTourRes.setText("");
				customerDayInUpdTourRes.setText("");
				customerYearInUpdTourRes.setText("");
				customersPhoneInUpdTourRes.setText("");
				radioButtonCompanyInUpdTourRes.setSelected(false);
				radioButtonPriateInUpdTourRes.setSelected(false);
				radioButtonSchoolInUpdTourRes.setSelected(false);
				boxIsAPassengerInUpdTourRes.setSelected(false);
			}
		});

		Autobus.frame.lblUpdateTourReservation.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent event){

				try {
					int reservationNumberOfCurrentlyUpdatingReservation = (int) Autobus.frame.tableTourReservations.getValueAt(Autobus.frame.tableTourReservations.getSelectedRow(), 0);
					for (int i = 0; i < Autobus.frame.reservationsArchive.size(); i++) {
						if (Autobus.frame.reservationsArchive.get(i).getReservationNumber() == reservationNumberOfCurrentlyUpdatingReservation) {
							currentlyUpdatingTourReservation = (TourReservation) Autobus.frame.reservationsArchive.get(i);
						}
					}
					Autobus.frame.hideAllPanels();
					listPassengers();
					listTours();
					listCustomers();
					Autobus.frame.updateTourReservationPanel.setVisible(true);
				}
				catch (ArrayIndexOutOfBoundsException e){
					JOptionPane.showMessageDialog(null, "You should first select the reservation you want to chage from the table above!");
				}
			}
		});

		lblAddNewCustomerButtonInUpdTourRes.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent arg0) {
				String str = new String();
				int month = 0;
				int day = 0;
				int year = 0;
				Calendar timeNow = Calendar.getInstance();
				int currentYear = timeNow.get(Calendar.YEAR);
				try {
					int phone = Integer.parseInt(customersPhoneInUpdTourRes.getText());
					if (!(10000000<phone&&phone<=99999999)) {
						str+= "\nPhone number does not have 8 digits!";
					}
				} catch (Exception e3) {
					str+= "\nEntered phone number does not appear to be digits!";
				}
				if (customerOrganisationInUpdTourRes.getText().equalsIgnoreCase("")) {
					str+= "\nName/organisation cannot be empty!";
				}
				if (customerNameInUpdTourRes.getText().equalsIgnoreCase("")){
					str+= "\nName/contact cannot be empty!";
				}
				if (customerAddressInUpdTourRes.getText().equalsIgnoreCase("")) {
					str+= "\nAddress cannot be empty!";
				}
				if (customerEmailInUpdTourRes.getText().equalsIgnoreCase("")){
					str+= "\nEmail address cannot be empty!";
				}
				if (!(customerEmailInUpdTourRes.getText().contains("@")&&customerEmailInUpdTourRes.getText().contains("."))){
					str+= "\nEmail address does not appear to be in correct format!";
				}

				try {
					month = Integer.parseInt(customerMonthInUpdTourRes.getText());
					if (month>12||month<1) str = str + "\nMonth does not seem to be a number between 1-12!";
				} catch (NumberFormatException e1) {
					str = str + "\nMonth does not seem to be a number between 1-12!";
				}
				try {
					day = Integer.parseInt(customerDayInUpdTourRes.getText());
					if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
						if (!(1<=day&&day<=31)) {
							str = str + "\nDay does not seem to be a number between 1-31!";
						}
					} else if (month==2){
						if (!(1<=day&&day<=28)) {
							str = str + "\nDay does not seem to be a number between 1-28!";
						}
					} else if (month==4||month==6||month==9||month==11){
						if (!(1<=day&&day<=30)) {
							str = str + "\nDay does not seem to be a number between 1-30!";
						}
					}
				} catch (NumberFormatException e1) {
					str = str + "\nDay does not seem to be a number between 1-31!";
				}
				try {
					year = Integer.parseInt(customerYearInUpdTourRes.getText());
					if (year>currentYear||year<currentYear-120) str = str + "\nYear does not appear to be a valid number!";
				} catch (NumberFormatException e1) {
					str = str + "\nYear does not appear to be a valid number!";
				}

				if (str.equalsIgnoreCase("")) {
					Date birthday = null;
					String organisationType = "PRIVATE";
					if (radioButtonCompanyInUpdTourRes.isSelected()) {
						organisationType = "COMPANY";
					}
					if (radioButtonSchoolInUpdTourRes.isSelected()){
						organisationType = "SCHOOL";
					}
					if (customerMonthInUpdTourRes.getText().equalsIgnoreCase("")||customerDayInUpdTourRes.getText().equalsIgnoreCase("")||customerYearInUpdTourRes.getText().equalsIgnoreCase("")){
						birthday = new Date(0, 0, 0);
					} else {
						int bMonth = 0;
						int bDay = 0;
						int bYear = 0;
						bMonth = Integer.parseInt(customerMonthInUpdTourRes.getText());
						bDay = Integer.parseInt(customerDayInUpdTourRes.getText());
						bYear = Integer.parseInt(customerYearInUpdTourRes.getText());
						birthday = new Date(bMonth, bDay, bYear);
					}
					Autobus.frame.customersArchive.addCustomer( new Customer(customerNameInUpdTourRes.getText(), customerOrganisationInUpdTourRes.getText(), customerEmailInUpdTourRes.getText(),
							customerAddressInUpdTourRes.getText(), birthday, customersPhoneInUpdTourRes.getText(), organisationType)
					);
					Autobus.frame.updateListCustomers(Autobus.frame.customersArchive.getListOfCustomers().get(Autobus.frame.customersArchive.getListOfCustomers().size() -1));
					updateListCustomers();
					try {
						Autobus.frame.customersArchive.saveCustomersArchive();
					} catch (Exception e) {

						e.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
				}

			}
		});
	}
	
	public UpdateTourReservationPanel() {

		setAlignmentX(Component.LEFT_ALIGNMENT);
		setAlignmentY(Component.TOP_ALIGNMENT);
		
		JPanel updateTourReservationInnerPanel = new JPanel();
		updateTourReservationInnerPanel.setBackground(new Color(95, 158, 160));
		
		JPanel updateTourReservationTopPanel = new JPanel();
		updateTourReservationTopPanel.setBackground(new Color(0, 128, 128));
		
		JLabel lblUpdateTourReservation = new JLabel("Update Tour Reservation");
		lblUpdateTourReservation.setForeground(Color.WHITE);
		lblUpdateTourReservation.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GroupLayout gl_updateTourReservationTopPanel = new GroupLayout(updateTourReservationTopPanel);
		gl_updateTourReservationTopPanel.setHorizontalGroup(
			gl_updateTourReservationTopPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1369, Short.MAX_VALUE)
				.addGroup(gl_updateTourReservationTopPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUpdateTourReservation, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1117, Short.MAX_VALUE))
		);
		gl_updateTourReservationTopPanel.setVerticalGroup(
			gl_updateTourReservationTopPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 58, Short.MAX_VALUE)
				.addGroup(gl_updateTourReservationTopPanel.createSequentialGroup()
					.addComponent(lblUpdateTourReservation, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		updateTourReservationTopPanel.setLayout(gl_updateTourReservationTopPanel);
		
		 lblCancelButtonInUpdateTourRes = new JLabel("Cancel");
		lblCancelButtonInUpdateTourRes.setForeground(Color.WHITE);
		lblCancelButtonInUpdateTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblCancelButtonInUpdateTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		JPanel addNewCustomerInUpdateTourResPanel = new JPanel();
		addNewCustomerInUpdateTourResPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Add New Customer", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		addNewCustomerInUpdateTourResPanel.setBackground(new Color(95, 158, 160));
		
		JLabel label_2 = new JLabel("Phone");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		customersPhoneInUpdTourRes = new JTextField();
		customersPhoneInUpdTourRes.setForeground(Color.WHITE);
		customersPhoneInUpdTourRes.setColumns(10);
		customersPhoneInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		 lblClearCustomerButtonInUpdTourRes = new JLabel("Clear");
		lblClearCustomerButtonInUpdTourRes.setForeground(Color.WHITE);
		lblClearCustomerButtonInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblClearCustomerButtonInUpdTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		 boxIsAPassengerInUpdTourRes = new JCheckBox("is a passenger");
		boxIsAPassengerInUpdTourRes.setForeground(Color.WHITE);
		boxIsAPassengerInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		boxIsAPassengerInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		 lblAddNewCustomerButtonInUpdTourRes = new JLabel("Add");
		lblAddNewCustomerButtonInUpdTourRes.setForeground(Color.WHITE);
		lblAddNewCustomerButtonInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		lblAddNewCustomerButtonInUpdTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		 radioButtonCompanyInUpdTourRes = new JRadioButton("Company");
		radioButtonCompanyInUpdTourRes.setForeground(Color.WHITE);
		radioButtonCompanyInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		radioButtonCompanyInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		radioButtonSchoolInUpdTourRes = new JRadioButton("School");
		radioButtonSchoolInUpdTourRes.setForeground(Color.WHITE);
		radioButtonSchoolInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		radioButtonSchoolInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		radioButtonPriateInUpdTourRes = new JRadioButton("Private");
		radioButtonPriateInUpdTourRes.setForeground(Color.WHITE);
		radioButtonPriateInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		radioButtonPriateInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel label_5 = new JLabel("Name/contact");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		customerNameInUpdTourRes = new JTextField();
		customerNameInUpdTourRes.setSelectionColor(new Color(102, 205, 170));
		customerNameInUpdTourRes.setForeground(Color.WHITE);
		customerNameInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		customerNameInUpdTourRes.setColumns(10);
		customerNameInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel lbl_28 = new JLabel("Name/organisation");
		lbl_28.setForeground(Color.WHITE);
		lbl_28.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		customerOrganisationInUpdTourRes = new JTextField();
		customerOrganisationInUpdTourRes.setSelectionColor(new Color(102, 205, 170));
		customerOrganisationInUpdTourRes.setForeground(Color.WHITE);
		customerOrganisationInUpdTourRes.setColumns(10);
		customerOrganisationInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel label_7 = new JLabel("Email");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		customerEmailInUpdTourRes = new JTextField();
		customerEmailInUpdTourRes.setForeground(Color.WHITE);
		customerEmailInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		customerEmailInUpdTourRes.setColumns(10);
		customerEmailInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel label_8 = new JLabel("Address");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		customerAddressInUpdTourRes = new JTextField();
		customerAddressInUpdTourRes.setSelectionColor(new Color(102, 205, 170));
		customerAddressInUpdTourRes.setForeground(Color.WHITE);
		customerAddressInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		customerAddressInUpdTourRes.setColumns(10);
		customerAddressInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel label_9 = new JLabel("Birthday");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		customerMonthInUpdTourRes = new JTextField();
		customerMonthInUpdTourRes.setForeground(Color.WHITE);
		customerMonthInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		customerMonthInUpdTourRes.setColumns(10);
		customerMonthInUpdTourRes.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
		customerMonthInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		customerDayInUpdTourRes = new JTextField();
		customerDayInUpdTourRes.setForeground(Color.WHITE);
		customerDayInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		customerDayInUpdTourRes.setColumns(10);
		customerDayInUpdTourRes.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
		customerDayInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		customerYearInUpdTourRes = new JTextField();
		customerYearInUpdTourRes.setForeground(Color.WHITE);
		customerYearInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		customerYearInUpdTourRes.setColumns(10);
		customerYearInUpdTourRes.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
		customerYearInUpdTourRes.setBackground(new Color(95, 158, 160));
		GroupLayout gl_addNewCustomerInUpdateTourResPanel = new GroupLayout(addNewCustomerInUpdateTourResPanel);
		gl_addNewCustomerInUpdateTourResPanel.setHorizontalGroup(
			gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 327, Short.MAX_VALUE)
				.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(customersPhoneInUpdTourRes, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(lblClearCustomerButtonInUpdTourRes)
							.addGap(30)
							.addComponent(boxIsAPassengerInUpdTourRes)
							.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
							.addComponent(lblAddNewCustomerButtonInUpdTourRes))
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(radioButtonCompanyInUpdTourRes)
							.addGap(18)
							.addComponent(radioButtonSchoolInUpdTourRes)
							.addGap(18)
							.addComponent(radioButtonPriateInUpdTourRes))
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(label_5)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(customerNameInUpdTourRes, 172, 172, 172))
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(lbl_28)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(customerOrganisationInUpdTourRes, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(label_7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(customerEmailInUpdTourRes, 238, 238, 238))
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(label_8)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(customerAddressInUpdTourRes, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
							.addComponent(label_9)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(customerMonthInUpdTourRes, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(customerDayInUpdTourRes, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(customerYearInUpdTourRes, 0, 0, Short.MAX_VALUE)))
					.addGap(31))
		);
		gl_addNewCustomerInUpdateTourResPanel.setVerticalGroup(
			gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 430, Short.MAX_VALUE)
				.addGroup(gl_addNewCustomerInUpdateTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(customersPhoneInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_28)
						.addComponent(customerOrganisationInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioButtonCompanyInUpdTourRes)
						.addComponent(radioButtonSchoolInUpdTourRes)
						.addComponent(radioButtonPriateInUpdTourRes))
					.addGap(18)
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(customerNameInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(customerAddressInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7)
						.addComponent(customerEmailInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(customerMonthInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(customerDayInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(customerYearInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addNewCustomerInUpdateTourResPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblClearCustomerButtonInUpdTourRes)
							.addComponent(boxIsAPassengerInUpdTourRes))
						.addComponent(lblAddNewCustomerButtonInUpdTourRes, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		addNewCustomerInUpdateTourResPanel.setLayout(gl_addNewCustomerInUpdateTourResPanel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel summaryInUpdTourResPanel = new JPanel();
		summaryInUpdTourResPanel.setBorder(new CompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Summary", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)), null));
		summaryInUpdTourResPanel.setBackground(new Color(51, 153, 153));
		
		JScrollPane selectedPassengersScrollPaneInUpdTourRes = new JScrollPane();
		
		selectedTourInUpdTourRes = new JLabel("");
		selectedTourInUpdTourRes.setVerticalAlignment(SwingConstants.TOP);
		selectedTourInUpdTourRes.setForeground(Color.WHITE);
		selectedTourInUpdTourRes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		selectedTourInUpdTourRes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Selected Tour", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		
		 selectedCustomerInUpdTourRes = new JLabel("");
		selectedCustomerInUpdTourRes.setVerticalAlignment(SwingConstants.TOP);
		selectedCustomerInUpdTourRes.setForeground(Color.WHITE);
		selectedCustomerInUpdTourRes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		selectedCustomerInUpdTourRes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Selected Customer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		GroupLayout gl_summaryInUpdTourResPanel = new GroupLayout(summaryInUpdTourResPanel);
		gl_summaryInUpdTourResPanel.setHorizontalGroup(
			gl_summaryInUpdTourResPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 288, Short.MAX_VALUE)
				.addGroup(gl_summaryInUpdTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_summaryInUpdTourResPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(selectedPassengersScrollPaneInUpdTourRes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(selectedTourInUpdTourRes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(selectedCustomerInUpdTourRes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_summaryInUpdTourResPanel.setVerticalGroup(
			gl_summaryInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 416, Short.MAX_VALUE)
				.addGroup(gl_summaryInUpdTourResPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(selectedTourInUpdTourRes, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(selectedCustomerInUpdTourRes, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(selectedPassengersScrollPaneInUpdTourRes, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		 listOfSelectedPassengersInUpdTourRes = new JList<String>();
		 listOfSelectedPassengersInUpdTourRes.setModel(new DefaultListModel<String>()); 
		listOfSelectedPassengersInUpdTourRes.setForeground(Color.WHITE);
		listOfSelectedPassengersInUpdTourRes.setBorder(new TitledBorder(null, "Selected Passengers", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		listOfSelectedPassengersInUpdTourRes.setBackground(new Color(51, 153, 153));
		selectedPassengersScrollPaneInUpdTourRes.setViewportView(listOfSelectedPassengersInUpdTourRes);
		summaryInUpdTourResPanel.setLayout(gl_summaryInUpdTourResPanel);
		
		 lblSaveUpdatedTourResButton = new JLabel("Save Changes");
		lblSaveUpdatedTourResButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaveUpdatedTourResButton.setForeground(Color.WHITE);
		lblSaveUpdatedTourResButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSaveUpdatedTourResButton.setBorder(new LineBorder(new Color(255, 255, 255)));
		GroupLayout gl_updateTourReservationInnerPanel = new GroupLayout(updateTourReservationInnerPanel);
		gl_updateTourReservationInnerPanel.setHorizontalGroup(
			gl_updateTourReservationInnerPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_updateTourReservationInnerPanel.createSequentialGroup()
					.addComponent(updateTourReservationTopPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(0))
				.addGroup(gl_updateTourReservationInnerPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_updateTourReservationInnerPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_updateTourReservationInnerPanel.createSequentialGroup()
							.addComponent(lblCancelButtonInUpdateTourRes, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 1116, Short.MAX_VALUE)
							.addComponent(lblSaveUpdatedTourResButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateTourReservationInnerPanel.createSequentialGroup()
							.addComponent(addNewCustomerInUpdateTourResPanel, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 642, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(summaryInUpdTourResPanel, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)))
					.addGap(64))
		);
		gl_updateTourReservationInnerPanel.setVerticalGroup(
			gl_updateTourReservationInnerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateTourReservationInnerPanel.createSequentialGroup()
					.addComponent(updateTourReservationTopPanel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_updateTourReservationInnerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateTourReservationInnerPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
							.addComponent(addNewCustomerInUpdateTourResPanel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
						.addComponent(summaryInUpdTourResPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_updateTourReservationInnerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateTourReservationInnerPanel.createSequentialGroup()
							.addGap(33)
							.addComponent(lblSaveUpdatedTourResButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateTourReservationInnerPanel.createSequentialGroup()
							.addGap(25)
							.addComponent(lblCancelButtonInUpdateTourRes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGap(294))
		);
		
		JPanel selectCustomerInUpdTourResPanel = new JPanel();
		selectCustomerInUpdTourResPanel.setForeground(new Color(0, 0, 0));
		selectCustomerInUpdTourResPanel.setBackground(new Color(0, 153, 153));
		tabbedPane.addTab("Select Customer", null, selectCustomerInUpdTourResPanel, null);
		tabbedPane.setForegroundAt(0, new Color(0, 153, 102));
		
		JScrollPane customerScrollPaneInUpdTourRes = new JScrollPane();
		customerScrollPaneInUpdTourRes.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Customers archive", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
		customerScrollPaneInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel label_13 = new JLabel("Search by name");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		searchCustomerTextFieldInUpdTourRes = new JTextField();
		searchCustomerTextFieldInUpdTourRes.setToolTipText("enter customer's name here");
		GroupLayout gl_selectCustomerInUpdTourResPanel = new GroupLayout(selectCustomerInUpdTourResPanel);
		gl_selectCustomerInUpdTourResPanel.setHorizontalGroup(
			gl_selectCustomerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 637, Short.MAX_VALUE)
				.addGroup(gl_selectCustomerInUpdTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_selectCustomerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(customerScrollPaneInUpdTourRes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
						.addGroup(gl_selectCustomerInUpdTourResPanel.createSequentialGroup()
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(searchCustomerTextFieldInUpdTourRes, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_selectCustomerInUpdTourResPanel.setVerticalGroup(
			gl_selectCustomerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 409, Short.MAX_VALUE)
				.addGroup(gl_selectCustomerInUpdTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_selectCustomerInUpdTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(searchCustomerTextFieldInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(customerScrollPaneInUpdTourRes, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(110, Short.MAX_VALUE))
		);
		
		tableCustomerInUpdTourRes = new JTable();
		tableCustomerInUpdTourRes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Type", "Organisation", "Name", "Address", "Phone", "Email", "Birthday", "# of Reservations"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		customerScrollPaneInUpdTourRes.setViewportView(tableCustomerInUpdTourRes);
		selectCustomerInUpdTourResPanel.setLayout(gl_selectCustomerInUpdTourResPanel);
		
		JPanel selectPassengersInUpdTourRes = new JPanel();
		selectPassengersInUpdTourRes.setBackground(new Color(0, 153, 153));
		tabbedPane.addTab("Select Passengers", null, selectPassengersInUpdTourRes, null);
		tabbedPane.setForegroundAt(1, new Color(0, 153, 102));
		
		JPanel addNewPassengerInUpdTourResPanel = new JPanel();
		addNewPassengerInUpdTourResPanel.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Add passenger", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), null));
		addNewPassengerInUpdTourResPanel.setBackground(new Color(95, 158, 160));
		
		 lblClearButtonInUpdTourRes = new JLabel("Clear");
		lblClearButtonInUpdTourRes.setForeground(Color.WHITE);
		lblClearButtonInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblClearButtonInUpdTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		 lblAddNewPassengerButtonInUpdTourRes = new JLabel("Add");
		lblAddNewPassengerButtonInUpdTourRes.setForeground(Color.WHITE);
		lblAddNewPassengerButtonInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAddNewPassengerButtonInUpdTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		JLabel label_16 = new JLabel("Address");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		JLabel label_17 = new JLabel("Email");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		passengerEmailInUpdTourRes = new JTextField();
		passengerEmailInUpdTourRes.setSelectionColor(new Color(102, 205, 170));
		passengerEmailInUpdTourRes.setForeground(Color.WHITE);
		passengerEmailInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passengerEmailInUpdTourRes.setColumns(10);
		passengerEmailInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		passengerAddressInUpdTourRes = new JTextField();
		passengerAddressInUpdTourRes.setSelectionColor(new Color(102, 205, 170));
		passengerAddressInUpdTourRes.setForeground(Color.WHITE);
		passengerAddressInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passengerAddressInUpdTourRes.setColumns(10);
		passengerAddressInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel label_18 = new JLabel("Phone");
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		JLabel label_19 = new JLabel("Name");
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		passengerPhoneInUpdTourRes = new JTextField();
		passengerPhoneInUpdTourRes.setSelectionColor(new Color(102, 205, 170));
		passengerPhoneInUpdTourRes.setForeground(Color.WHITE);
		passengerPhoneInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passengerPhoneInUpdTourRes.setColumns(10);
		passengerPhoneInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		lblSearchForPassengerInUpdTourRes = new JLabel("Search");
		lblSearchForPassengerInUpdTourRes.setForeground(Color.WHITE);
		lblSearchForPassengerInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSearchForPassengerInUpdTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		passengerNameInUpdTourRes = new JTextField();
		passengerNameInUpdTourRes.setSelectionColor(new Color(102, 205, 170));
		passengerNameInUpdTourRes.setForeground(Color.WHITE);
		passengerNameInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passengerNameInUpdTourRes.setColumns(10);
		passengerNameInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		JLabel label_21 = new JLabel("Birthday");
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		passengerMonthInUpdTourRes = new JTextField();
		passengerMonthInUpdTourRes.setForeground(Color.WHITE);
		passengerMonthInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passengerMonthInUpdTourRes.setColumns(10);
		passengerMonthInUpdTourRes.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
		passengerMonthInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		passengerDayInUpdTourRes = new JTextField();
		passengerDayInUpdTourRes.setForeground(Color.WHITE);
		passengerDayInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passengerDayInUpdTourRes.setColumns(10);
		passengerDayInUpdTourRes.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
		passengerDayInUpdTourRes.setBackground(new Color(95, 158, 160));
		
		passengerYearInUpdTourRes = new JTextField();
		passengerYearInUpdTourRes.setForeground(Color.WHITE);
		passengerYearInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passengerYearInUpdTourRes.setColumns(10);
		passengerYearInUpdTourRes.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
		passengerYearInUpdTourRes.setBackground(new Color(95, 158, 160));
		GroupLayout gl_addNewPassengerInUpdTourResPanel = new GroupLayout(addNewPassengerInUpdTourResPanel);
		gl_addNewPassengerInUpdTourResPanel.setHorizontalGroup(
			gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 265, Short.MAX_VALUE)
				.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
					.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblClearButtonInUpdTourRes)
							.addGap(140)
							.addComponent(lblAddNewPassengerButtonInUpdTourRes))
						.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
									.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_16)
										.addComponent(label_17))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(passengerEmailInUpdTourRes, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
										.addComponent(passengerAddressInUpdTourRes, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
								.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
									.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_18)
										.addComponent(label_19))
									.addGap(18)
									.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
											.addComponent(passengerPhoneInUpdTourRes, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblSearchForPassengerInUpdTourRes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addComponent(passengerNameInUpdTourRes, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
							.addGap(13)
							.addComponent(label_21)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passengerMonthInUpdTourRes, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passengerDayInUpdTourRes, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passengerYearInUpdTourRes, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
					.addGap(13))
		);
		gl_addNewPassengerInUpdTourResPanel.setVerticalGroup(
			gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 385, Short.MAX_VALUE)
				.addGroup(gl_addNewPassengerInUpdTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_18)
							.addComponent(passengerPhoneInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSearchForPassengerInUpdTourRes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_19)
						.addComponent(passengerNameInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_16)
						.addComponent(passengerAddressInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_17)
						.addComponent(passengerEmailInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_21)
						.addComponent(passengerMonthInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(passengerDayInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(passengerYearInUpdTourRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
					.addGroup(gl_addNewPassengerInUpdTourResPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddNewPassengerButtonInUpdTourRes)
						.addComponent(lblClearButtonInUpdTourRes))
					.addContainerGap())
		);
		addNewPassengerInUpdTourResPanel.setLayout(gl_addNewPassengerInUpdTourResPanel);
		
		JScrollPane selectPassengersInUpdTourResScrollPane = new JScrollPane();
		selectPassengersInUpdTourResScrollPane.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "List of Selected Passengers", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
		selectPassengersInUpdTourResScrollPane.setBackground(new Color(95, 158, 160));
		
		 lblRemovePassengerButtonInUpdTourRes = new JLabel("Remove");
		lblRemovePassengerButtonInUpdTourRes.setForeground(Color.WHITE);
		lblRemovePassengerButtonInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblRemovePassengerButtonInUpdTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		 lblClearAllPassengersButtonInUpdTourRes = new JLabel("Clear all");
		lblClearAllPassengersButtonInUpdTourRes.setForeground(Color.WHITE);
		lblClearAllPassengersButtonInUpdTourRes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblClearAllPassengersButtonInUpdTourRes.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		GroupLayout gl_selectPassengersInUpdTourRes = new GroupLayout(selectPassengersInUpdTourRes);
		gl_selectPassengersInUpdTourRes.setHorizontalGroup(
			gl_selectPassengersInUpdTourRes.createParallelGroup(Alignment.LEADING)
				.addGap(0, 637, Short.MAX_VALUE)
				.addGroup(gl_selectPassengersInUpdTourRes.createSequentialGroup()
					.addContainerGap()
					.addComponent(addNewPassengerInUpdTourResPanel, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(gl_selectPassengersInUpdTourRes.createParallelGroup(Alignment.LEADING)
						.addComponent(selectPassengersInUpdTourResScrollPane, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
						.addGroup(gl_selectPassengersInUpdTourRes.createSequentialGroup()
							.addComponent(lblRemovePassengerButtonInUpdTourRes, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblClearAllPassengersButtonInUpdTourRes, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_selectPassengersInUpdTourRes.setVerticalGroup(
			gl_selectPassengersInUpdTourRes.createParallelGroup(Alignment.LEADING)
				.addGap(0, 409, Short.MAX_VALUE)
				.addGroup(gl_selectPassengersInUpdTourRes.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_selectPassengersInUpdTourRes.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_selectPassengersInUpdTourRes.createSequentialGroup()
							.addComponent(selectPassengersInUpdTourResScrollPane, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
							.addGroup(gl_selectPassengersInUpdTourRes.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblRemovePassengerButtonInUpdTourRes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblClearAllPassengersButtonInUpdTourRes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addComponent(addNewPassengerInUpdTourResPanel, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		tablePassengersInUpdTourRes = new JTable();
		tablePassengersInUpdTourRes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "Phone", "Email", "Birthday"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		selectPassengersInUpdTourResScrollPane.setViewportView(tablePassengersInUpdTourRes);
		selectPassengersInUpdTourRes.setLayout(gl_selectPassengersInUpdTourRes);
		
		JPanel selectTourInUpdTourResPanel = new JPanel();
		selectTourInUpdTourResPanel.setBackground(new Color(0, 153, 153));
		tabbedPane.addTab("New tab", null, selectTourInUpdTourResPanel, null);
		tabbedPane.setForegroundAt(2, new Color(0, 153, 102));
		
		JScrollPane selectTourInUpdTourResScrollPane = new JScrollPane();
		selectTourInUpdTourResScrollPane.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Tours archive", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
		selectTourInUpdTourResScrollPane.setBackground(new Color(95, 158, 160));
		
		JLabel label_24 = new JLabel("Search by destination");
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_24.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		searchForTourInUpdTourRes = new JTextField();
		searchForTourInUpdTourRes.setToolTipText("enter Tour's destination here");
		searchForTourInUpdTourRes.setColumns(10);
		searchForTourInUpdTourRes.setBorder(new LineBorder(new Color(171, 173, 179), 2));
		GroupLayout gl_selectTourInUpdTourResPanel = new GroupLayout(selectTourInUpdTourResPanel);
		gl_selectTourInUpdTourResPanel.setHorizontalGroup(
			gl_selectTourInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 637, Short.MAX_VALUE)
				.addGroup(gl_selectTourInUpdTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_selectTourInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(selectTourInUpdTourResScrollPane, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
						.addGroup(gl_selectTourInUpdTourResPanel.createSequentialGroup()
							.addComponent(label_24)
							.addGap(18)
							.addComponent(searchForTourInUpdTourRes, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_selectTourInUpdTourResPanel.setVerticalGroup(
			gl_selectTourInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 409, Short.MAX_VALUE)
				.addGroup(gl_selectTourInUpdTourResPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_selectTourInUpdTourResPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_24)
						.addComponent(searchForTourInUpdTourRes, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(selectTourInUpdTourResScrollPane, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(111, Short.MAX_VALUE))
		);
		
		tableToursInUpdTourRes = new JTable();
		tableToursInUpdTourRes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Destination", "Pick Ups", "Services", "Price", "Bus", "Chauffeur"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		selectTourInUpdTourResScrollPane.setViewportView(tableToursInUpdTourRes);
		selectTourInUpdTourResPanel.setLayout(gl_selectTourInUpdTourResPanel);
		updateTourReservationInnerPanel.setLayout(gl_updateTourReservationInnerPanel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(updateTourReservationInnerPanel, GroupLayout.DEFAULT_SIZE, 2301, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(updateTourReservationInnerPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
		this.createEventsForUpdateTouReservationPanel();
	}
	
	public void listCustomers(){
		DefaultTableModel customersTable = (DefaultTableModel) tableCustomerInUpdTourRes.getModel();
		Object[] rowData = new Object[7];
		selectedCustomerInUpdTourRes.setText(currentlyUpdatingTourReservation.getCustomer().getName() + " - " + currentlyUpdatingTourReservation.getCustomer().getPhonenumber());
		Autobus.frame.deleteAllRows(customersTable);
		for (int i=0; i<Autobus.frame.customersArchive.size(); i++){
			rowData[0] = Autobus.frame.customersArchive.get(i).getOrganisationName();
			rowData[1] = Autobus.frame.customersArchive.get(i).getOrganisationType();
			rowData[2] = Autobus.frame.customersArchive.get(i).getPhonenumber();
			rowData[3] = Autobus.frame.customersArchive.get(i).getName();
			rowData[4] = Autobus.frame.customersArchive.get(i).getAddress();
			rowData[5] = Autobus.frame.customersArchive.get(i).getEmail();
			rowData[6] = Autobus.frame.customersArchive.get(i).getBirthday().displayDate();
			customersTable.addRow(rowData);			
		}
	}

	public void updateListCustomers(){
		DefaultTableModel customersTable = (DefaultTableModel) tableCustomerInUpdTourRes.getModel();
		Customer lastCustomer = Autobus.frame.customersArchive.get(Autobus.frame.customersArchive.size() -1);
		Object[] rowData = new Object[7];
		Autobus.frame.deleteAllRows(customersTable);
			rowData[0] = lastCustomer.getOrganisationName();
			rowData[1] = lastCustomer.getOrganisationType();
			rowData[2] = lastCustomer.getPhonenumber();
			rowData[3] = lastCustomer.getName();
			rowData[4] = lastCustomer.getAddress();
			rowData[5] = lastCustomer.getEmail();
			rowData[6] = lastCustomer.getBirthday().displayDate();
			customersTable.addRow(rowData);
	}


	public void listPassengers(){
		DefaultTableModel passengersTable = (DefaultTableModel) tablePassengersInUpdTourRes.getModel();
		Autobus.frame.deleteAllRows(passengersTable);
		DefaultListModel<String> listModel = (DefaultListModel<String>) listOfSelectedPassengersInUpdTourRes.getModel();
		for (int i = 0; i < currentlyUpdatingTourReservation.getPassengers().size(); i++) {
			listModel.addElement(currentlyUpdatingTourReservation.getPassengers().get(i).getName() +" - " + currentlyUpdatingTourReservation.getPassengers().get(i).getPhonenumber());
		}
		Object[] rowData = new Object[5];
		for (int i = 0; i < currentlyUpdatingTourReservation.getPassengers().size(); i++) {
			rowData[0] = currentlyUpdatingTourReservation.getPassengers().get(i).getName();
			rowData[1] = currentlyUpdatingTourReservation.getPassengers().get(i).getAddress();
			rowData[2] = currentlyUpdatingTourReservation.getPassengers().get(i).getPhonenumber();
			rowData[3] = currentlyUpdatingTourReservation.getPassengers().get(i).getEmail();
			rowData[4] = currentlyUpdatingTourReservation.getPassengers().get(i).getBirthday().displayDate();
			passengersTable.addRow(rowData);
		}
	}

	public void updateListPassengers(Passenger newPassengerInTheList){
		DefaultTableModel passengersTable = (DefaultTableModel) tablePassengersInUpdTourRes.getModel();
		Object[] rowData = new Object[5];
			rowData[0] = newPassengerInTheList.getName();
			rowData[1] = newPassengerInTheList.getAddress();
			rowData[2] = newPassengerInTheList.getPhonenumber();
			rowData[3] = newPassengerInTheList.getEmail();
			rowData[4] = newPassengerInTheList.getBirthday().displayDate();
			passengersTable.addRow(rowData);


	}
	
	public void listTours(){
		DefaultTableModel toursTable = (DefaultTableModel) tableToursInUpdTourRes.getModel();
		Autobus.frame.deleteAllRows(toursTable);
		selectedTourInUpdTourRes.setText(currentlyUpdatingTourReservation.getTour().getDestination() + " - " + currentlyUpdatingTourReservation.getTour().getDateIntervalString());
		Object[] rowData = new Object[7];
		for (int i=0; i< Autobus.frame.toursArchive.size(); i++){
			rowData[0] = Autobus.frame.toursArchive.get(i).getDateIntervalString();
			rowData[1] = Autobus.frame.toursArchive.get(i).getDestination();
			rowData[2] = Autobus.frame.toursArchive.get(i).getPickUpPlacesString();
			rowData[3] = Autobus.frame.toursArchive.get(i).getServicesString();
			rowData[4] = Autobus.frame.toursArchive.get(i).getPricePerPassengerString();
			rowData[5] = Autobus.frame.toursArchive.get(i).getBusAndType();
			rowData[6] = Autobus.frame.toursArchive.get(i).getChauffeur();
			toursTable.addRow(rowData);
		}

	}
}
