package Principal;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Autores extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autores frame = new Autores();
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
	public Autores() {
		setBounds(100, 100, 450, 300);

	}

}
