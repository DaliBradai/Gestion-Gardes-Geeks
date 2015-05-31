package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Planification extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planification frame = new Planification();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Planification() {
		setResizable(false);
		setBounds(100, 100, 820, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("08866811");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(180, 111, 227, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("21 034 621 / 53 034 621");
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setBounds(180, 128, 227, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Holou loulou echr9iya :p rte Zembabwey km 819 30720 Japon");
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1.setBounds(180, 146, 604, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("hachem.info@gmail.com");
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2.setBounds(587, 128, 201, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Hachem Rmida");
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setBounds(587, 111, 201, 14);
		contentPane.add(label_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preference pref = new Preference();
				pref.show();
			}
		});
		btnNewButton.setBounds(363, 184, 33, 37);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preference pref = new Preference();
				pref.show();
			}
		});
		button.setBounds(330, 184, 33, 37);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(297, 184, 33, 37);
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(689, 184, 33, 37);
		button_2.setOpaque(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Holiday hol = new Holiday();
				hol.show();
			}
		});
		button_3.setBounds(722, 184, 33, 37);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Holiday hol = new Holiday();
				hol.show();
			}
		});
		button_4.setBounds(755, 184, 33, 37);
		button_4.setOpaque(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		contentPane.add(button_4);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Sunday"},
			},
			new String[] {
				"Day"
			}
		));
		table.setBounds(26, 223, 371, 332);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"23/06/2015", null},
			},
			new String[] {
				"Start date", "End date"
			}
		));
		table_1.setBounds(420, 223, 371, 332);
		contentPane.add(table_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Planification.class.getResource("/view/planification.jpg")));
		lblNewLabel.setBounds(0, 0, 816, 599);
		contentPane.add(lblNewLabel);
	}
}
