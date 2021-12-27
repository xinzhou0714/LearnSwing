import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		textPanel = new TextPanel();
		toolbar = new Toolbar();
		formPanel = new FormPanel();
		
		
		
		toolbar.setStringListener(new StringListener() {
			
			@Override
			public void textEmitted(String text) {
				textPanel.appendText(text);
				
			}
		});
		

		add(formPanel,BorderLayout.WEST);
		add(toolbar,BorderLayout.NORTH);
		add(textPanel,BorderLayout.CENTER);

		
		setSize(600,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
