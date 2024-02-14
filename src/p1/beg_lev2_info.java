package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class beg_lev2_info {
    private font font = new font();
    private JLabel begStage, infoLabel;
    private JPanel infoPanel;
    private Image demoIcon;
    private JButton goButton, backButton;

    // Main method
    public static void main(String args[]) {
        // Not used
    }

    // Constructor
    public beg_lev2_info(JFrame baseframe) {
        begStage = new JLabel();
        Image img = new ImageIcon(this.getClass().getResource("/Images/beginnerTitle.png")).getImage();
        begStage.setIcon(new ImageIcon(img));
        begStage.setBounds(310, 50, 200, 100);
        baseframe.add(begStage);

        infoPanel = new JPanel();
        infoPanel.setBounds(225, 170, 350, 240);
        infoPanel.setBackground(Color.red);
        infoPanel.setLayout(null);
        baseframe.add(infoPanel);

        infoLabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Level 2<br/> <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time : 160 Seconds<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hit Target : 30<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Maximum miss : 60<br/> <br/>&nbsp;&nbsp;Objective : Hit The Demon To Gain Points</html>");
        infoLabel.setBounds(10, 20, 370, 200);
        infoLabel.setBackground(Color.yellow);
        infoLabel.setForeground(Color.yellow);
        infoLabel.setFont(font.pixelMplus);
        infoLabel.setFont(infoLabel.getFont().deriveFont(Font.PLAIN, 20f));
        infoPanel.add(infoLabel);

        goButton = new JButton("GO");
        goButton.setBounds(370, 460, 60, 35);
        goButton.setForeground(Color.yellow);
        goButton.setBackground(Color.red);
        goButton.setFont(font.pixelMplus);
        goButton.setFont(goButton.getFont().deriveFont(Font.PLAIN, 20f));
        goButton.setBorderPainted(false);
        goButton.setFocusPainted(false);
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new gameZoneB2();
            }
        });
        baseframe.add(goButton);

        backButton = new JButton("BACK");
        backButton.setBounds(600, 510, 90, 35);
        backButton.setForeground(Color.yellow);
        backButton.setBackground(Color.red);
        backButton.setFont(font.pixelMplus);
        backButton.setFont(backButton.getFont().deriveFont(Font.PLAIN, 20f));
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                begStage.setVisible(false);
                infoLabel.setVisible(false);
                infoPanel.setVisible(false);
                goButton.setVisible(false);
                backButton.setVisible(false);
                new beg_lev_cat(baseframe);
            }
        });
        baseframe.add(backButton);
    }
}