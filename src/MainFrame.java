import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private JButton btn;
	
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		textPanel = new TextPanel();
		btn = new JButton("Click Me! ");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO action when btn was clicked
				textPanel.appendText("Hello\n");
			}
		});
		
		add(textPanel,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		setSize(600,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
