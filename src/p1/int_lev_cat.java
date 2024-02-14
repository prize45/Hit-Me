package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class int_lev_cat {

	private static JLabel intlevelTitle;
	private font font = new font();
	private static JButton playIlev1,playIlev2,backButton;
	
	public int_lev_cat(JFrame baseframe) {
 		
 		//Setting up beglevelTitle
		intlevelTitle = new JLabel("INTERMEDIATE LEVELS");
		intlevelTitle.setBounds(200, 50, 500, 70);
		intlevelTitle.setBackground(Color.red);
		intlevelTitle.setForeground(Color.red);
		intlevelTitle.setFont(font.pixelMplus);
		intlevelTitle.setFont(intlevelTitle.getFont().deriveFont(Font.BOLD,40f));
 		baseframe.add(intlevelTitle);
 		
 		//the buttons
 				//Setting up  Play Button
 				playIlev1 = new JButton("PLAY LEVEL 1");
 				playIlev1.setBounds(270,200,250,35);
 				playIlev1.setForeground(Color.yellow);
 				playIlev1.setBackground(Color.red);
 				playIlev1.setFont(font.pixelMplus);
 				playIlev1.setFont(playIlev1.getFont().deriveFont(Font.PLAIN, 20f));
 				playIlev1.setBorderPainted(false);
 				playIlev1.setFocusPainted(false);
 				playIlev1.addActionListener(new ActionListener() {

 					@Override
 					public void actionPerformed(ActionEvent e) {
 						intlevelTitle.setVisible(false);
 						playIlev1.setVisible(false);
 						playIlev2.setVisible(false);
 						backButton.setVisible(false);
 						
 						//Link to beg_lev1_info
 						new int_lev1_info(baseframe);
 					}
 					
 				});
 				baseframe.add(playIlev1);
 				
 				//Play beginner level Buton
 				playIlev2 = new JButton("PLAY LEVEL 2");
 				playIlev2.setBounds(270,300,250,35);
 				playIlev2.setForeground(Color.yellow);
 				playIlev2.setBackground(Color.red);
 				playIlev2.setFont(font.pixelMplus);
 				playIlev2.setFont(playIlev2.getFont().deriveFont(Font.PLAIN, 20f));
 				playIlev2.setBorderPainted(false);
 				playIlev2.setFocusPainted(false);
 				playIlev2.addActionListener(new ActionListener() {

 					@Override
 					public void actionPerformed(ActionEvent e) {
 						
 						intlevelTitle.setVisible(false);
 						playIlev1.setVisible(false);
 						playIlev2.setVisible(false);
 						backButton.setVisible(false);
 						
 						//Link to beg_lev1_info
 						new int_lev2_info(baseframe);
 					}
 					
 				});
 				baseframe.add(playIlev2);
 				

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
 						intlevelTitle.setVisible(false);
 						playIlev1.setVisible(false);
 						playIlev2.setVisible(false);
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
