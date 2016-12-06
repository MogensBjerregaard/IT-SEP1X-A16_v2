package autoBus;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

public class UpdateTourPanel extends JPanel {
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

	/**
	 * Create the panel.
	 */
	
	public void createEvents(){
		lblUpdateTourButton.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent event){
				Autobus.frame.hideAllPanels();
				listBuses(currentlyUpdatingTour.getDateInterval().getStartDate());
				listChauffeurs();
				Autobus.frame.updateTourPanel.setVisible(true);
			}
		});
		
	}
	
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
		
		JLabel lblSearchButtonUpdTour = new JLabel("Search");
		lblSearchButtonUpdTour.setForeground(Color.WHITE);
		lblSearchButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSearchButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		JLabel lblAddNewTourButtonUpdTour = new JLabel("Save Changes");
		lblAddNewTourButtonUpdTour.setForeground(Color.WHITE);
		lblAddNewTourButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAddNewTourButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		JCheckBox allInclusiveUpdTour = new JCheckBox("All inclusive");
		allInclusiveUpdTour.setForeground(Color.WHITE);
		allInclusiveUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		allInclusiveUpdTour.setBackground(new Color(95, 158, 160));
		
		JCheckBox lunchUpdTour = new JCheckBox("Lunch");
		lunchUpdTour.setForeground(Color.WHITE);
		lunchUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lunchUpdTour.setBackground(new Color(95, 158, 160));
		
		JCheckBox breakfastUpdTour = new JCheckBox("Breakfast");
		breakfastUpdTour.setForeground(Color.WHITE);
		breakfastUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		breakfastUpdTour.setBackground(new Color(95, 158, 160));
		
		JLabel lblAddNewPickUpButtonUpdTour = new JLabel("Add");
		lblAddNewPickUpButtonUpdTour.setForeground(Color.WHITE);
		lblAddNewPickUpButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblAddNewPickUpButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		lblAddNewPickUpButtonUpdTour.setBackground(new Color(95, 158, 160));
		
		JLabel lblClearAllPickUpsButtonUpdTour = new JLabel("Clear");
		lblClearAllPickUpsButtonUpdTour.setForeground(Color.WHITE);
		lblClearAllPickUpsButtonUpdTour.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblClearAllPickUpsButtonUpdTour.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		JCheckBox ticketsUpdTour = new JCheckBox("Entrance tickets");
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
		GroupLayout gl_updateTourMainPanel = new GroupLayout(updateTourMainPanel);
		gl_updateTourMainPanel.setHorizontalGroup(
			gl_updateTourMainPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_updateTourMainPanel.createSequentialGroup()
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
				.addGroup(gl_updateTourMainPanel.createSequentialGroup()
					.addContainerGap(1334, Short.MAX_VALUE)
					.addComponent(lblAddNewTourButtonUpdTour)
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
					.addGroup(gl_updateTourMainPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_updateTourMainPanel.createSequentialGroup()
							.addComponent(lblAddNewTourButtonUpdTour)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_updateTourMainPanel.createSequentialGroup()
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
							.addGap(43)))
					.addGap(13))
		);
		
		JList list = new JList();
		scrollPane_2.setViewportView(list);
		
		tableChauffeursUpdTour = new JTable();
		tableChauffeursUpdTour.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name"
			}
		) {
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
}
