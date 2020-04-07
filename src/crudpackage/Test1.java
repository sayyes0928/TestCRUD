package crudpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test1 {

	private JFrame frame;
	private JTextField name;
	private JTextField id;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 window = new Test1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Frame");
		frame.setBounds(100, 100, 600, 400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel WellcomePanel = new JPanel();
		WellcomePanel.setBounds(0, 0, 596, 372);
		frame.getContentPane().add(WellcomePanel);
		WellcomePanel.setLayout(null);
		
		JPanel InsertPanel = new JPanel();
		InsertPanel.setBounds(151, 50, 421, 300);
		WellcomePanel.add(InsertPanel);
		InsertPanel.setBackground(Color.WHITE);
		InsertPanel.setLayout(null);
		InsertPanel.setVisible(false);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertPanel.setVisible(true);

			}
		});
		btnInsert.setBounds(12, 50, 91, 23);
		WellcomePanel.add(btnInsert);
		
		JButton btnSelect = new JButton("SELECT");
		btnSelect.setBounds(12, 100, 91, 23);
		WellcomePanel.add(btnSelect);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(12, 150, 91, 23);
		WellcomePanel.add(btnUpdate);
		
		JButton btnDele = new JButton("DELETE");
		btnDele.setBounds(12, 200, 91, 23);
		WellcomePanel.add(btnDele);
		
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(12, 50, 87, 25);
		InsertPanel.add(lblId);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(12, 150, 87, 25);
		InsertPanel.add(lblPhone);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 101, 87, 25);
		InsertPanel.add(lblName);
		
		name = new JTextField();
		name.setBounds(72, 103, 214, 23);
		InsertPanel.add(name);
		name.setColumns(10);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(72, 52, 214, 23);
		InsertPanel.add(id);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(72, 152, 214, 23);
		InsertPanel.add(phone);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameTxt = name.getText();
				String idTxt = id.getText();
				String phoneTxt = phone.getText();
			}
		});
		btnSubmit.setBounds(77, 230, 91, 23);
		InsertPanel.add(btnSubmit);
	}
}
