package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Preference extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preference frame = new Preference();
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
	public Preference() {
		setResizable(false);
		setBounds(100, 100, 420, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
		comboBox.setBounds(84, 159, 303, 28);
		comboBox.setBorder(null);
		comboBox.setBackground(null);
		contentPane.add(comboBox);
		
		JButton button = new JButton("");
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(164, 211, 114, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(285, 211, 114, 34);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Preference.class.getResource("/view/preference.jpg")));
		label.setBounds(0, 0, 420, 256);
		contentPane.add(label);
	}
}
