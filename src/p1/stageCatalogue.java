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

	// Components
	private JLabel pnLabel, sel_st_image;
	private JTextField playerName;
	private Image demoIcon;
	private JButton begButton, interButton, expButton, homebutton, PlayerButton;
	private font font = new font();

	// The main class
	public static void main(String args[]) {
		// new stageCatalogue();

	}

	// The Constructor
	public stageCatalogue(JFrame baseframe) {

		// the pLabelPlayerName
		pnLabel = new JLabel("PLAYER NAME");
		pnLabel.setBounds(300, 100, 250, 70); // Set the position and size of the label
		pnLabel.setBackground(Color.red);
		pnLabel.setForeground(Color.red);
		pnLabel.setFont(font.pixelMplus); // Set the font of the label
		pnLabel.setFont(pnLabel.getFont().deriveFont(Font.PLAIN, 36f)); // Set the font size of the label
		baseframe.add(pnLabel);

		// setting up textfeildPlayerName
		playerName = new JTextField("hi", 1);
		playerName.setBounds(270, 170, 250, 40); // Set the position and size of the text field
		playerName.setBorder(new MatteBorder(4, 4, 4, 4, Color.red)); // Set the border of the text field
		playerName.setBackground(Color.gray); // Set the background color of the text field
		playerName.setForeground(Color.yellow); // Set the text color of the text field
		playerName.setFont(font.pixelMplus); // Set the font of the text field
		playerName.setFont(playerName.getFont().deriveFont(Font.BOLD, 20f)); // Set the font size of the text field
		baseframe.add(playerName);

		// Setting up PlayerButton Button
		PlayerButton = new JButton("LOGIN");
		PlayerButton.setBounds(500, 170, 100, 40); // Set the position and size of the button
		PlayerButton.setForeground(Color.yellow); // Set the text color of the button
		PlayerButton.setBackground(Color.red); // Set the background color of the button
		PlayerButton.setFont(font.pixelMplus); // Set the font of the button
		PlayerButton.setFont(PlayerButton.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		PlayerButton.setBorderPainted(false); // Remove the border of the button
		PlayerButton.setFocusPainted(false); // Remove the focus paint of the button
		baseframe.add(PlayerButton);

		// Setting up the selectStage image
		sel_st_image = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/selectstage.png")).getImage();
		sel_st_image.setIcon(new ImageIcon(img));
		sel_st_image.setBounds(315, 300, 200, 20); // Set the position and size of the label
		baseframe.add(sel_st_image);

		// the buttons
		// Setting up beginner Button
		begButton = new JButton("BEGINNER");
		begButton.setBounds(270, 350, 250, 35); // Set the position and size of the button
		begButton.setForeground(Color.yellow); // Set the text color of the button
		begButton.setBackground(Color.red); // Set the background color of the button
		begButton.setFont(font.pixelMplus); // Set the font of the button
		begButton.setFont(begButton.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		begButton.setBorderPainted(false); // Remove the border of the button
		begButton.setFocusPainted(false); // Remove the focus paint of the button
		begButton.addActionListener(new ActionListener() {
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
				new beg_lev_cat(baseframe); // Link to the beg_lev_cat page
			}
		});
		baseframe.add(begButton);

		// Setting up intermediate Button
		interButton = new JButton("INTERMEDIATE");
		interButton.setBounds(270, 410, 250, 35); // Set the position and size of the button
		interButton.setForeground(Color.yellow); // Set the text color of the button
		interButton.setBackground(Color.red); // Set the background color of the button
		interButton.setFont(font.pixelMplus); // Set the font of the button
		interButton.setFont(interButton.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		interButton.setBorderPainted(false); // Remove the border of the button
		interButton.setFocusPainted(false); // Remove the focus paint of the button
		interButton.addActionListener(new ActionListener() {
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
				new int_lev_cat(baseframe); // Link to the int_lev_cat page
			}
		});
		baseframe.add(interButton);

		// setting up expert Button
		expButton = new JButton("EXPERT");
		expButton.setBounds(270, 470, 250, 35); // Set the position and size of the button
		expButton.setForeground(Color.yellow); // Set the text color of the button
		expButton.setBackground(Color.red); // Set the background color of the button
		expButton.setFont(font.pixelMplus); // Set the font of the button
		expButton.setFont(expButton.getFont().deriveFont(Font.PLAIN, 20f)); // Set the font size of the button
		expButton.setBorderPainted(false); // Remove the border of the button
		expButton.setFocusPainted(false); // Remove the focus paint of the button
		expButton.addActionListener(new ActionListener() {
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
				new exp_lev_cat(baseframe); // Link to the exp_lev_cat page
			}
		});
		baseframe.add(expButton);

		// setting up home Button icon
		homebutton = new JButton();
		Image img1 = new ImageIcon(this.getClass().getResource("/Images/homeIcon.png")).getImage();
		homebutton.setIcon(new ImageIcon(img1));
		homebutton.setForeground(Color.yellow); // Set the text color of the button
		homebutton.setBackground(Color.black); // Set the background color of the button
		homebutton.setBorderPainted(false); // Remove the border of the button
		homebutton.setFocusPainted(false); // Remove the focus paint of the button
		homebutton.setBounds(720, 10, 40, 40); // Set the position and size of the button
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

				// Visibility of Home
				TheBaseClass.title.setVisible(true);
				TheBaseClass.demon1.setVisible(true);
				TheBaseClass.enterButton.setVisible(true);
			}
		});
		baseframe.add(homebutton);

	}

}