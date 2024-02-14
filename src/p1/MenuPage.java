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

public class MenuPage {
	
	//Helper
//	JFrame frame;
//	private startHandler sHandler = new startHandler();
//	private scoreboardHandler scoHandler = new scoreboardHandler();
//	private settingsHandler stHandler = new settingsHandler();
//	private homeHandler h_Handler = new homeHandler();
//	private exitHandler eHandler = new exitHandler();
	
	//the components
	public static JLabel menutitle;
	public static JButton startButton, scoreButton, settButton, homeButton, exitButton;
	private Image demoIcon;
	private font font = new font();
	static boolean flag = true;
	
	//The main class
	public static void main(String args[]) {
//		new MenuPage();
	
	}
	
	//the constructor
		public MenuPage(JFrame baseframe) {
			
			
			//helper
			//Setting up the frame	
//			frame = new JFrame("ByteSquad");
//			frame.setSize(800, 600);
//			frame.setVisible(true);
//			frame.getContentPane().setBackground(Color.black);
//			frame.setLayout(null);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.setLocationRelativeTo(null);
//			//Setting up the icon
//			demoIcon = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage();//Imports the font file
//			frame.setIconImage(demoIcon);
			
			
			//the title
			menutitle = new JLabel("HIT-ME");
			menutitle.setBounds(270, 100, 250, 70);
			menutitle.setBackground(Color.red);
			menutitle.setForeground(Color.red);
//			menutitle.setOpaque(true);
			menutitle.setFont(font.pixelMplus);
			menutitle.setFont(menutitle.getFont().deriveFont(Font.BOLD,76f));
			baseframe.add(menutitle);
			
			//the buttons
			//Setting up startButton
			startButton = new JButton("START");
			startButton.setBounds(310,270,150,35);
			startButton.setForeground(Color.yellow);
			startButton.setBackground(Color.red);
			startButton.setFont(font.pixelMplus);
			startButton.setFont(startButton.getFont().deriveFont(Font.PLAIN, 20f));
			startButton.setBorderPainted(false);
			startButton.setFocusPainted(false);
			startButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					menutitle.setVisible(false);
					startButton.setVisible(false);
					scoreButton.setVisible(false);
					settButton.setVisible(false);
					homeButton.setVisible(false);
					exitButton.setVisible(false);
					
					//linking up the stageCatalogue class
					new stageCatalogue(baseframe);
					
				}
				
			});
			baseframe.add(startButton);
			
			
			//Setting up scoreButton
			scoreButton = new JButton("SCOREBOARD");
			scoreButton.setBounds(310,330,150,35);
			scoreButton.setForeground(Color.yellow);
			scoreButton.setBackground(Color.red);
			scoreButton.setFont(font.pixelMplus);
			scoreButton.setFont(scoreButton.getFont().deriveFont(Font.PLAIN, 20f));
			scoreButton.setBorderPainted(false);
			scoreButton.setFocusPainted(false);
			scoreButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				
					
					// TODO Auto-generated method stub
					menutitle.setVisible(false);
					startButton.setVisible(false);
					scoreButton.setVisible(false);
					settButton.setVisible(false);
					homeButton.setVisible(false);
					exitButton.setVisible(false);
					
					//linking up the scoreboard class
					new scoreboard(baseframe);
					
				}
				
			
			});
			baseframe.add(scoreButton);
			
			//setting up settButton
			settButton = new JButton("SETTINGS");
			settButton.setBounds(310,390,150,35);
			settButton.setForeground(Color.yellow);
			settButton.setBackground(Color.red);
			settButton.setFont(font.pixelMplus);
			settButton.setFont(settButton.getFont().deriveFont(Font.PLAIN, 20f));
			settButton.setBorderPainted(false);
			settButton.setFocusPainted(false);
			settButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					
					// TODO Auto-generated method stub
					menutitle.setVisible(false);
					startButton.setVisible(false);
					scoreButton.setVisible(false);
					settButton.setVisible(false);
					homeButton.setVisible(false);
					exitButton.setVisible(false);
					
					//linking to setting panel
					if(flag == true) {
						flag = false;
					new settingsPanel(baseframe);
					}else {
					settingsPanel.f_backPanel.setVisible(true);
					settingsPanel.o_backPanel.setVisible(true);
					settingsPanel.settingsTitle.setVisible(true);
					settingsPanel.musicLabel.setVisible(true);
					settingsPanel.themeLabel.setVisible(true);
					settingsPanel.ocb.setVisible(true);
					settingsPanel.fcb.setVisible(true);
					settingsPanel.pauseResumeButton.setVisible(true);
					settingsPanel.backButton.setVisible(true);
					}
					
				}
				
			});
			baseframe.add(settButton);
			
			//setting up home Button icon
			homeButton= new JButton("HOME");
			Image img1 = new ImageIcon(this.getClass().getResource("/Images/homeIcon.png")).getImage();
			homeButton.setIcon(new ImageIcon(img1));
			homeButton.setBounds(310,450,150,35);
			homeButton.setFont(font.pixelMplus);
			homeButton.setFont(homeButton.getFont().deriveFont(Font.PLAIN, 22f));
			homeButton.setForeground(Color.red);
			homeButton.setBackground(Color.black);
			homeButton.setBorderPainted(false);
			homeButton.setFocusPainted(false);
			homeButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					
					// TODO Auto-generated method stub
					//setvisibilty
					menutitle.setVisible(false);
					startButton.setVisible(false);
					scoreButton.setVisible(false);
					settButton.setVisible(false);
					homeButton.setVisible(false);
					exitButton.setVisible(false);
					
					//Visibility of Home
					TheBaseClass.title.setVisible(true);
					TheBaseClass.demon1.setVisible(true);
					TheBaseClass.enterButton.setVisible(true);	
				}
				
				
			});
			baseframe.add(homeButton);
			
			//setting up exitButton
			exitButton = new JButton("EXIT");
			exitButton.setBounds(600,510,90,35);
			exitButton.setForeground(Color.yellow);
			exitButton.setBackground(Color.red);
			exitButton.setFont(font.pixelMplus);
			exitButton.setFont(exitButton.getFont().deriveFont(Font.PLAIN, 20f));
			//Setting the border curve try 1
//			exitButton.setBorder(new RoundedBorder(10));
			exitButton.setBorderPainted(false);
			exitButton.setFocusPainted(false);
			exitButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				
					// TODO Auto-generated method stub
					System.exit(0);
				}
				
			});
			baseframe.add(exitButton);
			
			//helper
//			frame.add(menutitle);
//			frame.add(startButton);
//			frame.add(scoreButton);
//			frame.add(settButton);
//			frame.add(homeButton);
//			frame.add(exitButton);
			
		}	
		
		
//		public class startHandler implements ActionListener{
	//
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				frame.dispose();
////				new stageCatalogue();
//			}
//			
//		}
		
		
//		public class scoreboardHandler implements ActionListener{
	//
//			@Override
//			public void actionPerformed(ActionEvent e) {
	//	
//			}
//			
//		}
		
//		public class settingsHandler implements ActionListener{
	//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		}
		
//		public class homeHandler implements ActionListener{
	//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		}
		
//		public class exitHandler implements ActionListener{
	//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//				
//			}
//			
//		}
		

}
