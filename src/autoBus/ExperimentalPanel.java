package autoBus;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

public class ExperimentalPanel extends JPanel {
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

	/**
	 * Create the panel.
	 */
	
	public void createEventsForNewBusReservationUpdatePanel(){
		
	
	}
	
	public ExperimentalPanel() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Customer", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBackground(new Color(95, 158, 160));
		
		JLabel label = new JLabel("Phone");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(new Color(95, 158, 160));
		
		JLabel label_1 = new JLabel("Search");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_1.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		JLabel label_2 = new JLabel("Clear");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_2.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		JCheckBox checkBox = new JCheckBox("is a passenger");
		checkBox.setForeground(Color.WHITE);
		checkBox.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		checkBox.setBackground(new Color(95, 158, 160));
		
		JRadioButton radioButton = new JRadioButton("Company");
		radioButton.setForeground(Color.WHITE);
		radioButton.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		radioButton.setBackground(new Color(95, 158, 160));
		
		JRadioButton radioButton_1 = new JRadioButton("School");
		radioButton_1.setForeground(Color.WHITE);
		radioButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		radioButton_1.setBackground(new Color(95, 158, 160));
		
		JRadioButton radioButton_2 = new JRadioButton("Private");
		radioButton_2.setForeground(Color.WHITE);
		radioButton_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		radioButton_2.setBackground(new Color(95, 158, 160));
		
		JLabel label_3 = new JLabel("Name/contact");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setSelectionColor(new Color(102, 205, 170));
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(95, 158, 160));
		
		JLabel label_4 = new JLabel("Name/organisation");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		textField_2 = new JTextField();
		textField_2.setSelectionColor(new Color(102, 205, 170));
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(95, 158, 160));
		
		JLabel label_5 = new JLabel("Email");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(95, 158, 160));
		
		JLabel label_6 = new JLabel("Address");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		textField_4 = new JTextField();
		textField_4.setSelectionColor(new Color(102, 205, 170));
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(95, 158, 160));
		
		JLabel label_7 = new JLabel("Birthday");
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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Add passenger", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), null));
		panel_2.setBackground(new Color(95, 158, 160));
		
		JLabel label_8 = new JLabel("Address");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		JLabel label_9 = new JLabel("Email");
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
		
		JLabel label_10 = new JLabel("Phone");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		JLabel label_11 = new JLabel("Name");
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
		
		JLabel label_12 = new JLabel("Search");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_12.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(3, 3, 3, 3)));
		
		JLabel label_13 = new JLabel("Birthday");
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
		
		JLabel label_14 = new JLabel("Clear");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_14.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		JLabel label_15 = new JLabel("Add");
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_15.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
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
							.addComponent(label_15)))
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
						.addComponent(label_15))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel label_16 = new JLabel("Remove");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_16.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		JLabel label_17 = new JLabel("Clear all");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_17.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new EmptyBorder(5, 5, 5, 5)));
		
		JLabel label_18 = new JLabel("NEXT >>");
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "Passenger list", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)), new EmptyBorder(3, 3, 3, 3)));
		scrollPane.setBackground(new Color(95, 158, 160));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 128));
		
		JLabel label_19 = new JLabel("New Bus & Chauffeur reservation");
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1369, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(899, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 58, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 1369, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
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
									.addPreferredGap(ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
									.addComponent(label_18)
									.addGap(35))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
									.addGap(27))))
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 669, Short.MAX_VALUE)
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
					.addContainerGap(211, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1369, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 669, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
