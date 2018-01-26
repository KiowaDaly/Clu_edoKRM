import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board{
	 
	public static void main(String[] args){
		JFrame image_frame = new JFrame("Cluedo by KRM");
		JLabel image_label = new JLabel();
		
		image_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		image_label.setIcon(new ImageIcon("cluedo board.jpg")); //has to be image_label
		
		image_frame.add(image_label);
		
		
		
		
		
		
		
		
		
		
		
		image_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image_frame.pack();
		image_frame.setVisible(true);
	}
	
	
}
