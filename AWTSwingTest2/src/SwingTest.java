import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SwingTest {

	private JFrame frame;
	private JTextField txtNum;
	private JTextField txtName;
	private JTextField txtMail;
	private JTextField txtTel;
	private JTable Table;
	private JLabel lblNum, lblName, lblMail, lblTel;
	private JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel;
	private JScrollPane ScrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTest window = new SwingTest();
					window.frame.setVisible(true);
					window.frame.setTitle("연습용");
					window.frame.setBounds(100, 100, 670, 260);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("연습용");
		frame.setBounds(100, 100, 614, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNum = new JLabel("번  호");
		lblNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNum.setBounds(12, 10, 57, 15);
		frame.getContentPane().add(lblNum);

		lblName = new JLabel("이  름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(12, 49, 57, 15);
		frame.getContentPane().add(lblName);

		lblMail = new JLabel("이 메 일");
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail.setBounds(12, 87, 57, 15);
		frame.getContentPane().add(lblMail);

		lblTel = new JLabel("전화번호");
		lblTel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTel.setBounds(12, 126, 57, 15);
		frame.getContentPane().add(lblTel);

		txtNum = new JTextField();
		txtNum.setBounds(81, 7, 116, 21);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);

		txtName = new JTextField();
		txtName.setBounds(81, 46, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtMail = new JTextField();
		txtMail.setBounds(81, 84, 116, 21);
		frame.getContentPane().add(txtMail);
		txtMail.setColumns(10);

		txtTel = new JTextField();
		txtTel.setBounds(81, 123, 116, 21);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);

		btnTotal = new JButton("전체보기");
		btnTotal.setBounds(81, 190, 92, 23);
		frame.getContentPane().add(btnTotal);

		btnAdd = new JButton("추 가");
		btnAdd.setBounds(185, 190, 92, 23);
		frame.getContentPane().add(btnAdd);

		btnDel = new JButton("삭 제");
		btnDel.setBounds(289, 190, 92, 23);
		frame.getContentPane().add(btnDel);

		btnSearch = new JButton("검 색");
		btnSearch.setBounds(393, 190, 92, 23);
		frame.getContentPane().add(btnSearch);

		btnCancel = new JButton("취 소");
		btnCancel.setBounds(497, 190, 92, 23);
		frame.getContentPane().add(btnCancel);

		ScrollPane = new JScrollPane();
		ScrollPane.setBounds(209, 9, 390, 176);
		frame.getContentPane().add(ScrollPane);

		Table = new JTable();
		ScrollPane.setViewportView(Table);
	}
}
