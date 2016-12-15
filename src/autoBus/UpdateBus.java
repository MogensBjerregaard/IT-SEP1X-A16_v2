package autoBus;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UpdateBus extends JPanel {
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
    private final JLabel lblCancelUpdateBusButton;
    private final JLabel lblBackUpdateBusButton;
    private Bus currentlyUpdatingBus;
   private JTextField pricePerHourTextFieldUpdateBus;
   private JTextField numberOfSeatsTextFieldUpdateBus;
   private JTextField vehicleIdTextFieldUpdateBus;
   private JTable tableUpdateBus;
   private JRadioButton standardUpdateRadioButton;
   private JRadioButton partyUpdateRadioButton;
   private JRadioButton luxuryUpdateRadioButton;
   private DefaultTableModel updateBusTable;
   private JLabel lblUpdateBus;


   /**
    * All methods for this UpdateBus
    */
   public void createEvents() {

       lblBackUpdateBusButton.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseReleased(MouseEvent event) {
               Autobus.frame.hideAllPanels();
               Autobus.frame.panelBuses.setVisible(true);
           }
       });
       
      /**
        * Cancel Button
        */
       lblCancelUpdateBusButton.addMouseListener(new MouseAdapter() {
             @Override
             /**
              * This shows an okOrCancel message after the button has been clicked and asks the user if he wants to cancel changing this bus
              */
             public void mouseReleased(MouseEvent event) {
                 if(Autobus.okOrCancel("Are you sure you want to cancel changing this bus?") == 0) {
                     Autobus.frame.hideAllPanels();
                     Autobus.frame.panelBuses.setVisible(true);
                 }
             }
         });

       /**
        * Show Full Description Button
        */
      Autobus.frame.lblShowFullDescription.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This fills additional Bus information in necessary fields of the specific Bus after the button has been clicked
          */
         public void mouseReleased(MouseEvent event){

            try {
               
               String vehicleIdOfCurrentlyUpdatingBus = (String) Autobus.frame.tableBuses.getValueAt(Autobus.frame.tableBuses.getSelectedRow(), 0);
               for (int i = 0; i < Autobus.frame.busesArchive.size(); i++) {
                  if (Autobus.frame.busesArchive.get(i).getVehicleID().equals(vehicleIdOfCurrentlyUpdatingBus)) {
                     currentlyUpdatingBus = Autobus.frame.busesArchive.get(i);
                  }
               }
               
               // FILLING BUS INFORMATION

                updateBusTable = (DefaultTableModel) tableUpdateBus.getModel();
                Autobus.frame.deleteAllRows(updateBusTable);
                Object[] rowData = new Object[3];
                for (int i = 0; i < Autobus.frame.toursArchive.size(); i++) {
                    if(Autobus.frame.toursArchive.get(i).getBus().getModelString().equals(currentlyUpdatingBus.getModelString())
                            && Autobus.frame.toursArchive.get(i).getBus().getVehicleID().equals(currentlyUpdatingBus.getVehicleID())){
                        rowData[0] = Autobus.frame.toursArchive.get(i).getDepartureDate();
                        rowData[1] = Autobus.frame.toursArchive.get(i).getDestination();
                        rowData[2] = Autobus.frame.toursArchive.get(i).getChauffeur();
                        updateBusTable.addRow(rowData);
                    }
                }
                
                for (int i = 0; i < Autobus.frame.reservationsArchive.size(); i++) {
                    if (Autobus.frame.reservationsArchive.get(i) instanceof BusReservation) {
                        BusReservation busReservation = (BusReservation) Autobus.frame.reservationsArchive.get(i);
                        if(busReservation.getBus().getModelString().equals(currentlyUpdatingBus.getModelString())
                                && busReservation.getBus().getVehicleID().equals(currentlyUpdatingBus.getVehicleID())){
                            rowData[0] = busReservation.getDepartureDate();
                            rowData[1] = "Bus & Chauffeur reservation";
                            rowData[2] = busReservation.getChauffeur();
                            updateBusTable.addRow(rowData);
                        }
                    }
                }
               vehicleIdTextFieldUpdateBus.setText(currentlyUpdatingBus.getVehicleID());
               pricePerHourTextFieldUpdateBus.setText(Double.toString(currentlyUpdatingBus.getPricePerHour()));
               numberOfSeatsTextFieldUpdateBus.setText(Integer.toString(currentlyUpdatingBus.getMaxNumberOfSeats()));
               
               if (currentlyUpdatingBus.getModelString().equalsIgnoreCase("STANDART"))
               {
                  standardUpdateRadioButton.setSelected(true);
                  partyUpdateRadioButton.setSelected(false);
                  luxuryUpdateRadioButton.setSelected(false);
               }
               
               if (currentlyUpdatingBus.getModelString().equalsIgnoreCase("PARTY"))
               {
                  standardUpdateRadioButton.setSelected(false);
                  partyUpdateRadioButton.setSelected(true);
                  luxuryUpdateRadioButton.setSelected(false);
               }
               
               if (currentlyUpdatingBus.getModelString().equalsIgnoreCase("LUXURY"))
               {
                  standardUpdateRadioButton.setSelected(false);
                  partyUpdateRadioButton.setSelected(false);
                  luxuryUpdateRadioButton.setSelected(true);
               }
               
               Autobus.frame.hideAllPanels();
               Autobus.frame.updateBusPanel.setVisible(true);
            }
            catch (ArrayIndexOutOfBoundsException e){
               JOptionPane.showMessageDialog(null, "You should first select the bus you want to change from the table above!");
            }
         }
      });

      /**
       * Update Bus button
       */
      lblUpdateBus.addMouseListener(new MouseAdapter() {
         @Override
         /**
          * This adds updated vehicleID, pricePerHour, maxNumberOfSeats and model information for this Bus
          */
         public void mouseReleased(MouseEvent event){
            if(Autobus.okOrCancel("Are you sure you want to save these changes") == 0){
               currentlyUpdatingBus.setVehicleID(vehicleIdTextFieldUpdateBus.getText());
               currentlyUpdatingBus.setPricePerHour(Double.parseDouble(pricePerHourTextFieldUpdateBus.getText()));
               currentlyUpdatingBus.setMaxNumberOfSeats(Integer.parseInt(numberOfSeatsTextFieldUpdateBus.getText()));
               String modelType = "STANDART";
               if (partyUpdateRadioButton.isSelected()) {
                  modelType = "PARTY";
               }
               if (luxuryUpdateRadioButton.isSelected()){
                  modelType = "LUXURY";
               }
               currentlyUpdatingBus.setModel(modelType);
               try{
                  Autobus.frame.busesArchive.saveBusesArchive();
               }
               catch(Exception ex){
                  ex.printStackTrace();
               }
               Autobus.frame.hideAllPanels();
               Autobus.frame.panelBuses.setVisible(true);
               Autobus.frame.busesTable.setRowCount(0);
               Autobus.frame.listBuses();
            }
            
         }
      });
      
      /**
       * Standard Radio Button
       */
      standardUpdateRadioButton.addActionListener(new ActionListener() {
         /**
          * Makes only standard Radio button to be selected, disabling luxury and party radio buttons
          */
         public void actionPerformed(ActionEvent arg0) {
            partyUpdateRadioButton.setSelected(false);
            luxuryUpdateRadioButton.setSelected(false);
         }
      });
      
      /**
       * Party Radio Button
       */
      partyUpdateRadioButton.addActionListener(new ActionListener() {
         /**
          * Makes only party Radio button to be selected, disabling standard and luxury radio buttons
          */
         public void actionPerformed(ActionEvent e) {
            standardUpdateRadioButton.setSelected(false);
            luxuryUpdateRadioButton.setSelected(false);
         }
      });
      
      /**
       * Luxury Radio Button
       */
      luxuryUpdateRadioButton.addActionListener(new ActionListener() {
         /**
          * Makes only luxury Radio button to be selected, disabling standard and party radio buttons
          */
         public void actionPerformed(ActionEvent e) {
            standardUpdateRadioButton.setSelected(false);
            partyUpdateRadioButton.setSelected(false);
         }
      });
   }
   
   /**
    * GUI stuff
    */
   public UpdateBus() {
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(95, 158, 160));
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(0, 128, 128));
      
      JLabel lblUpdateBusesArchive = new JLabel("Update Buses archive");
      lblUpdateBusesArchive.setForeground(Color.WHITE);
      lblUpdateBusesArchive.setFont(new Font("Century Gothic", Font.PLAIN, 20));
      GroupLayout gl_panel_1 = new GroupLayout(panel_1);
      gl_panel_1.setHorizontalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGap(0, 1371, Short.MAX_VALUE)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblUpdateBusesArchive, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(1121, Short.MAX_VALUE))
      );
      gl_panel_1.setVerticalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addComponent(lblUpdateBusesArchive, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      panel_1.setLayout(gl_panel_1);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Update bus", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
      panel_2.setBackground(new Color(95, 158, 160));
      
      JLabel label_1 = new JLabel("Price per hour:");
      label_1.setForeground(Color.WHITE);
      label_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      JLabel label_2 = new JLabel("Number of seats:");
      label_2.setForeground(Color.WHITE);
      label_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      JLabel label_3 = new JLabel("Bus modeltype:");
      label_3.setForeground(Color.WHITE);
      label_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      luxuryUpdateRadioButton = new JRadioButton("Luxury bus");
      luxuryUpdateRadioButton.setForeground(Color.WHITE);
      luxuryUpdateRadioButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      luxuryUpdateRadioButton.setBackground(new Color(95, 158, 160));
      
      partyUpdateRadioButton = new JRadioButton("Party bus");
      partyUpdateRadioButton.setForeground(Color.WHITE);
      partyUpdateRadioButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      partyUpdateRadioButton.setBackground(new Color(95, 158, 160));
      
      standardUpdateRadioButton = new JRadioButton("Standard bus");
      standardUpdateRadioButton.setForeground(Color.WHITE);
      standardUpdateRadioButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      standardUpdateRadioButton.setBackground(new Color(95, 158, 160));
      
      pricePerHourTextFieldUpdateBus = new JTextField();
      pricePerHourTextFieldUpdateBus.setForeground(Color.WHITE);
      pricePerHourTextFieldUpdateBus.setColumns(10);
      pricePerHourTextFieldUpdateBus.setBorder(new LineBorder(Color.WHITE));
      pricePerHourTextFieldUpdateBus.setBackground(new Color(95, 158, 160));
      
      numberOfSeatsTextFieldUpdateBus = new JTextField();
      numberOfSeatsTextFieldUpdateBus.setForeground(Color.WHITE);
      numberOfSeatsTextFieldUpdateBus.setColumns(10);
      numberOfSeatsTextFieldUpdateBus.setBorder(new LineBorder(new Color(255, 255, 255)));
      numberOfSeatsTextFieldUpdateBus.setBackground(new Color(95, 158, 160));
      
      JLabel label_4 = new JLabel("Vehicle ID# :");
      label_4.setForeground(Color.WHITE);
      label_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      vehicleIdTextFieldUpdateBus = new JTextField();
      vehicleIdTextFieldUpdateBus.setSelectionColor(new Color(95, 158, 160));
      vehicleIdTextFieldUpdateBus.setSelectedTextColor(Color.WHITE);
      vehicleIdTextFieldUpdateBus.setForeground(Color.WHITE);
      vehicleIdTextFieldUpdateBus.setColumns(10);
      vehicleIdTextFieldUpdateBus.setBorder(new LineBorder(new Color(255, 255, 255)));
      vehicleIdTextFieldUpdateBus.setBackground(new Color(95, 158, 160));
      
      lblUpdateBus = new JLabel("Save Changes");
      lblUpdateBus.setForeground(Color.WHITE);
      lblUpdateBus.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      lblUpdateBus.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(2, 2, 2, 2)));
      
       lblCancelUpdateBusButton = new JLabel("Cancel");
      lblCancelUpdateBusButton.setForeground(Color.WHITE);
      lblCancelUpdateBusButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      lblCancelUpdateBusButton.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(2, 2, 2, 2)));
      GroupLayout gl_panel_2 = new GroupLayout(panel_2);
      gl_panel_2.setHorizontalGroup(
      	gl_panel_2.createParallelGroup(Alignment.TRAILING)
      		.addGroup(gl_panel_2.createSequentialGroup()
      			.addContainerGap()
      			.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
      				.addGroup(gl_panel_2.createSequentialGroup()
      					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
      						.addGroup(gl_panel_2.createSequentialGroup()
      							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
      								.addComponent(label_1)
      								.addComponent(label_2)
      								.addComponent(label_3))
      							.addGap(29)
      							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
      								.addGroup(gl_panel_2.createSequentialGroup()
      									.addComponent(luxuryUpdateRadioButton)
      									.addPreferredGap(ComponentPlacement.RELATED, 74, GroupLayout.PREFERRED_SIZE))
      								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
      									.addGroup(gl_panel_2.createSequentialGroup()
      										.addComponent(partyUpdateRadioButton)
      										.addPreferredGap(ComponentPlacement.RELATED, 80, GroupLayout.PREFERRED_SIZE))
      									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
      										.addGroup(gl_panel_2.createSequentialGroup()
      											.addComponent(standardUpdateRadioButton)
      											.addPreferredGap(ComponentPlacement.RELATED, 54, GroupLayout.PREFERRED_SIZE))
      										.addComponent(pricePerHourTextFieldUpdateBus, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
      										.addComponent(numberOfSeatsTextFieldUpdateBus, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))))
      						.addGroup(gl_panel_2.createSequentialGroup()
      							.addComponent(label_4)
      							.addGap(53)
      							.addComponent(vehicleIdTextFieldUpdateBus, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
      							.addPreferredGap(ComponentPlacement.RELATED)))
      					.addGap(7))
      				.addGroup(gl_panel_2.createSequentialGroup()
      					.addComponent(lblCancelUpdateBusButton)
      					.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
      					.addComponent(lblUpdateBus)
      					.addContainerGap())))
      );
      gl_panel_2.setVerticalGroup(
      	gl_panel_2.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_panel_2.createSequentialGroup()
      			.addContainerGap()
      			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
      				.addComponent(label_4)
      				.addComponent(vehicleIdTextFieldUpdateBus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
      				.addComponent(pricePerHourTextFieldUpdateBus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      				.addComponent(label_1))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
      				.addComponent(label_2)
      				.addComponent(numberOfSeatsTextFieldUpdateBus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
      				.addComponent(label_3)
      				.addComponent(standardUpdateRadioButton))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addComponent(partyUpdateRadioButton)
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addComponent(luxuryUpdateRadioButton)
      			.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
      			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
      				.addComponent(lblUpdateBus)
      				.addComponent(lblCancelUpdateBusButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
      			.addContainerGap())
      );
      panel_2.setLayout(gl_panel_2);
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setOpaque(false);
      scrollPane.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      scrollPane.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Buses archive", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(5, 5, 5, 5)));
      scrollPane.setBackground(new Color(95, 158, 160));

       lblBackUpdateBusButton = new JLabel("Back");
      lblBackUpdateBusButton.setForeground(Color.WHITE);
      lblBackUpdateBusButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      lblBackUpdateBusButton.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(2, 2, 2, 2)));
      GroupLayout gl_panel = new GroupLayout(panel);
      gl_panel.setHorizontalGroup(
      	gl_panel.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_panel.createSequentialGroup()
      			.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
      			.addGap(0))
      		.addGroup(gl_panel.createSequentialGroup()
      			.addGap(12)
      			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
      			.addGap(18)
      			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE)
      			.addContainerGap(191, Short.MAX_VALUE))
      		.addGroup(gl_panel.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(lblBackUpdateBusButton)
      			.addContainerGap(994, Short.MAX_VALUE))
      );
      gl_panel.setVerticalGroup(
      	gl_panel.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_panel.createSequentialGroup()
      			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
      			.addGap(18)
      			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
      				.addComponent(scrollPane, 0, 0, Short.MAX_VALUE)
      				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addComponent(lblBackUpdateBusButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
      			.addGap(374))
      );
      
      tableUpdateBus = new JTable();
      tableUpdateBus.setModel(new DefaultTableModel(
      	new Object[][] {
      	},
      	new String[] {
      		"Date", "Destination", "Chauffeur"
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
      scrollPane.setViewportView(tableUpdateBus);
      panel.setLayout(gl_panel);
      GroupLayout groupLayout_1 = new GroupLayout(this);
      groupLayout_1.setHorizontalGroup(
         groupLayout_1.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout_1.createSequentialGroup()
               .addComponent(panel, GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)
               .addGap(56))
      );
      groupLayout_1.setVerticalGroup(
         groupLayout_1.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout_1.createSequentialGroup()
               .addComponent(panel, GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
               .addContainerGap())
      );
      setLayout(groupLayout_1);
      createEvents();
   }
}