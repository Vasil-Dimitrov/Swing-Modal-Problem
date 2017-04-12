

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JLabelDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JLabelDialog dialog;
	/**
	 * Launch the application.
	 */
	public static void run() {
		try {
			dialog = new JLabelDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocation(MainDialog.dialog.getLocation());
			dialog.setVisible(true);
			dialog.repaint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the dialog.
	 */
	public JLabelDialog() {
		setModal(true);		// IF THIS IS SET TO FALSE EVERYTHING WORKS WELL
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("JLabel Dialog");
		setBounds(100, 100, 333, 244);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setToolTipText("Not updatable");
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		Font font = new Font("Tahoma", Font.PLAIN, 13);
		/*
		 * FIRST LABEL
		 */
		JLabel lblFirst = new JLabel("First Label");
		lblFirst.setFont(font);
		lblFirst.setBounds(12, 46, 87, 16);
		contentPanel.add(lblFirst);
		/*
		 * SECOND LABEL
		 */
		JLabel lblSecond = new JLabel("Second Label");
		lblSecond.setFont(font);
		lblSecond.setBounds(228, 46, 87, 16);
		contentPanel.add(lblSecond);
		
		/*
		 * THIRD LABEL
		 */
		JLabel lblThird = new JLabel("Third Label");
		lblThird.setFont(font);
		lblThird.setBounds(129, 46, 87, 16);
		contentPanel.add(lblThird);
		/*
		 * BUTTON
		 */
		JButton btnButton = new JButton("Button");
		btnButton.setBounds(43, 121, 257, 51);
		contentPanel.add(btnButton);
	}
	



	
}
