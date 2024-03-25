package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public Test2() {
		super("회원가입");		
		setSize(600,480);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 560, 44);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setBounds(24, 10, 524, 24);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 63, 560, 226);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("성명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 163, 51);
		pn2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("성명");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(12, 81, 163, 51);
		pn2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("성명");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(12, 150, 163, 51);
		pn2.add(lblNewLabel_1_1_2);
		
		textField = new JTextField();
		textField.setBounds(233, 29, 227, 36);
		pn2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(233, 94, 227, 36);
		pn2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(233, 159, 227, 36);
		pn2.add(textField_2);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 299, 560, 132);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(22, 34, 150, 71);
		pn3.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("New button_1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(206, 34, 150, 71);
		pn3.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(206, 34, 150, 71);
		pn3.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("New button_2");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(383, 34, 150, 71);
		pn3.add(btnNewButton_2_1);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
		
	}
}
