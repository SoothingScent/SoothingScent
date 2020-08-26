import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test implements ActionListener {

	private JFrame frame;
	private JTextField NameField;
	private JTextField IDField;
	private JTextField PWField;
	private JButton btnIDCheck, btnPWCheck, btnInsert, btnDelete, btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblname = new JLabel("\uC774\uB984");
		lblname.setBounds(38, 44, 57, 15);
		frame.getContentPane().add(lblname);
		
		NameField = new JTextField();
		NameField.setBounds(107, 41, 116, 21);
		frame.getContentPane().add(NameField);
		NameField.setColumns(10);
		
		IDField = new JTextField();
		IDField.setBounds(107, 72, 116, 21);
		frame.getContentPane().add(IDField);
		IDField.setColumns(10);
		
		PWField = new JTextField();
		PWField.setBounds(107, 103, 116, 21);
		frame.getContentPane().add(PWField);
		PWField.setColumns(10);
		
		JLabel lblID = new JLabel("\uC544\uC774\uB514");
		lblID.setBounds(38, 75, 57, 15);
		frame.getContentPane().add(lblID);
		
		JLabel lblPW = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPW.setBounds(38, 106, 57, 15);
		frame.getContentPane().add(lblPW);
		
		btnIDCheck = new JButton("\uC911\uBCF5\uD655\uC778");
		btnIDCheck.setBounds(235, 71, 97, 23);
		frame.getContentPane().add(btnIDCheck);
		
		btnPWCheck = new JButton("\uD655\uC778");
		btnPWCheck.setBounds(235, 102, 97, 23);
		frame.getContentPane().add(btnPWCheck);
		
		btnInsert = new JButton("\uC0BD\uC785");
		btnInsert.setBounds(34, 158, 97, 23);
		frame.getContentPane().add(btnInsert);
		
		btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setBounds(157, 158, 97, 23);
		frame.getContentPane().add(btnDelete);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(280, 158, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		btnIDCheck.addActionListener(this);
		btnPWCheck.addActionListener(this);
		btnInsert.addActionListener(this);
		btnDelete.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
