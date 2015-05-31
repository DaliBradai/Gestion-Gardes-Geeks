package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.Canvas;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class List extends JFrame {

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
					List frame = new List();
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
	public List() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(347, 11, 115, 117);
		contentPane.add(label);
		label.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\profil.jpg"));
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(11, 82, 466, 57);
		contentPane.add(panel_4);
		
		JLabel lblNomEtPrnom = new JLabel("Nom et prénom:  Hachem Rmida");
		lblNomEtPrnom.setBounds(10, 11, 321, 14);
		panel_4.add(lblNomEtPrnom);
		
		JLabel lblNumTl = new JLabel("Num. Tél: 21 034 621");
		lblNumTl.setBounds(10, 32, 321, 14);
		panel_4.add(lblNumTl);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Pr\u00E9f\u00E9rences", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(11, 150, 228, 219);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
					{"23/10/2015"},
					{"17/06/2015"},
					{"15/05/2016"},
					{"02/06/2016"},
					{"09/07/2017"},
					{"23/10/2015"},
					{"17/06/2015"},
					{"15/05/2016"},
					{"02/06/2016"},
					{"09/07/2017"},
			},
			new String[] {
				"New column"
			}
		));
		table.setBounds(10, 56, 208, 118);
		panel.add(table);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(129, 185, 89, 23);
		panel.add(btnAjouter);
		btnAjouter.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\drop-add.gif"));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\edit.gif"));
		btnModifier.setBounds(118, 22, 100, 23);
		panel.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\delete.gif"));
		btnSupprimer.setBounds(10, 22, 100, 23);
		panel.add(btnSupprimer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(0, 0, 487, 71);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\3468229751094944365.png"));
		lblNewLabel.setBounds(10, 0, 64, 71);
		panel_1.add(lblNewLabel);
		
		JLabel lblPlanningDesVancances = new JLabel("Planning des vancances");
		lblPlanningDesVancances.setForeground(Color.WHITE);
		lblPlanningDesVancances.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPlanningDesVancances.setBounds(84, 11, 220, 26);
		panel_1.add(lblPlanningDesVancances);
		
		JLabel lblEtDesPrferences = new JLabel("et des préferences");
		lblEtDesPrferences.setForeground(Color.WHITE);
		lblEtDesPrferences.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEtDesPrferences.setBounds(84, 34, 220, 26);
		panel_1.add(lblEtDesPrferences);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 411, 467, 28);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(378, 0, 89, 23);
		panel_2.add(btnAnnuler);
		btnAnnuler.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\drop-no.gif"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Vacances", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(249, 150, 228, 219);
		contentPane.add(panel_3);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"14/03/2015", "14/04/2015"},
				{"17/07/2016", "17/08/2016"},
				{"17/07/2016", "17/08/2016"},
				{"17/07/2016", "17/08/2016"},
				{"17/07/2016", "17/08/2016"},
				{"17/07/2016", "17/08/2016"},
				{"17/07/2016", "17/08/2016"},
				{"17/07/2016", "17/08/2016"},
			},
			new String[] {
				"Date d\u00E9but", "Date fin"
			}
		));
		table_1.setBounds(10, 56, 208, 118);
		panel_3.add(table_1);
		
		JButton button = new JButton("Ajouter");
		button.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\drop-add.gif"));
		button.setBounds(129, 185, 89, 23);
		panel_3.add(button);
		
		JButton button_1 = new JButton("Modifier");
		button_1.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\edit.gif"));
		button_1.setBounds(118, 22, 100, 23);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("Supprimer");
		button_2.setIcon(new ImageIcon("D:\\mes secrets\\Documents\\Cyle d'ingenieur\\2ème année\\2ème semestre\\Agile\\workshop\\delete.gif"));
		button_2.setBounds(10, 22, 100, 23);
		panel_3.add(button_2);
		
		JLabel lblText = new JLabel("Text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text");
		lblText.setBounds(11, 380, 466, 14);
		contentPane.add(lblText);
	}
	

	
	
	
}
