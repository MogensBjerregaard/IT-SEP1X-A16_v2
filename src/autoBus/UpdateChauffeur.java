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
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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

public class UpdateChauffeur extends JPanel
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private Chauffeur currentlyUpdatingChauffeur;
   private JTextField employeeIDUpdateChauffeur;
   private JTextField addressUpdateChauffeur;
   private JTextField nameUpdateChauffeur;
   private JTextField emailUpdateChauffeur;
   private JTextField phoneUpdateChauffeur;
   private JTextField mmUpdateChauffeur;
   private JTextField ddUpdateChauffeur;
   private JTextField yyyyUpdateChauffeur;
   private JCheckBox externalCheckBoxUpdateChauffeur;
   private JCheckBox oneDayCheckBoxUpdateChauffeur;
   private JLabel updateChauffeurLabelUpdateChauffeur;

   public void createEvents()
   {
      Autobus.frame.lblShowFullDescriptionChauffeurButton 
            .addMouseListener(new MouseAdapter()
            {
               @Override
               public void mouseReleased(MouseEvent event)
               {

                  try
                  {

                     String employeeNumberOfCurrentlyUpdatingChauffeur = (String) Autobus.frame.tableChauffeurs
                           .getValueAt(
                                 Autobus.frame.tableChauffeurs.getSelectedRow(),
                                 0);
                     for (int i = 0; i < Autobus.frame.chauffeursArchive.size(); i++)
                     {
                        if (Autobus.frame.chauffeursArchive.get(i)
                              .getEmployeeNumber().equals(employeeNumberOfCurrentlyUpdatingChauffeur))
                        {
                           currentlyUpdatingChauffeur = Autobus.frame.chauffeursArchive
                                 .get(i);
                        }
                     }

                     // FILLING CHAUFFEURS INFORMATION
                     employeeIDUpdateChauffeur.setText(
                           currentlyUpdatingChauffeur.getEmployeeNumber());
                     nameUpdateChauffeur
                           .setText(currentlyUpdatingChauffeur.getName());
                     addressUpdateChauffeur
                           .setText(currentlyUpdatingChauffeur.getAddress());
                     emailUpdateChauffeur
                           .setText(currentlyUpdatingChauffeur.getEmail());
                     phoneUpdateChauffeur.setText(
                           currentlyUpdatingChauffeur.getPhonenumber());
                     mmUpdateChauffeur
                           .setText(Integer.toString(currentlyUpdatingChauffeur
                                 .getBirthday().getMonth()));
                     ddUpdateChauffeur.setText(Integer.toString(
                           currentlyUpdatingChauffeur.getBirthday().getDay()));
                     yyyyUpdateChauffeur.setText(Integer.toString(
                           currentlyUpdatingChauffeur.getBirthday().getYear()));

                     if (currentlyUpdatingChauffeur.isExternalEmployee())
                     {
                        externalCheckBoxUpdateChauffeur.setSelected(true);
                     }

                     if (currentlyUpdatingChauffeur.isOnlyOneDayTrips())
                     {
                        oneDayCheckBoxUpdateChauffeur.setSelected(true);
                     }
                     Autobus.frame.hideAllPanels();
                     Autobus.frame.updateChauffeurPanel.setVisible(true);
                  }
                  catch (ArrayIndexOutOfBoundsException e)
                  {
                     JOptionPane.showMessageDialog(null,
                           "You should first select the chauffeur you want to change from the table above!");
                  }
               }
            });
      
      updateChauffeurLabelUpdateChauffeur.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent event){
            if(Autobus.okOrCancel("Are you sure you want to save these changes") == 0){
               currentlyUpdatingChauffeur.setEmployeeNumber(employeeIDUpdateChauffeur.getText());
               currentlyUpdatingChauffeur.setName(nameUpdateChauffeur.getText());
               currentlyUpdatingChauffeur.setAddress(addressUpdateChauffeur.getText());
               Date birthday = new Date(Integer.parseInt(mmUpdateChauffeur.getText()), Integer.parseInt(ddUpdateChauffeur.getText()), Integer.parseInt(yyyyUpdateChauffeur.getText()));
               currentlyUpdatingChauffeur.setBirthday(birthday);
               if (externalCheckBoxUpdateChauffeur.isSelected()) {
                  currentlyUpdatingChauffeur.isExternalEmployee();
               }
               if (oneDayCheckBoxUpdateChauffeur.isSelected()){
                  currentlyUpdatingChauffeur.isOnlyOneDayTrips();
               }
               try{
                  Autobus.frame.chauffeursArchive.saveChauffeursArchive();
               }
               catch(Exception ex){
                  ex.printStackTrace();
               }
               Autobus.frame.hideAllPanels();
               Autobus.frame.panelChauffeurs.setVisible(true);
               Autobus.frame.chauffeursTable.setRowCount(0);
               Autobus.frame.listChauffeurs();
            }
            
         }
      });
   }

   public UpdateChauffeur()
   {

      JPanel panel = new JPanel();
      panel.setBackground(new Color(95, 158, 160));

      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(0, 128, 128));

      JLabel label = new JLabel("Chauffeurs archive");
      label.setForeground(Color.WHITE);
      label.setFont(new Font("Century Gothic", Font.PLAIN, 20));
      GroupLayout gl_panel_1 = new GroupLayout(panel_1);
      gl_panel_1.setHorizontalGroup(
            gl_panel_1.createParallelGroup(Alignment.LEADING)
                  .addGap(0, 1371, Short.MAX_VALUE)
                  .addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
                        .addComponent(label, GroupLayout.PREFERRED_SIZE, 240,
                              GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(1121, Short.MAX_VALUE)));
      gl_panel_1.setVerticalGroup(gl_panel_1
            .createParallelGroup(Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(gl_panel_1.createSequentialGroup()
                  .addComponent(label, GroupLayout.PREFERRED_SIZE, 51,
                        GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
      panel_1.setLayout(gl_panel_1);

      JPanel panel_2 = new JPanel();
      panel_2.setBorder(
            new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true),
                  "Update chauffeur", TitledBorder.CENTER, TitledBorder.TOP,
                  null, new Color(255, 255, 255)));
      panel_2.setBackground(new Color(95, 158, 160));

      JLabel label_1 = new JLabel("Employee#");
      label_1.setForeground(Color.WHITE);
      label_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));

      employeeIDUpdateChauffeur = new JTextField();
      employeeIDUpdateChauffeur.setSelectionColor(new Color(95, 158, 160));
      employeeIDUpdateChauffeur.setSelectedTextColor(Color.WHITE);
      employeeIDUpdateChauffeur.setForeground(Color.WHITE);
      employeeIDUpdateChauffeur.setColumns(10);
      employeeIDUpdateChauffeur
            .setBorder(new LineBorder(new Color(255, 255, 255)));
      employeeIDUpdateChauffeur.setBackground(new Color(95, 158, 160));

      oneDayCheckBoxUpdateChauffeur = new JCheckBox("Only 1 day trips");
      oneDayCheckBoxUpdateChauffeur.setForeground(Color.WHITE);
      oneDayCheckBoxUpdateChauffeur
            .setFont(new Font("Century Gothic", Font.PLAIN, 12));
      oneDayCheckBoxUpdateChauffeur.setBackground(new Color(95, 158, 160));

      externalCheckBoxUpdateChauffeur = new JCheckBox("External employee");
      externalCheckBoxUpdateChauffeur.setForeground(Color.WHITE);
      externalCheckBoxUpdateChauffeur
            .setFont(new Font("Century Gothic", Font.PLAIN, 12));
      externalCheckBoxUpdateChauffeur.setBackground(new Color(95, 158, 160));

      JLabel label_2 = new JLabel("Birthday");
      label_2.setForeground(Color.WHITE);
      label_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));

      JLabel label_3 = new JLabel("Name:");
      label_3.setForeground(Color.WHITE);
      label_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));

      JLabel label_4 = new JLabel("Address:");
      label_4.setForeground(Color.WHITE);
      label_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));

      JLabel label_5 = new JLabel("Email");
      label_5.setForeground(Color.WHITE);
      label_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));

      JLabel label_6 = new JLabel("Phone");
      label_6.setForeground(Color.WHITE);
      label_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));

      addressUpdateChauffeur = new JTextField();
      addressUpdateChauffeur.setForeground(Color.WHITE);
      addressUpdateChauffeur.setColumns(10);
      addressUpdateChauffeur
            .setBorder(new LineBorder(new Color(255, 255, 255)));
      addressUpdateChauffeur.setBackground(new Color(95, 158, 160));

      nameUpdateChauffeur = new JTextField();
      nameUpdateChauffeur.setForeground(Color.WHITE);
      nameUpdateChauffeur.setColumns(10);
      nameUpdateChauffeur.setBorder(new LineBorder(Color.WHITE));
      nameUpdateChauffeur.setBackground(new Color(95, 158, 160));

      emailUpdateChauffeur = new JTextField();
      emailUpdateChauffeur.setSelectionColor(new Color(95, 158, 160));
      emailUpdateChauffeur.setSelectedTextColor(Color.WHITE);
      emailUpdateChauffeur.setForeground(Color.WHITE);
      emailUpdateChauffeur.setColumns(10);
      emailUpdateChauffeur.setBorder(new LineBorder(new Color(255, 255, 255)));
      emailUpdateChauffeur.setBackground(new Color(95, 158, 160));

      phoneUpdateChauffeur = new JTextField();
      phoneUpdateChauffeur.setSelectionColor(new Color(95, 158, 160));
      phoneUpdateChauffeur.setSelectedTextColor(Color.WHITE);
      phoneUpdateChauffeur.setForeground(Color.WHITE);
      phoneUpdateChauffeur.setColumns(10);
      phoneUpdateChauffeur.setBorder(new LineBorder(new Color(255, 255, 255)));
      phoneUpdateChauffeur.setBackground(new Color(95, 158, 160));

      mmUpdateChauffeur = new JTextField();
      mmUpdateChauffeur.setSelectionColor(new Color(95, 158, 160));
      mmUpdateChauffeur.setSelectedTextColor(Color.WHITE);
      mmUpdateChauffeur.setForeground(Color.WHITE);
      mmUpdateChauffeur.setColumns(10);
      mmUpdateChauffeur.setBorder(
            new TitledBorder(new LineBorder(null), "MM", TitledBorder.LEADING,
                  TitledBorder.TOP, null, new Color(255, 255, 255)));
      mmUpdateChauffeur.setBackground(new Color(95, 158, 160));

      ddUpdateChauffeur = new JTextField();
      ddUpdateChauffeur.setForeground(Color.WHITE);
      ddUpdateChauffeur.setColumns(10);
      ddUpdateChauffeur.setBorder(
            new TitledBorder(new LineBorder(null), "DD", TitledBorder.LEADING,
                  TitledBorder.TOP, null, new Color(255, 255, 255)));
      ddUpdateChauffeur.setBackground(new Color(95, 158, 160));

      yyyyUpdateChauffeur = new JTextField();
      yyyyUpdateChauffeur.setForeground(Color.WHITE);
      yyyyUpdateChauffeur.setColumns(10);
      yyyyUpdateChauffeur.setBorder(
            new TitledBorder(new LineBorder(new Color(255, 255, 255)), "YYYY",
                  TitledBorder.LEADING, TitledBorder.TOP, null,
                  new Color(255, 255, 255)));
      yyyyUpdateChauffeur.setBackground(new Color(95, 158, 160));

      updateChauffeurLabelUpdateChauffeur = new JLabel("Update Chauffeur");
      updateChauffeurLabelUpdateChauffeur.setForeground(Color.WHITE);
      updateChauffeurLabelUpdateChauffeur
            .setFont(new Font("Century Gothic", Font.PLAIN, 14));
      updateChauffeurLabelUpdateChauffeur.setBorder(new CompoundBorder(
            new LineBorder(new Color(255, 255, 255), 1, true),
            new EmptyBorder(2, 2, 2, 2)));
      GroupLayout gl_panel_2 = new GroupLayout(panel_2);
      gl_panel_2.setHorizontalGroup(gl_panel_2
            .createParallelGroup(Alignment.TRAILING)
            .addGap(0, 318, Short.MAX_VALUE)
            .addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
                  .addComponent(label_1)
                  .addPreferredGap(ComponentPlacement.RELATED)
                  .addComponent(employeeIDUpdateChauffeur,
                        GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                  .addGap(7))
            .addGroup(gl_panel_2.createSequentialGroup().addGap(13).addGroup(
                  gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(
                        gl_panel_2.createSequentialGroup().addGroup(gl_panel_2
                              .createParallelGroup(Alignment.LEADING)
                              .addComponent(oneDayCheckBoxUpdateChauffeur)
                              .addComponent(externalCheckBoxUpdateChauffeur))
                              .addContainerGap())
                        .addGroup(gl_panel_2.createSequentialGroup()
                              .addGroup(gl_panel_2
                                    .createParallelGroup(Alignment.LEADING)
                                    .addComponent(label_2).addComponent(label_3)
                                    .addComponent(label_4).addComponent(label_5)
                                    .addComponent(label_6))
                              .addGap(29)
                              .addGroup(gl_panel_2
                                    .createParallelGroup(Alignment.LEADING)
                                    .addComponent(addressUpdateChauffeur,
                                          Alignment.TRAILING,
                                          GroupLayout.DEFAULT_SIZE, 209,
                                          Short.MAX_VALUE)
                                    .addComponent(nameUpdateChauffeur,
                                          Alignment.TRAILING,
                                          GroupLayout.DEFAULT_SIZE, 209,
                                          Short.MAX_VALUE)
                                    .addComponent(emailUpdateChauffeur,
                                          GroupLayout.DEFAULT_SIZE, 209,
                                          Short.MAX_VALUE)
                                    .addComponent(phoneUpdateChauffeur,
                                          Alignment.TRAILING,
                                          GroupLayout.DEFAULT_SIZE, 209,
                                          Short.MAX_VALUE)
                                    .addGroup(gl_panel_2.createSequentialGroup()
                                          .addComponent(mmUpdateChauffeur,
                                                GroupLayout.PREFERRED_SIZE, 49,
                                                GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(
                                                ComponentPlacement.RELATED)
                                          .addComponent(ddUpdateChauffeur,
                                                GroupLayout.PREFERRED_SIZE, 48,
                                                GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(
                                                ComponentPlacement.RELATED)
                                          .addComponent(yyyyUpdateChauffeur,
                                                GroupLayout.DEFAULT_SIZE, 100,
                                                Short.MAX_VALUE)))
                              .addGap(7))))
            .addGroup(gl_panel_2.createSequentialGroup()
                  .addContainerGap(190, Short.MAX_VALUE)
                  .addComponent(updateChauffeurLabelUpdateChauffeur)
                  .addContainerGap()));
      gl_panel_2.setVerticalGroup(gl_panel_2
            .createParallelGroup(Alignment.TRAILING)
            .addGap(0, 368, Short.MAX_VALUE)
            .addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
                  .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_1)
                        .addComponent(employeeIDUpdateChauffeur,
                              GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(ComponentPlacement.RELATED, 29,
                        Short.MAX_VALUE)
                  .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(nameUpdateChauffeur,
                              GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_3))
                  .addPreferredGap(ComponentPlacement.UNRELATED)
                  .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_4).addComponent(
                              addressUpdateChauffeur,
                              GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(ComponentPlacement.UNRELATED)
                  .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_5).addComponent(
                              emailUpdateChauffeur, GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE))
                  .addGap(12)
                  .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_6).addComponent(
                              phoneUpdateChauffeur, GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(ComponentPlacement.UNRELATED)
                  .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(label_2)
                        .addComponent(mmUpdateChauffeur,
                              GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE)
                        .addComponent(yyyyUpdateChauffeur,
                              GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE)
                        .addComponent(ddUpdateChauffeur,
                              GroupLayout.PREFERRED_SIZE,
                              GroupLayout.DEFAULT_SIZE,
                              GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(ComponentPlacement.UNRELATED)
                  .addComponent(externalCheckBoxUpdateChauffeur).addGap(4)
                  .addComponent(oneDayCheckBoxUpdateChauffeur).addGap(45)
                  .addComponent(updateChauffeurLabelUpdateChauffeur)
                  .addContainerGap()));
      panel_2.setLayout(gl_panel_2);
      GroupLayout gl_panel = new GroupLayout(panel);
      gl_panel
            .setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_panel.createSequentialGroup()
                        .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1371,
                              Short.MAX_VALUE)
                        .addGap(0))
                  .addGroup(gl_panel.createSequentialGroup().addGap(12)
                        .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 318,
                              GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(1041, Short.MAX_VALUE)));
      gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
                  .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 58,
                        GroupLayout.PREFERRED_SIZE)
                  .addGap(18)
                  .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 368,
                        GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(444, Short.MAX_VALUE)));
      panel.setLayout(gl_panel);
      GroupLayout groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(groupLayout
            .createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
                  .addComponent(panel, GroupLayout.PREFERRED_SIZE, 1371,
                        GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
      groupLayout.setVerticalGroup(groupLayout
            .createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
                  .addComponent(panel, GroupLayout.PREFERRED_SIZE, 888,
                        GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
      setLayout(groupLayout);
      createEvents();

   }
}