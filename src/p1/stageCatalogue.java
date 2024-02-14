package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class stageCatalogue {
	//Helper
//	JFrame frame;
//	private beginnerHandler bHandler = new beginnerHandler();
//	private intermediateHandler iHandler = new intermediateHandler();
//	private expertHandler eHandler = new expertHandler();
//	private homeHandler h_Handler = new homeHandler();
	
	//Components	
	private JLabel pnLabel, sel_st_image;
	private JTextField playerName;
	private Image demoIcon;
	private JButton begButton,interButton,expButton,homebutton,PlayerButton;
	private font font = new font();
	
	//The main class
	public static void main(String args[]) {
//		new stageCatalogue();
	
	}
	
	//the Constructor
	public stageCatalogue(JFrame baseframe) {
		//helper
//		frame = new JFrame("ByteSquad");
//		frame.setSize(800, 600);
//		frame.setVisible(true);
//		frame.getContentPane().setBackground(Color.black);
//		frame.setLayout(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLocationRelativeTo(null);
		//Setting up the icon
//		demoIcon = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage();//Imports the font file
//		frame.setIconImage(demoIcon);
		
		
		//the pLabelPlayerName
		pnLabel = new JLabel("PLAYER NAME");
		pnLabel.setBounds(300, 100, 250, 70);
		pnLabel.setBackground(Color.red);
		pnLabel.setForeground(Color.red);
		pnLabel.setFont(font.pixelMplus);
		pnLabel.setFont(pnLabel.getFont().deriveFont(Font.PLAIN,36f));
		baseframe.add(pnLabel);
		
		//setting up textfeildPlayerName
		playerName = new JTextField("hi", 1);
		playerName.setBounds(270, 170, 250, 40);
		playerName.setBorder(new MatteBorder(4, 4, 4, 4, Color.red));
		playerName.setBackground(Color.gray);
		playerName.setForeground(Color.yellow);
		playerName.setFont(font.pixelMplus);
		playerName.setFont(playerName.getFont().deriveFont(Font.BOLD,20f));
		baseframe.add(playerName);
		
		//Setting up  PlayerButton Button
		PlayerButton = new JButton("LOGIN");
		PlayerButton.setBounds(500, 170,100,40);
		PlayerButton.setForeground(Color.yellow);
		PlayerButton.setBackground(Color.red);
		PlayerButton.setFont(font.pixelMplus);
		PlayerButton.setFont(PlayerButton.getFont().deriveFont(Font.PLAIN, 20f));
		PlayerButton.setBorderPainted(false);
		PlayerButton.setFocusPainted(false);
		baseframe.add(PlayerButton);
		
		//Setting up the selectStage image
		sel_st_image = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/selectstage.png")).getImage();
		sel_st_image.setIcon(new ImageIcon(img));
		sel_st_image.setBounds(315, 300, 200, 20);
		baseframe.add(sel_st_image);
		
		
		//the buttons
		//Setting up  beginner Button
		begButton = new JButton("BEGINNER");
		begButton.setBounds(270,350,250,35);
		begButton.setForeground(Color.yellow);
		begButton.setBackground(Color.red);
		begButton.setFont(font.pixelMplus);
		begButton.setFont(begButton.getFont().deriveFont(Font.PLAIN, 20f));
		begButton.setBorderPainted(false);
		begButton.setFocusPainted(false);
		begButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnLabel.setVisible(false);
				playerName.setVisible(false);
				sel_st_image.setVisible(false);
				begButton.setVisible(false);
				interButton.setVisible(false);
				expButton.setVisible(false);
				homebutton.setVisible(false);
				PlayerButton.setVisible(false);
				//Linking up the beg_lev1_info
//				new beg_lev1_info(baseframe);
				new beg_lev_cat(baseframe);
			}
			
		});
		baseframe.add(begButton);
		
		//Setting up intermediate Button
		interButton = new JButton("INTERMEDIATE");
		interButton.setBounds(270,410,250,35);
		interButton.setForeground(Color.yellow);
		interButton.setBackground(Color.red);
		interButton.setFont(font.pixelMplus);
		interButton.setFont(interButton.getFont().deriveFont(Font.PLAIN, 20f));
		interButton.setBorderPainted(false);
		interButton.setFocusPainted(false);
		interButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnLabel.setVisible(false);
				playerName.setVisible(false);
				sel_st_image.setVisible(false);
				begButton.setVisible(false);
				interButton.setVisible(false);
				expButton.setVisible(false);
				homebutton.setVisible(false);
				PlayerButton.setVisible(false);
				//Linking up the beg_lev1_info
				new int_lev_cat(baseframe);
			}
			
		});
		baseframe.add(interButton);
		
		//setting up expert Button
		expButton = new JButton("EXPERT");
		expButton.setBounds(270,470,250,35);
		expButton.setForeground(Color.yellow);
		expButton.setBackground(Color.red);
		expButton.setFont(font.pixelMplus);
		expButton.setFont(expButton.getFont().deriveFont(Font.PLAIN, 20f));
		expButton.setBorderPainted(false);
		expButton.setFocusPainted(false);
		expButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnLabel.setVisible(false);
				playerName.setVisible(false);
				sel_st_image.setVisible(false);
				begButton.setVisible(false);
				interButton.setVisible(false);
				expButton.setVisible(false);
				homebutton.setVisible(false);
				PlayerButton.setVisible(false);
				//Linking up the beg_lev1_info
				new exp_lev_cat(baseframe);
			}
			
		});
		baseframe.add(expButton);
		
		//setting up home Button icon
		homebutton= new JButton();
		Image img1 = new ImageIcon(this.getClass().getResource("/Images/homeIcon.png")).getImage();
		homebutton.setIcon(new ImageIcon(img1));
		homebutton.setForeground(Color.yellow);
		homebutton.setBackground(Color.black);
		homebutton.setBorderPainted(false);
		homebutton.setFocusPainted(false);
		homebutton.setBounds(720,10,40,40);
		homebutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnLabel.setVisible(false);
				playerName.setVisible(false);
				sel_st_image.setVisible(false);
				begButton.setVisible(false);
				interButton.setVisible(false);
				expButton.setVisible(false);
				homebutton.setVisible(false);
				PlayerButton.setVisible(false);
				
				//Visibility of Home
				TheBaseClass.title.setVisible(true);
				TheBaseClass.demon1.setVisible(true);
				TheBaseClass.enterButton.setVisible(true);	
			}
			
		});
		baseframe.add(homebutton);
		
		//helper
//		frame.add(pnLabel);
//		frame.add(playerName);
//		frame.add(sel_st_image);
//		frame.add(begButton);
//		frame.add(interButton);
//		frame.add(expButton);	
//		frame.add(homebutton);
	}	
	
//	public class beginnerHandler implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			frame.dispose();
//			new beg_lev1_info();
//			
//		}
//		
//	}
	
//	public class intermediateHandler implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
	
//	public class expertHandler implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
	
//	public class homeHandler implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//		}
//		
//	}
}
