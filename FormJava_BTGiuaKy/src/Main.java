import java.awt.EventQueue;

import GUI.*;

public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UILogin window = new UILogin();
					window.Show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
