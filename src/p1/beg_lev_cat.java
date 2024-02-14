package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class beg_lev_cat {
	// Components
	private static JLabel beglevelTitle;
	private font font = new font();
	private static JButton playBlev1, playBlev2, backButton;

	public beg_lev_cat(JFrame baseframe) {
		// Setting up beglevelTitle
		beglevelTitle = new JLabel("BEGINNER LEVELS");
		beglevelTitle.setBounds(230, 50, 400, 70); // Set the position and size of the label
		beglevelTitle.setBackground(Color.red);
		beglevelTitle.setForeground(Color.red);
		beglevelTitle.setFont(font.pixelMplus); // Set the font of the label
		beglevelTitle.setFont(beglevelTitle.getFont().deriveFont(Font.BOLD, 40f)); // Set the font size of the label
		baseframe.add(beglevelTitle);

		// Setting up Play Button for Level 1
		playBlev1 = new JButton("PLAY LEVEL 1");
		playBlev1.setBounds(270, 200, 250, 35); // Set the position and size of the button
		playBlev1.setForeground(Color.yellow); // Set the text color of the button
		playBlev1.setBackground(Color.red); // Set the background color of the button
		playBlev1.setFont(font.pixelMplus); // Set the font of the button
		playBlev1.setFont(playBlev1.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		playBlev1.setBorderPainted(false); // Remove the border of the button
		playBlev1.setFocusPainted(false); // Remove the focus paint of the button
		playBlev1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				beglevelTitle.setVisible(false);
				playBlev1.setVisible(false);
				playBlev2.setVisible(false);
				backButton.setVisible(false);

				// Link to beg_lev1_info
				new beg_lev1_info(baseframe);
			}
		});
		baseframe.add(playBlev1);

		// Setting up Play Button for Level 2
		playBlev2 = new JButton("PLAY LEVEL 2");
		playBlev2.setBounds(270, 300, 250, 35); // Set the position and size of the button
		playBlev2.setForeground(Color.yellow); // Set the text color of the button
		playBlev2.setBackground(Color.red); // Set the background color of the button
		playBlev2.setFont(font.pixelMplus); // Set the font of the button
		playBlev2.setFont(playBlev2.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		playBlev2.setBorderPainted(false); // Remove the border of the button
		playBlev2.setFocusPainted(false); // Remove the focus paint of the button
		playBlev2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				beglevelTitle.setVisible(false);
				playBlev1.setVisible(false);
				playBlev2.setVisible(false);
				backButton.setVisible(false);

				// Link to beg_lev2_info
				new beg_lev2_info(baseframe);
			}
		});
		baseframe.add(playBlev2);

		// Setting up backButton
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
				beglevelTitle.setVisible(false);
				playBlev1.setVisible(false);
				playBlev2.setVisible(false);
				backButton.setVisible(false);

				// Linking to stageCatalogue
				new stageCatalogue(baseframe);
			}
		});
		baseframe.add(backButton);
	}

	public static void main(String[] args) {
		// new beg_lev_cat();
	}

}