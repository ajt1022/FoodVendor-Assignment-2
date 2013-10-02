package foodvendorsim;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ExcelBrowserFrame extends JFrame implements ActionListener {

	JButton openButton;
	//Create a file chooser
	int returnVal;
	final JFileChooser fc = new JFileChooser();
	public ExcelBrowserFrame() {
		openButton = new JButton("Browse");	
		openButton.addActionListener(this);
		add(openButton);
		setVisible(true);
		setSize(100,100);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//In response to a button click:
		returnVal = fc.showOpenDialog(null);
		System.out.println(returnVal);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			   File selectedFile = fc.getSelectedFile();
			   String path = selectedFile.getAbsolutePath();
			   System.out.println(path);
			try {
				new ReadExcelFile(path);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

	}
}
