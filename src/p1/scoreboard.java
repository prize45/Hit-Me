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
		//helper
 		//Setting up the frame	
// 		frame = new JFrame("ByteSquad");
// 		frame.setSize(800, 600);
// 		frame.setVisible(true);
// 		frame.getContentPane().setBackground(Color.black);
// 		frame.setLayout(null);
// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		frame.setLocationRelativeTo(null);
		
 		
 		//setting up backButton
 		backButton = new JButton("BACK");
 		backButton.setBounds(600,510,90,35);
 		backButton.setForeground(Color.yellow);
 		backButton.setBackground(Color.red);
 		backButton.setFont(font.pixelMplus);
 		backButton.setFont(backButton.getFont().deriveFont(Font.PLAIN, 20f));
 		//Setting the border curve try 1
// 					exitButton.setBorder(new RoundedBorder(10));
 		backButton.setBorderPainted(false);
 		backButton.setFocusPainted(false);
 		backButton.addActionListener(new ActionListener() {

 					@Override
 				public void actionPerformed(ActionEvent e) {
 						//SetVisible
 						backButton.setVisible(false);
 						
 						//Linking to MenuPage page
 						new MenuPage(baseframe);
 						
 						
 				}
 				
 		});
// 		baseframe.add(backButton);
 		baseframe.add(backButton);
	}
	
	public static void main(String[]args) {
//		new scoreboard();
		
	}

}
