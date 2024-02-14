package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class scoreboard {
	//helper
	private JFrame frame;
	public static JButton backButton;
	private font font = new font();
	
	public scoreboard(JFrame baseframe) {
 		
 		//setting up backButton
 		backButton = new JButton("BACK");
 		backButton.setBounds(600,510,90,35); // Set the position and size of the button
 		backButton.setForeground(Color.yellow); // Set the text color of the button
 		backButton.setBackground(Color.red); // Set the background color of the button
 		backButton.setFont(font.pixelMplus); // Set the font of the button
 		backButton.setFont(backButton.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
 		backButton.setBorderPainted(false); // Remove the border of the button
 		backButton.setFocusPainted(false); // Remove the focus paint of the button
 		backButton.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				backButton.setVisible(false); // Hide the button
 				new MenuPage(baseframe); // Link to the MenuPage
 			}
 		});
 		baseframe.add(backButton); // Add the button to the baseframe
	}
	
	public static void main(String[]args) {
//		new scoreboard();
		
	}

}