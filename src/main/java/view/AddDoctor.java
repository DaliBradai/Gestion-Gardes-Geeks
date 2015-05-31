package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddDoctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDoctor frame = new AddDoctor();
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
	public AddDoctor() {
		setResizable(false);
		setBounds(100, 100, 820, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(170, 147, 44, 23);
		radioButton.setOpaque(false);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(227, 147, 61, 23);
		radioButton_1.setOpaque(false);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(301, 147, 61, 23);
		radioButton_2.setOpaque(false);
		contentPane.add(radioButton_2);
		
		textField = new JTextField();
		textField.setBounds(175, 187, 197, 20);
		textField.setOpaque(false);
		textField.setBorder(null);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(175, 228, 197, 20);
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(175, 267, 197, 20);
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(576, 267, 197, 20);
		textField_3.setOpaque(false);
		textField_3.setBorder(null);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(631, 228, 142, 20);
		textField_4.setOpaque(false);
		textField_4.setBorder(null);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(631, 187, 142, 20);
		textField_5.setOpaque(false);
		textField_5.setBorder(null);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(576, 147, 197, 20);
		textField_6.setOpaque(false);
		textField_6.setBorder(null);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(576, 187, 33, 20);
		textField_7.setOpaque(false);
		textField_7.setBorder(null);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(576, 228, 33, 20);
		textField_8.setOpaque(false);
		textField_8.setBorder(null);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AddDoctor.class.getResource("/view/add_edit_doctor.jpg")));
		lblNewLabel.setBounds(0, 0, 816, 599);
		contentPane.add(lblNewLabel);
		
		button = new JButton("");
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(678, 319, 114, 34);
		contentPane.add(button);
		
		button_1 = new JButton("");
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(557, 319, 114, 34);
		contentPane.add(button_1);
	}
}
