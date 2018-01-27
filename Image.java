package clue;
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
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Board{
	 
	public static void main(String[] args){
		JFrame image_frame = new JFrame("Cluedo by KRM");
		JLabel image_label = new JLabel();
		image_frame.setLayout(new BorderLayout());
		JSplitPane topPanel=new JSplitPane();
	
		topPanel.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		image_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		image_frame.add(topPanel);
		image_label.setIcon(new ImageIcon("board.jpg")); //has to be image_label
		JSplitPane verticalPanels=new JSplitPane();
		verticalPanels.setOrientation(JSplitPane.VERTICAL_SPLIT);
		topPanel.setLeftComponent(verticalPanels);
		//image_frame.add(image_label);
		JTextField textField=new JTextField();
		JPanel panel1=new JPanel();
		panel1.add(textField);
		topPanel.setRightComponent(panel1);
		verticalPanels.setTopComponent(image_label);
		JTextArea textArea=new JTextArea();
		verticalPanels.setBottomComponent(textArea);
		image_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image_frame.pack();
		image_frame.setVisible(true);
	}
