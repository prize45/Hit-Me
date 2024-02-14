package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class beg_lev_cat {
	//helper
//	private JFrame frame;
	
	private static JLabel beglevelTitle;
	private font font = new font();
	private static JButton playBlev1,playBlev2,backButton;
	
	public beg_lev_cat(JFrame baseframe) {
 		//helper
// 		Setting up the frame	
// 		frame = new JFrame("ByteSquad");
// 		frame.setSize(800, 600);
// 		frame.setVisible(true);
// 		frame.getContentPane().setBackground(Color.black);
// 		frame.setLayout(null);
// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		frame.setLocationRelativeTo(null);
 		
 		//Setting up beglevelTitle
 		beglevelTitle = new JLabel("BEGINNER LEVELS");
 		beglevelTitle.setBounds(230, 50, 400, 70);
 		beglevelTitle.setBackground(Color.red);
 		beglevelTitle.setForeground(Color.red);
 		beglevelTitle.setFont(font.pixelMplus);
 		beglevelTitle.setFont(beglevelTitle.getFont().deriveFont(Font.BOLD,40f));
 		baseframe.add(beglevelTitle);
 		
 		//the buttons
 				//Setting up  Play Button
 				playBlev1 = new JButton("PLAY LEVEL 1");
 				playBlev1.setBounds(270,200,250,35);
 				playBlev1.setForeground(Color.yellow);
 				playBlev1.setBackground(Color.red);
 				playBlev1.setFont(font.pixelMplus);
 				playBlev1.setFont(playBlev1.getFont().deriveFont(Font.PLAIN, 20f));
 				playBlev1.setBorderPainted(false);
 				playBlev1.setFocusPainted(false);
 				playBlev1.addActionListener(new ActionListener() {

 					@Override
 					public void actionPerformed(ActionEvent e) {
 						beglevelTitle.setVisible(false);
 						playBlev1.setVisible(false);
 						playBlev2.setVisible(false);
 						backButton.setVisible(false);
 						
 						//Link to beg_lev1_info
 						new beg_lev1_info(baseframe);
 					}
 					
 				});
 				baseframe.add(playBlev1);
 				
 				//Play beginner level Buton
 				playBlev2 = new JButton("PLAY LEVEL 2");
 				playBlev2.setBounds(270,300,250,35);
 				playBlev2.setForeground(Color.yellow);
 				playBlev2.setBackground(Color.red);
 				playBlev2.setFont(font.pixelMplus);
 				playBlev2.setFont(playBlev2.getFont().deriveFont(Font.PLAIN, 20f));
 				playBlev2.setBorderPainted(false);
 				playBlev2.setFocusPainted(false);
 				playBlev2.addActionListener(new ActionListener() {

 					@Override
 					public void actionPerformed(ActionEvent e) {
 						
 						beglevelTitle.setVisible(false);
 						playBlev1.setVisible(false);
 						playBlev2.setVisible(false);
 						backButton.setVisible(false);
 						
 						//Link to beg_lev1_info
 						new beg_lev2_info(baseframe);
 					}
 					
 				});
 				baseframe.add(playBlev2);
 				

 				//backButton
 				backButton = new JButton("BACK");
 				backButton.setBounds(600,510,90,35);
 				backButton.setForeground(Color.yellow);
 				backButton.setBackground(Color.red);
 				backButton.setFont(font.pixelMplus);
 				backButton.setFont(backButton.getFont().deriveFont(Font.PLAIN, 20f));
 				backButton.setBorderPainted(false);
 				backButton.setFocusPainted(false);
 				backButton.addActionListener(new ActionListener() {

 					@Override
 					public void actionPerformed(ActionEvent e) {
 						beglevelTitle.setVisible(false);
 						playBlev1.setVisible(false);
 						playBlev2.setVisible(false);
 						backButton.setVisible(false);
 						
 						//linking to stageCatalogue
 						new stageCatalogue(baseframe);
 						
 					}
 					
 				});
 				baseframe.add(backButton);
		
	}
	
    
	public static void main(String[]args) {
//		new beg_lev_cat();
		
	}
	
	
}
