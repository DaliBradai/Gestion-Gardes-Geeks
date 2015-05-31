package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class ListMedecin extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListMedecin frame = new ListMedecin();
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
	public ListMedecin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 123, 467, 277);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"(photo)", "Hachem Rmida", "21 034 621", "Aujoud'hui"},
					{"(photo)", "Mohamed Frikha", "22 233 342", "Demain"},
					{"(photo)", "Mohamed  Ali Bredai", "23 213 123", "Demain"},
					{"(photo)", "Akrem Sellami", "55 232 112", "23/06/2015"},
					{"(photo)", "Imen Karray", "23 223 122", "Aujourd'hui"},
					{"(photo)", "Zied Sellami", "54 762 254", "23/06/2015"},
					{"(photo)", "Hatem Hadrich", "99 232 887", "29/04/2015"},
					{"(photo)", "Mohamed Bouhamed", "54 227 015", "29/04/2015"},
				},
				new String[] {
					"Photo", "Nom et pr\u00E9nom", "Num. T\u00E9l", "Disponibilit\u00E9"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(1).setPreferredWidth(191);
			table.getColumnModel().getColumn(2).setPreferredWidth(100);
			table.getColumnModel().getColumn(3).setPreferredWidth(103);
			table.setBounds(0, 0, 467, 275);
			panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 411, 467, 28);
		contentPane.add(panel_1);
		
		JButton button = new JButton("Annuler");
		button.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\drop-no.gif"));
		button.setBounds(378, 0, 89, 23);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(0, 0, 487, 71);
		contentPane.add(panel_2);
		
		JLabel label = new JLabel("  Liste des medecins");
		label.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\doctor-male-icon-64.png"));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(10, 0, 296, 71);
		panel_2.add(label);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_3.setBounds(10, 74, 467, 38);
		contentPane.add(panel_3);
		
		JButton button_2 = new JButton("Supprimer");
		button_2.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\delete.gif"));
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Modifier");
		button_3.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\edit.gif"));
		panel_3.add(button_3);
		
		JButton button_1 = new JButton("Ajouter");
		panel_3.add(button_1);
		button_1.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\drop-add.gif"));
	}
	
	
	
}
