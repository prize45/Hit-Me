package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class exp_lev_cat {
	
	private static JLabel explevelTitle;
	private font font = new font();
	private static JButton playElev1,playElev2,backButton;
	
	public exp_lev_cat(JFrame baseframe) {
 		
 		//Setting up beglevelTitle
		explevelTitle = new JLabel("EXPERT LEVELS");
		explevelTitle.setBounds(260, 50, 400, 70);
		explevelTitle.setBackground(Color.red);
		explevelTitle.setForeground(Color.red);
		explevelTitle.setFont(font.pixelMplus);
		explevelTitle.setFont(explevelTitle.getFont().deriveFont(Font.BOLD,40f));
 		baseframe.add(explevelTitle);
 		
 		//the buttons
 				//Setting up  Play Button
 				playElev1 = new JButton("PLAY LEVEL 1");
 				playElev1.setBounds(270,200,250,35);
 				playElev1.setForeground(Color.yellow);
 				playElev1.setBackground(Color.red);
 				playElev1.setFont(font.pixelMplus);
 				playElev1.setFont(playElev1.getFont().deriveFont(Font.PLAIN, 20f));
 				playElev1.setBorderPainted(false);
 				playElev1.setFocusPainted(false);
 				playElev1.addActionListener(new ActionListener() {

 					@Override
 					public void actionPerformed(ActionEvent e) {
 						explevelTitle.setVisible(false);
 						playElev1.setVisible(false);
 						playElev2.setVisible(false);
 						backButton.setVisible(false);
 						
 						//Link to beg_lev1_info
 						new exp_lev1_info(baseframe);
 					}
 					
 				});
 				baseframe.add(playElev1);
 				
 				//Play beginner level Buton
 				playElev2 = new JButton("PLAY LEVEL 2");
 				playElev2.setBounds(270,300,250,35);
 				playElev2.setForeground(Color.yellow);
 				playElev2.setBackground(Color.red);
 				playElev2.setFont(font.pixelMplus);
 				playElev2.setFont(playElev2.getFont().deriveFont(Font.PLAIN, 20f));
 				playElev2.setBorderPainted(false);
 				playElev2.setFocusPainted(false);
 				playElev2.addActionListener(new ActionListener() {

 					@Override
 					public void actionPerformed(ActionEvent e) {
 						
 						explevelTitle.setVisible(false);
 						playElev1.setVisible(false);
 						playElev2.setVisible(false);
 						backButton.setVisible(false);
 						
 						//Link to beg_lev1_info
 						new exp_lev2_info(baseframe);
 					}
 					
 				});
 				baseframe.add(playElev2);
 				

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
 						explevelTitle.setVisible(false);
 						playElev1.setVisible(false);
 						playElev2.setVisible(false);
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
