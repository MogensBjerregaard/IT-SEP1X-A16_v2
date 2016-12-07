package autoBus;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.AbstractListModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UpdateBusReservations extends JPanel {
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private PriceList priceList;
   private BusesArchive busesArchive;
   DefaultTableModel newBusSelectBusTable;
   DefaultTableModel newBusSelectChauffeurTable;
   private BusReservation currentlyUpdatingBusReservation;
   
   private DefaultTableModel newTable;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;
   private JTextField textField_6;
   private JTextField textField_7;
   private JTextField textField_8;
   private JTextField textField_9;
   private JTextField textField_10;
   private JTextField textField_11;
   private JTextField textField_12;
   private JTextField textField_13;
   private JTextField textField_14;
   private JLabel label_1;
   private JLabel label_2;
   private JLabel label_12;
   private JLabel label_14;
   private JLabel label_16;
   private JLabel label_17;
   private JLabel lblAdd;
   private JRadioButton radioButton;
   private JRadioButton radioButton_1;
   private JRadioButton radioButton_2;
   private CustomersArchive customersArchive;
   private PassengersArchive passengersArchive;
   private JCheckBox checkBox;
   private JTable table;
   private JLabel label_3;
   private JLabel label_4;
   private JLabel label_5;
   private JLabel label_6;
   private JLabel label_7;
   private JLabel label_8;
   private JLabel label_9;
   private JPanel panel_2;
   private JLabel label_10;
   private JComponent label_11;
   private JLabel label_13;
   private JLabel label_18;
   private JScrollPane scrollPane;
   private JPanel panel_3;
   private JLabel lblNewBus;
   private GroupLayout gl_panel_3;
   private GroupLayout gl_panel;
   private GroupLayout groupLayout;
   private GroupLayout gl_panel_1;
   private JLabel label;
   private JComponent panel_1;
   private JComponent panel;

   /**
    * Create the panel.
    */
   
   public void createEventsForNewBusReservationUpdatePanel() {
    
      Autobus.frame.lblUpdateBusReservation.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseReleased(MouseEvent event){

            try {
               int reservationNumberOfCurrentlyUpdatingReservation = (int) Autobus.frame.tableBusReservations.getValueAt(Autobus.frame.tableBusReservations.getSelectedRow(), 0);
               for (int i = 0; i < Autobus.frame.reservationsArchive.size(); i++) {
                  if (Autobus.frame.reservationsArchive.get(i).getReservationNumber() == reservationNumberOfCurrentlyUpdatingReservation) {
                     currentlyUpdatingBusReservation = (BusReservation) Autobus.frame.reservationsArchive.get(i);
                  }
               }
               
               // FILLING CUSTOMER INFORMATION
               textField.setText(currentlyUpdatingBusReservation.getCustomer().getPhonenumber());
               textField_2.setText(currentlyUpdatingBusReservation.getCustomer().getOrganisationName());
               textField_1.setText(currentlyUpdatingBusReservation.getCustomer().getOrganisationType());
               textField_4.setText(currentlyUpdatingBusReservation.getCustomer().getAddress());
               textField_3.setText(currentlyUpdatingBusReservation.getCustomer().getEmail());
               textField_5.setText(Integer.toString(currentlyUpdatingBusReservation.getCustomer().getBirthday().getMonth()));
               textField_6.setText(Integer.toString(currentlyUpdatingBusReservation.getCustomer().getBirthday().getDay()));
               textField_7.setText(Integer.toString(currentlyUpdatingBusReservation.getCustomer().getBirthday().getYear()));
               
               Autobus.frame.hideAllPanels();
               listPassengers();
               Autobus.frame.updateBusReservations.setVisible(true);
            }
            catch (ArrayIndexOutOfBoundsException e){
               JOptionPane.showMessageDialog(null, "You should first select the reservation you want to change from the table above!");
            }
         }
      });
      
   // SEARCH FOR CUSTOMER BY PHONE NUMBER
      label_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent arg0) {
            if (textField.getText().equalsIgnoreCase("")) {
               JOptionPane.showMessageDialog(null, "You need to fill in the phone number first!");
            } else {
               try {
                  int phone = Integer.parseInt(textField.getText());
                  if (!(10000000<phone&&phone<=99999999)) {
                     JOptionPane.showMessageDialog(null, "Phonenumber does not have 8 digits!");
                  } else {
                     for (int i =0; i<customersArchive.size();i++){
                        if (customersArchive.get(i).getPhonenumber().equalsIgnoreCase(textField.getText())){
                           textField_2.setText(customersArchive.get(i).getOrganisationName());
                           textField_1.setText(customersArchive.get(i).getName());
                           textField_4.setText(customersArchive.get(i).getAddress());
                           textField_3.setText(customersArchive.get(i).getEmail());
                           textField_5.setText(Integer.toString(customersArchive.get(i).getBirthday().getMonth()));
                           textField_6.setText(Integer.toString(customersArchive.get(i).getBirthday().getDay()));
                           textField_7.setText(Integer.toString(customersArchive.get(i).getBirthday().getYear()));
                           if (customersArchive.get(i).getOrganisationType().equalsIgnoreCase("PRIVATE")) {
                              radioButton.setSelected(false);
                              radioButton_2.setSelected(true);
                              radioButton_1.setSelected(false);
                           }
                           if (customersArchive.get(i).getOrganisationType().equalsIgnoreCase("COMPANY")) {
                              radioButton.setSelected(true);
                              radioButton_2.setSelected(false);
                              radioButton_1.setSelected(false);                       
                                                      }
                           if (customersArchive.get(i).getOrganisationType().equalsIgnoreCase("SCHOOL")) {
                              radioButton.setSelected(false);
                              radioButton_2.setSelected(false);
                              radioButton_1.setSelected(true);
                           }
                           break;
                        }
                        if (i==customersArchive.size()-1||customersArchive.size()==0) {
                           JOptionPane.showMessageDialog(null, "No customer match found!\nPlease fill in new customer.");                          
                        }
                        
                     }
                  }
               } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "Entered phonenumber does not appear to be digits!");
               }
            }
         }
      });
      
      // CLEAR CUSTOMER INFORMATION
      label_2.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent arg0) {
            textField_2.setText("");
            textField_1.setText("");
            textField_4.setText("");
            textField_3.setText("");
            textField_5.setText("");
            textField_6.setText("");
            textField_7.setText("");
            textField.setText("");
            radioButton.setSelected(false);
            radioButton_2.setSelected(false);
            radioButton_1.setSelected(false);
            checkBox.setSelected(false);
         }
      });
      
      // IS A PASSENGER IN CUSTOMER
      checkBox.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String str = new String();
            int month = 0;
            int day = 0;
            int year = 0;
            Calendar timeNow = Calendar.getInstance();
            int currentYear = timeNow.get(Calendar.YEAR);
            try {
               int phone = Integer.parseInt(textField.getText());
               if (!(10000000<phone&&phone<=99999999)) {
                  str+= "\nPhone number does not have 8 digits!";
               } 
            } catch (Exception e3) {
               str+= "\nEntered phone number does not appear to be digits!";
            }
            if (textField_2.getText().equalsIgnoreCase("")) {
               str+= "\nName/organisation cannot be empty!";
            }
            if (textField_1.getText().equalsIgnoreCase("")){
               str+= "\nName/contact cannot be empty!";
            }
            if (textField_4.getText().equalsIgnoreCase("")) {
               str+= "\nAddress cannot be empty!";
            }
            if (textField_3.getText().equalsIgnoreCase("")){
               str+= "\nEmail address cannot be empty!";
            }
            if (!(textField_3.getText().contains("@")&&textField_3.getText().contains("."))){
               str+= "\nEmail address does not appear to be in correct format!";
            }
         
            try {
               month = Integer.parseInt(textField_5.getText());
               if (month>12||month<1) str = str + "\nMonth does not seem to be a number between 1-12!";
            } catch (NumberFormatException e1) {
               str = str + "\nMonth does not seem to be a number between 1-12!";
            }
            try {
               day = Integer.parseInt(textField_6.getText());
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
               year = Integer.parseInt(textField_7.getText());
               if (year>currentYear||year<currentYear-120) str = str + "\nYear does not appear to be a valid number!";
            } catch (NumberFormatException e1) {
               str = str + "\nYear does not appear to be a valid number!";
            }
            
            if (str.equalsIgnoreCase("")) {
   
               updatePassengerListNewBus(textField_1.getText(), textField_4.getText(), textField.getText(), textField_3.getText(), (String)(month+"/"+day+"/"+year));
            } else {
               JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
               checkBox.setSelected(false);
            }        
            
         }
      });
   
      // ADDING NEW PASSENGER IN PASSENGER LIST
      lblAdd.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent e) {
            String str = new String();
            int month = 0;
            int day = 0;
            int year = 0;
            Calendar timeNow = Calendar.getInstance();
            int currentYear = timeNow.get(Calendar.YEAR);
            try {
               int phone = Integer.parseInt(textField_11.getText());
               if (!(10000000<phone&&phone<=99999999)) {
                  str+= "\nPhone number does not have 8 digits!";
               } 
            } catch (Exception e3) {
               str+= "\nEntered phone number does not appear to be digits!";
            }
            if (textField_10.getText().equalsIgnoreCase("")){
               str+= "\nName cannot be empty!";
            }
            if (textField_9.getText().equalsIgnoreCase("")) {
               str+= "\nAddress cannot be empty!";
            }

            if (!(textField_8.getText().contains("@")&&textField_8.getText().contains("."))){
               str+= "\nEmail appears to be either empty or incorrect format!";
            }
         
            try {
               month = Integer.parseInt(textField_12.getText());
               if (month>12||month<1) str = str + "\nMonth does not seem to be a number between 1-12!";
            } catch (NumberFormatException e1) {
               str = str + "\nMonth does not seem to be a number between 1-12!";
            }
            try {
               day = Integer.parseInt(textField_13.getText());
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
               year = Integer.parseInt(textField_14.getText());
               if (year>currentYear||year<currentYear-120) str = str + "\nYear does not appear to be a valid number!";
            } catch (NumberFormatException e1) {
               str = str + "\nYear does not appear to be a valid number!";
            }
            
            if (str.equalsIgnoreCase("")) {
               
               updatePassengerListNewBus(textField_10.getText(), textField_9.getText(), textField_11.getText(), textField_8.getText(), (String)(month+"/"+day+"/"+year));
            } else {
               JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
            }        
         }
      });
      
      // CLEAR PASSENGER INFORMATION
      label_14.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent e) {
            textField_11.setText("");
            textField_10.setText("");
            textField_9.setText("");
            textField_8.setText("");
            textField_12.setText("");
            textField_13.setText("");
            textField_14.setText("");
         }
      });
      
      // SEARCH PASSENGER BY PHONE NUMBER
      label_12.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent e) {
            if (textField_11.getText().equalsIgnoreCase("")) {
               JOptionPane.showMessageDialog(null, "You need to fill in the phone number first!");
            } else {
               try {
                  int phone = Integer.parseInt(textField_11.getText());
                  if (!(10000000<phone&&phone<=99999999)) {
                     JOptionPane.showMessageDialog(null, "Phonenumber does not have 8 digits!");
                  } else {
                     for (int i =0; i<passengersArchive.size();i++){
                        if (passengersArchive.get(i).getPhonenumber().equalsIgnoreCase(textField_11.getText())){
                           textField_10.setText(passengersArchive.get(i).getName());
                           textField_9.setText(passengersArchive.get(i).getAddress());
                           textField_8.setText(passengersArchive.get(i).getEmail());
                           textField_12.setText(Integer.toString(passengersArchive.get(i).getBirthday().getMonth()));
                           textField_13.setText(Integer.toString(passengersArchive.get(i).getBirthday().getDay()));
                           textField_14.setText(Integer.toString(passengersArchive.get(i).getBirthday().getYear()));
                           break;
                        } 
                        if(i==passengersArchive.size()-1||passengersArchive.size()==0) {
                           JOptionPane.showMessageDialog(null, "No passenger match found!\nPlease fill in new passenger.");                           
                        }
                     }
                  }
               } catch (Exception e4) {
                  JOptionPane.showMessageDialog(null, "Entered phonenumber does not appear to be digits!");
               }
            }
         }
      });
      
      // REMOVE SELECTED PASSENGER
      label_16.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent e) {
            
            int index = table.getSelectedRow();
            DefaultTableModel tablePassengersModelInNewBusReservation = (DefaultTableModel) table.getModel();
            if (index!=-1){
               if (Autobus.okOrCancel("Are you sure you want to remove this passenger from the list?")==0) {
                  tablePassengersModelInNewBusReservation.removeRow(index);
                  
               }
            } else {
               JOptionPane.showMessageDialog(null, "You need first to select the passenger you wish to remove!");
            }
         }
      });
      
      // CLEAR ALL PASSENGERS FROM PASSENGERS TABLE
      label_17.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent arg0) {
            newTable.setRowCount(0);
            checkBox.setSelected(false);
         }
      });
      
      // >>NEXT BUTTON
      label_18.addMouseListener(new MouseAdapter() {
         

         @Override
         public void mouseReleased(MouseEvent e) {
            String str = new String();
            int month = 0;
            int day = 0;
            int year = 0;
            Calendar timeNow = Calendar.getInstance();
            int currentYear = timeNow.get(Calendar.YEAR);
            try {
               int phone = Integer.parseInt(textField.getText());
               if (!(10000000<phone&&phone<=99999999)) {
                  str+= "\nCustomer phone number does not have 8 digits!";
               } 
            } catch (Exception e3) {
               str+= "\nEntered customer phone number does not appear to be digits!";
            }
            if (textField_2.getText().equalsIgnoreCase("")) {
               str+= "\nCustomer name/organisation cannot be empty!";
            }
            if (textField_1.getText().equalsIgnoreCase("")){
               str+= "\nCustomer name/contact cannot be empty!";
            }
            if (textField_4.getText().equalsIgnoreCase("")) {
               str+= "\nCustomer address cannot be empty!";
            }
            if (textField_3.getText().equalsIgnoreCase("")){
               str+= "\nCustomer email address cannot be empty!";
            }
            if (!(textField_3.getText().contains("@")&&textField_3.getText().contains("."))){
               str+= "\nCustomer email address does not appear to be in correct format!";
            }
         
            try {
               month = Integer.parseInt(textField_5.getText());
               if (month>12||month<1) str = str + "\nCustomer birth month does not seem to be a number between 1-12!";
            } catch (NumberFormatException e1) {
               str = str + "\nCustomer birth month does not seem to be a number between 1-12!";
            }
            try {
               day = Integer.parseInt(textField_6.getText());
               if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
                  if (!(1<=day&&day<=31)) {
                     str = str + "\nCustomer birth day does not seem to be a number between 1-31!";
                  }
               } else if (month==2){
                  if (!(1<=day&&day<=28)) {
                     str = str + "\nCustomer birth day does not seem to be a number between 1-28!";
                  }
               } else if (month==4||month==6||month==9||month==11){
                  if (!(1<=day&&day<=30)) {
                     str = str + "\nCustomer birth day does not seem to be a number between 1-30!";
                  }
               }
            } catch (NumberFormatException e1) {
               str = str + "\nCustomer birth day does not seem to be a number between 1-31!";
            }
            try {
               year = Integer.parseInt(textField_7.getText());
               if (year>currentYear-15) str = str + "\nCustomer birth year: Must be at least 15!";
               if (year<currentYear-120) str = str + "\nCustomer birth year: Cannot be over 120 years old!";
            } catch (NumberFormatException e1) {
               str = str + "\nCustomer birth year does not appear to be a valid number!";
            }
            
            if (table.getRowCount()==0){
               str+= "\nYou did not add any passengers to the list!";
            }
            
            if (str.equalsIgnoreCase("")) {
               Autobus.frame.hideAllPanels();
               Autobus.frame.updateBusReservationsNext.setVisible(true);
               try {
                  Autobus.frame.reservationNumber = Autobus.frame.reservationNumberGenerator.getReservationNumber();
               } catch (Exception e1) {
                  e1.printStackTrace();
               }
               updateSummaryNewBus();
            } else {
               JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
            }                             
         }
      });
      
   }
   
   public UpdateBusReservations() {
      
      panel = new JPanel();
      panel.setBackground(new Color(95, 158, 160));
      
      panel_1 = new JPanel();
      panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Customer", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
      panel_1.setBackground(new Color(95, 158, 160));
      
      label = new JLabel("Phone");
      label.setForeground(Color.WHITE);
      label.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField = new JTextField();
      textField.setForeground(Color.WHITE);
      textField.setColumns(10);
      textField.setBackground(new Color(95, 158, 160));
      
      label_1 = new JLabel("Search");
      label_1.setForeground(Color.WHITE);
      label_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      label_1.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
      
      label_2 = new JLabel("Clear");
      label_2.setForeground(Color.WHITE);
      label_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      label_2.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      checkBox = new JCheckBox("is a passenger");
      checkBox.setForeground(Color.WHITE);
      checkBox.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      checkBox.setBackground(new Color(95, 158, 160));
      
      radioButton = new JRadioButton("Company");
      radioButton.setForeground(Color.WHITE);
      radioButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      radioButton.setBackground(new Color(95, 158, 160));
      
      radioButton_1 = new JRadioButton("School");
      radioButton_1.setForeground(Color.WHITE);
      radioButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      radioButton_1.setBackground(new Color(95, 158, 160));
      
      radioButton_2 = new JRadioButton("Private");
      radioButton_2.setForeground(Color.WHITE);
      radioButton_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      radioButton_2.setBackground(new Color(95, 158, 160));
      
      label_3 = new JLabel("Name/contact");
      label_3.setForeground(Color.WHITE);
      label_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_1 = new JTextField();
      textField_1.setSelectionColor(new Color(102, 205, 170));
      textField_1.setForeground(Color.WHITE);
      textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_1.setColumns(10);
      textField_1.setBackground(new Color(95, 158, 160));
      
      label_4 = new JLabel("Name/organisation");
      label_4.setForeground(Color.WHITE);
      label_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_2 = new JTextField();
      textField_2.setSelectionColor(new Color(102, 205, 170));
      textField_2.setForeground(Color.WHITE);
      textField_2.setColumns(10);
      textField_2.setBackground(new Color(95, 158, 160));
      
      label_5 = new JLabel("Email");
      label_5.setForeground(Color.WHITE);
      label_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_3 = new JTextField();
      textField_3.setForeground(Color.WHITE);
      textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_3.setColumns(10);
      textField_3.setBackground(new Color(95, 158, 160));
      
      label_6 = new JLabel("Address");
      label_6.setForeground(Color.WHITE);
      label_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_4 = new JTextField();
      textField_4.setSelectionColor(new Color(102, 205, 170));
      textField_4.setForeground(Color.WHITE);
      textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_4.setColumns(10);
      textField_4.setBackground(new Color(95, 158, 160));
      
      label_7 = new JLabel("Birthday");
      label_7.setForeground(Color.WHITE);
      label_7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_5 = new JTextField();
      textField_5.setForeground(Color.WHITE);
      textField_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_5.setColumns(10);
      textField_5.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      textField_5.setBackground(new Color(95, 158, 160));
      
      textField_6 = new JTextField();
      textField_6.setForeground(Color.WHITE);
      textField_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_6.setColumns(10);
      textField_6.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      textField_6.setBackground(new Color(95, 158, 160));
      
      textField_7 = new JTextField();
      textField_7.setForeground(Color.WHITE);
      textField_7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_7.setColumns(10);
      textField_7.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      textField_7.setBackground(new Color(95, 158, 160));
      gl_panel_1 = new GroupLayout(panel_1);
      gl_panel_1.setHorizontalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                  .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                     .addComponent(label)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(textField, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                     .addComponent(label_1))
                  .addGroup(gl_panel_1.createSequentialGroup()
                     .addComponent(label_2)
                     .addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                     .addComponent(checkBox))
                  .addGroup(gl_panel_1.createSequentialGroup()
                     .addComponent(radioButton)
                     .addGap(18)
                     .addComponent(radioButton_1)
                     .addGap(18)
                     .addComponent(radioButton_2))
                  .addGroup(gl_panel_1.createSequentialGroup()
                     .addComponent(label_4)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
                  .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
                     .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_7)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(textField_7, 0, 0, Short.MAX_VALUE))
                     .addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
                        .addComponent(label_3)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(textField_1))
                     .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_6)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(textField_4))
                     .addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
                        .addComponent(label_5)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(textField_3, 238, 238, 238))))
               .addGap(24))
      );
      gl_panel_1.setVerticalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label)
                  .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(label_1))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_4)
                  .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(radioButton)
                  .addComponent(radioButton_1)
                  .addComponent(radioButton_2))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_3)
                  .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_6)
                  .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_5)
                  .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_7)
                  .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_2)
                  .addComponent(checkBox))
               .addContainerGap())
      );
      panel_1.setLayout(gl_panel_1);
      
      panel_2 = new JPanel();
      panel_2.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Add passenger", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), null));
      panel_2.setBackground(new Color(95, 158, 160));
      
      label_8 = new JLabel("Address");
      label_8.setForeground(Color.WHITE);
      label_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      label_9 = new JLabel("Email");
      label_9.setForeground(Color.WHITE);
      label_9.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_8 = new JTextField();
      textField_8.setSelectionColor(new Color(102, 205, 170));
      textField_8.setForeground(Color.WHITE);
      textField_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_8.setColumns(10);
      textField_8.setBackground(new Color(95, 158, 160));
      
      textField_9 = new JTextField();
      textField_9.setSelectionColor(new Color(102, 205, 170));
      textField_9.setForeground(Color.WHITE);
      textField_9.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_9.setColumns(10);
      textField_9.setBackground(new Color(95, 158, 160));
      
      label_10 = new JLabel("Phone");
      label_10.setForeground(Color.WHITE);
      label_10.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      label_11 = new JLabel("Name");
      label_11.setForeground(Color.WHITE);
      label_11.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_10 = new JTextField();
      textField_10.setSelectionColor(new Color(102, 205, 170));
      textField_10.setForeground(Color.WHITE);
      textField_10.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_10.setColumns(10);
      textField_10.setBackground(new Color(95, 158, 160));
      
      textField_11 = new JTextField();
      textField_11.setSelectionColor(new Color(102, 205, 170));
      textField_11.setForeground(Color.WHITE);
      textField_11.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_11.setColumns(10);
      textField_11.setBackground(new Color(95, 158, 160));
      
      label_12 = new JLabel("Search");
      label_12.setForeground(Color.WHITE);
      label_12.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      label_12.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
      
      label_13 = new JLabel("Birthday");
      label_13.setForeground(Color.WHITE);
      label_13.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      textField_12 = new JTextField();
      textField_12.setForeground(Color.WHITE);
      textField_12.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_12.setColumns(10);
      textField_12.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      textField_12.setBackground(new Color(95, 158, 160));
      
      textField_13 = new JTextField();
      textField_13.setForeground(Color.WHITE);
      textField_13.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_13.setColumns(10);
      textField_13.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      textField_13.setBackground(new Color(95, 158, 160));
      
      textField_14 = new JTextField();
      textField_14.setForeground(Color.WHITE);
      textField_14.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      textField_14.setColumns(10);
      textField_14.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      textField_14.setBackground(new Color(95, 158, 160));
      
      label_14 = new JLabel("Clear");
      label_14.setForeground(Color.WHITE);
      label_14.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      label_14.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      lblAdd = new JLabel("Add");
      lblAdd.setForeground(Color.WHITE);
      lblAdd.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      lblAdd.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      GroupLayout gl_panel_2 = new GroupLayout(panel_2);
      gl_panel_2.setHorizontalGroup(
         gl_panel_2.createParallelGroup(Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
            .addGroup(gl_panel_2.createSequentialGroup()
               .addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addContainerGap()
                     .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                           .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                              .addComponent(label_8)
                              .addComponent(label_9))
                           .addPreferredGap(ComponentPlacement.UNRELATED)
                           .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                              .addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                              .addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                        .addGroup(gl_panel_2.createSequentialGroup()
                           .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                              .addComponent(label_10)
                              .addComponent(label_11))
                           .addGap(27)
                           .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
                              .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                              .addGroup(gl_panel_2.createSequentialGroup()
                                 .addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(label_12))))))
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addGap(13)
                     .addComponent(label_13)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addGap(14)
                     .addComponent(label_14)
                     .addPreferredGap(ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                     .addComponent(lblAdd)))
               .addContainerGap())
      );
      gl_panel_2.setVerticalGroup(
         gl_panel_2.createParallelGroup(Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
            .addGroup(gl_panel_2.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_10)
                  .addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(label_12))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_11)
                  .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_8)
                  .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_9)
                  .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(16)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_13)
                  .addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_14)
                  .addComponent(lblAdd))
               .addContainerGap())
      );
      panel_2.setLayout(gl_panel_2);
      
      label_16 = new JLabel("Remove");
      label_16.setForeground(Color.WHITE);
      label_16.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      label_16.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      label_17 = new JLabel("Clear all");
      label_17.setForeground(Color.WHITE);
      label_17.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      label_17.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      label_18 = new JLabel("NEXT >>");
      label_18.setForeground(Color.WHITE);
      label_18.setFont(new Font("Century Gothic", Font.PLAIN, 18));
      
      scrollPane = new JScrollPane();
      scrollPane.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Passenger list", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
      scrollPane.setBackground(new Color(95, 158, 160));
      
      panel_3 = new JPanel();
      panel_3.setBackground(new Color(0, 128, 128));
      
      lblNewBus = new JLabel("New Bus & Chauffeur Reservation Update");
      lblNewBus.setForeground(Color.WHITE);
      lblNewBus.setFont(new Font("Century Gothic", Font.PLAIN, 20));
      gl_panel_3 = new GroupLayout(panel_3);
      gl_panel_3.setHorizontalGroup(
         gl_panel_3.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_3.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblNewBus, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(1219, Short.MAX_VALUE))
      );
      gl_panel_3.setVerticalGroup(
         gl_panel_3.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_3.createSequentialGroup()
               .addComponent(lblNewBus, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      panel_3.setLayout(gl_panel_3);
      gl_panel = new GroupLayout(panel);
      gl_panel.setHorizontalGroup(
         gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
               .addGap(12)
               .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
               .addGap(18)
               .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_panel.createSequentialGroup()
                     .addComponent(label_16)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(label_17)
                     .addPreferredGap(ComponentPlacement.RELATED, 749, Short.MAX_VALUE)
                     .addComponent(label_18)
                     .addGap(35))
                  .addGroup(gl_panel.createSequentialGroup()
                     .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                     .addGap(27)))
               .addGap(0))
            .addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1697, Short.MAX_VALUE)
      );
      gl_panel.setVerticalGroup(
         gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
               .addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                  .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                  .addGroup(gl_panel.createSequentialGroup()
                     .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                     .addGap(18)
                     .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                           .addComponent(label_18)
                           .addComponent(label_16))
                        .addComponent(label_17)))
                  .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
               .addContainerGap(415, Short.MAX_VALUE))
      );
      
      table = new JTable();
      table.setModel(new DefaultTableModel(
         new Object[][] {
         },
         new String[] {
            "Name", "Address", "Phone", "Email", "Birthday"
         }
      ));
      scrollPane.setViewportView(table);
      panel.setLayout(gl_panel);
      groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, 1731, Short.MAX_VALUE)
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(182, Short.MAX_VALUE))
      );
      setLayout(groupLayout);
      createEventsForNewBusReservationUpdatePanel();
   }
   
   public void listPassengers(){
      DefaultTableModel passengersTable = (DefaultTableModel) table.getModel();
      Autobus.frame.deleteAllRows(passengersTable);
      Object[] rowData = new Object[5];
      for (int i = 0; i < currentlyUpdatingBusReservation.getPassengers().size(); i++) {
         rowData[0] = currentlyUpdatingBusReservation.getPassengers().get(i).getName();
         rowData[1] = currentlyUpdatingBusReservation.getPassengers().get(i).getAddress();
         rowData[2] = currentlyUpdatingBusReservation.getPassengers().get(i).getPhonenumber();
         rowData[3] = currentlyUpdatingBusReservation.getPassengers().get(i).getEmail();
         rowData[4] = currentlyUpdatingBusReservation.getPassengers().get(i).getBirthday().displayDate();
         passengersTable.addRow(rowData);
      }
   }
   
   public void updatePassengerListNewBus(String name, String address, String phone, String email, String birthday){
      Autobus.frame.newBusPassengersTable = (DefaultTableModel) Autobus.frame.tableNewBusPassengers.getModel();
      Object[] rowData = new Object[5];      
      rowData[0] = name;
      rowData[1] = address;
      rowData[2] = phone;
      rowData[3] = email;
      rowData[4] = birthday;
      Autobus.frame.newBusPassengersTable.addRow(rowData);
      Autobus.frame.newBusPassengersTable = (DefaultTableModel) Autobus.frame.tablePassengersInNewTourReservation.getModel();
      Autobus.frame.newBusPassengersTable.addRow(rowData);
   }
   
   public void updateSummaryNewBus(){
      UpdateBusReservationsNext updateBusReservationsNext = new UpdateBusReservationsNext();
      String str = new String();
      str+= "Reservation#: "+Autobus.frame.reservationNumber;
      str+= "\n\nCustomer: "+textField_2.getText()+"\n";
      if (!radioButton_2.isSelected()) {
         str+= "Contact name: "+textField_1.getText()+"\n";
      }
      str+= textField_4.getText()+"\nPhone: "+textField.getText()+"\n";
      str+= "\nPassengers: "+table.getRowCount();
      
      str+= "\nRent date: ";
      if (!(updateBusReservationsNext.startDayNext.getText().equalsIgnoreCase("")&&updateBusReservationsNext.startMonthNext.getText().equalsIgnoreCase("")&&updateBusReservationsNext.startYearNext.getText().equalsIgnoreCase("")
            &&updateBusReservationsNext.endDayNext.getText().equalsIgnoreCase("")&&updateBusReservationsNext.endMonthNext.getText().equalsIgnoreCase("")&&updateBusReservationsNext.endYearNext.getText().equalsIgnoreCase(""))) {
         str+= updateBusReservationsNext.startMonthNext.getText()+"/"+updateBusReservationsNext.startDayNext.getText()+"/"+updateBusReservationsNext.startYearNext.getText()
         +" - "+updateBusReservationsNext.endMonthNext.getText()+"/"+updateBusReservationsNext.endDayNext.getText()+"/"+updateBusReservationsNext.endYearNext.getText();
      }
      
      str+= "\nServices: ";
      if (updateBusReservationsNext.ticketsCheckBoxNext.isSelected()){
         str+= "Entrance tickets, ";
      }
      if (updateBusReservationsNext.allInclusiveCheckBoxNext.isSelected()) {
         str+= "All inclusive";
      }
      if (updateBusReservationsNext.breakfastCheckBoxNext.isSelected()) {
         str+= "Breakfast";
      }
      if (updateBusReservationsNext.breakfastCheckBoxNext.isSelected()&&updateBusReservationsNext.lunchCheckBoxNext.isSelected()) {
         str+= ", Lunch";
      } else if (updateBusReservationsNext.lunchCheckBoxNext.isSelected()) {
         str+= "Lunch";
      }
      if (!(updateBusReservationsNext.breakfastCheckBoxNext.isSelected()||updateBusReservationsNext.lunchCheckBoxNext.isSelected()||updateBusReservationsNext.lunchCheckBoxNext.isSelected()||updateBusReservationsNext.ticketsCheckBoxNext.isSelected())){
         str+= "\nNo services selected";
      }
      if (updateBusReservationsNext.tableSelectBusNext.getSelectedRow()!=-1){
         str+= "\nBus selected:  #"+newBusSelectBusTable.getValueAt(updateBusReservationsNext.tableSelectBusNext.getSelectedRow(), 0)
         +"  Price/h: "+newBusSelectBusTable.getValueAt(updateBusReservationsNext.tableSelectBusNext.getSelectedRow(), 1)
         +"  Seats: "+newBusSelectBusTable.getValueAt(updateBusReservationsNext.tableSelectBusNext.getSelectedRow(), 2)
         +"  Type: "+newBusSelectBusTable.getValueAt(updateBusReservationsNext.tableSelectBusNext.getSelectedRow(), 3);
      }
      if (updateBusReservationsNext.tableSelectChauffeurNext.getSelectedRow()!=-1){
         str+= "\nChauffeur selected: "+newBusSelectChauffeurTable.getValueAt(updateBusReservationsNext.tableSelectChauffeurNext.getSelectedRow(), 1);
      }
      if (!(updateBusReservationsNext.startDayNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.startMonthNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.startYearNext.getText().equalsIgnoreCase("")
            ||updateBusReservationsNext.endDayNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.endMonthNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.endYearNext.getText().equalsIgnoreCase("")
            ||updateBusReservationsNext.tableSelectBusNext.getSelectedRow()==-1)) {
         String busSelected = (String)newBusSelectBusTable.getValueAt(updateBusReservationsNext.tableSelectBusNext.getSelectedRow(), 0);
         double pricePerDay=0;
         pricePerDay=busesArchive.getBusById(busSelected).getPricePerHour()*8;//price/hour * 8 working hours per day = price/day
         double totalPrice=0;
         int numberOfPassengers=table.getRowCount();
         int monthStart=0;
         int dayStart =0;
         int yearStart=0;
         int monthEnd=0;
         int dayEnd=0;
         int yearEnd=0;
         try {
            monthStart=Integer.parseInt(updateBusReservationsNext.startMonthNext.getText());
            dayStart=Integer.parseInt(updateBusReservationsNext.startDayNext.getText());
            yearStart=Integer.parseInt(updateBusReservationsNext.startYearNext.getText());
            monthEnd=Integer.parseInt(updateBusReservationsNext.endMonthNext.getText());
            dayEnd=Integer.parseInt(updateBusReservationsNext.endDayNext.getText());
            yearEnd=Integer.parseInt(updateBusReservationsNext.endYearNext.getText());
         } catch (Exception e) {
         }
         
         SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
         java.util.Date startDate = null, endDate = null, currentDate = new java.util.Date();
         
         try {
            startDate = dateformat.parse(dayStart+"/"+monthStart+"/"+yearStart);
            endDate = dateformat.parse(dayEnd+"/"+monthEnd+"/"+yearEnd);
         } catch (ParseException e) {

            e.printStackTrace();
         }
         
         if (currentDate.equals(startDate)&&startDate.before(endDate)||currentDate.before(startDate)&&startDate.before(endDate)) {
            int daysCount = daysBetweenDates(startDate, endDate);
            if (updateBusReservationsNext.allInclusiveCheckBoxNext.isSelected()) {
               pricePerDay+=numberOfPassengers*priceList.getPriceAllInclusive();
            }
            if (updateBusReservationsNext.breakfastCheckBoxNext.isSelected()){
               pricePerDay+=numberOfPassengers*priceList.getPriceBreakfast();
            }
            if (updateBusReservationsNext.lunchCheckBoxNext.isSelected()){
               pricePerDay+=numberOfPassengers*priceList.getPriceLunch();
            }
            totalPrice=daysCount*pricePerDay;
            if (updateBusReservationsNext.ticketsCheckBoxNext.isSelected()) {
               totalPrice+=priceList.getPriceEntranceTickets();
            }
            str+= "\n\nTotal price: "+round(totalPrice, 2) +"\n Total price per passenger: "+round(totalPrice/numberOfPassengers, 2);
         } else {
            str+= "\n - unable to calculate total price -\n";
         }
         
      }
      updateBusReservationsNext.summaryPaneNext.setText(str);
   }
   public static int daysBetweenDates(java.util.Date startDate, java.util.Date endDate){
      long days = ChronoUnit.DAYS.between(startDate.toInstant(), endDate.toInstant());
      return (int)days;
   }
   public static double round(double value, int places) {
      if (places < 0) throw new IllegalArgumentException();
      BigDecimal bd = new BigDecimal(value);
      bd = bd.setScale(places, RoundingMode.HALF_UP);
      return bd.doubleValue();
  }
}
