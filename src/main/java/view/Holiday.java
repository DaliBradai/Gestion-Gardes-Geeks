package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Holiday extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Holiday frame = new Holiday();
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
	public Holiday() {
		setResizable(false);
		setBounds(100, 100, 552, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(117, 162, 132, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(377, 162, 132, 20);
		contentPane.add(textField_1);
		
		JButton button = new JButton("");
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(417, 211, 114, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(296, 211, 114, 34);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("dfz");
		lblNewLabel.setIcon(new ImageIcon(Holiday.class.getResource("/view/holiday.jpg")));
		//lblNewLabel.setIcon(new ImageIcon(Holiday.class.getResource("/view/holiday.jpg")));
		lblNewLabel.setBounds(0, 0, 552, 256);
		contentPane.add(lblNewLabel);
	}

}
