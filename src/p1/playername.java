package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class playername {
	
	JFrame baseframe;
	private JTextField playerName;
	private JButton PlayerButton;
	private font font = new font();
	
	public playername() {
		baseframe = new JFrame("ByteSquad");
		baseframe.setSize(800, 600);
		baseframe.setVisible(true);
		baseframe.getContentPane().setBackground(Color.black);
		baseframe.setLayout(null);
		baseframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		baseframe.setLocationRelativeTo(null);
		
		//input text field
		playerName = new JTextField("ENTER PLAYERNAME TO LOGIN", 1);
		playerName.setBounds(240, 170, 300, 40);
		playerName.setBorder(new MatteBorder(4, 4, 4, 4, Color.red));
		playerName.setBackground(Color.gray);
		playerName.setForeground(Color.yellow);
		playerName.setFont(font.pixelMplus);
		playerName.setFont(playerName.getFont().deriveFont(Font.BOLD,20f));
		baseframe.add(playerName);
		
		//Setting up  PlayerButton Button
		PlayerButton = new JButton("LOGIN AS A PLAYER");
		PlayerButton.setBounds(270,300,250,35);
		PlayerButton.setForeground(Color.yellow);
		PlayerButton.setBackground(Color.red);
		PlayerButton.setFont(font.pixelMplus);
		PlayerButton.setFont(PlayerButton.getFont().deriveFont(Font.PLAIN, 20f));
		PlayerButton.setBorderPainted(false);
		PlayerButton.setFocusPainted(false);
		PlayerButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							String player = playerName.getText();
				            FileWriter writer = new FileWriter("players.txt", true); // Append mode
				            writer.write(player + "\n"); // Write the player name and add a newline
				            writer.close();
				            System.out.println("Player name written to players.txt successfully.");
				        } catch (IOException e1) {
				            System.out.println("An error occurred while writing to the file.");
				            e1.printStackTrace();
				        }
//					    try {
//					        String filename = "myFile.txt"; // Specify the desired filename
//					        FileWriter writer = new FileWriter(filename);
//					        writer.write("Hello, this is my file content!");
//					        writer.close();
//					        System.out.println("File created: " + filename);
//					    } catch (IOException ex) {
//					        System.out.println("An error occurred while creating the file.");
//					        ex.printStackTrace();
//					    }
					}
					
				});
		baseframe.add(PlayerButton);
		
	}
	
	
    public static void main(String[] args) {
    	new playername();
    }


}
