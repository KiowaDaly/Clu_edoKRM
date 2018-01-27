
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Board {
	static JTextField textField=new JTextField(150);
	static JButton Submit = new JButton("Submit");
	public static void main(String[] args){
		
		
	
		JFrame image_frame = new JFrame("Cluedo by KRM");//creating the main frame//
		JLabel image_label = new JLabel();
		image_frame.setLayout(new BorderLayout());
		
		JSplitPane topPanel=new JSplitPane();//this allows us to splice the frame into smaller bits//
	
		topPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);//splitting the 
		image_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		image_frame.add(topPanel);
		image_label.setIcon(new ImageIcon("board.jpg")); //has to be image_label
		JSplitPane verticalPanels=new JSplitPane();
		
		
		
		verticalPanels.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		topPanel.setLeftComponent(verticalPanels);
		//image_frame.add(image_label);
		
		
		JPanel panel1=new JPanel();
		JLabel InputConsole = new JLabel("Input Console");
		
		panel1.add(InputConsole);
		panel1.add(textField,BorderLayout.EAST);
		panel1.add(Submit);
	
		topPanel.setRightComponent(panel1);
		verticalPanels.setTopComponent(image_label);
		
		
		JTextArea textArea=new JTextArea();
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		verticalPanels.setBottomComponent(scrollPane);
		
		image_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image_frame.pack();
		image_frame.setVisible(true);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
