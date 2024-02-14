package p1;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class settingsPanel {

	
	//Members
	public static JPanel o_backPanel, f_backPanel, o_frontPanel, f_frontPanel;
	public static JLabel settingsTitle, musicLabel, themeLabel, o_Label, f_Label;
	public static Checkbox ocb,fcb;
	public static JButton backButton;
	private font font = new font();
    public static JButton pauseResumeButton ;
    static pauseResumeHandler pRHandler = new  pauseResumeHandler();
    private static soundClass sound = new soundClass();
	
	
 	public settingsPanel(JFrame baseframe) {
 		
 		//Setting up the settings title image
 		settingsTitle = new JLabel();
 		Image img = new ImageIcon(this.getClass().getResource("/Images/settingsTitle.png")).getImage();
 		settingsTitle.setIcon(new ImageIcon(img));
 		settingsTitle.setBounds(305, 50, 200, 50);
 		baseframe.add(settingsTitle);
 				
 		//Setting up musicLabel
 		musicLabel = new JLabel("MUSIC");
 		musicLabel.setBounds(150, 150, 150, 70);
 		musicLabel.setBackground(Color.red);
 		musicLabel.setForeground(Color.red);
 		musicLabel.setFont(font.pixelMplus);
 		musicLabel.setFont(musicLabel.getFont().deriveFont(Font.BOLD,40f));
 		baseframe.add(musicLabel);
 		
 		
 		//Setting up the pauseResumeButton
 		pauseResumeButton = new JButton();
 		Image img1 = new ImageIcon( this.getClass().getResource("/Images/ToggleOFF.png")).getImage();
 		pauseResumeButton.setIcon(new ImageIcon(img1));
 		pauseResumeButton.setBounds(400, 165 , 65 ,50);
 		pauseResumeButton.setBackground(Color.black);
 		pauseResumeButton.setFont(font.pixelMplus);
 		pauseResumeButton.setFont( pauseResumeButton.getFont().deriveFont(Font.PLAIN, 20f));
 		pauseResumeButton.setBorderPainted(false);
 		pauseResumeButton.setFocusPainted(false);
 		pauseResumeButton.addActionListener(pRHandler);
 		baseframe.add(pauseResumeButton);
 		
 		//Setting up themeLabel
 		themeLabel = new JLabel("THEME");
 		themeLabel.setBounds(150, 250, 150, 70);
 		themeLabel.setBackground(Color.red);
 		themeLabel.setForeground(Color.red);
 		themeLabel.setFont(font.pixelMplus);
 		themeLabel.setFont(themeLabel.getFont().deriveFont(Font.BOLD,40f));
 		baseframe.add(themeLabel);
 		
 		//The Ocean Theme
 		//setting up the back panel
 		o_backPanel = new JPanel();
 		o_backPanel.setBounds(400, 250, 100, 100);
 		o_backPanel.setBackground(Color.red);
 		o_backPanel.setLayout(null);
 		baseframe.add(o_backPanel);
 		
 		//setting up the front panel
 		o_frontPanel = new JPanel();
 		o_frontPanel.setBounds(25, 30, 50, 50);
 		o_frontPanel.setBackground(Color.blue);
 		o_frontPanel.setLayout(null);
 		o_backPanel.add(o_frontPanel);
 		
 		//Setting up Color Label
 		o_Label = new JLabel("OCEAN");
 		o_Label.setBounds(25, 3, 60, 25);
 		o_Label.setBackground(Color.red);
 		o_Label.setForeground(Color.blue);
 		o_Label.setFont(font.pixelMplus);
 		o_Label.setFont(o_Label.getFont().deriveFont(Font.BOLD,20f));
 		o_backPanel.add(o_Label);
 		
 		//The Check box
 		ocb = new Checkbox();
 		ocb.setBounds(445,400, 12, 12);
 		ocb.setForeground(Color.red);
 		ocb.addItemListener(new ItemListener()  {
 			@Override
 			public void itemStateChanged(ItemEvent e) {
 				if(e.getStateChange() == ItemEvent.SELECTED) {
 			    	 baseframe.getContentPane().setBackground(Color.blue);
 			     }else {
 			    	 baseframe.getContentPane().setBackground(Color.black);
 			     }             
 			}
 		});
 		baseframe.add(ocb);
 		
 		//The Forest Theme
 		//setting up the back panel
 		f_backPanel = new JPanel();
 		f_backPanel.setBounds(600, 250, 100, 100);
 		f_backPanel.setBackground(Color.red);
 		f_backPanel.setLayout(null);
 		baseframe.add(f_backPanel);
 		
 		//setting up the front panel
 		f_frontPanel = new JPanel();
 		f_frontPanel.setBounds(25, 30, 50, 50);
 		f_frontPanel.setBackground(Color.green);
 		f_frontPanel.setLayout(null);
 		f_backPanel.add(f_frontPanel);
 		
 		//Setting up Color Label
 		f_Label = new JLabel("FOREST");
 		f_Label.setBounds(22, 3, 70, 25);
 		f_Label.setBackground(Color.red);
 		f_Label.setForeground(Color.green);
 		f_Label.setFont(font.pixelMplus);
 		f_Label.setFont(f_Label.getFont().deriveFont(Font.BOLD,20f));
 		f_backPanel.add(f_Label);
 		
 		//The Check box
 		fcb = new Checkbox();
 		fcb.setBounds(645,400, 12, 12);
 		fcb.setForeground(Color.red);
 		fcb.addItemListener(new ItemListener()  {
 			@Override
 			public void itemStateChanged(ItemEvent e) {
 				if(e.getStateChange() == ItemEvent.SELECTED) {
 			    	 baseframe.getContentPane().setBackground(Color.green);
 			     }else {
 			    	 baseframe.getContentPane().setBackground(Color.black);
 			     }	            
 			}
 		});
 		baseframe.add(fcb);
 		
 		//setting up backButton
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
 				f_backPanel.setVisible(false);
 				o_backPanel.setVisible(false);
 				settingsTitle.setVisible(false);
 				musicLabel.setVisible(false);
 				themeLabel.setVisible(false);
 				ocb.setVisible(false);
 				fcb.setVisible(false);
 				pauseResumeButton.setVisible(false);
 				backButton.setVisible(false);
 				new MenuPage(baseframe);
 			}
 		});
 		baseframe.add(backButton);
 	}
    
    
	public static class pauseResumeHandler implements ActionListener{
    	boolean flag3 = true;
		@Override
		public void actionPerformed(ActionEvent e) {
			Image img2 = new ImageIcon(this.getClass().getResource("/Images/ToggleON.png")).getImage();
			if(flag3 == true) {
				pauseResumeButton.setIcon(new ImageIcon(img2));
		        flag3 = false;
		        playMusic(0);
			} else {
				Image img1 = new ImageIcon(this.getClass().getResource("/Images/ToggleOFF.png")).getImage();
				pauseResumeButton.setIcon(new ImageIcon(img1));
				flag3 = true;
				stopMusic();
			}
		}
	}
	
 	public static void playMusic(int i) {
		sound.setFile(i);
		sound.play();
		sound.loop();
	}
	
	public static void stopMusic() {
		sound.stop();
	}
	
	public static void playSE(int i) {
		sound.setFile(i);
		sound.play();
	}
}