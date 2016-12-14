package autoBus;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
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
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UpdateBusReservations extends JPanel {
   /**
    * 
    */
   private UpdateBusReservationsNext updateBusReservationsNext = (UpdateBusReservationsNext) Autobus.frame.updateBusReservationsNext;
   private static final long serialVersionUID = 1L;
   DefaultTableModel newBusSelectBusTable;
   DefaultTableModel newBusSelectChauffeurTable;
   private BusReservation currentlyUpdatingBusReservation;
   
   private DefaultTableModel newTablePassengerReservationUpdate;
   private JTextField phoneCustomerReservationUpdate;
   private JTextField nameCustomerReservationUpdate;
   private JTextField organisationNameReservationUpdate;
   private JTextField emailCustomerReservationUpdate;
   private JTextField addressCustomerReservationUpdate;
   private JTextField mmCustomerReservationUpdate;
   private JTextField ddCustomerReservationUpdate;
   private JTextField yyyyCustomerReservationUpdate;
   private JTextField emailPassengerReservationUpdate;
   private JTextField addressPassengerReservationUpdate;
   private JTextField namePassengerReservationUpdate;
   private JTextField phonePassengerReservationUpdate;
   private JTextField mmPassengerReservationUpdate;
   private JTextField ddPassengerReservationUpdate;
   private JTextField yyyyPassengerReservationUpdate;
   private JLabel searchCustomerLabelReservationUpdate;
   private JLabel customerClearLabelReservationUpdate;
   private JLabel searchPassengerReservationUpdate;
   private JLabel clearPassengerReservationUpdate;
   private JLabel removePassengerReservationUpdate;
   private JLabel clearAllPassengersReservationUpdate;
   private JLabel addPassengerReservationUpdate;
   private JRadioButton companyRadioButtonReservationUpdate;
   private JRadioButton schoolRadioButtonReservationUpdate;
   private JRadioButton privateRadioButtonReservationUpdate;
   private JCheckBox isPassengerCheckBox;
   private JTable tablePassengerReservationUpdate;
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
   private JLabel nextReservationUpdate;
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
    * All methods for this UpdateBusReservations
    */
   public void createEventsForNewBusReservationUpdatePanel() {
      updateBusReservationsNext.startMonthNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startMonthNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startMonthNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startMonthNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }


      });

      updateBusReservationsNext.startDayNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startDayNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startDayNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startDayNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }




      });

      updateBusReservationsNext.startYearNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startYearNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startYearNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startYearNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }




      });

      updateBusReservationsNext.startHourNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startHourNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startHourNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startHourNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }





      });

      updateBusReservationsNext.startMinuteNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startMinuteNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startMinuteNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.startMinuteNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }





      });

      updateBusReservationsNext.endMonthNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endMonthNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endMonthNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endMonthNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }





      });

      updateBusReservationsNext.endDayNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endDayNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endDayNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endDayNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }





      });

      updateBusReservationsNext.endYearNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endYearNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endYearNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endYearNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }






      });

      updateBusReservationsNext.endHourNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endHourNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endHourNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endHourNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }





      });

      updateBusReservationsNext.endMinuteNext.getDocument().addDocumentListener(new DocumentListener() {
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endMinuteNext
          */
         public void changedUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endMinuteNext
          */
         public void insertUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());
         }
         /**
          * Deletes all rows in tableSelectBusNext and tableSelectChauffeurNext after a symbols was added in updateBusReservationsNext.endMinuteNext
          */
         public void removeUpdate(DocumentEvent e) {
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel());
            deleteAllRows((DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel());

         }
      });

      /**
       * This checks in all the fields are field correctly
       */
      updateBusReservationsNext.nextLabelNext.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent arg0) {
            if (Autobus.frame.okOrCancel("Are you sure you want to save these changes?") == 0) {
               String str = new String();
               int monthStart=0;
               int dayStart =0;
               int yearStart=0;
               int monthEnd=0;
               int dayEnd=0;
               int yearEnd=0;

               int numberOfPassengers=tablePassengerReservationUpdate.getRowCount();
               double pricePerDay = 0;
               double totalPrice = 0;
               Services services = null;
               java.util.Date javastartDate;
               java.util.Date javaendDate;

               int hourStart =0;
               int hourEnd =0;
               int minuteStart =0;
               int minuteEnd = 0;

               //int dayCount = -1;
               //int workHoursPerDay = 8; //for calculating price per passenger (8 hours per day * price per hour = day price)
               Calendar timeNow = Calendar.getInstance();
               int currentYear = timeNow.get(Calendar.YEAR);
               try {
                  monthStart = Integer.parseInt(updateBusReservationsNext.startMonthNext.getText());
                  if (monthStart>12||monthStart<1) str = str + "\nStart month does not seem to be a number between 1-12!";
               } catch (NumberFormatException e1) {
                  str = str + "\nStart month does not seem to be a number between 1-12!";
               }
               try {
                  dayStart = Integer.parseInt(updateBusReservationsNext.startDayNext.getText());
                  if (monthStart==1||monthStart==3||monthStart==5||monthStart==7||monthStart==8||monthStart==10||monthStart==12) {
                     if (!(1<=dayStart&&dayStart<=31)) {
                        str = str + "\nStart day does not seem to be a number between 1-31!";
                     }
                  } else if (monthStart==2){
                     if (!(1<=dayStart&&dayStart<=28)) {
                        str = str + "\nStart day does not seem to be a number between 1-28!";
                     }
                  } else if (monthStart==4||monthStart==6||monthStart==9||monthStart==11){
                     if (!(1<=dayStart&&dayStart<=30)) {
                        str = str + "\nStart day does not seem to be a number between 1-30!";
                     }
                  }
               } catch (NumberFormatException e1) {
                  str = str + "\nStart day does not seem to be a number between 1-31!";
               }
               try {
                  yearStart = Integer.parseInt(updateBusReservationsNext.startYearNext.getText());
                  if (yearStart<currentYear) str = str + "\nStart year does not appear to be a valid number!";
               } catch (NumberFormatException e1) {
                  str = str + "\nStart year does not appear to be a valid number!";
               }
               try {
                  monthEnd = Integer.parseInt(updateBusReservationsNext.endMonthNext.getText());
                  if (monthEnd>12||monthEnd<1) str = str + "\nEnd month does not seem to be a number between 1-12!";
               } catch (NumberFormatException e1) {
                  str = str + "\nEndt month does not seem to be a number between 1-12!";
               }
               try {
                  dayEnd = Integer.parseInt(updateBusReservationsNext.endDayNext.getText());
                  if (monthEnd==1||monthEnd==3||monthEnd==5||monthEnd==7||monthEnd==8||monthEnd==10||monthEnd==12) {
                     if (!(1<=dayEnd&&dayEnd<=31)) {
                        str = str + "\nEnd day does not seem to be a number between 1-31!";
                     }
                  } else if (monthEnd==2){
                     if (!(1<=dayEnd&&dayEnd<=28)) {
                        str = str + "\nEnd day does not seem to be a number between 1-28!";
                     }
                  } else if (monthEnd==4||monthEnd==6||monthEnd==9||monthEnd==11){
                     if (!(1<=dayEnd&&dayEnd<=30)) {
                        str = str + "\nEnd day does not seem to be a number between 1-30!";
                     }
                  }
               } catch (NumberFormatException e1) {
                  str = str + "\nEnd day does not seem to be a number between 1-31!";
               }
               try {
                  yearEnd = Integer.parseInt(updateBusReservationsNext.endYearNext.getText());
                  if (yearEnd<currentYear) str = str + "\nEnd year does not appear to be a valid number!";
               } catch (NumberFormatException e1) {
                  str = str + "\nEnd year does not appear to be a valid number!";
               }
               try {
                  hourStart= Integer.parseInt(updateBusReservationsNext.startHourNext.getText());
                  if (hourStart<0 && hourStart > 23) str = str + "\nStart hour does not appear to be a number between 0-23!";
               } catch (NumberFormatException e1) {
                  str = str + "\nStart hour does not appear to be a valid number!";
               }
               try {
                  hourEnd= Integer.parseInt(updateBusReservationsNext.endHourNext.getText());
                  if (hourEnd<0 && hourEnd > 23) str = str + "\nEnd hour does not appear to be a number between 0-23!";
               } catch (NumberFormatException e1) {
                  str = str + "\nEnd hour does not appear to be a valid number!";
               }
               try {
                  minuteStart= Integer.parseInt(updateBusReservationsNext.startMinuteNext.getText());
                  if (minuteStart<0 && minuteStart > 59) str = str + "\nStart minute does not appear to be a number between 0-59!";
               } catch (NumberFormatException e1) {
                  str = str + "\nStart minute does not appear to be a valid number!";
               }
               try {
                  minuteEnd= Integer.parseInt(updateBusReservationsNext.endMinuteNext.getText());
                  if (minuteEnd<0 && minuteEnd> 59) str = str + "\nEnd minute does not appear to be a number between 0-59!";
               } catch (NumberFormatException e1) {
                  str = str + "\nEnd minute does not appear to be a valid number!";
               }


               try {
                  services = new Services();
               } catch (Exception e1) {

                  e1.printStackTrace();
               }
               int daysCount = 0;
               double discount = 0;
               SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
               java.util.Date startDate = null, endDate = null, currentDate = new java.util.Date();
               @SuppressWarnings("unused")
               DateInterval dateInterval = new DateInterval();
               String busSelected = new String("");
               Chauffeur chauffeur = null;
               Bus bus = null;
               if (updateBusReservationsNext.allInclusiveCheckBoxNext.isSelected()){
                  services.setAllInclusive(true);
                  pricePerDay+=numberOfPassengers*Autobus.frame.priceList.getPriceAllInclusive();
               }
               if (updateBusReservationsNext.breakfastCheckBoxNext.isSelected()){
                  services.setBreakfastIncluded(true);
                  pricePerDay+=numberOfPassengers*Autobus.frame.priceList.getPriceBreakfast();
               }
               if (updateBusReservationsNext.lunchCheckBoxNext.isSelected()){
                  services.setLunchIncluded(true);
                  pricePerDay+=numberOfPassengers*Autobus.frame.priceList.getPriceLunch();
               }
               if (updateBusReservationsNext.ticketsCheckBoxNext.isSelected()){
                  services.setEntranceTickets(true);
                  totalPrice += numberOfPassengers*Autobus.frame.priceList.getPriceEntranceTickets();
               }
               if (!(updateBusReservationsNext.startDayNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.startMonthNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.startYearNext.getText().equalsIgnoreCase("")
                       ||updateBusReservationsNext.endDayNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.endMonthNext.getText().equalsIgnoreCase("")||updateBusReservationsNext.endYearNext.getText().equalsIgnoreCase(""))) {
                  try {
                     monthStart=Integer.parseInt(updateBusReservationsNext.startMonthNext.getText());
                     dayStart=Integer.parseInt(updateBusReservationsNext.startDayNext.getText());
                     yearStart=Integer.parseInt(updateBusReservationsNext.startYearNext.getText());
                     monthEnd=Integer.parseInt(updateBusReservationsNext.endMonthNext.getText());
                     dayEnd=Integer.parseInt(updateBusReservationsNext.endDayNext.getText());
                     yearEnd=Integer.parseInt(updateBusReservationsNext.endYearNext.getText());
                     dateInterval = new DateInterval(new Date(monthStart, dayStart, yearStart), new Date(monthEnd, dayEnd, yearEnd));
                     startDate = dateformat.parse(dayStart+"/"+monthStart+"/"+yearStart);
                     endDate = dateformat.parse(dayEnd+"/"+monthEnd+"/"+yearEnd);
                     if (currentDate.equals(startDate)&&startDate.before(endDate)||currentDate.before(startDate)&&startDate.before(endDate)) {
                        daysCount = daysBetweenDates(startDate, endDate);
                     } else {
                        str += "Dates must be future dates, and start date must be before end date!";
                     }

                  } catch (Exception e) {
                     str+= "Please check if start and end dates are correct!";
                  }
               }
               if (!(updateBusReservationsNext.tableSelectBusNext.getSelectedRow()==-1)) {
                  busSelected = (String)newBusSelectBusTable.getValueAt(updateBusReservationsNext.tableSelectBusNext.getSelectedRow(), 0);
                  pricePerDay += Autobus.frame.busesArchive.getBusById(busSelected).getPricePerHour()*8;//price/hour * 8 working hours per day = price/day
                  bus = Autobus.frame.busesArchive.getBusById(busSelected);


               } else {
                  pricePerDay += currentlyUpdatingBusReservation.getBus().getPricePerHour()*8;//price/hour * 8 working hours per day = price/day
                  bus = currentlyUpdatingBusReservation.getBus();
               }
               if (!(updateBusReservationsNext.tableSelectChauffeurNext.getSelectedRow()==-1)) {
                  String chauffeurSelected = (String)newBusSelectChauffeurTable.getValueAt(updateBusReservationsNext.tableSelectChauffeurNext.getSelectedRow(), 0);
                  chauffeur = Autobus.frame.chauffeursArchive.getChauffeurById(chauffeurSelected);
               } else {
                  chauffeur = currentlyUpdatingBusReservation.getChauffeur();
               }
               for (int i=0; i<Autobus.frame.customersArchive.size(); i++){
                  if (phoneCustomerReservationUpdate.getText().equalsIgnoreCase(Autobus.frame.customersArchive.get(i).getPhonenumber())) {
                     discount = Autobus.frame.customersArchive.get(i).getDiscount();
                  }
               }
               totalPrice += pricePerDay*daysCount;
               totalPrice = totalPrice - (totalPrice * discount);
               totalPrice = round(totalPrice, 2);


               if (str.equalsIgnoreCase("")){
                  javastartDate = parseDate(yearStart+"-" + monthStart + "-" + dayStart + "-" + hourStart + "-" + minuteStart);
                  javaendDate = parseDate(yearEnd+"-" + monthEnd + "-" + dayEnd+ "-" + hourEnd + "-" + minuteEnd);
                  int customerIndex = -1;
                  Bus oldBus = currentlyUpdatingBusReservation.getBus();
                  for (int i = 0; i < oldBus.getListOfStartEndDates().size(); i++) {
                     if(currentlyUpdatingBusReservation.getNewDateInterval()[0].toString().equals(oldBus.getListOfStartEndDates().get(i)[0].toString())){
                        oldBus.getListOfStartEndDates().remove(i);
                        oldBus.setDatePointer(oldBus.getDatePointer() <= i ? oldBus.getDatePointer()  : oldBus.getDatePointer() - 1);
                        break;
                     }
                  }
                  bus.addNewReservationPeriod(new java.util.Date[]{javastartDate,javaendDate});
                  try {
                     Autobus.frame.busesArchive.saveBusesArchive();
                  }
                  catch (Exception e){
                     e.printStackTrace();
                  }
                  Chauffeur oldChauffeur = currentlyUpdatingBusReservation.getChauffeur();
                  for (int i = 0; i < oldChauffeur.getListOfStartEndDates().size(); i++) {
                     if(currentlyUpdatingBusReservation.getNewDateInterval()[0].toString().equals(oldChauffeur.getListOfStartEndDates().get(i)[0].toString())) {
                        oldChauffeur.getListOfStartEndDates().remove(i);
                        oldChauffeur.setDatePointer(oldChauffeur.getDatePointer() <= i ? oldChauffeur.getDatePointer()  : oldChauffeur.getDatePointer() - 1);
                        break;
                     }
                  }
                  chauffeur.addNewReservationPeriod(new java.util.Date[]{javastartDate,javaendDate});
                  try {
                     Autobus.frame.chauffeursArchive.saveChauffeursArchive();
                  }
                  catch (Exception e){
                     e.printStackTrace();
                  }
                  for (int i=0; i< Autobus.frame.customersArchive.size(); i++){
                     if (phoneCustomerReservationUpdate.getText().equalsIgnoreCase(Autobus.frame.customersArchive.get(i).getPhonenumber())) {
                        customerIndex = i;
                     }
                  }
                  if (customerIndex==-1) {
                     Date birthday = null;
                     String organisationType = "PRIVATE";
                     if (companyRadioButtonReservationUpdate.isSelected()) {
                        organisationType = "COMPANY";
                     }
                     if (schoolRadioButtonReservationUpdate.isSelected()){
                        organisationType = "SCHOOL";
                     }
                     if (mmCustomerReservationUpdate.getText().equalsIgnoreCase("")||ddCustomerReservationUpdate.getText().equalsIgnoreCase("")||yyyyCustomerReservationUpdate.getText().equalsIgnoreCase("")){
                        birthday = new Date(0, 0, 0);
                     } else {
                        int bMonth = 0;
                        int bDay = 0;
                        int bYear = 0;
                        bMonth = Integer.parseInt(mmCustomerReservationUpdate.getText());
                        bDay = Integer.parseInt(ddCustomerReservationUpdate.getText());
                        bYear = Integer.parseInt(yyyyCustomerReservationUpdate.getText());
                        birthday = new Date(bMonth, bDay, bYear);
                     }
                     Customer customer = new Customer(nameCustomerReservationUpdate.getText(), organisationNameReservationUpdate.getText(), emailCustomerReservationUpdate.getText(),
                             addressCustomerReservationUpdate.getText(), birthday, phoneCustomerReservationUpdate.getText(), organisationType);
                     Autobus.frame.customersArchive.addCustomer(customer);
                     try {
                        Autobus.frame.customersArchive.saveCustomersArchive();
                     } catch (Exception e) {

                        e.printStackTrace();
                     }
                     customerIndex= Autobus.frame.customersArchive.size()-1;
                  }

                  Autobus.frame.customersArchive.get(customerIndex).setMoneySpent(Autobus.frame.customersArchive.get(customerIndex).getMoneySpent() + (totalPrice - currentlyUpdatingBusReservation.getTotalPrice()));
                  currentlyUpdatingBusReservation.setCustomer(Autobus.frame.customersArchive.get(customerIndex));
                  currentlyUpdatingBusReservation.setChauffeur(chauffeur);
                  currentlyUpdatingBusReservation.setBus(bus);
                  currentlyUpdatingBusReservation.setTotalPrice(totalPrice);
                  currentlyUpdatingBusReservation.setNewDateInterval(new java.util.Date[]{javastartDate,javaendDate});
                  ArrayList<Passenger> listOfSelectedPassengers = new ArrayList<>();
                  currentlyUpdatingBusReservation.getPassengers().clear();
                  int passengersTableRowCount= tablePassengerReservationUpdate.getRowCount();
                  for (int i = 0; i < passengersTableRowCount; i++) {
                     String passengersPhoneNumber = (String) tablePassengerReservationUpdate.getModel().getValueAt(i,2);
                     String passengersName = (String) tablePassengerReservationUpdate.getModel().getValueAt(i,0);

                     for (int j = 0; j < Autobus.frame.passengersArchive.size(); j++) {
                        if(Autobus.frame.passengersArchive.getPassengersArchive().get(j).getPhonenumber().equals(passengersPhoneNumber) &&
                                Autobus.frame.passengersArchive.getPassengersArchive().get(j).getName().equals(passengersName)){

                           listOfSelectedPassengers.add(Autobus.frame.passengersArchive.getPassengersArchive().get(j));
                           break;
                        }
                     }
                  }
                  currentlyUpdatingBusReservation.setPassengers(listOfSelectedPassengers);
                  try {
                     Autobus.frame.reservationsArchive.saveReservationsArchive();
                  } catch (Exception e1) {
                     e1.printStackTrace();
                  }
                  try {
                     Autobus.frame.reservationsArchive.saveReservationsArchive();
                     JOptionPane.showMessageDialog(null, "The updated reservation is now saved to the archive.");
                     addressCustomerReservationUpdate.setText("");
                     ddCustomerReservationUpdate.setText("");
                     mmCustomerReservationUpdate.setText("");
                     yyyyCustomerReservationUpdate.setText("");
                     emailCustomerReservationUpdate.setText("");
                     nameCustomerReservationUpdate.setText("");
                     phoneCustomerReservationUpdate.setText("");
                     addressCustomerReservationUpdate.setText("");
                     ddPassengerReservationUpdate.setText("");
                     mmPassengerReservationUpdate.setText("");
                     yyyyPassengerReservationUpdate.setText("");
                     emailPassengerReservationUpdate.setText("");
                     namePassengerReservationUpdate.setText("");
                     phonePassengerReservationUpdate.setText("");
                     newTablePassengerReservationUpdate = (DefaultTableModel) tablePassengerReservationUpdate.getModel();
                     newTablePassengerReservationUpdate.setRowCount(0);
                     isPassengerCheckBox.setSelected(false);
                     companyRadioButtonReservationUpdate.setSelected(false);
                     privateRadioButtonReservationUpdate.setSelected(false);
                     schoolRadioButtonReservationUpdate.setSelected(false);
                     organisationNameReservationUpdate.setText("");
                     updateBusReservationsNext.endDayNext.setText("");
                     updateBusReservationsNext.endMonthNext.setText("");
                     updateBusReservationsNext.endYearNext.setText("");
                     updateBusReservationsNext.endHourNext.setText("");
                     updateBusReservationsNext.endMinuteNext.setText("");
                     updateBusReservationsNext.startDayNext.setText("");
                     updateBusReservationsNext.startMonthNext.setText("");
                     updateBusReservationsNext.startYearNext.setText("");
                     updateBusReservationsNext.startHourNext.setText("");
                     updateBusReservationsNext.startMinuteNext.setText("");
                     Autobus.frame.hideAllPanels();
                     Autobus.frame.listBusReservations();
                     Autobus.frame.listPassengers();
                     Autobus.frame.listCustomers();
                     Autobus.frame.listBuses();
                     Autobus.frame.listChauffeurs();
                     Autobus.frame.panelBusReservations.setVisible(true);
                  } catch (Exception e) {

                     e.printStackTrace();
                  }
               } else {
                  JOptionPane.showMessageDialog(null, "You have to fill out the fields correctly:\n"+str);
               }
            }

         }

      });
    
      Autobus.frame.lblUpdateBusReservation.addMouseListener(new MouseAdapter(){
         @Override
         /**
          * This fills every element with necessary information after the button has been clicked 
          */
         public void mouseReleased(MouseEvent event){

            try {
               int reservationNumberOfCurrentlyUpdatingReservation = (int) Autobus.frame.tableBusReservations.getValueAt(Autobus.frame.tableBusReservations.getSelectedRow(), 0);
               for (int i = 0; i < Autobus.frame.reservationsArchive.size(); i++) {
                  if (Autobus.frame.reservationsArchive.get(i).getReservationNumber() == reservationNumberOfCurrentlyUpdatingReservation) {
                     currentlyUpdatingBusReservation = (BusReservation) Autobus.frame.reservationsArchive.get(i);
                  }
               }
               
               // FILLING CUSTOMER INFORMATION
               phoneCustomerReservationUpdate.setText(currentlyUpdatingBusReservation.getCustomer().getPhonenumber());
               organisationNameReservationUpdate.setText(currentlyUpdatingBusReservation.getCustomer().getOrganisationName());
               nameCustomerReservationUpdate.setText(currentlyUpdatingBusReservation.getCustomer().getName());
               addressCustomerReservationUpdate.setText(currentlyUpdatingBusReservation.getCustomer().getAddress());
               emailCustomerReservationUpdate.setText(currentlyUpdatingBusReservation.getCustomer().getEmail());
               mmCustomerReservationUpdate.setText(Integer.toString(currentlyUpdatingBusReservation.getCustomer().getBirthday().getMonth()));
               ddCustomerReservationUpdate.setText(Integer.toString(currentlyUpdatingBusReservation.getCustomer().getBirthday().getDay()));
               yyyyCustomerReservationUpdate.setText(Integer.toString(currentlyUpdatingBusReservation.getCustomer().getBirthday().getYear()));
               companyRadioButtonReservationUpdate.setSelected(currentlyUpdatingBusReservation.getCustomer().getOrganisationName().equals("COMPANY"));
               privateRadioButtonReservationUpdate.setSelected(currentlyUpdatingBusReservation.getCustomer().getOrganisationName().equals("PRIVATE"));
               schoolRadioButtonReservationUpdate.setSelected(currentlyUpdatingBusReservation.getCustomer().getOrganisationName().equals("SCHOOL"));

               Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableSelectChauffeur.getModel());
               Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableSelectBus.getModel());
               Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableNewBusSelectChauffeur.getModel());
               Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableNewBusSelectBus.getModel());
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
      searchCustomerLabelReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This searches for customer by phone number and fills fields with the information if it was found
          */
         public void mouseReleased(MouseEvent arg0) {
            if (phoneCustomerReservationUpdate.getText().equalsIgnoreCase("")) {
               JOptionPane.showMessageDialog(null, "You need to fill in the phone number first!");
            } else {
               try {
                  int phone = Integer.parseInt(phoneCustomerReservationUpdate.getText());
                  if (!(10000000<phone&&phone<=99999999)) {
                     JOptionPane.showMessageDialog(null, "Phonenumber does not have 8 digits!");
                  } else {
                     for (int i =0; i<Autobus.frame.customersArchive.size();i++){
                        if (Autobus.frame.customersArchive.get(i).getPhonenumber().equalsIgnoreCase(phoneCustomerReservationUpdate.getText())){
                           organisationNameReservationUpdate.setText(Autobus.frame.customersArchive.get(i).getOrganisationName());
                           nameCustomerReservationUpdate.setText(Autobus.frame.customersArchive.get(i).getName());
                           addressCustomerReservationUpdate.setText(Autobus.frame.customersArchive.get(i).getAddress());
                           emailCustomerReservationUpdate.setText(Autobus.frame.customersArchive.get(i).getEmail());
                           mmCustomerReservationUpdate.setText(Integer.toString(Autobus.frame.customersArchive.get(i).getBirthday().getMonth()));
                           ddCustomerReservationUpdate.setText(Integer.toString(Autobus.frame.customersArchive.get(i).getBirthday().getDay()));
                           yyyyCustomerReservationUpdate.setText(Integer.toString(Autobus.frame.customersArchive.get(i).getBirthday().getYear()));
                           if (Autobus.frame.customersArchive.get(i).getOrganisationType().equalsIgnoreCase("PRIVATE")) {
                              companyRadioButtonReservationUpdate.setSelected(false);
                              privateRadioButtonReservationUpdate.setSelected(true);
                              schoolRadioButtonReservationUpdate.setSelected(false);
                           }
                           if (Autobus.frame.customersArchive.get(i).getOrganisationType().equalsIgnoreCase("COMPANY")) {
                              companyRadioButtonReservationUpdate.setSelected(true);
                              privateRadioButtonReservationUpdate.setSelected(false);
                              schoolRadioButtonReservationUpdate.setSelected(false);                       
                                                      }
                           if (Autobus.frame.customersArchive.get(i).getOrganisationType().equalsIgnoreCase("SCHOOL")) {
                              companyRadioButtonReservationUpdate.setSelected(false);
                              privateRadioButtonReservationUpdate.setSelected(false);
                              schoolRadioButtonReservationUpdate.setSelected(true);
                           }
                           break;
                        }
                        if (i==Autobus.frame.customersArchive.size()-1||Autobus.frame.customersArchive.size()==0) {
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
      customerClearLabelReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This clears all the fields in Customer
          */
         public void mouseReleased(MouseEvent arg0) {
            organisationNameReservationUpdate.setText("");
            nameCustomerReservationUpdate.setText("");
            addressCustomerReservationUpdate.setText("");
            emailCustomerReservationUpdate.setText("");
            mmCustomerReservationUpdate.setText("");
            ddCustomerReservationUpdate.setText("");
            yyyyCustomerReservationUpdate.setText("");
            phoneCustomerReservationUpdate.setText("");
            companyRadioButtonReservationUpdate.setSelected(false);
            privateRadioButtonReservationUpdate.setSelected(false);
            schoolRadioButtonReservationUpdate.setSelected(false);
            isPassengerCheckBox.setSelected(false);
         }
      });
      
      // IS A PASSENGER IN CUSTOMER
      isPassengerCheckBox.addActionListener(new ActionListener() {
         /**
          * This adds the customer as a passenger in the table
          */
         public void actionPerformed(ActionEvent e) {
            if (isPassengerCheckBox.isSelected()) {
               String str = new String();
               int month = 0;
               int day = 0;
               int year = 0;
               Calendar timeNow = Calendar.getInstance();
               int currentYear = timeNow.get(Calendar.YEAR);
               try {
                  int phone = Integer.parseInt(phoneCustomerReservationUpdate.getText());
                  if (!(10000000<phone&&phone<=99999999)) {
                     str+= "\nPhone number does not have 8 digits!";
                  }
               } catch (Exception e3) {
                  str+= "\nEntered phone number does not appear to be digits!";
               }
               if (organisationNameReservationUpdate.getText().equalsIgnoreCase("")) {
                  str+= "\nName/organisation cannot be empty!";
               }
               if (nameCustomerReservationUpdate.getText().equalsIgnoreCase("")){
                  str+= "\nName/contact cannot be empty!";
               }
               if (addressCustomerReservationUpdate.getText().equalsIgnoreCase("")) {
                  str+= "\nAddress cannot be empty!";
               }
               if (emailCustomerReservationUpdate.getText().equalsIgnoreCase("")){
                  str+= "\nEmail address cannot be empty!";
               }
               if (!(emailCustomerReservationUpdate.getText().contains("@")&&emailCustomerReservationUpdate.getText().contains("."))){
                  str+= "\nEmail address does not appear to be in correct format!";
               }

               try {
                  month = Integer.parseInt(mmCustomerReservationUpdate.getText());
                  if (month>12||month<1) str = str + "\nMonth does not seem to be a number between 1-12!";
               } catch (NumberFormatException e1) {
                  str = str + "\nMonth does not seem to be a number between 1-12!";
               }
               try {
                  day = Integer.parseInt(ddCustomerReservationUpdate.getText());
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
                  year = Integer.parseInt(yyyyCustomerReservationUpdate.getText());
                  if (year>currentYear||year<currentYear-120) str = str + "\nYear does not appear to be a valid number!";
               } catch (NumberFormatException e1) {
                  str = str + "\nYear does not appear to be a valid number!";
               }

               if (str.equalsIgnoreCase("")) {
                  Passenger newPassenger = null;
                  for (int i = 0; i < Autobus.frame.passengersArchive.size(); i++) {
                     if(Autobus.frame.passengersArchive.get(i).getPhonenumber().equals(phoneCustomerReservationUpdate.getText())
                             && Autobus.frame.passengersArchive.get(i).getName().equals(nameCustomerReservationUpdate.getText())) {
                        newPassenger = Autobus.frame.passengersArchive.get(i);
                        break;
                     }
                  }
                  if(newPassenger == null) {
                     Autobus.frame.passengersArchive.addPassenger(new Passenger(nameCustomerReservationUpdate.getText(), emailCustomerReservationUpdate.getText(), addressCustomerReservationUpdate.getText(), new Date(month, day, year), phoneCustomerReservationUpdate.getText()));
                     newPassenger = Autobus.frame.passengersArchive.get(Autobus.frame.passengersArchive.size() -1);
                  }
                  updatePassengerListNewBus(newPassenger);
               } else {
                  JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
                  isPassengerCheckBox.setSelected(false);
               }
            }
            else{
               for (int i = 0; i < Autobus.frame.passengersArchive.size(); i++) {
                  if(Autobus.frame.passengersArchive.get(i).getName().equals(nameCustomerReservationUpdate.getText()) && Autobus.frame.passengersArchive.get(i).getName().equals(nameCustomerReservationUpdate.getText())) {
                     Autobus.frame.passengersArchive.removePassenger(i);
                     break;
                  }
               }
               DefaultTableModel tableModel = (DefaultTableModel) tablePassengerReservationUpdate.getModel();
               for (int i = 0; i < tablePassengerReservationUpdate.getRowCount(); i++) {
                  if(tablePassengerReservationUpdate.getValueAt(i,0).equals(nameCustomerReservationUpdate.getText()) && tablePassengerReservationUpdate.getValueAt(i,2).equals(phoneCustomerReservationUpdate.getText())){
                     tableModel.removeRow(i);
                     break;
                  }
               }
            }
            try{
               Autobus.frame.passengersArchive.savePassengersArchive();
               Autobus.frame.listPassengers();
            }
            catch(Exception ex){
               ex.printStackTrace();
            }

         }
      });
   
      // ADDING NEW PASSENGER IN PASSENGER LIST
      addPassengerReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This adds a new Passenger to the list and checks if the information is filled correctly
          */
         public void mouseReleased(MouseEvent e) {
            String str = new String();
            int month = 0;
            int day = 0;
            int year = 0;
            Calendar timeNow = Calendar.getInstance();
            int currentYear = timeNow.get(Calendar.YEAR);
            try {
               int phone = Integer.parseInt(phonePassengerReservationUpdate.getText());
               if (!(10000000<phone&&phone<=99999999)) {
                  str+= "\nPhone number does not have 8 digits!";
               } 
            } catch (Exception e3) {
               str+= "\nEntered phone number does not appear to be digits!";
            }
            if (namePassengerReservationUpdate.getText().equalsIgnoreCase("")){
               str+= "\nName cannot be empty!";
            }
            if (addressPassengerReservationUpdate.getText().equalsIgnoreCase("")) {
               str+= "\nAddress cannot be empty!";
            }

            if (!(emailPassengerReservationUpdate.getText().contains("@")&&emailPassengerReservationUpdate.getText().contains("."))){
               str+= "\nEmail appears to be either empty or incorrect format!";
            }
         
            try {
               month = Integer.parseInt(mmPassengerReservationUpdate.getText());
               if (month>12||month<1) str = str + "\nMonth does not seem to be a number between 1-12!";
            } catch (NumberFormatException e1) {
               str = str + "\nMonth does not seem to be a number between 1-12!";
            }
            try {
               day = Integer.parseInt(ddPassengerReservationUpdate.getText());
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
               year = Integer.parseInt(yyyyPassengerReservationUpdate.getText());
               if (year>currentYear||year<currentYear-120) str = str + "\nYear does not appear to be a valid number!";
            } catch (NumberFormatException e1) {
               str = str + "\nYear does not appear to be a valid number!";
            }
            
            if (str.equalsIgnoreCase("")) {
               Autobus.frame.passengersArchive.addPassenger(new Passenger(namePassengerReservationUpdate.getText(),emailPassengerReservationUpdate.getText(), addressPassengerReservationUpdate.getText(), new Date(month,day,year),phonePassengerReservationUpdate.getText()));
               updatePassengerListNewBus(Autobus.frame.passengersArchive.get(Autobus.frame.passengersArchive.size() - 1));
               try{
                  Autobus.frame.passengersArchive.savePassengersArchive();
               }
               catch(Exception ex){
                  ex.printStackTrace();
               }
            } else {
               JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
            }        
         }
      });
      
      // CLEAR PASSENGER INFORMATION
      clearPassengerReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This clears all the fields in Passenger
          */
         public void mouseReleased(MouseEvent e) {
            phonePassengerReservationUpdate.setText("");
            namePassengerReservationUpdate.setText("");
            addressPassengerReservationUpdate.setText("");
            emailPassengerReservationUpdate.setText("");
            mmPassengerReservationUpdate.setText("");
            ddPassengerReservationUpdate.setText("");
            yyyyPassengerReservationUpdate.setText("");
         }
      });
      
      // SEARCH PASSENGER BY PHONE NUMBER
      searchPassengerReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This searches for Passenger by phone number and fills all the fields with the information in Passenger was found
          */
         public void mouseReleased(MouseEvent e) {
            if (phonePassengerReservationUpdate.getText().equalsIgnoreCase("")) {
               JOptionPane.showMessageDialog(null, "You need to fill in the phone number first!");
            } else {
               try {
                  int phone = Integer.parseInt(phonePassengerReservationUpdate.getText());
                  if (!(10000000<phone&&phone<=99999999)) {
                     JOptionPane.showMessageDialog(null, "Phonenumber does not have 8 digits!");
                  } else {
                     for (int i =0; i<Autobus.frame.passengersArchive.size();i++){
                        if (Autobus.frame.passengersArchive.get(i).getPhonenumber().equalsIgnoreCase(phonePassengerReservationUpdate.getText())){
                           updatePassengerListNewBus(Autobus.frame.passengersArchive.get(i));
                           break;
                        } 
                        if(i==Autobus.frame.passengersArchive.size()-1||Autobus.frame.passengersArchive.size()==0) {
                           JOptionPane.showMessageDialog(null, "No passenger match found!\nPlease fill in new passenger.");                           
                        }
                     }
                  }
               } catch (Exception e4) {
                  JOptionPane.showMessageDialog(null, "Entered phone number does not appear to be digits!");
               }
            }
         }
      });
      
      // REMOVE SELECTED PASSENGER
      removePassengerReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This removes selected Passenger from the table
          */
         public void mouseReleased(MouseEvent e) {
            
            int index = tablePassengerReservationUpdate.getSelectedRow();
            DefaultTableModel tablePassengersModelInNewBusReservation = (DefaultTableModel) tablePassengerReservationUpdate.getModel();
            if (index!=-1){
               if (Autobus.okOrCancel("Are you sure you want to remove this passenger from the list?")==0) {
                  tablePassengersModelInNewBusReservation.removeRow(index);
                  
               }
            }
            else {
               JOptionPane.showMessageDialog(null, "You need to select the passenger you wish to remove!");
            }
         }
      });
      
      // CLEAR ALL PASSENGERS FROM PASSENGERS TABLE
      clearAllPassengersReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This clears all the Passengers from the Passengers table
          */
         public void mouseReleased(MouseEvent arg0) {
            if (Autobus.okOrCancel("Are you sure you want to clear the list of the selected passengers?")==0) {
               newTablePassengerReservationUpdate = (DefaultTableModel) tablePassengerReservationUpdate.getModel();
               newTablePassengerReservationUpdate.setRowCount(0);
               isPassengerCheckBox.setSelected(false);
            }
         }
      });
      
      // >>NEXT BUTTON
      nextReservationUpdate.addMouseListener(new MouseAdapter() {
         
         @Override
         /**
          * This checks if all the fields where filled correctly and update summary new Bus
          */
         public void mouseReleased(MouseEvent e) {
            String str = new String();
            int month = 0;
            int day = 0;
            int year = 0;
            Calendar timeNow = Calendar.getInstance();
            int currentYear = timeNow.get(Calendar.YEAR);
            try {
               int phone = Integer.parseInt(phoneCustomerReservationUpdate.getText());
               if (!(10000000<phone&&phone<=99999999)) {
                  str+= "\nCustomer phone number does not have 8 digits!";
               } 
            } catch (Exception e3) {
               str+= "\nEntered customer phone number does not appear to be digits!";
            }
            if (organisationNameReservationUpdate.getText().equalsIgnoreCase("")) {
               str+= "\nCustomer name/organisation cannot be empty!";
            }
            if (nameCustomerReservationUpdate.getText().equalsIgnoreCase("")){
               str+= "\nCustomer name/contact cannot be empty!";
            }
            if (addressCustomerReservationUpdate.getText().equalsIgnoreCase("")) {
               str+= "\nCustomer address cannot be empty!";
            }
            if (emailCustomerReservationUpdate.getText().equalsIgnoreCase("")){
               str+= "\nCustomer email address cannot be empty!";
            }
            if (!(emailCustomerReservationUpdate.getText().contains("@")&&emailCustomerReservationUpdate.getText().contains("."))){
               str+= "\nCustomer email address does not appear to be in correct format!";
            }
         
            try {
               month = Integer.parseInt(mmCustomerReservationUpdate.getText());
               if (month>12||month<1) str = str + "\nCustomer birth month does not seem to be a number between 1-12!";
            } catch (NumberFormatException e1) {
               str = str + "\nCustomer birth month does not seem to be a number between 1-12!";
            }
            try {
               day = Integer.parseInt(ddCustomerReservationUpdate.getText());
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
               year = Integer.parseInt(yyyyCustomerReservationUpdate.getText());
               if (year>currentYear-15) str = str + "\nCustomer birth year: Must be at least 15!";
               if (year<currentYear-120) str = str + "\nCustomer birth year: Cannot be over 120 years old!";
            } catch (NumberFormatException e1) {
               str = str + "\nCustomer birth year does not appear to be a valid number!";
            }
            
            if (tablePassengerReservationUpdate.getRowCount()==0){
               str+= "\nYou did not add any passengers to the list!";
            }
            
            if (str.equalsIgnoreCase("")) {
               listElements();
               int durationInHours =   (int)((currentlyUpdatingBusReservation.getNewDateInterval()[1].getTime() -
                       currentlyUpdatingBusReservation.getNewDateInterval()[0].getTime()) / 3600000);
               listNewBusSelectChauffeur(currentlyUpdatingBusReservation.getNewDateInterval()[0], durationInHours);
               listNewBusSelectBus(currentlyUpdatingBusReservation.getNewDateInterval()[0], durationInHours);
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
      
      // CLEAR BUTTON IN ADD PASSENGER
      clearPassengerReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This clears all the fields in add Passenger
          */
         public void mouseReleased(MouseEvent e) {
            phonePassengerReservationUpdate.setText("");
            namePassengerReservationUpdate.setText("");
            addressPassengerReservationUpdate.setText("");
            emailPassengerReservationUpdate.setText("");
            mmPassengerReservationUpdate.setText("");
            ddPassengerReservationUpdate.setText("");
            yyyyPassengerReservationUpdate.setText("");
         }
      });
      
      // REMOVE BUTTON IN PASSENGERS LIST
      removePassengerReservationUpdate.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This removes thisPassenger from the table 
          */
         public void mouseReleased(MouseEvent e) {
            newTablePassengerReservationUpdate = (DefaultTableModel) tablePassengerReservationUpdate.getModel(); 
            int index = tablePassengerReservationUpdate.getSelectedRow(); 
            if (index!=-1){
               if (Autobus.okOrCancel("Are you sure you want to remove this passenger from the list?")==0) {
                  newTablePassengerReservationUpdate.removeRow(index);                       
               }
            } else {
               JOptionPane.showMessageDialog(null, "You need first to select the passenger you wish to remove!");
            }
         }
      });
      
      // UPDATE SELECT BUS TABLE FROM NEXT
      updateBusReservationsNext.lblSelectBusUpdBusResButton.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This updates the new information for this Bus Reservation
          */
         public void mouseReleased(MouseEvent e) {
            updateSummaryNewBus();
         }
      });
      
     
      
      // CANCEL IN NEXT
      updateBusReservationsNext.cancelLabelNext.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This clears all fields and shows panel
          */
         public void mouseReleased(MouseEvent e) {
            try {
               Autobus.frame.reservationNumberGenerator.cancelReservationNumber();
               addressCustomerReservationUpdate.setText("");
               ddCustomerReservationUpdate.setText("");
               mmCustomerReservationUpdate.setText("");
               yyyyCustomerReservationUpdate.setText("");
               emailCustomerReservationUpdate.setText("");
               nameCustomerReservationUpdate.setText("");
               phoneCustomerReservationUpdate.setText("");
               addressPassengerReservationUpdate.setText("");
               ddPassengerReservationUpdate.setText("");
               mmPassengerReservationUpdate.setText("");
               yyyyPassengerReservationUpdate.setText("");
               emailPassengerReservationUpdate.setText("");
               namePassengerReservationUpdate.setText("");
               phonePassengerReservationUpdate.setText("");
               newTablePassengerReservationUpdate = (DefaultTableModel) tablePassengerReservationUpdate.getModel(); 
               newTablePassengerReservationUpdate.setRowCount(0);
               isPassengerCheckBox.setSelected(false);
               companyRadioButtonReservationUpdate.setSelected(false);
               privateRadioButtonReservationUpdate.setSelected(false);
               schoolRadioButtonReservationUpdate.setSelected(false);
               organisationNameReservationUpdate.setText("");
               updateBusReservationsNext.endDayNext.setText("");
               updateBusReservationsNext.endMonthNext.setText("");
               updateBusReservationsNext.endYearNext.setText("");
               updateBusReservationsNext.startDayNext.setText("");
               updateBusReservationsNext.startMonthNext.setText("");
               updateBusReservationsNext.startYearNext.setText("");
               Autobus.frame.hideAllPanels();
               panel.setVisible(true);
            } catch (Exception e1) {
   
               e1.printStackTrace();
            }
         }
      });
      
      // DATE INTERVAL SEARCH BUTTON
      updateBusReservationsNext.searchLabelNext.addMouseListener(new MouseAdapter() {
         /**
          * This searches and lists available Buses and Chauffeurs according to Date Interval
          */
         @Override
         public void mouseReleased(MouseEvent e) {
            String str = new String("");
            int monthStart = 0;
            int monthEnd = 0;
            int dayStart = 0;
            int dayEnd = 0;
            int yearStart = 0;
            int yearEnd = 0;
            int hourStart =0;
            int hourEnd =0;
            int minuteStart =0;
            int minuteEnd = 0;
            java.util.Date startDate = null;
            java.util.Date endDate = null;
            //int dayCount = -1;
            //int workHoursPerDay = 8; //for calculating price per passenger (8 hours per day * price per hour = day price)
            Calendar timeNow = Calendar.getInstance();
            int currentYear = timeNow.get(Calendar.YEAR);
            try {
               monthStart = Integer.parseInt(updateBusReservationsNext.startMonthNext.getText());
               if (monthStart>12||monthStart<1) str = str + "\nStart month does not seem to be a number between 1-12!";
            } catch (NumberFormatException e1) {
               str = str + "\nStart month does not seem to be a number between 1-12!";
            }
            try {
               dayStart = Integer.parseInt(updateBusReservationsNext.startDayNext.getText());
               if (monthStart==1||monthStart==3||monthStart==5||monthStart==7||monthStart==8||monthStart==10||monthStart==12) {
                  if (!(1<=dayStart&&dayStart<=31)) {
                     str = str + "\nStart day does not seem to be a number between 1-31!";
                  }
               } else if (monthStart==2){
                  if (!(1<=dayStart&&dayStart<=28)) {
                     str = str + "\nStart day does not seem to be a number between 1-28!";
                  }
               } else if (monthStart==4||monthStart==6||monthStart==9||monthStart==11){
                  if (!(1<=dayStart&&dayStart<=30)) {
                     str = str + "\nStart day does not seem to be a number between 1-30!";
                  }
               }
            } catch (NumberFormatException e1) {
               str = str + "\nStart day does not seem to be a number between 1-31!";
            }
            try {
               yearStart = Integer.parseInt(updateBusReservationsNext.startYearNext.getText());
               if (yearStart<currentYear) str = str + "\nStart year does not appear to be a valid number!";
            } catch (NumberFormatException e1) {
               str = str + "\nStart year does not appear to be a valid number!";
            }
            try {
               monthEnd = Integer.parseInt(updateBusReservationsNext.endMonthNext.getText());
               if (monthEnd>12||monthEnd<1) str = str + "\nEnd month does not seem to be a number between 1-12!";
            } catch (NumberFormatException e1) {
               str = str + "\nEndt month does not seem to be a number between 1-12!";
            }
            try {
               dayEnd = Integer.parseInt(updateBusReservationsNext.endDayNext.getText());
               if (monthEnd==1||monthEnd==3||monthEnd==5||monthEnd==7||monthEnd==8||monthEnd==10||monthEnd==12) {
                  if (!(1<=dayEnd&&dayEnd<=31)) {
                     str = str + "\nEnd day does not seem to be a number between 1-31!";
                  }
               } else if (monthEnd==2){
                  if (!(1<=dayEnd&&dayEnd<=28)) {
                     str = str + "\nEnd day does not seem to be a number between 1-28!";
                  }
               } else if (monthEnd==4||monthEnd==6||monthEnd==9||monthEnd==11){
                  if (!(1<=dayEnd&&dayEnd<=30)) {
                     str = str + "\nEnd day does not seem to be a number between 1-30!";
                  }
               }
            } catch (NumberFormatException e1) {
               str = str + "\nEnd day does not seem to be a number between 1-31!";
            }
            try {
               yearEnd = Integer.parseInt(updateBusReservationsNext.endYearNext.getText());
               if (yearEnd<currentYear) str = str + "\nEnd year does not appear to be a valid number!";
            } catch (NumberFormatException e1) {
               str = str + "\nEnd year does not appear to be a valid number!";
            }
            try {
               hourStart= Integer.parseInt(updateBusReservationsNext.startHourNext.getText());
               if (hourStart<0 && hourStart > 23) str = str + "\nStart hour does not appear to be a number between 0-23!";
            } catch (NumberFormatException e1) {
               str = str + "\nStart hour does not appear to be a valid number!";
            }
            try {
               hourEnd= Integer.parseInt(updateBusReservationsNext.endHourNext.getText());
               if (hourEnd<0 && hourEnd > 23) str = str + "\nEnd hour does not appear to be a number between 0-23!";
            } catch (NumberFormatException e1) {
               str = str + "\nEnd hour does not appear to be a valid number!";
            }
            try {
               minuteStart= Integer.parseInt(updateBusReservationsNext.startMinuteNext.getText());
               if (minuteStart<0 && minuteStart > 59) str = str + "\nStart minute does not appear to be a number between 0-59!";
            } catch (NumberFormatException e1) {
               str = str + "\nStart minute does not appear to be a valid number!";
            }
            try {
               minuteEnd= Integer.parseInt(updateBusReservationsNext.endMinuteNext.getText());
               if (minuteEnd<0 && minuteEnd> 59) str = str + "\nEnd minute does not appear to be a number between 0-59!";
            } catch (NumberFormatException e1) {
               str = str + "\nEnd minute does not appear to be a valid number!";
            }
            if(str.equals("")){
               startDate = parseDate(yearStart+"-" + monthStart + "-" + dayStart + "-" + hourStart + "-" + minuteStart);
               endDate = parseDate(yearEnd+"-" + monthEnd + "-" + dayEnd+ "-" + hourEnd + "-" + minuteEnd);
               listNewBusSelectBus(startDate, (int)((endDate.getTime() - startDate.getTime()) / 3600000));
               listNewBusSelectChauffeur(startDate, (int)((endDate.getTime() - startDate.getTime()) / 3600000));
            }
            else{
               JOptionPane.showMessageDialog(null, "Some of the fields were filled incorrectly:" + str);
            }
         }
      });
   }
   
   // GUI STUFF
   public UpdateBusReservations() {
      
      panel = new JPanel();
      panel.setBackground(new Color(95, 158, 160));
      
      panel_1 = new JPanel();
      panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Customer", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
      panel_1.setBackground(new Color(95, 158, 160));
      
      label = new JLabel("Phone");
      label.setForeground(Color.WHITE);
      label.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      phoneCustomerReservationUpdate = new JTextField();
      phoneCustomerReservationUpdate.setForeground(Color.WHITE);
      phoneCustomerReservationUpdate.setColumns(10);
      phoneCustomerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      searchCustomerLabelReservationUpdate = new JLabel("Search");
      searchCustomerLabelReservationUpdate.setForeground(Color.WHITE);
      searchCustomerLabelReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      searchCustomerLabelReservationUpdate.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
      
      customerClearLabelReservationUpdate = new JLabel("Clear");
      customerClearLabelReservationUpdate.setForeground(Color.WHITE);
      customerClearLabelReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      customerClearLabelReservationUpdate.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      isPassengerCheckBox = new JCheckBox("is a passenger");
      isPassengerCheckBox.setForeground(Color.WHITE);
      isPassengerCheckBox.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      isPassengerCheckBox.setBackground(new Color(95, 158, 160));
      
      companyRadioButtonReservationUpdate = new JRadioButton("Company");
      companyRadioButtonReservationUpdate.setForeground(Color.WHITE);
      companyRadioButtonReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      companyRadioButtonReservationUpdate.setBackground(new Color(95, 158, 160));
      
      schoolRadioButtonReservationUpdate = new JRadioButton("School");
      schoolRadioButtonReservationUpdate.setForeground(Color.WHITE);
      schoolRadioButtonReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      schoolRadioButtonReservationUpdate.setBackground(new Color(95, 158, 160));
      
      privateRadioButtonReservationUpdate = new JRadioButton("Private");
      privateRadioButtonReservationUpdate.setForeground(Color.WHITE);
      privateRadioButtonReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      privateRadioButtonReservationUpdate.setBackground(new Color(95, 158, 160));
      
      label_3 = new JLabel("Name/contact");
      label_3.setForeground(Color.WHITE);
      label_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      nameCustomerReservationUpdate = new JTextField();
      nameCustomerReservationUpdate.setSelectionColor(new Color(102, 205, 170));
      nameCustomerReservationUpdate.setForeground(Color.WHITE);
      nameCustomerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      nameCustomerReservationUpdate.setColumns(10);
      nameCustomerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      label_4 = new JLabel("Name/organisation");
      label_4.setForeground(Color.WHITE);
      label_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      organisationNameReservationUpdate = new JTextField();
      organisationNameReservationUpdate.setSelectionColor(new Color(102, 205, 170));
      organisationNameReservationUpdate.setForeground(Color.WHITE);
      organisationNameReservationUpdate.setColumns(10);
      organisationNameReservationUpdate.setBackground(new Color(95, 158, 160));
      
      label_5 = new JLabel("Email");
      label_5.setForeground(Color.WHITE);
      label_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      emailCustomerReservationUpdate = new JTextField();
      emailCustomerReservationUpdate.setForeground(Color.WHITE);
      emailCustomerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      emailCustomerReservationUpdate.setColumns(10);
      emailCustomerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      label_6 = new JLabel("Address");
      label_6.setForeground(Color.WHITE);
      label_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      addressCustomerReservationUpdate = new JTextField();
      addressCustomerReservationUpdate.setSelectionColor(new Color(102, 205, 170));
      addressCustomerReservationUpdate.setForeground(Color.WHITE);
      addressCustomerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      addressCustomerReservationUpdate.setColumns(10);
      addressCustomerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      label_7 = new JLabel("Birthday");
      label_7.setForeground(Color.WHITE);
      label_7.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      mmCustomerReservationUpdate = new JTextField();
      mmCustomerReservationUpdate.setForeground(Color.WHITE);
      mmCustomerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      mmCustomerReservationUpdate.setColumns(10);
      mmCustomerReservationUpdate.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      mmCustomerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      ddCustomerReservationUpdate = new JTextField();
      ddCustomerReservationUpdate.setForeground(Color.WHITE);
      ddCustomerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      ddCustomerReservationUpdate.setColumns(10);
      ddCustomerReservationUpdate.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      ddCustomerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      yyyyCustomerReservationUpdate = new JTextField();
      yyyyCustomerReservationUpdate.setForeground(Color.WHITE);
      yyyyCustomerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      yyyyCustomerReservationUpdate.setColumns(10);
      yyyyCustomerReservationUpdate.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      yyyyCustomerReservationUpdate.setBackground(new Color(95, 158, 160));
      gl_panel_1 = new GroupLayout(panel_1);
      gl_panel_1.setHorizontalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                  .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                     .addComponent(label)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(phoneCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                     .addComponent(searchCustomerLabelReservationUpdate))
                  .addGroup(gl_panel_1.createSequentialGroup()
                     .addComponent(customerClearLabelReservationUpdate)
                     .addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                     .addComponent(isPassengerCheckBox))
                  .addGroup(gl_panel_1.createSequentialGroup()
                     .addComponent(companyRadioButtonReservationUpdate)
                     .addGap(18)
                     .addComponent(schoolRadioButtonReservationUpdate)
                     .addGap(18)
                     .addComponent(privateRadioButtonReservationUpdate))
                  .addGroup(gl_panel_1.createSequentialGroup()
                     .addComponent(label_4)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(organisationNameReservationUpdate, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
                  .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
                     .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_7)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(mmCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(ddCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(yyyyCustomerReservationUpdate, 0, 0, Short.MAX_VALUE))
                     .addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
                        .addComponent(label_3)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(nameCustomerReservationUpdate))
                     .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_6)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(addressCustomerReservationUpdate))
                     .addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
                        .addComponent(label_5)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(emailCustomerReservationUpdate, 238, 238, 238))))
               .addGap(24))
      );
      gl_panel_1.setVerticalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label)
                  .addComponent(phoneCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(searchCustomerLabelReservationUpdate))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_4)
                  .addComponent(organisationNameReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(companyRadioButtonReservationUpdate)
                  .addComponent(schoolRadioButtonReservationUpdate)
                  .addComponent(privateRadioButtonReservationUpdate))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_3)
                  .addComponent(nameCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_6)
                  .addComponent(addressCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_5)
                  .addComponent(emailCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_7)
                  .addComponent(mmCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(ddCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(yyyyCustomerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
               .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                  .addComponent(customerClearLabelReservationUpdate)
                  .addComponent(isPassengerCheckBox))
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
      
      emailPassengerReservationUpdate = new JTextField();
      emailPassengerReservationUpdate.setSelectionColor(new Color(102, 205, 170));
      emailPassengerReservationUpdate.setForeground(Color.WHITE);
      emailPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      emailPassengerReservationUpdate.setColumns(10);
      emailPassengerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      addressPassengerReservationUpdate = new JTextField();
      addressPassengerReservationUpdate.setSelectionColor(new Color(102, 205, 170));
      addressPassengerReservationUpdate.setForeground(Color.WHITE);
      addressPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      addressPassengerReservationUpdate.setColumns(10);
      addressPassengerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      label_10 = new JLabel("Phone");
      label_10.setForeground(Color.WHITE);
      label_10.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      label_11 = new JLabel("Name");
      label_11.setForeground(Color.WHITE);
      label_11.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      namePassengerReservationUpdate = new JTextField();
      namePassengerReservationUpdate.setSelectionColor(new Color(102, 205, 170));
      namePassengerReservationUpdate.setForeground(Color.WHITE);
      namePassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      namePassengerReservationUpdate.setColumns(10);
      namePassengerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      phonePassengerReservationUpdate = new JTextField();
      phonePassengerReservationUpdate.setSelectionColor(new Color(102, 205, 170));
      phonePassengerReservationUpdate.setForeground(Color.WHITE);
      phonePassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      phonePassengerReservationUpdate.setColumns(10);
      phonePassengerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      searchPassengerReservationUpdate = new JLabel("Search");
      searchPassengerReservationUpdate.setForeground(Color.WHITE);
      searchPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      searchPassengerReservationUpdate.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
      
      label_13 = new JLabel("Birthday");
      label_13.setForeground(Color.WHITE);
      label_13.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      mmPassengerReservationUpdate = new JTextField();
      mmPassengerReservationUpdate.setForeground(Color.WHITE);
      mmPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      mmPassengerReservationUpdate.setColumns(10);
      mmPassengerReservationUpdate.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      mmPassengerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      ddPassengerReservationUpdate = new JTextField();
      ddPassengerReservationUpdate.setForeground(Color.WHITE);
      ddPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      ddPassengerReservationUpdate.setColumns(10);
      ddPassengerReservationUpdate.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      ddPassengerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      yyyyPassengerReservationUpdate = new JTextField();
      yyyyPassengerReservationUpdate.setForeground(Color.WHITE);
      yyyyPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      yyyyPassengerReservationUpdate.setColumns(10);
      yyyyPassengerReservationUpdate.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      yyyyPassengerReservationUpdate.setBackground(new Color(95, 158, 160));
      
      clearPassengerReservationUpdate = new JLabel("Clear");
      clearPassengerReservationUpdate.setForeground(Color.WHITE);
      clearPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      clearPassengerReservationUpdate.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      addPassengerReservationUpdate = new JLabel("Add");
      addPassengerReservationUpdate.setForeground(Color.WHITE);
      addPassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      addPassengerReservationUpdate.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      GroupLayout gl_panel_2 = new GroupLayout(panel_2);
      gl_panel_2.setHorizontalGroup(
         gl_panel_2.createParallelGroup(Alignment.LEADING)
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
                              .addComponent(emailPassengerReservationUpdate, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                              .addComponent(addressPassengerReservationUpdate, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                        .addGroup(gl_panel_2.createSequentialGroup()
                           .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                              .addComponent(label_10)
                              .addComponent(label_11))
                           .addGap(27)
                           .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
                              .addComponent(namePassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                              .addGroup(gl_panel_2.createSequentialGroup()
                                 .addComponent(phonePassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(searchPassengerReservationUpdate))))))
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addGap(13)
                     .addComponent(label_13)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(mmPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(ddPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                     .addGap(14)
                     .addComponent(yyyyPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addGap(14)
                     .addComponent(clearPassengerReservationUpdate)
                     .addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                     .addComponent(addPassengerReservationUpdate)))
               .addContainerGap())
      );
      gl_panel_2.setVerticalGroup(
         gl_panel_2.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_2.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_10)
                  .addComponent(phonePassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(searchPassengerReservationUpdate))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_11)
                  .addComponent(namePassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_8)
                  .addComponent(addressPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_9)
                  .addComponent(emailPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(16)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(label_13)
                  .addComponent(mmPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(yyyyPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(ddPassengerReservationUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
               .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                  .addComponent(clearPassengerReservationUpdate)
                  .addComponent(addPassengerReservationUpdate))
               .addContainerGap())
      );
      panel_2.setLayout(gl_panel_2);
      
      removePassengerReservationUpdate = new JLabel("Remove");
      removePassengerReservationUpdate.setForeground(Color.WHITE);
      removePassengerReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      removePassengerReservationUpdate.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      clearAllPassengersReservationUpdate = new JLabel("Clear all");
      clearAllPassengersReservationUpdate.setForeground(Color.WHITE);
      clearAllPassengersReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      clearAllPassengersReservationUpdate.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      nextReservationUpdate = new JLabel("NEXT >>");
      nextReservationUpdate.setForeground(Color.WHITE);
      nextReservationUpdate.setFont(new Font("Century Gothic", Font.PLAIN, 18));
      
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
               .addComponent(lblNewBus, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
               .addGap(798))
      );
      gl_panel_3.setVerticalGroup(
         gl_panel_3.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_3.createSequentialGroup()
               .addComponent(lblNewBus, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
               .addGap(7))
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
                     .addComponent(removePassengerReservationUpdate)
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(clearAllPassengersReservationUpdate)
                     .addPreferredGap(ComponentPlacement.RELATED, 749, Short.MAX_VALUE)
                     .addComponent(nextReservationUpdate)
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
                           .addComponent(nextReservationUpdate)
                           .addComponent(removePassengerReservationUpdate))
                        .addComponent(clearAllPassengersReservationUpdate)))
                  .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
               .addContainerGap(415, Short.MAX_VALUE))
      );
      
      tablePassengerReservationUpdate = new JTable();
      tablePassengerReservationUpdate.setModel(new DefaultTableModel(
         new Object[][] {
         },
         new String[] {
            "Name", "Address", "Phone", "Email", "Birthday"
         }
      ));
      scrollPane.setViewportView(tablePassengerReservationUpdate);
      panel.setLayout(gl_panel);
      groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE)
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addComponent(panel, GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
               .addGap(0))
      );
      setLayout(groupLayout);
      createEventsForNewBusReservationUpdatePanel();
   }
   
   /**
    * This lists all Passengers in the table
    */
   public void listPassengers(){
      DefaultTableModel passengersTable = (DefaultTableModel) tablePassengerReservationUpdate.getModel();
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
   
   /**
    * This updates Passengers table after changes
    * @param newPassenger - new passenger 
    */
   public void updatePassengerListNewBus(Passenger newPassenger){
      newTablePassengerReservationUpdate = (DefaultTableModel) tablePassengerReservationUpdate.getModel();
      Object[] rowData = new Object[5];      
      rowData[0] = newPassenger.getName();
      rowData[1] = newPassenger.getAddress();
      rowData[2] = newPassenger.getPhonenumber();
      rowData[3] = newPassenger.getEmail();
      rowData[4] = newPassenger.getBirthday().displayDate();
      newTablePassengerReservationUpdate.addRow(rowData);
   }
   
   /**
    * This updates Bus table in >>NEXT 
    */
   public void updateSummaryNewBus(){
      String str = new String();
      str+= "Reservation#: "+Autobus.frame.reservationNumber;
      str+= "\n\nCustomer: "+organisationNameReservationUpdate.getText()+"\n";
      if (!privateRadioButtonReservationUpdate.isSelected()) {
         str+= "Contact name: "+nameCustomerReservationUpdate.getText()+"\n";
      }
      str+= addressCustomerReservationUpdate.getText()+"\nPhone: "+phoneCustomerReservationUpdate.getText()+"\n";
      str+= "\nPassengers: "+tablePassengerReservationUpdate.getRowCount();
      
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
         pricePerDay=Autobus.frame.busesArchive.getBusById(busSelected).getPricePerHour()*8;//price/hour * 8 working hours per day = price/day
         double totalPrice=0;
         int numberOfPassengers=tablePassengerReservationUpdate.getRowCount();
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
               pricePerDay+=numberOfPassengers*Autobus.frame.priceList.getPriceAllInclusive();
            }
            if (updateBusReservationsNext.breakfastCheckBoxNext.isSelected()){
               pricePerDay+=numberOfPassengers*Autobus.frame.priceList.getPriceBreakfast();
            }
            if (updateBusReservationsNext.lunchCheckBoxNext.isSelected()){
               pricePerDay+=numberOfPassengers*Autobus.frame.priceList.getPriceLunch();
            }
            totalPrice=daysCount*pricePerDay;
            if (updateBusReservationsNext.ticketsCheckBoxNext.isSelected()) {
               totalPrice+=Autobus.frame.priceList.getPriceEntranceTickets();
            }
            str+= "\n\nTotal price: "+round(totalPrice, 2) +"\n Total price per passenger: "+round(totalPrice/numberOfPassengers, 2);
         } else {
            str+= "\n - unable to calculate total price -\n";
         }
         
      }
      updateBusReservationsNext.summaryPaneNext.setText(str);
   }
   /**
    * This returns days between Dates according to the startDate and endDate
    * @param startDate - start Date
    * @param endDate - end Date
    * @return
    */
   public static int daysBetweenDates(java.util.Date startDate, java.util.Date endDate){
      long days = ChronoUnit.DAYS.between(startDate.toInstant(), endDate.toInstant());
      return (int)days;
   }
   /**
    * This setsScale according to the value and places and returnsIT
    * @param value - value
    * @param places - places
    * @return
    */
   public static double round(double value, int places) {
      if (places < 0) throw new IllegalArgumentException();
      BigDecimal bd = new BigDecimal(value);
      bd = bd.setScale(places, RoundingMode.HALF_UP);
      return bd.doubleValue();
  }
   /**
    * This returns parseDate
    * @param date - date
    * @return
    */
   public static java.util.Date parseDate(String date) {
      try {
         return new SimpleDateFormat("yyyy-MM-d-H-m").parse(date);
      } catch (ParseException e) {
         return null;
      }
   }
   /**
    * This lists Bus according to startDate and durationInHours
    * @param startDate - start date
    * @param durationInHours - duration in hours
    */
   public void listNewBusSelectBus(java.util.Date startDate, int durationInHours){
      newBusSelectBusTable = (DefaultTableModel) updateBusReservationsNext.tableSelectBusNext.getModel();
      deleteAllRows(newBusSelectBusTable);
      Object[] rowData = new Object[4];
      for (int i=0; i<Autobus.frame.busesArchive.size(); i++){
         if (updateBusReservationsNext.tableSelectBusNext.getRowCount()<= Autobus.frame.busesArchive.get(i).getMaxNumberOfSeats()
            &&(Autobus.frame.busesArchive.get(i).isAvailable(startDate, durationInHours))) {
            rowData[0] = Autobus.frame.busesArchive.get(i).getVehicleID();
            rowData[1] = Autobus.frame.busesArchive.get(i).getPricePerHour();
            rowData[2] = Autobus.frame.busesArchive.get(i).getMaxNumberOfSeats();
            rowData[3] = Autobus.frame.busesArchive.get(i).getModelString();
            newBusSelectBusTable.addRow(rowData);        
         }
      }
   }
   /**
    * This lists Chauffeur according to startDate and durationInHours
    * @param startDate - start date
    * @param durationInHours - duration in hours
    */
   public void listNewBusSelectChauffeur(java.util.Date startDate, int durationInHours ){
      newBusSelectChauffeurTable = (DefaultTableModel) updateBusReservationsNext.tableSelectChauffeurNext.getModel();
      deleteAllRows(newBusSelectChauffeurTable);
      Object[] rowData = new Object[2];
      for (int i=0; i<Autobus.frame.chauffeursArchive.size(); i++){
         if (Autobus.frame.chauffeursArchive.get(i).isAvailable(startDate, durationInHours)) {
            rowData[0] = Autobus.frame.chauffeursArchive.get(i).getEmployeeNumber();
            rowData[1] = Autobus.frame.chauffeursArchive.get(i).getName();
            newBusSelectChauffeurTable.addRow(rowData);
         }
      }
   }
   
   /**
    * This removes all elements from the row
    * @param model
    */
   public void deleteAllRows(final DefaultTableModel model) {
      for (int i = model.getRowCount() - 1; i >= 0; i--) {
         model.removeRow(i);
      }
   }

   /**
    * This list elements in >>NEXT
    */
   public void listElements(){

      Calendar cal = Calendar.getInstance();
      cal.setTime(currentlyUpdatingBusReservation.getNewDateInterval()[0]);
      int startMonth = cal.get(Calendar.MONTH) + 1;
      int startDay = cal.get(Calendar.DAY_OF_MONTH);
      int startYear = cal.get(Calendar.YEAR);
      int startHour = cal.get(Calendar.HOUR_OF_DAY);
      int startMinute = cal.get(Calendar.MINUTE);

      cal.setTime(currentlyUpdatingBusReservation.getNewDateInterval()[1]);
      int endMonth = cal.get(Calendar.MONTH) + 1;
      int endDay = cal.get(Calendar.DAY_OF_MONTH);
      int endYear = cal.get(Calendar.YEAR);
      int endHour = cal.get(Calendar.HOUR_OF_DAY);
      int endMinute = cal.get(Calendar.MINUTE);

      updateBusReservationsNext.startMonthNext.setText(String.valueOf(startMonth));
      updateBusReservationsNext.startDayNext.setText(String.valueOf(startDay));
      updateBusReservationsNext.startYearNext.setText(String.valueOf(startYear));
      updateBusReservationsNext.startHourNext.setText(String.valueOf(startHour));
      updateBusReservationsNext.startMinuteNext.setText(String.valueOf(startMinute));

      updateBusReservationsNext.endMonthNext.setText(String.valueOf(endMonth));
      updateBusReservationsNext.endDayNext.setText(String.valueOf(endDay));
      updateBusReservationsNext.endYearNext.setText(String.valueOf(endYear));
      updateBusReservationsNext.endHourNext.setText(String.valueOf(endHour));
      updateBusReservationsNext.endMinuteNext.setText(String.valueOf(endMinute));



      updateBusReservationsNext.breakfastCheckBoxNext.setSelected(currentlyUpdatingBusReservation.getServices().isBreakfastIncluded());
      updateBusReservationsNext.allInclusiveCheckBoxNext.setSelected(currentlyUpdatingBusReservation.getServices().isAllInclusive());
      updateBusReservationsNext.lunchCheckBoxNext.setSelected(currentlyUpdatingBusReservation.getServices().isLunchIncluded());
      updateBusReservationsNext.ticketsCheckBoxNext.setSelected(currentlyUpdatingBusReservation.getServices().isEntranceTickets());
   }
}
