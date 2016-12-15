package autoBus;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class UpdateTourPanel extends JPanel {
	/**
    * 
    */
   private static final long serialVersionUID = 1L;
   private final JList<String> list;
	private final JCheckBox ticketsUpdTour;
	private final JLabel lblAddNewPickUpButtonUpdTour;
	private final JLabel lblClearAllPickUpsButtonUpdTour;
	private final JCheckBox breakfastUpdTour;
	private final JCheckBox lunchUpdTour;
	private final JLabel lblSearchButtonUpdTour;
	private final JCheckBox allInclusiveUpdTour;
	private final JLabel lblSaveChangesButtonUpdTour;
	private Tour currentlyUpdatingTour;
	private JTextField endMonthUpdTour;
	private JTextField startmonthUpdTour;
	private JTextField endDayUpdTour;
	private JTextField startdayUpdTour;
	private JTextField startyearUpdTour;
	private JTextField endYearUpdTour;
	private JTextField destinationUpdTour;
	private JTextField pickUpTextFieldUpdTour;
	private JTextField endHourUpdTour;
	private JTextField endMinuteUpdTour;
	private JTextField starthourUpdTour;
	private JTextField startMinuteUpdTour;
	private JTable tableBusesUpdTour;
	private JTable tableChauffeursUpdTour;
	private JLabel lblCancelUpdateTourButton;

	/**
	 * All methods for Update Tour Panel
	 */
	public void createEvents(){

		
	   // START MONTH FIELD
	   startmonthUpdTour.getDocument().addDocumentListener(new DocumentListener() {
	      /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startmonthUpdTour field
          */
	      public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
	      /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startmonthUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startmonthUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}


		});

	   // START DAY FIELD
		startdayUpdTour.getDocument().addDocumentListener(new DocumentListener() {
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startdayUpdTour field
          */
		   public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startdayUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startdayUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// START YEAR FIELD
		startyearUpdTour.getDocument().addDocumentListener(new DocumentListener() {
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startyearUpdTour field
          */
		   public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startyearUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startyearUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// START HOUR FIELD
		starthourUpdTour.getDocument().addDocumentListener(new DocumentListener() {
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in starthourUpdTour field
          */
		   public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in starthourUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in starthourUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// START MINUTE FIELD
		startMinuteUpdTour.getDocument().addDocumentListener(new DocumentListener() {
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startMinuteUpdTour field
          */
		   public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startMinuteUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in startMinuteUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// END MONTH FIELD
		endMonthUpdTour.getDocument().addDocumentListener(new DocumentListener() {
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endMonthUpdTour field
          */
		   public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endMonthUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endMonthUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// END DAY FIELD
		endDayUpdTour.getDocument().addDocumentListener(new DocumentListener() {
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endDayUpdTour field
          */
		   public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endDayUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endDayUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// END YEAR FIELD
		endYearUpdTour.getDocument().addDocumentListener(new DocumentListener() {
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endYearUpdTour field
          */
		   public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
		   /**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endYearUpdTour field
          */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
          * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endYearUpdTour field
          */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// END HOUR FIELD
		/**
       * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endHourUpdTour field
       */
		endHourUpdTour.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
	       * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endHourUpdTour field
	       */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
	       * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endHourUpdTour field
	       */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});

		// END MINUTE FIELD
		/**
       * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endMinuteUpdTour field
       */
		endMinuteUpdTour.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
	       * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endMinuteUpdTour field
	       */
			public void insertUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());
			}
			/**
	       * Deletes all rows in tableBusUpdTour and tableChauffeursUpdTour tables after a symbols was added in endMinuteUpdTour field
	       */
			public void removeUpdate(DocumentEvent e) {
				Autobus.frame.deleteAllRows((DefaultTableModel) tableBusesUpdTour.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) tableChauffeursUpdTour.getModel());

			}

		});
		// SEARCH BUTTON BUTTON
		lblSearchButtonUpdTour.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * This searches for the suitable buses and chauffeurs according to destinationUpdTour, startmonthUpdTour, startdayUpdTour, startyearUpdTour, starthourUpdTour, startMinuteUpdTour, endMonthUpdTour, endDayUpdTour, endYearUpdTour, endHourUpdTour, endMinuteUpdTour fields, checks if the information was filled correctly. If some fields are wrong, a notification pops up and says what fields should be changed. Suitable buses and chauffeurs are listed in tableBusesUpdTour and tableChauffeursUpdTour tables after the button has been pressed
			 */
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
					monthStart = Integer.parseInt(startmonthUpdTour.getText());
					if (monthStart>12||monthStart<1) str = str + "\nStart month does not seem to be a number between 1-12!";
				} catch (NumberFormatException e1) {
					str = str + "\nStart month does not seem to be a number between 1-12!";
				}
				try {
					dayStart = Integer.parseInt(startdayUpdTour.getText());
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
					yearStart = Integer.parseInt(startyearUpdTour.getText());
					if (yearStart<currentYear) str = str + "\nStart year does not appear to be a valid number!";
				} catch (NumberFormatException e1) {
					str = str + "\nStart year does not appear to be a valid number!";
				}

				try {
					monthEnd = Integer.parseInt(endMonthUpdTour.getText());
					if (monthEnd>12||monthEnd<1) str = str + "\nEnd month does not seem to be a number between 1-12!";
				} catch (NumberFormatException e1) {
					str = str + "\nEndt month does not seem to be a number between 1-12!";
				}
				try {
					dayEnd = Integer.parseInt(endDayUpdTour.getText());
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
					yearEnd = Integer.parseInt(endYearUpdTour.getText());
					if (yearEnd<currentYear) str = str + "\nEnd year does not appear to be a valid number!";
				} catch (NumberFormatException e1) {
					str = str + "\nEnd year does not appear to be a valid number!";
				}
				try {
					hourStart= Integer.parseInt(starthourUpdTour.getText());
					if (hourStart<0 && hourStart > 23) str = str + "\nStart hour does not appear to be a number between 0-23!";
				} catch (NumberFormatException e1) {
					str = str + "\nStart hour does not appear to be a valid number!";
				}
				try {
					hourEnd= Integer.parseInt(endHourUpdTour.getText());
					if (hourEnd<0 && hourEnd > 23) str = str + "\nEnd hour does not appear to be a number between 0-23!";
				} catch (NumberFormatException e1) {
					str = str + "\nEnd hour does not appear to be a valid number!";
				}
				try {
					minuteStart= Integer.parseInt(startMinuteUpdTour.getText());
					if (minuteStart<0 && minuteStart > 59) str = str + "\nStart minute does not appear to be a number between 0-59!";
				} catch (NumberFormatException e1) {
					str = str + "\nStart minute does not appear to be a valid number!";
				}
				try {
					minuteEnd= Integer.parseInt(endMinuteUpdTour.getText());
					if (minuteEnd<0 && minuteEnd> 59) str = str + "\nEnd minute does not appear to be a number between 0-59!";
				} catch (NumberFormatException e1) {
					str = str + "\nEnd minute does not appear to be a valid number!";
				}
				if(str.equals("")){
					startDate = Autobus.parseDate(yearStart+"-" + monthStart + "-" + dayStart + "-" + hourStart + "-" + minuteStart);
					endDate = Autobus.parseDate(yearEnd+"-" + monthEnd + "-" + dayEnd+ "-" + hourEnd + "-" + minuteEnd);
					listBuses(startDate, (int)((endDate.getTime() - startDate.getTime()) / 3600000));
					listChauffeurs(startDate, (int)((endDate.getTime() - startDate.getTime()) / 3600000));
				}
				else{
					JOptionPane.showMessageDialog(null, "Some of the fields were filled incorrectly:" +str);
				}
			}
		});

		// ADD NEW PICK UP BUTTON
		lblAddNewPickUpButtonUpdTour.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Adds new pick up to the JList list, where are the pick ups are shown after the button has been pressed
			 */
			public void mouseReleased(MouseEvent arg0) {
				if (!pickUpTextFieldUpdTour.getText().equalsIgnoreCase("")) {
					updateListPickUps(pickUpTextFieldUpdTour.getText());
				}
			}
		});

		// CLEAR ALL PICK UP BUTTON
		lblClearAllPickUpsButtonUpdTour.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Clears all pick ups in JList list after the button has been pressed
			 */
			public void mouseReleased(MouseEvent e) {
				int index = list.getSelectedIndex();
				if (index!=-1){
					DefaultListModel<String> listModel = (DefaultListModel<String>)list.getModel();
					listModel.remove(index);
				} else {
					JOptionPane.showMessageDialog(null, "You need first to select the row you wish to delete!");
				}
			}
		});

		// SAVE CHANGES BUTTON
		lblSaveChangesButtonUpdTour.addMouseListener(new MouseAdapter() {
			/**
			 * This saves updated information according to destinationUpdTour, startmonthUpdTour, startdayUpdTour, startyearUpdTour, starthourUpdTour, startMinuteUpdTour, endMonthUpdTour, endDayUpdTour, endYearUpdTour, endHourUpdTour, endMinuteUpdTour fields, checks if the information was filled correctly. If some fields are wrong, a notification pops up and says what fields should be changed, hides all panels and shows panelTours panel after the button has been pressed 
			 */
		   public void mouseReleased(MouseEvent event) {
			   if (Autobus.okOrCancel("Are you sure you want to save these changes?") == 0) {
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
				   Date startDate = null;
				   Date endDate = null;
				   java.util.Date javastartDate = null;
				   java.util.Date javaendDate = null;
				   int dayCount = -1;
				   int workHoursPerDay = 8; //for calculating price per passenger (8 hours per day * price per hour = day price)
				   Calendar timeNow = Calendar.getInstance();
				   int currentYear = timeNow.get(Calendar.YEAR);
				   Services services = null;
				   try {
                       services = new Services();
                   } catch (Exception e2) {

                       e2.printStackTrace();
                   }
				   if (destinationUpdTour.getText().equalsIgnoreCase("")) {
                       str += "\nDestination cannot be empty!";
                   }

				   try {
                       monthStart = Integer.parseInt(startmonthUpdTour.getText());
                       if (monthStart>12||monthStart<1) str = str + "\nStart month does not seem to be a number between 1-12!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nStart month does not seem to be a number between 1-12!";
                   }
				   try {
                       dayStart = Integer.parseInt(startdayUpdTour.getText());
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
                       yearStart = Integer.parseInt(startyearUpdTour.getText());
                       if (yearStart<currentYear) str = str + "\nStart year does not appear to be a valid number!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nStart year does not appear to be a valid number!";
                   }

				   try {
                       monthEnd = Integer.parseInt(endMonthUpdTour.getText());
                       if (monthEnd>12||monthEnd<1) str = str + "\nEnd month does not seem to be a number between 1-12!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nEndt month does not seem to be a number between 1-12!";
                   }
				   try {
                       dayEnd = Integer.parseInt(endDayUpdTour.getText());
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
                       yearEnd = Integer.parseInt(endYearUpdTour.getText());
                       if (yearEnd<currentYear) str = str + "\nEnd year does not appear to be a valid number!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nEnd year does not appear to be a valid number!";
                   }
				   Bus bus;
				   if (tableBusesUpdTour.getSelectedRow()==-1){
                       bus = currentlyUpdatingTour.getBus();
                   }
                   else{
                       String strBus = (String)tableBusesUpdTour.getModel().getValueAt(tableBusesUpdTour.getSelectedRow(), 0);
                       bus = Autobus.frame.busesArchive.getBusById(strBus);
                   }
				   Chauffeur chauffeur;
				   if (tableChauffeursUpdTour.getSelectedRow()==-1){
                       chauffeur = currentlyUpdatingTour.getChauffeursObject();
                   }
                   else{
                       String strChauffeur =(String)tableChauffeursUpdTour.getModel().getValueAt(tableChauffeursUpdTour.getSelectedRow(), 0);
                       chauffeur = Autobus.frame.chauffeursArchive.getChauffeurById(strChauffeur);
                   }

				   if (yearEnd<yearStart){
                       str += "\nEnd year cannont be before start year!";
                   }
				   if (yearStart==yearEnd&&monthEnd<monthStart){
                       str += "\nEnd date must be after start date!";
                   }
				   if (yearStart==yearEnd&&monthStart==monthEnd&&dayStart>dayEnd){
                       str += "\nEnd date must be later than start date!";
                   }

				   SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
				   java.util.Date startRentDate = null, endRentDate = null, currentDate = new java.util.Date();

				   try {
                       startRentDate = dateformat.parse(dayStart+"/"+monthStart+"/"+yearStart);
                       endRentDate = dateformat.parse(dayEnd+"/"+monthEnd+"/"+yearEnd);
                   } catch (ParseException e) {

                       e.printStackTrace();
                   }
				   try {
                       hourStart= Integer.parseInt(starthourUpdTour.getText());
                       if (hourStart<0 && hourStart > 23) str = str + "\nStart hour does not appear to be a number between 0-23!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nStart hour does not appear to be a valid number!";
                   }
				   try {
                       hourEnd= Integer.parseInt(endHourUpdTour.getText());
                       if (hourEnd<0 && hourEnd > 23) str = str + "\nEnd hour does not appear to be a number between 0-23!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nEnd hour does not appear to be a valid number!";
                   }
				   try {
                       minuteStart= Integer.parseInt(startMinuteUpdTour.getText());
                       if (minuteStart<0 && minuteStart > 59) str = str + "\nStart minute does not appear to be a number between 0-59!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nStart minute does not appear to be a valid number!";
                   }
				   try {
                       minuteEnd= Integer.parseInt(endMinuteUpdTour.getText());
                       if (minuteEnd<0 && minuteEnd> 59) str = str + "\nEnd minute does not appear to be a number between 0-59!";
                   } catch (NumberFormatException e1) {
                       str = str + "\nEnd minute does not appear to be a valid number!";
                   }

				   if (str.equals("")) {
                       if (currentDate.equals(startRentDate)&&startRentDate.before(endRentDate)||currentDate.before(startRentDate)&&startRentDate.before(endRentDate)) {
                           dayCount = Autobus.daysBetweenDates(startRentDate, endRentDate);

                       }
                       startDate = new Date(monthStart, dayStart, yearStart);
                       endDate = new Date(monthEnd, dayEnd, yearEnd);
                       try {
                           /*!!!!!!*///Autobus.frame.toursArchive.addTour(new Tour(destinationUpdTour.getText()));
                       } catch (Exception e1) {

                           e1.printStackTrace();
                       }
                       DefaultListModel<String> listModel = (DefaultListModel<String>) list.getModel();
                       if (listModel.size()==0) {
                           currentlyUpdatingTour.clearPickUpPlaces();
                           currentlyUpdatingTour.setPickUpPlaces("");
                       }
                       else {
                           currentlyUpdatingTour.clearPickUpPlaces();
                           for (int i = 0; i < listModel.size(); i++) {
                               currentlyUpdatingTour.setPickUpPlaces((String) listModel.getElementAt(i));
                           }
                       }
                       javastartDate = Autobus.parseDate(yearStart+"-" + monthStart + "-" + dayStart + "-" + hourStart + "-" + minuteStart);
                       javaendDate = Autobus.parseDate(yearEnd+"-" + monthEnd + "-" + dayEnd+ "-" + hourEnd + "-" + minuteEnd);
                       Bus oldBus = currentlyUpdatingTour.getBus();
                       for (int i = 0; i < oldBus.getListOfStartEndDates().size(); i++) {
                           if(currentlyUpdatingTour.getNewDateInterval()[0].toString().equals(oldBus.getListOfStartEndDates().get(i)[0].toString())){
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
                       currentlyUpdatingTour.setBus(bus);
                       double price = Autobus.round((double)(bus.getPricePerHour()*workHoursPerDay*dayCount)/bus.getMaxNumberOfSeats(),2); //price per passenger rounded to 2 decimals
                       if (allInclusiveUpdTour.isSelected()){
                           price += dayCount*Autobus.frame.priceList.getPriceAllInclusive();
                           services.setAllInclusive(true);
                       }
                       if (breakfastUpdTour.isSelected()){
                           price += dayCount*Autobus.frame.priceList.getPriceBreakfast();
                           services.setBreakfastIncluded(true);
                       }
                       if (lunchUpdTour.isSelected()){
                           price += dayCount*Autobus.frame.priceList.getPriceLunch();
                           services.setLunchIncluded(true);
                       }
                       if (ticketsUpdTour.isSelected()){
                           price += Autobus.frame.priceList.getPriceEntranceTickets();
                           services.setEntranceTickets(true);
                       }
                       currentlyUpdatingTour.setPricePerPassenger(price);
                       currentlyUpdatingTour.setServices(services);

                       Chauffeur oldChauffeur = currentlyUpdatingTour.getChauffeursObject();
                       for (int i = 0; i < oldChauffeur.getListOfStartEndDates().size(); i++) {
                           if(currentlyUpdatingTour.getNewDateInterval()[0].toString().equals(oldChauffeur.getListOfStartEndDates().get(i)[0].toString())) {
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
                       currentlyUpdatingTour.setChauffeur(chauffeur);
                       currentlyUpdatingTour.setDateInterval(new DateInterval(startDate,endDate));
                       currentlyUpdatingTour.setNewDateInterval(new java.util.Date[]{javastartDate, javaendDate});
                       try {
                           Autobus.frame.toursArchive.saveToursArchive();
                       } catch (Exception e) {

                           e.printStackTrace();
                       }

                       Autobus.frame.listTours();
                       Autobus.frame.hideAllPanels();
                       Autobus.frame.panelTours.setVisible(true);



                   } else {
                       JOptionPane.showMessageDialog(null, "You have to fill out the fields correct:\n"+str);
                   }
			   }

		   }
		 });

		// UPDATE TOUR BUTTON
		Autobus.frame.lblUpdateTourButton.addMouseListener(new MouseAdapter() {
			/**
			 * This detects the row that was clicked in tableTours table hides, all panels and shows updateTourPanel after the button has been clicked
			 */
		   public void mouseReleased(MouseEvent event){
				currentlyUpdatingTour = Autobus.frame.toursArchive.get(Autobus.frame.tableTours.getSelectedRow());
				int durationInHours =   (int)((currentlyUpdatingTour.getNewDateInterval()[1].getTime() -
										currentlyUpdatingTour.getNewDateInterval()[0].getTime()) / 3600000);
				Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableSelectChauffeur.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableSelectBus.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableNewBusSelectChauffeur.getModel());
				Autobus.frame.deleteAllRows((DefaultTableModel) Autobus.frame.tableNewBusSelectBus.getModel());

				listBuses(currentlyUpdatingTour.getNewDateInterval()[0], durationInHours);
				listChauffeurs(currentlyUpdatingTour.getNewDateInterval()[0], durationInHours);
				listElements();
				Autobus.frame.hideAllPanels();
				Autobus.frame.updateTourPanel.setVisible(true);
			}
		});

		// CANCEL UPDATE BUTTON
		lblCancelUpdateTourButton.addMouseListener(new MouseAdapter() {
		   /**
		    * This hides all panels and returns to panelTours after the button has been clicked
		    */
			public void mouseReleased(MouseEvent event) {
				Autobus.frame.hideAllPanels();
				Autobus.frame.panelTours.setVisible(true);
			}
		});
	}
	
	// GUI STUFF
	public UpdateTourPanel() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		
		JPanel updateTourTopPanel = new JPanel();
		updateTourTopPanel.setBackground(new Color(0, 128, 128));
		
		JLabel lblUpdateTour = new JLabel("Update Tour");
		lblUpdateTour.setForeground(Color.WHITE);
		lblUpdateTour.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GroupLayout gl_updateTourTopPanel = new GroupLayout(updateTourTopPanel);
		gl_updateTourTopPanel.setHorizontalGroup(
			gl_updateTourTopPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1369, Short.MAX_VALUE)
				.addGroup(gl_updateTourTopPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUpdateTour, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1117, Short.MAX_VALUE))
		);
		gl_updateTourTopPanel.setVerticalGroup(
			gl_updateTourTopPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 58, Short.MAX_VALUE)
				.addGroup(gl_updateTourTopPanel.createSequentialGroup()
					.addComponent(lblUpdateTour, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		updateTourTopPanel.setLayout(gl_updateTourTopPanel);
		
		JPanel updateTourMainPanel = new JPanel();
		updateTourMainPanel.setForeground(Color.WHITE);
		updateTourMainPanel.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Change Tour", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
		updateTourMainPanel.setBackground(new Color(95, 158, 160));
		
		JLabel label_1 = new JLabel("End date:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		JLabel label_2 = new JLabel("Start date:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		endMonthUpdTour = new JTextField();
		endMonthUpdTour.setForeground(Color.WHITE);
		endMonthUpdTour.setColumns(10);
		endMonthUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		endMonthUpdTour.setBackground(new Color(95, 158, 160));
		
		startmonthUpdTour = new JTextField();
		startmonthUpdTour.setSelectionColor(new Color(102, 205, 170));
		startmonthUpdTour.setSelectedTextColor(Color.WHITE);
		startmonthUpdTour.setForeground(Color.WHITE);
		startmonthUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		startmonthUpdTour.setColumns(10);
		startmonthUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MM", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		startmonthUpdTour.setBackground(new Color(95, 158, 160));
		
		endDayUpdTour = new JTextField();
		endDayUpdTour.setForeground(Color.WHITE);
		endDayUpdTour.setColumns(10);
		endDayUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		endDayUpdTour.setBackground(new Color(95, 158, 160));
		
		startdayUpdTour = new JTextField();
		startdayUpdTour.setForeground(Color.WHITE);
		startdayUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		startdayUpdTour.setColumns(10);
		startdayUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "DD", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		startdayUpdTour.setBackground(new Color(95, 158, 160));
		
		startyearUpdTour = new JTextField();
		startyearUpdTour.setForeground(Color.WHITE);
		startyearUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		startyearUpdTour.setColumns(10);
		startyearUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		startyearUpdTour.setBackground(new Color(95, 158, 160));
		
		endYearUpdTour = new JTextField();
		endYearUpdTour.setForeground(Color.WHITE);
		endYearUpdTour.setColumns(10);
		endYearUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		endYearUpdTour.setBackground(new Color(95, 158, 160));
		
		JLabel label_3 = new JLabel("Destination:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		destinationUpdTour = new JTextField();
		destinationUpdTour.setSelectionColor(new Color(102, 205, 170));
		destinationUpdTour.setSelectedTextColor(Color.WHITE);
		destinationUpdTour.setForeground(Color.WHITE);
		destinationUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		destinationUpdTour.setColumns(10);
		destinationUpdTour.setBorder(new LineBorder(new Color(255, 255, 255)));
		destinationUpdTour.setBackground(new Color(95, 158, 160));
		
		JScrollPane selectBusScrollPaneUpdTour = new JScrollPane();
		selectBusScrollPaneUpdTour.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Select bus", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
		selectBusScrollPaneUpdTour.setBackground(new Color(95, 158, 160));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Select chauffeur", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
		scrollPane_1.setBackground(new Color(95, 158, 160));
		
		JSeparator separator = new JSeparator();
		
		 lblSearchButtonUpdTour = new JLabel("Search");
		lblSearchButtonUpdTour.setForeground(Color.WHITE);
		lblSearchButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSearchButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		 lblSaveChangesButtonUpdTour = new JLabel("Save Changes");
		lblSaveChangesButtonUpdTour.setForeground(Color.WHITE);
		lblSaveChangesButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSaveChangesButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		allInclusiveUpdTour = new JCheckBox("All inclusive");
		allInclusiveUpdTour.setForeground(Color.WHITE);
		allInclusiveUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		allInclusiveUpdTour.setBackground(new Color(95, 158, 160));
		
		 lunchUpdTour = new JCheckBox("Lunch");
		lunchUpdTour.setForeground(Color.WHITE);
		lunchUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lunchUpdTour.setBackground(new Color(95, 158, 160));
		
		 breakfastUpdTour = new JCheckBox("Breakfast");
		breakfastUpdTour.setForeground(Color.WHITE);
		breakfastUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		breakfastUpdTour.setBackground(new Color(95, 158, 160));
		
		 lblAddNewPickUpButtonUpdTour = new JLabel("Add");
		lblAddNewPickUpButtonUpdTour.setForeground(Color.WHITE);
		lblAddNewPickUpButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblAddNewPickUpButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		lblAddNewPickUpButtonUpdTour.setBackground(new Color(95, 158, 160));
		
		 lblClearAllPickUpsButtonUpdTour = new JLabel("Clear");
		lblClearAllPickUpsButtonUpdTour.setForeground(Color.WHITE);
		lblClearAllPickUpsButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblClearAllPickUpsButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		ticketsUpdTour = new JCheckBox("Entrance tickets");
		ticketsUpdTour.setForeground(Color.WHITE);
		ticketsUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		ticketsUpdTour.setBackground(new Color(95, 158, 160));
		
		pickUpTextFieldUpdTour = new JTextField();
		pickUpTextFieldUpdTour.setSelectionColor(new Color(102, 205, 170));
		pickUpTextFieldUpdTour.setSelectedTextColor(Color.WHITE);
		pickUpTextFieldUpdTour.setForeground(Color.WHITE);
		pickUpTextFieldUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		pickUpTextFieldUpdTour.setColumns(10);
		pickUpTextFieldUpdTour.setBorder(new LineBorder(new Color(255, 255, 255)));
		pickUpTextFieldUpdTour.setBackground(new Color(95, 158, 160));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setForeground(Color.WHITE);
		scrollPane_2.setBorder(null);
		scrollPane_2.setBackground(new Color(95, 158, 160));
		
		endHourUpdTour = new JTextField();
		endHourUpdTour.setSelectionColor(new Color(102, 205, 170));
		endHourUpdTour.setSelectedTextColor(Color.WHITE);
		endHourUpdTour.setForeground(Color.WHITE);
		endHourUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		endHourUpdTour.setColumns(10);
		endHourUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "HH", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		endHourUpdTour.setBackground(new Color(95, 158, 160));
		
		endMinuteUpdTour = new JTextField();
		endMinuteUpdTour.setSelectionColor(new Color(102, 205, 170));
		endMinuteUpdTour.setSelectedTextColor(Color.WHITE);
		endMinuteUpdTour.setForeground(Color.WHITE);
		endMinuteUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		endMinuteUpdTour.setColumns(10);
		endMinuteUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MIN", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		endMinuteUpdTour.setBackground(new Color(95, 158, 160));
		
		starthourUpdTour = new JTextField();
		starthourUpdTour.setSelectionColor(new Color(102, 205, 170));
		starthourUpdTour.setSelectedTextColor(Color.WHITE);
		starthourUpdTour.setForeground(Color.WHITE);
		starthourUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		starthourUpdTour.setColumns(10);
		starthourUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "HH", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		starthourUpdTour.setBackground(new Color(95, 158, 160));
		
		startMinuteUpdTour = new JTextField();
		startMinuteUpdTour.setSelectionColor(new Color(102, 205, 170));
		startMinuteUpdTour.setSelectedTextColor(Color.WHITE);
		startMinuteUpdTour.setForeground(Color.WHITE);
		startMinuteUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		startMinuteUpdTour.setColumns(10);
		startMinuteUpdTour.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "MIN", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		startMinuteUpdTour.setBackground(new Color(95, 158, 160));
		
		lblCancelUpdateTourButton = new JLabel("Cancel");
		lblCancelUpdateTourButton.setForeground(Color.WHITE);
		lblCancelUpdateTourButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblCancelUpdateTourButton.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		GroupLayout gl_updateTourMainPanel = new GroupLayout(updateTourMainPanel);
		gl_updateTourMainPanel.setHorizontalGroup(
			gl_updateTourMainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateTourMainPanel.createSequentialGroup()
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateTourMainPanel.createSequentialGroup()
							.addGap(379)
							.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_updateTourMainPanel.createSequentialGroup()
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(endMonthUpdTour, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_updateTourMainPanel.createSequentialGroup()
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(startmonthUpdTour, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_3))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_updateTourMainPanel.createSequentialGroup()
									.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_updateTourMainPanel.createSequentialGroup()
											.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.TRAILING)
												.addComponent(startdayUpdTour, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
												.addComponent(endDayUpdTour, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_updateTourMainPanel.createSequentialGroup()
													.addComponent(endYearUpdTour, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(endHourUpdTour, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_updateTourMainPanel.createSequentialGroup()
													.addComponent(startyearUpdTour, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(starthourUpdTour, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
										.addComponent(destinationUpdTour, 193, 193, 193)
										.addComponent(separator, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(startMinuteUpdTour, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(endMinuteUpdTour, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_updateTourMainPanel.createSequentialGroup()
										.addGap(12)
										.addComponent(lblAddNewPickUpButtonUpdTour)
										.addGap(18)
										.addComponent(lblClearAllPickUpsButtonUpdTour))
									.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
									.addComponent(pickUpTextFieldUpdTour))))
						.addGroup(gl_updateTourMainPanel.createSequentialGroup()
							.addGap(568)
							.addComponent(lblSearchButtonUpdTour, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateTourMainPanel.createSequentialGroup()
							.addGap(196)
							.addComponent(selectBusScrollPaneUpdTour, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)))
					.addGap(421))
				.addGroup(Alignment.TRAILING, gl_updateTourMainPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCancelUpdateTourButton)
					.addPreferredGap(ComponentPlacement.RELATED, 1263, Short.MAX_VALUE)
					.addComponent(lblSaveChangesButtonUpdTour)
					.addContainerGap())
				.addGroup(gl_updateTourMainPanel.createSequentialGroup()
					.addGap(398)
					.addComponent(lunchUpdTour)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(breakfastUpdTour)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(allInclusiveUpdTour)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(ticketsUpdTour)
					.addContainerGap(678, Short.MAX_VALUE))
		);
		gl_updateTourMainPanel.setVerticalGroup(
			gl_updateTourMainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateTourMainPanel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(destinationUpdTour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(startMinuteUpdTour, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(starthourUpdTour, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(startdayUpdTour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startmonthUpdTour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(startyearUpdTour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(endMonthUpdTour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endDayUpdTour, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(endYearUpdTour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(endHourUpdTour, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(endMinuteUpdTour, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addGap(18)
					.addComponent(lblSearchButtonUpdTour, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(selectBusScrollPaneUpdTour, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(pickUpTextFieldUpdTour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblClearAllPickUpsButtonUpdTour, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddNewPickUpButtonUpdTour))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(ticketsUpdTour)
						.addComponent(allInclusiveUpdTour)
						.addComponent(breakfastUpdTour)
						.addComponent(lunchUpdTour))
					.addGap(16)
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSaveChangesButtonUpdTour)
						.addComponent(lblCancelUpdateTourButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(13))
		);
		
		 list = new JList<String>();
		scrollPane_2.setViewportView(list);
		list.setModel(new DefaultListModel<String>());
		
		tableChauffeursUpdTour = new JTable();
		tableChauffeursUpdTour.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name"
			}
		) {
			/**
          * 
          */
         private static final long serialVersionUID = 1L;
         boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(tableChauffeursUpdTour);
		
		tableBusesUpdTour = new JTable();
		tableBusesUpdTour.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Type", "Seats"
			}
		) {
			/**
          * 
          */
         private static final long serialVersionUID = 1L;
         boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		selectBusScrollPaneUpdTour.setViewportView(tableBusesUpdTour);
		updateTourMainPanel.setLayout(gl_updateTourMainPanel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(updateTourTopPanel, GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE)
					.addGap(0))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(updateTourMainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(38))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(updateTourTopPanel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(updateTourMainPanel, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
					.addGap(35))
		);
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
					.addGap(11))
		);
		setLayout(groupLayout);
		this.createEvents();
	}
	
	/**
	 * This lists all Buses in table from ChauffeursArchive according to startmonthUpdTour, startdayUpdTour, startyearUpdTour, starthourUpdTour, startMinuteUpdTour, endMonthUpdTour, endDayUpdTour, endYearUpdTour, endHourUpdTour, endMinuteUpdTour fields after the button has been pressed
	 * @param startDate - start date by which Buses are going to be searched
	 * @param durationInHours - duration in hours by which Buses are going to be searched
	 */
	public void listBuses(java.util.Date startDate, int durationInHours){
		DefaultTableModel selectBusTable = (DefaultTableModel) tableBusesUpdTour.getModel();
		Autobus.frame.deleteAllRows(selectBusTable);
		Object[] rowData = new Object[3];
		for (int i=0; i<	Autobus.frame.busesArchive.size(); i++){
			if(	Autobus.frame.busesArchive.get(i).isAvailable(startDate, durationInHours)) {
				rowData[0] = 	Autobus.frame.busesArchive.get(i).getVehicleID();
				rowData[1] = 	Autobus.frame.busesArchive.get(i).getModel();
				rowData[2] = Integer.toString(	Autobus.frame.busesArchive.get(i).getMaxNumberOfSeats());
				selectBusTable.addRow(rowData);
			}
		}
	}
	
	/**
	 * This lists all Buses in table from ChauffeursArchive according to startmonthUpdTour, startdayUpdTour, startyearUpdTour, starthourUpdTour, startMinuteUpdTour, endMonthUpdTour, endDayUpdTour, endYearUpdTour, endHourUpdTour, endMinuteUpdTour fields after the button has been pressed
    * @param startDate - start date by which Chauffeurs are going to be searched
    * @param durationInHours - duration in hours by which Chauffeurs are going to be searched
	 */
	public void listChauffeurs(java.util.Date startDate, int durationInHours){
		DefaultTableModel selectChauffeurTable = (DefaultTableModel) tableChauffeursUpdTour.getModel();
		Autobus.frame.deleteAllRows(selectChauffeurTable);
		Object[] rowData = new Object[2];
		for (int i=0; i< Autobus.frame.chauffeursArchive.size(); i++){
			if (!Autobus.frame.chauffeursArchive.get(i).isOnlyOneDayTrips() && Autobus.frame.chauffeursArchive.get(i).isAvailable(startDate, durationInHours)) {
				rowData[0] = Autobus.frame.chauffeursArchive.get(i).getEmployeeNumber();
				rowData[1] = Autobus.frame.chauffeursArchive.get(i).getName();
				selectChauffeurTable.addRow(rowData);
			}
		}
	}

	/**
	 * This updates JList list for this Tour
	 * @param newPickUp
	 */
	public void updateListPickUps(String newPickUp){
		DefaultListModel<String> listModel = (DefaultListModel<String>) list.getModel();
		listModel.addElement(newPickUp);
	}

	/**
	 * This lists all fields with the information for this Tour
	 */
	public void listElements(){
		destinationUpdTour.setText(currentlyUpdatingTour.getDestination());

		Calendar cal = Calendar.getInstance();
		cal.setTime(currentlyUpdatingTour.getNewDateInterval()[0]);
		int startMonth = cal.get(Calendar.MONTH) + 1;
		int startDay = cal.get(Calendar.DAY_OF_MONTH);
		int startYear = cal.get(Calendar.YEAR);
		int startHour = cal.get(Calendar.HOUR_OF_DAY);
		int startMinute = cal.get(Calendar.MINUTE);

		cal.setTime(currentlyUpdatingTour.getNewDateInterval()[1]);
		int endMonth = cal.get(Calendar.MONTH) + 1;
		int endDay = cal.get(Calendar.DAY_OF_MONTH);
		int endYear = cal.get(Calendar.YEAR);
		int endHour = cal.get(Calendar.HOUR_OF_DAY);
		int endMinute = cal.get(Calendar.MINUTE);

		startmonthUpdTour.setText(String.valueOf(startMonth));
		startdayUpdTour.setText(String.valueOf(startDay));
		startyearUpdTour.setText(String.valueOf(startYear));
		starthourUpdTour.setText(String.valueOf(startHour));
		startMinuteUpdTour.setText(String.valueOf(startMinute));

		endMonthUpdTour.setText(String.valueOf(endMonth));
		endDayUpdTour.setText(String.valueOf(endDay));
		endYearUpdTour.setText(String.valueOf(endYear));
		endHourUpdTour.setText(String.valueOf(endHour));
		endMinuteUpdTour.setText(String.valueOf(endMinute));

		DefaultListModel<String> listModel = (DefaultListModel<String>) list.getModel();
		listModel.removeAllElements();
		for (int i = 0; i < currentlyUpdatingTour.getPickUpPlaces().size(); i++) {
			listModel.addElement(currentlyUpdatingTour.getPickUpPlaces().get(i));
		}

		breakfastUpdTour.setSelected(currentlyUpdatingTour.getServices().isBreakfastIncluded());
		allInclusiveUpdTour.setSelected(currentlyUpdatingTour.getServices().isAllInclusive());
		lunchUpdTour.setSelected(currentlyUpdatingTour.getServices().isLunchIncluded());
		ticketsUpdTour.setSelected(currentlyUpdatingTour.getServices().isEntranceTickets());
	}
}
