package arkadiuszsas.norwegian_cards.display;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class MainFrame {

	//to display main frame type new MainFrame("frame name");
	
	private JFrame frame;
	
	public MainFrame(String frameName) {
		frame = new JFrame(frameName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame settings
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		//set icon
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/appIcon.png"));
		
		//set frame visibable at the end!
		frame.setVisible(true);
	}
}
