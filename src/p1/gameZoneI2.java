package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import p1.gameZoneB1.gamethread;



public class gameZoneI2 extends JPanel{
	//helper
	static JFrame frame;
//	static retryHandler rHandler = new  retryHandler();
//	static mainMenuHandler mHandler = new  mainMenuHandler();
	
	//the Members
	private static int LEV_MIN = 0; // in pixels
    private static int LEV_SEC = 30; // in pixels
    private static final int IMG_WIDTH = 110; // in pixels
    private static final int IMG_HEIGHT = 131; // in pixels
    private static final int FIMG_WIDTH = 110; // in pixels
    private static final int FIMG_HEIGHT = 110; // in pixels
    private static final int PANEL_WIDTH = 784; // in pixels
    private static final int PANEL_HEIGHT = 511; // in pixels
    private static final int HIT_MISS_LABEL_WIDTH = 100; // in pixels
    private static final int HIT_MISS_LABEL_HEIGHT = 20; // in pixels
    private static final int MAX_IMG_POSITION_X = PANEL_WIDTH -IMG_WIDTH;
    private static final int MAX_IMG_POSITION_Y = PANEL_HEIGHT - IMG_HEIGHT;
    private static final Random RANDOM = new Random();
    private int imgPositionX;
    private int imgPositionY;
    private int fimgPositionX;
    private int fimgPositionY;
    private static int hitCount;
    private static int HIT_TARGET = 5;
    private static int missCount;
    private static int Max_MISSES = 50;
    static Font pixelMplus;
    private Image imgd = new ImageIcon(this.getClass().getResource("/Images/DEMON_2.png")).getImage();
    private Image imgf = new ImageIcon(this.getClass().getResource("/Images/FIRE.png")).getImage();
    private static JLabel hitmissLabel;
    private static Boolean flag1 = true, flag2 = true, flag4 = true;;
    private StartStopTimer phone = new StartStopTimer();
    private static JButton pauseResumeButton ;
    pauseResumeHandler pRHandler = new  pauseResumeHandler();
    //The popup related components
    private static JFrame popupframe = new JFrame();
    private static JLabel levelstatusLabel;
    private static JButton okButton,nextButton, mainMenuButton;

    //The main class
    public static void main(String[] args) {
    	
//		setting up gamePanel()
//		 gameZoneI2 gamePanel = new  gameZoneI2();
//		gamePanel.setBounds(0,50,PANEL_WIDTH, PANEL_HEIGHT);
//		frame.add(gamePanel);      

    }//end of main method
    
    
    public gameZoneI2() {
    	
// 		Setting up the frame	
 		frame = new JFrame("ByteSquad");
 		frame.setSize(800, 600);
 		frame.setVisible(true);
 		frame.getContentPane().setBackground(Color.black);
 		frame.setLayout(null);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setLocationRelativeTo(null);
    	
    	//Setting up the Color
    	Color baseframeColor = null;
    	baseframeColor.getColor(getName(), frame.getContentPane().getBackground());
    	
    	//Setting up the panel
    	
    	phone.min = LEV_MIN;
    	phone.sec = LEV_SEC;
    	setBounds(0,50,PANEL_WIDTH, PANEL_HEIGHT);
    	setBackground(baseframeColor);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	if(flag4 == true) {
                Point point = e.getPoint();
                if (point.x >= imgPositionX && point.x <= imgPositionX + IMG_WIDTH
                        && point.y >= imgPositionY && point.y <= imgPositionY + IMG_HEIGHT) {
                	if(flag1 == true) {
                    hitCount++;
                	}
                } else {
                	if(flag1 == true) {
                    missCount++;
                	}
                }
                //for fire
                if (point.x >= fimgPositionX && point.x <= fimgPositionX + FIMG_WIDTH
                        && point.y >= fimgPositionY && point.y <= fimgPositionY + FIMG_HEIGHT) {
                    hitCount--;
                }
            
                repaint();
            	}
            }
        });
        
      //Setting up Font 
      		try {
      			InputStream font = gameZoneI1.class.getResourceAsStream("/Font/PixelMplus10-Regular.ttf");//Imports the font file
      			pixelMplus = Font.createFont(Font.TRUETYPE_FONT, font);
      		}catch(FontFormatException e) {
      			e.printStackTrace();
      		}catch(IOException e) {
      			System.out.println("Font error");
      			e.printStackTrace();
      		}
      		
      		frame.add(this);
      		
      		//Setting up dashboardPanel
    		JPanel dashPanel = new JPanel();
    		dashPanel.setBounds(0,0,PANEL_WIDTH, 50);
    		dashPanel.setBackground(baseframeColor);
    		dashPanel.setLayout(null);
    		frame.add(dashPanel);
    		
    		//Adding components into the panel

    		//The gameTherad 
    		gamethread g1 = new gamethread();
    		g1.start();

    		//Setting up the pauseResumeButton
    		pauseResumeButton = new JButton();
    		Image img1 = new ImageIcon( gameZoneI1.class.getResource("/Images/pause.png")).getImage(); // removed that .getClass part from the previous buttons
    		pauseResumeButton.setIcon(new ImageIcon(img1));
    		pauseResumeButton.setBounds(PANEL_WIDTH - 70, 10 , 40 ,40);
    		pauseResumeButton.setBackground(baseframeColor);
    		pauseResumeButton.setFont(pixelMplus);
    		pauseResumeButton.setFont( pauseResumeButton.getFont().deriveFont(Font.PLAIN, 20f));
    		pauseResumeButton.setBorderPainted(false);
    		pauseResumeButton.setFocusPainted(false);
    		pauseResumeButton.addActionListener(pRHandler);
    		dashPanel.add( pauseResumeButton);
    		

    		//Setting up the hitmisscountLabel
    		hitmissLabel = new JLabel();
    		hitmissLabel.setBounds(PANEL_WIDTH - 300, 10,220,40);
    		hitmissLabel.setForeground(Color.yellow);
    		hitmissLabel.setOpaque(true);
    		hitmissLabel.setBackground(baseframeColor);
    		hitmissLabel.setFont(pixelMplus);
    		hitmissLabel.setFont( hitmissLabel.getFont().deriveFont(Font.BOLD, 22f));
    		dashPanel.add(hitmissLabel);

    		//Setting up the timer
    		phone.timedisplayer.setForeground(Color.yellow);
    		phone.timedisplayer.setOpaque(true);
    		phone.timedisplayer.setBackground(baseframeColor);
    		phone.timedisplayer.setBounds(20,10,300,40);
    		phone.timedisplayer.setFont(pixelMplus);
    		phone.timedisplayer.setFont(phone.timedisplayer.getFont().deriveFont(Font.BOLD, 22f));
    		dashPanel.add(phone.timedisplayer);
    		phone.startRinging();

    		//Setting up pop buttons
    		//Retry button
    		okButton =  new JButton("OK");
    		okButton.setBounds(140,110,120,40);
    		okButton.setForeground(Color.black);
    		okButton.setBackground(Color.white);
    		okButton.setFont(pixelMplus);
    		okButton.setFont(okButton.getFont().deriveFont(Font.BOLD, 20f));
    		okButton.setBorder(new MatteBorder(4, 4, 4, 4, Color.black));
//        	retryButton.setBorderPainted(false);
    		okButton.setFocusPainted(false);
    		okButton.addActionListener(new ActionListener() {

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				imgPositionX = 0; 
    				imgPositionY = 0;
    				flag1 = true;
    				 flag2 = true;
    				 flag4 = true;
    				hitCount = 0;
    				missCount = 0;
    				hitmissLabel.setText("Hit: " + hitCount + "   Miss: " + (Max_MISSES - missCount));
    			    phone.cancelTimer();
    			    levelstatusLabel.setText("");
    				frame.dispose();
    				popupframe.dispose();
    				
    				//Closing the popup and gameZoneB1
//    				popupframe.dispose();
//    				phone.timedisplayer.setVisible(false);
//    				hitmissLabel.setVisible(false);
//    				pauseResumeButton.setVisible(false);
//    				dashPanel.setVisible(false);
//    				setVisible(false);
//    				
//    				//try to say timer is not cancelled
//    				
//    				imgPositionX = 0; 
//    				imgPositionY = 0;
//    				flag1 = true;
//    				 flag2 = true;
//    				 flag4 = true;
//    				hitCount = 0;
//    				missCount = 0;
//    				hitmissLabel.setText("Hit: " + hitCount + "   Miss: " + (Max_MISSES - missCount));
//    			     phone.cancelTimer();
//    				
//    				//Linking new gameZone
//    				new  beg_lev1_info(frame);
//    				
//    				
//    				//Linking up the beg_lev1_info
////    				gameZoneB1 alkfalk  = new gameZoneB1(baseframe);
////    				new beg_lev1_info(baseframe); 
////    				new gameZoneB1copy1(baseframe);
//    				
//    				beg_lev1_info.begStage.setVisible(true);
//    				beg_lev1_info.infoPanel.setVisible(true);
//    				beg_lev1_info.infoLabel.setVisible(true);
//    				beg_lev1_info.goButton.setVisible(true);
    				
    				
    				
    			}
        		
        	});
//        	//MainMenu Button
//        	mainMenuButton =  new JButton("MAIN MENU");
//        	mainMenuButton.setBounds(270,170,130,30);
//        	mainMenuButton.setForeground(Color.black);
//        	mainMenuButton.setBackground(Color.red);
//        	mainMenuButton.setFont(pixelMplus);
//        	mainMenuButton.setFont(mainMenuButton.getFont().deriveFont(Font.BOLD, 20f));
//        	mainMenuButton.setBorderPainted(false);
//        	mainMenuButton.setFocusPainted(false);
//        	mainMenuButton.addActionListener(new ActionListener() {
//
//    			@Override
//    			public void actionPerformed(ActionEvent e) {
//    				//Closing the popup and gameZoneB1
//    					
//    			}
//        		
//        	});
//        	
//        	
//          	//next button
//        	nextButton =  new JButton("NEXT");
//        	nextButton.setBounds(140,110,120,40);
//        	nextButton.setForeground(Color.black);
//        	nextButton.setBackground(Color.white);
//        	nextButton.setFont(pixelMplus);
//        	nextButton.setFont(nextButton.getFont().deriveFont(Font.BOLD, 20f));
//        	nextButton.setBorder(new MatteBorder(4, 4, 4, 4, Color.black));
////        	nextButton.setBorderPainted(false);
//        	nextButton.setFocusPainted(false);
//        	nextButton.addActionListener(new ActionListener() {
//
//    			@Override
//    			public void actionPerformed(ActionEvent e) {
//    			
//    				
//    			}
//        		
//        	});   	
//     
        
    }
    
    

    //Using Threads to draw the gameZone
    public class gamethread extends Thread{
    	@Override
    	public void run() {

    		 
    		while (true) { // Continuously repaint the panel with a delay of 1 second
    			//	System.out.println("Oh I can be here too" + phone.min + ":" + phone.sec);
    			imgPositionX = 0;
    			imgPositionY = 0;
    			fimgPositionX = 0;
    			fimgPositionY = 0;
    			repaint();
        
    			try {
    				Thread.sleep(1000);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
        
    			//to avoid stop of thread 
    			while(flag2 == false) {
    				System.out.println("The while loop");
    				System.out.println("hey");
    			}  // infinite loop
        
        
    			if(flag2 == true && flag1 == false) { 
    				break;
    			}
                
    		}//End of while loop
    	}
    	
    }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw the image of demon
            if (imgPositionX == 0 && imgPositionY == 0) { 
                imgPositionX = RANDOM.nextInt(MAX_IMG_POSITION_X + 1);
                imgPositionY = RANDOM.nextInt(MAX_IMG_POSITION_Y + 1);
            }
            //For fire
            if (fimgPositionX == 0 && fimgPositionY == 0) { 
                fimgPositionX = RANDOM.nextInt(MAX_IMG_POSITION_X + 1);
                fimgPositionY = RANDOM.nextInt(MAX_IMG_POSITION_Y + 1);
            }
            
            hitmissLabel.setText("Hit: " + hitCount + "   Miss: " + (Max_MISSES - missCount));
              
            if((phone.min == 0 && phone.sec == 0) || hitCount == HIT_TARGET ||   (Max_MISSES - missCount  == 0) ) {
            	phone.timedisplayer.setText("Time Remaining : " + phone.min + ":" + phone.sec);
            	phone.timer.cancel();
            	flag1 =false;
            	flag4 = false;
//            	baseframe.setEnabled(false);
            	//The popups
                if((phone.min == 0 && phone.sec == 0) ||  (Max_MISSES - missCount  == 0) ) {
            	incompletePopup();
                }
                else {
                levelCompletePopup();
                }
            	
            }
            g.drawImage(imgd, imgPositionX,  imgPositionY, getFocusCycleRootAncestor());
            g.drawImage(imgf, fimgPositionX,  fimgPositionY, getFocusCycleRootAncestor());


        }


        public  class pauseResumeHandler implements ActionListener{
        	
        	boolean flag3 = true;
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			Image img2 = new ImageIcon(gameZoneI1.class.getResource("/Images/play.png")).getImage();  // removed that .getClass part from the previous buttons
    			System.out.println("hi");
    			if(flag3 == true) {
    			pauseResumeButton.setIcon(new ImageIcon(img2));
    	        flag3 = false;
    	        //pausing the hit and miss counter
    	        flag1 = false;
    	        //making the main while loop to fall into infinite loop
    	        flag2 = false;
    	        //Pause the timer
    	        phone.pauseTimer();
    	        
    			}
    				else {
    			Image img1 = new ImageIcon(gameZoneI1.class.getResource("/Images/pause.png")).getImage();;
    			pauseResumeButton.setIcon(new ImageIcon(img1 ));
    			flag3 = true;
    			//playing the hit and miss counter
    	        flag1 = true;
    	        //helping the main while loop to come up from the infinite loop
    	        flag2 = true;
    	        //Resume the timer
    	        phone.resumeTimer();
    			}
    		}//End of actionPerformed method 
    	}//End of pauseResumeHandler 
        
        //incomplete popup
        public void incompletePopup(){
        	//the frame
        	popupframe.setUndecorated(true);
        	popupframe.setSize(400, 200);
        	popupframe.getContentPane().setBackground(Color.red);
        	popupframe.setVisible(true);
        	popupframe.setLayout(null);
        	popupframe.setLocationRelativeTo(null);
        	
        	//The level incomplete Label
        	levelstatusLabel =new JLabel("Level Incomplete!!!");
        	levelstatusLabel.setBounds(50, 30, 350, 40);
        	levelstatusLabel.setForeground(Color.black);
        	levelstatusLabel.setFont(pixelMplus);
        	levelstatusLabel.setFont(levelstatusLabel.getFont().deriveFont(Font.BOLD, 30f));
        	popupframe.add(levelstatusLabel);
        	
        	//adding the Buttons
        	popupframe.add(okButton);
//        	popupframe.add(mainMenuButton);
        	

        }
        
        //levelCompletePopup
        public void levelCompletePopup(){
        	//the frame
        	popupframe.setUndecorated(true);
        	popupframe.setSize(400, 200);
        	popupframe.getContentPane().setBackground(Color.red);
        	popupframe.setVisible(true);
        	popupframe.setLayout(null);
        	popupframe.setLocationRelativeTo(null);
        	
        	//The level incomplete Label
        	levelstatusLabel =new JLabel("<html>&nbsp;&nbsp;Congratulations<br/>&nbsp;&nbsp;&nbsp;LevelComplete</html>");
        	levelstatusLabel.setBounds(50, 30, 350, 70);
        	levelstatusLabel.setForeground(Color.black);
        	levelstatusLabel.setFont(pixelMplus);
        	levelstatusLabel.setFont(levelstatusLabel.getFont().deriveFont(Font.BOLD, 30f));
        	popupframe.add(levelstatusLabel);
        	
        	//Adding up the Buttons
          	popupframe.add(okButton);
//        	popupframe.add(mainMenuButton);
        	
        }
        
        
//        
//     
//        
//        public static class retryHandler implements ActionListener{
//
//    		@Override
//    		public void actionPerformed(ActionEvent e) {
//    			// TODO Auto-generated method stub
//    			
//    		}
//    		
//    	}
//        
//        public static class mainMenuHandler implements ActionListener{
//
//    		@Override
//    		public void actionPerformed(ActionEvent e) {
//    			// TODO Auto-generated method stub
//    		}
//    		
//    	}
        
        
}//End of class
