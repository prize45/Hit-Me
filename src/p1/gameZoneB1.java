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

public class gameZoneB1 extends JPanel {
    static JFrame frame;

    // Members
    private static int LEV_MIN = 3;
    private static int LEV_SEC = 0;
    private static final int IMG_WIDTH = 110;
    private static final int IMG_HEIGHT = 122;
    private static final int PANEL_WIDTH = 784;
    private static final int PANEL_HEIGHT = 511;
    private static final int HIT_MISS_LABEL_WIDTH = 100;
    private static final int HIT_MISS_LABEL_HEIGHT = 20;
    private static final int MAX_IMG_POSITION_X = PANEL_WIDTH - IMG_WIDTH;
    private static final int MAX_IMG_POSITION_Y = PANEL_HEIGHT - IMG_HEIGHT;
    private static final Random RANDOM = new Random();
    private int imgPositionX;
    private int imgPositionY;
    private static int hitCount = 0;
    private static int HIT_TARGET = 20;
    private static int missCount = 0;
    private static int Max_MISSES = 60;
    static Font pixelMplus;
    private Image imgd = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage();
    private static JLabel hitmissLabel;
    private static Boolean flag1 = true, flag2 = true, flag4 = true;
    private StartStopTimer phone = new StartStopTimer();
    private static JButton pauseResumeButton;
    pauseResumeHandler pRHandler = new pauseResumeHandler();
    private static JFrame popupframe = new JFrame();
    private static JLabel levelstatusLabel;
    private static JButton okButton, nextButton, mainMenuButton;
    private Image demonIcon;

    // Main method
    public static void main(String[] args) {
//        gameZoneB1 gamePanel = new gameZoneB1();
//        gamePanel.setBounds(0, 50, PANEL_WIDTH, PANEL_HEIGHT);
//        frame.add(gamePanel);
    }

    // Constructor
    public gameZoneB1() {
        frame = new JFrame("ByteSquad");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
		//Setting up the icon
		demonIcon = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage(); // Setting up the frame icon
		frame.setIconImage(demonIcon);

        Color baseframeColor = null;
        baseframeColor.getColor(getName(), frame.getContentPane().getBackground());

        phone.min = LEV_MIN;
        phone.sec = LEV_SEC;
        setBounds(0, 50, PANEL_WIDTH, PANEL_HEIGHT);
        setBackground(baseframeColor);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (flag4 == true) {
                    Point point = e.getPoint();
                    if (point.x >= imgPositionX && point.x <= imgPositionX + IMG_WIDTH
                            && point.y >= imgPositionY && point.y <= imgPositionY + IMG_HEIGHT) {
                        if (flag1 == true) {
                            hitCount++;
                        }
                    } else {
                        if (flag1 == true) {
                            missCount++;
                        }
                    }
                    repaint();
                }
            }
        });

        try {
            InputStream font = gameZoneB1.class.getResourceAsStream("/Font/PixelMplus10-Regular.ttf");
            pixelMplus = Font.createFont(Font.TRUETYPE_FONT, font);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Font error");
            e.printStackTrace();
        }

        frame.add(this);

        JPanel dashPanel = new JPanel();
        dashPanel.setBounds(0, 0, PANEL_WIDTH, 50);
        dashPanel.setBackground(baseframeColor);
        dashPanel.setLayout(null);
        frame.add(dashPanel);

        gamethread g1 = new gamethread();
        g1.start();

        pauseResumeButton = new JButton();
        Image img1 = new ImageIcon(gameZoneB1.class.getResource("/Images/pause.png")).getImage();
        pauseResumeButton.setIcon(new ImageIcon(img1));
        pauseResumeButton.setBounds(PANEL_WIDTH - 70, 10, 40, 40);
        pauseResumeButton.setBackground(baseframeColor);
        pauseResumeButton.setFont(pixelMplus);
        pauseResumeButton.setFont(pauseResumeButton.getFont().deriveFont(Font.PLAIN, 20f));
        pauseResumeButton.setBorderPainted(false);
        pauseResumeButton.setFocusPainted(false);
        pauseResumeButton.addActionListener(pRHandler);
        dashPanel.add(pauseResumeButton);

        hitmissLabel = new JLabel();
        hitmissLabel.setBounds(PANEL_WIDTH - 300, 10, 220, 40);
        hitmissLabel.setForeground(Color.yellow);
        hitmissLabel.setOpaque(true);
        hitmissLabel.setBackground(baseframeColor);
        hitmissLabel.setFont(pixelMplus);
        hitmissLabel.setFont(hitmissLabel.getFont().deriveFont(Font.BOLD, 22f));
        dashPanel.add(hitmissLabel);

        phone.timedisplayer.setForeground(Color.yellow);
        phone.timedisplayer.setOpaque(true);
        phone.timedisplayer.setBackground(baseframeColor);
        phone.timedisplayer.setBounds(20, 10, 300, 40);
        phone.timedisplayer.setFont(pixelMplus);
        phone.timedisplayer.setFont(phone.timedisplayer.getFont().deriveFont(Font.BOLD, 22f));
        dashPanel.add(phone.timedisplayer);
        phone.startRinging();
    }

    // Gamethread
    public class gamethread extends Thread {
        @Override
        public void run() {
            while (true) {
                imgPositionX = 0;
                imgPositionY = 0;
                repaint();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                while (flag2 == false) {
                    System.out.println("The while loop");
                    System.out.println("hey");
                }

                if (flag2 == true && flag1 == false) {
                    break;
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("I am from paint");

        if (imgPositionX == 0 && imgPositionY == 0) {
            imgPositionX = RANDOM.nextInt(MAX_IMG_POSITION_X + 1);
            imgPositionY = RANDOM.nextInt(MAX_IMG_POSITION_Y + 1);
        }

        hitmissLabel.setText("Hit: " + hitCount + "   Miss: " + (Max_MISSES - missCount));

        if ((phone.min == 0 && phone.sec == 0) || hitCount == HIT_TARGET || (Max_MISSES - missCount == 0)) {
            phone.timedisplayer.setText("Time Remaining : " + phone.min + ":" + phone.sec);
            phone.timer.cancel();
            flag1 = false;
            flag4 = false;

            if ((phone.min == 0 && phone.sec == 0) || (Max_MISSES - missCount == 0)) {
                incompletePopup();
            } else {
                levelCompletePopup();
            }
        }
        g.drawImage(imgd, imgPositionX, imgPositionY, getFocusCycleRootAncestor());
    }

    // pauseResumeHandler
    public class pauseResumeHandler implements ActionListener {
        boolean flag3 = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            Image img2 = new ImageIcon(gameZoneB1.class.getResource("/Images/play.png")).getImage();
            System.out.println("hi");
            if (flag3 == true) {
                pauseResumeButton.setIcon(new ImageIcon(img2));
                flag3 = false;
                flag1 = false;
                flag2 = false;
                phone.pauseTimer();
            } else {
                Image img1 = new ImageIcon(gameZoneB1.class.getResource("/Images/pause.png")).getImage();
                pauseResumeButton.setIcon(new ImageIcon(img1));
                flag3 = true;
                flag1 = true;
                flag2 = true;
                phone.resumeTimer();
            }
        }
    }

    // incompletePopup
    public void incompletePopup() {
        popupframe.setUndecorated(true);
        popupframe.setSize(400, 200);
        popupframe.getContentPane().setBackground(Color.red);
        popupframe.setVisible(true);
        popupframe.setLayout(null);
        popupframe.setLocationRelativeTo(null);

        levelstatusLabel = new JLabel("Level Incomplete!!!");
        levelstatusLabel.setBounds(50, 30, 350, 40);
        levelstatusLabel.setForeground(Color.black);
        levelstatusLabel.setFont(pixelMplus);
        levelstatusLabel.setFont(levelstatusLabel.getFont().deriveFont(Font.BOLD, 30f));
        popupframe.add(levelstatusLabel);

        popupframe.add(okButton);
    }

    // levelCompletePopup
    public void levelCompletePopup() {
        popupframe.setUndecorated(true);
        popupframe.setSize(400, 200);
        popupframe.getContentPane().setBackground(Color.red);
        popupframe.setVisible(true);
        popupframe.setLayout(null);
        popupframe.setLocationRelativeTo(null);

        levelstatusLabel = new JLabel("<html>&nbsp;&nbsp;Congratulations<br/>&nbsp;&nbsp;&nbsp;LevelComplete</html>");
        levelstatusLabel.setBounds(50, 30, 350, 70);
        levelstatusLabel.setForeground(Color.black);
        levelstatusLabel.setFont(pixelMplus);
        levelstatusLabel.setFont(levelstatusLabel.getFont().deriveFont(Font.BOLD, 30f));
        popupframe.add(levelstatusLabel);

        popupframe.add(okButton);
    }
}