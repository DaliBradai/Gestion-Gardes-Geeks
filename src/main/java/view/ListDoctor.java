package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListDoctor extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListDoctor frame = new ListDoctor();
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
	public ListDoctor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(316, 90, 114, 60);
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Planification Pla = new Planification();
				Pla.show();
			}
		});
		button_2.setBounds(437, 90, 114, 60);
		button_2.setOpaque(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		contentPane.add(button_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"08866811", "hachem", "rmida", "21034621", "53034621", "hachem.info@gmail.com", "Disponible"},
			},
			new String[] {
				"CIN", "First Name", "Last Name", "Phone Number 1", "Phone Number 2", "E-mail", "Availability"
			}
		));
		table.setBounds(26, 195, 763, 360);
		contentPane.add(table);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDoctor AD = new AddDoctor();
				AD.show();
			}
		});
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(680, 90, 114, 60);
		contentPane.add(button);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(559, 90, 114, 60);
		contentPane.add(button_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ListDoctor.class.getResource("/view/doctorList.jpg")));
		lblNewLabel.setBounds(0, 0, 816, 599);
		contentPane.add(lblNewLabel);
	}
}
