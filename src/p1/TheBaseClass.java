package p1;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TheBaseClass {
	JFrame baseframe;
	public static JLabel title, demon1;
	public static JButton enterButton;
	private Image demonIcon;
	private font font = new font();
	private titleScreenHandler tHandler = new titleScreenHandler();

	
public TheBaseClass() {
		
		baseframe = new JFrame("ByteSquad");
		baseframe.setSize(800, 600);
		baseframe.setVisible(true);
		baseframe.getContentPane().setBackground(Color.black);
		baseframe.setLayout(null);
		baseframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		baseframe.setLocationRelativeTo(null);
		
		//Setting up the title image
		title = new JLabel();
		Image img0 = new ImageIcon(this.getClass().getResource("/Images/Title.png")).getImage();
		title.setIcon(new ImageIcon(img0));
		title.setBounds(295, 270, 400, 100); // Positioning the title image
		baseframe.add(title);
		
		//Adding enter Button
		enterButton =  new JButton("ENTER");
		enterButton.setBounds(350,420,110,30); // Positioning the enter button
		enterButton.setForeground(Color.yellow);
		enterButton.setBackground(Color.red);
		
		enterButton.setFont(font.pixelMplus); // Setting the font for the enter button
		enterButton.setFont(enterButton.getFont().deriveFont(Font.BOLD, 20f)); // Setting the font size and style
		enterButton.setBorderPainted(false); // Removing border from the button
		enterButton.setFocusPainted(false); // Removing focus border
		enterButton.addActionListener(tHandler); // Adding action listener to the button
		baseframe.add(enterButton);
		
		//Setting up the icon
		demonIcon = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage(); // Setting up the frame icon
		baseframe.setIconImage(demonIcon);
		
		//Adding the Image to the Home page
		demon1 = new JLabel();
		Image img1 = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage();
		demon1.setIcon(new ImageIcon(img1));
		demon1.setBounds(350, 140, 110, 122);  // Positioning the demon image
		baseframe.add(demon1);
	}
	
	
    public static void main(String[] args) {
    	new TheBaseClass();
    }
    
	public class titleScreenHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			title.setVisible(false);
			demon1.setVisible(false);
			enterButton.setVisible(false);
			//linking up MenuPage
			new MenuPage(baseframe);
		}
		
	}
    
}