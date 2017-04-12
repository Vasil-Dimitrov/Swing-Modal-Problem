

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings({"serial"})
public class MainDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static MainDialog dialog;
	private JButton btnCurrent;

	/**
	 * Launch the application.
	 */
	public static void main(String...arg) {
		try {
			dialog = new MainDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MainDialog() {
		setAlwaysOnTop(true);
		setResizable(false);
		initComponents();
		createEvents();
	}
	
	//////////////////////////////////////////////////////////////
	// This method contains all of the code for creating and 
	// initializing components.
	//////////////////////////////////////////////////////////////
	public void initComponents(){	
		setName("dialog01");
		setTitle("Candle Exercise");
		setBounds(100, 100, 356, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		Font font = new Font("Tahoma", Font.PLAIN, 13);

		btnCurrent = new JButton("Show Labels");
		btnCurrent.setToolTipText("shows current best data saved");
		btnCurrent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCurrent.setFocusPainted(false);
		btnCurrent.setBounds(68, 77, 214, 88);
		contentPanel.add(btnCurrent);

	}
	
	//////////////////////////////////////////////////////////////
	// This method contains all of the code for creating events  
	//////////////////////////////////////////////////////////////
	public void createEvents(){
		btnCurrent.addActionListener((ActionEvent e) -> JLabelDialog.run());
	}

}
