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
import javax.swing.JPanel;

public class beg_lev1_info {
	// Components
	private font font = new font();
	public static JLabel begStage, infoLabel;
	public static JPanel infoPanel;
	private Image demoIcon;
	public static JButton goButton, backButton;
	static int k = 0;

	// Constructor
	public beg_lev1_info(JFrame baseframe) {
		// Setting up the stageTitle image
		begStage = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/beginnerTitle.png")).getImage();
		begStage.setIcon(new ImageIcon(img));
		begStage.setBounds(310, 50, 200, 100); // Set the position and size of the label
		baseframe.add(begStage);

		// Setting up the info panel
		infoPanel = new JPanel();
		infoPanel.setBounds(225, 170, 350, 240); // Set the position and size of the panel
		infoPanel.setBackground(Color.red); // Set the background color of the panel
		infoPanel.setLayout(null);
		baseframe.add(infoPanel);

		// Setting up the infoLabel
		infoLabel = new JLabel(
				"<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Level 1<br/> <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time : 180 Seconds<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hit Target : 20<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Maximum miss : 60<br/> <br/>&nbsp;&nbsp;Objective : Hit The Demon To &nbsp;&nbsp;Gain Points</html>");
		infoLabel.setBounds(10, 25, 370, 200); // Set the position and size of the label
		infoLabel.setBackground(Color.yellow); // Set the background color of the label
		infoLabel.setForeground(Color.yellow); // Set the text color of the label
		infoLabel.setFont(font.pixelMplus); // Set the font of the label
		infoLabel.setFont(infoLabel.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the label
		infoPanel.add(infoLabel);

		// Setting up the goButton
		goButton = new JButton("GO");
		goButton.setBounds(370, 460, 60, 35); // Set the position and size of the button
		goButton.setForeground(Color.yellow); // Set the text color of the button
		goButton.setBackground(Color.red); // Set the background color of the button
		goButton.setFont(font.pixelMplus); // Set the font of the button
		goButton.setFont(goButton.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		goButton.setBorderPainted(false); // Remove the border of the button
		goButton.setFocusPainted(false); // Remove the focus paint of the button
		goButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Linking to the gameZoneB1
				new gameZoneB1();
			}
		});
		baseframe.add(goButton);

		// backButton
		backButton = new JButton("BACK");
		backButton.setBounds(600, 510, 90, 35); // Set the position and size of the button
		backButton.setForeground(Color.yellow); // Set the text color of the button
		backButton.setBackground(Color.red); // Set the background color of the button
		backButton.setFont(font.pixelMplus); // Set the font of the button
		backButton.setFont(backButton.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		backButton.setBorderPainted(false); // Remove the border of the button
		backButton.setFocusPainted(false); // Remove the focus paint of the button
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				begStage.setVisible(false);
				infoLabel.setVisible(false);
				infoPanel.setVisible(false);
				goButton.setVisible(false);
				backButton.setVisible(false);

				// Linking to stageCatalogue
				new beg_lev_cat(baseframe);
			}
		});
		baseframe.add(backButton);
	}
}