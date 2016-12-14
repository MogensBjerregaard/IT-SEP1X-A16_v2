package autoBus;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UpdateBusReservationsNext extends JPanel {
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   JTextField endMonthNext;
   JTextField endDayNext;
   JTextField endYearNext;
   JTextField startMonthNext;
   JTextField startDayNext;
   JTextField startYearNext;
   JTextField startHourNext;
   JTextField startMinuteNext;
   JTextField endHourNext;
   JTextField endMinuteNext;
   JTable tableSelectBusNext;
   JTable tableSelectChauffeurNext;
   JCheckBox breakfastCheckBoxNext;
   JCheckBox lunchCheckBoxNext;
   JCheckBox allInclusiveCheckBoxNext;
   JCheckBox ticketsCheckBoxNext;
   JTextPane summaryPaneNext;
   JPanel panel;
   JLabel cancelLabelNext;
   JLabel nextLabelNext;
   JLabel searchLabelNext;
    JLabel lblSelectBusUpdBusResButton;


   // GUI STUFF
    public UpdateBusReservationsNext() {
      
      panel = new JPanel();
      panel.setBackground(new Color(95, 158, 160));
      
      JPanel panel_1 = new JPanel();
      panel_1.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Services", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(2, 2, 2, 2)));
      panel_1.setBackground(new Color(95, 158, 160));
      
      breakfastCheckBoxNext = new JCheckBox("Breakfast");
      breakfastCheckBoxNext.setForeground(Color.WHITE);
      breakfastCheckBoxNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      breakfastCheckBoxNext.setBackground(new Color(95, 158, 160));
      
      lunchCheckBoxNext = new JCheckBox("Lunch");
      lunchCheckBoxNext.setForeground(Color.WHITE);
      lunchCheckBoxNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      lunchCheckBoxNext.setBackground(new Color(95, 158, 160));
      
      allInclusiveCheckBoxNext = new JCheckBox("All inclusive");
      allInclusiveCheckBoxNext.setForeground(Color.WHITE);
      allInclusiveCheckBoxNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      allInclusiveCheckBoxNext.setBackground(new Color(95, 158, 160));
      
      ticketsCheckBoxNext = new JCheckBox("Entrance tickets");
      ticketsCheckBoxNext.setForeground(Color.WHITE);
      ticketsCheckBoxNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      ticketsCheckBoxNext.setBackground(new Color(95, 158, 160));
      GroupLayout gl_panel_1 = new GroupLayout(panel_1);
      gl_panel_1.setHorizontalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                  .addComponent(breakfastCheckBoxNext)
                  .addComponent(lunchCheckBoxNext)
                  .addComponent(allInclusiveCheckBoxNext)
                  .addComponent(ticketsCheckBoxNext))
               .addContainerGap(163, Short.MAX_VALUE))
      );
      gl_panel_1.setVerticalGroup(
         gl_panel_1.createParallelGroup(Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
            .addGroup(gl_panel_1.createSequentialGroup()
               .addComponent(breakfastCheckBoxNext)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lunchCheckBoxNext)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(allInclusiveCheckBoxNext)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(ticketsCheckBoxNext)
               .addContainerGap(12, Short.MAX_VALUE))
      );
      panel_1.setLayout(gl_panel_1);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Date interval", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
      panel_2.setBackground(new Color(95, 158, 160));
      
      JLabel label = new JLabel("Enter start date:");
      label.setForeground(Color.WHITE);
      label.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      endMonthNext = new JTextField();
      endMonthNext.setForeground(Color.WHITE);
      endMonthNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      endMonthNext.setColumns(10);
      endMonthNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "M", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      endMonthNext.setBackground(new Color(95, 158, 160));
      
      endDayNext = new JTextField();
      endDayNext.setForeground(Color.WHITE);
      endDayNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      endDayNext.setColumns(10);
      endDayNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "D", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      endDayNext.setBackground(new Color(95, 158, 160));
      
      endYearNext = new JTextField();
      endYearNext.setForeground(Color.WHITE);
      endYearNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      endYearNext.setColumns(10);
      endYearNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Y", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      endYearNext.setBackground(new Color(95, 158, 160));
      
      startMonthNext = new JTextField();
      startMonthNext.setForeground(Color.WHITE);
      startMonthNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      startMonthNext.setColumns(10);
      startMonthNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "M", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      startMonthNext.setBackground(new Color(95, 158, 160));
      
      startDayNext = new JTextField();
      startDayNext.setForeground(Color.WHITE);
      startDayNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      startDayNext.setColumns(10);
      startDayNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "D", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      startDayNext.setBackground(new Color(95, 158, 160));
      
      startYearNext = new JTextField();
      startYearNext.setForeground(Color.WHITE);
      startYearNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      startYearNext.setColumns(10);
      startYearNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Y", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      startYearNext.setBackground(new Color(95, 158, 160));
      
      searchLabelNext = new JLabel("Search");
      searchLabelNext.setForeground(Color.WHITE);
      searchLabelNext.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      searchLabelNext.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      JLabel label_2 = new JLabel("Enter end date:");
      label_2.setForeground(Color.WHITE);
      label_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      
      startHourNext = new JTextField();
      startHourNext.setForeground(Color.WHITE);
      startHourNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      startHourNext.setColumns(10);
      startHourNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "H", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      startHourNext.setBackground(new Color(95, 158, 160));
      
      startMinuteNext = new JTextField();
      startMinuteNext.setForeground(Color.WHITE);
      startMinuteNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      startMinuteNext.setColumns(10);
      startMinuteNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Mn", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      startMinuteNext.setBackground(new Color(95, 158, 160));
      
      endHourNext = new JTextField();
      endHourNext.setForeground(Color.WHITE);
      endHourNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      endHourNext.setColumns(10);
      endHourNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "H", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      endHourNext.setBackground(new Color(95, 158, 160));
      
      endMinuteNext = new JTextField();
      endMinuteNext.setForeground(Color.WHITE);
      endMinuteNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      endMinuteNext.setColumns(10);
      endMinuteNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Mn", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(1, 1, 1, 1)));
      endMinuteNext.setBackground(new Color(95, 158, 160));
      GroupLayout gl_panel_2 = new GroupLayout(panel_2);
      gl_panel_2.setHorizontalGroup(
         gl_panel_2.createParallelGroup(Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
            .addGroup(gl_panel_2.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                  .addComponent(label)
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
                           .addGroup(gl_panel_2.createSequentialGroup()
                              .addComponent(endMonthNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(ComponentPlacement.UNRELATED)
                              .addComponent(endDayNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(ComponentPlacement.UNRELATED)
                              .addComponent(endYearNext, 0, 0, Short.MAX_VALUE))
                           .addGroup(gl_panel_2.createSequentialGroup()
                              .addComponent(startMonthNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(ComponentPlacement.UNRELATED)
                              .addComponent(startDayNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(ComponentPlacement.UNRELATED)
                              .addComponent(startYearNext, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                           .addComponent(searchLabelNext, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                        .addComponent(label_2))
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                           .addComponent(startHourNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(startMinuteNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_panel_2.createSequentialGroup()
                           .addComponent(endHourNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(endMinuteNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))))
               .addContainerGap(33, Short.MAX_VALUE))
      );
      gl_panel_2.setVerticalGroup(
         gl_panel_2.createParallelGroup(Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
            .addGroup(gl_panel_2.createSequentialGroup()
               .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addContainerGap()
                     .addComponent(label)
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(startMonthNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(startDayNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(startYearNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(startHourNext, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                           .addComponent(label_2)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                              .addComponent(endMonthNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                              .addComponent(endDayNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                              .addComponent(endYearNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(endHourNext, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                  .addGroup(gl_panel_2.createSequentialGroup()
                     .addGap(36)
                     .addComponent(startMinuteNext, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                     .addComponent(endMinuteNext, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addComponent(searchLabelNext, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(15, Short.MAX_VALUE))
      );
      panel_2.setLayout(gl_panel_2);
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Select bus", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
      scrollPane.setBackground(new Color(95, 158, 160));
      
      JScrollPane scrollPane_1 = new JScrollPane();
      scrollPane_1.setForeground(Color.WHITE);
      scrollPane_1.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Select chauffeur", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
      scrollPane_1.setBackground(new Color(95, 158, 160));
      
      summaryPaneNext = new JTextPane();
      summaryPaneNext.setForeground(Color.WHITE);
      summaryPaneNext.setFont(new Font("Century Gothic", Font.PLAIN, 12));
      summaryPaneNext.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Summary", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(5, 5, 5, 5)));
      summaryPaneNext.setBackground(new Color(95, 158, 160));
      
      cancelLabelNext = new JLabel("Cancel");
      cancelLabelNext.setForeground(Color.WHITE);
      cancelLabelNext.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      cancelLabelNext.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      nextLabelNext = new JLabel("Save Changes");
      nextLabelNext.setForeground(Color.WHITE);
      nextLabelNext.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      nextLabelNext.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      
      JPanel panel_3 = new JPanel();
      panel_3.setBackground(new Color(0, 128, 128));
      
      JLabel lblNewBus = new JLabel("New Bus & Chauffeur Reservation Update");
      lblNewBus.setForeground(Color.WHITE);
      lblNewBus.setFont(new Font("Century Gothic", Font.PLAIN, 20));
      GroupLayout gl_panel_3 = new GroupLayout(panel_3);
      gl_panel_3.setHorizontalGroup(
         gl_panel_3.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_3.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblNewBus, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(1442, Short.MAX_VALUE))
      );
      gl_panel_3.setVerticalGroup(
         gl_panel_3.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_3.createSequentialGroup()
               .addComponent(lblNewBus, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      panel_3.setLayout(gl_panel_3);
      
      lblSelectBusUpdBusResButton = new JLabel("Select");
      lblSelectBusUpdBusResButton.setForeground(Color.WHITE);
      lblSelectBusUpdBusResButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
      lblSelectBusUpdBusResButton.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
      GroupLayout gl_panel = new GroupLayout(panel);
      gl_panel.setHorizontalGroup(
         gl_panel.createParallelGroup(Alignment.LEADING)
            .addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 1901, Short.MAX_VALUE)
            .addGroup(gl_panel.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
                  .addGroup(gl_panel.createSequentialGroup()
                     .addComponent(cancelLabelNext)
                     .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(nextLabelNext))
                  .addGroup(gl_panel.createSequentialGroup()
                     .addGap(12)
                     .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel.createSequentialGroup()
                           .addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
                              .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
                              .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE))
                           .addPreferredGap(ComponentPlacement.UNRELATED)
                           .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                           .addGap(18)
                           .addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_panel.createSequentialGroup()
                           .addComponent(lblSelectBusUpdBusResButton)
                           .addGap(218)))
                     .addPreferredGap(ComponentPlacement.UNRELATED)
                     .addComponent(summaryPaneNext, GroupLayout.PREFERRED_SIZE, 511, GroupLayout.PREFERRED_SIZE)))
               .addContainerGap(592, Short.MAX_VALUE))
      );
      gl_panel.setVerticalGroup(
         gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
               .addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
               .addGap(18)
               .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_panel.createSequentialGroup()
                     .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
                        .addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
                           .addComponent(scrollPane, 0, 0, Short.MAX_VALUE)
                           .addGroup(gl_panel.createSequentialGroup()
                              .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                              .addGap(18)
                              .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(lblSelectBusUpdBusResButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                  .addGroup(gl_panel.createSequentialGroup()
                     .addComponent(summaryPaneNext, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
                     .addGap(18)
                     .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(cancelLabelNext)
                        .addComponent(nextLabelNext))))
               .addGap(452))
      );
      
      tableSelectChauffeurNext = new JTable();
      tableSelectChauffeurNext.setModel(new DefaultTableModel(
         new Object[][] {
         },
         new String[] {
            "ID", "Name"
         }
      ));
      scrollPane_1.setViewportView(tableSelectChauffeurNext);
      
      tableSelectBusNext = new JTable();
      tableSelectBusNext.setModel(new DefaultTableModel(
         new Object[][] {
         },
         new String[] {
            "ID", "Price/Hour", "Seats", "Type"
         }
      ));
      scrollPane.setViewportView(tableSelectBusNext);
      panel.setLayout(gl_panel);
      GroupLayout groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addComponent(panel, GroupLayout.DEFAULT_SIZE, 1915, Short.MAX_VALUE)
               .addGap(1))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addComponent(panel, GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
               .addGap(0))
      );
      setLayout(groupLayout);

   }
}
