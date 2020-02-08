package GUI;

import java.awt.*;
import com.jgoodies.*;
import javax.swing.*;

public class UILogin {

	private JFrame loginForm;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	
	/**
	 * Create the application.
	 */
	public UILogin() {
		initialize();
	}
	
	public void Show() {
		loginForm.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginForm = new JFrame();
		loginForm.setResizable(false);
		loginForm.setTitle("S\u00E0n ch\u1EE9ng kho\u00E1n thu nh\u1ECF");
		loginForm.setBounds(200, 100, 462, 206);
		loginForm.setLocationRelativeTo(null);
		loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginForm.getContentPane().setLayout(null);
		
		JLabel lbUsername = new JLabel("Username");
		lbUsername.setBounds(142, 39, 70, 14);
		loginForm.getContentPane().add(lbUsername);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 122, 123);
		loginForm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("D:\\EcliseProjects\\FormJava_BTGiuaKy\\resources\\logo_mta.png"));
		logo.setBounds(10, 11, 102, 101);
		panel.add(logo);
		
		JLabel lbPassword = new JLabel("Password");
		lbPassword.setBounds(142, 77, 70, 14);
		loginForm.getContentPane().add(lbPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(222, 36, 207, 20);
		loginForm.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(222, 71, 207, 20);
		loginForm.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(340, 102, 89, 32);
		loginForm.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(222, 102, 89, 32);
		loginForm.getContentPane().add(btnRegister);
		
		JLabel lbTitle = new JLabel("By Kh\u1EA3i V\u0169 (KTPM15)");
		lbTitle.setBounds(10, 146, 122, 14);
		loginForm.getContentPane().add(lbTitle);
	}
}
