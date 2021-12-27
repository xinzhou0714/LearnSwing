
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {

	private JButton helloButton;
	private JButton goodbyeButton;
	private TextPanel textPanel;
	
	public Toolbar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	
	
	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO method of ActionListener
		//System.out.println("A button has been clicked");
		JButton clicked =(JButton) e.getSource();
		
		if(clicked == helloButton ) {
			//System.out.println("hello");
			textPanel.appendText("Hello\n");
		}
		else if (clicked == goodbyeButton){
			//System.out.println("goodbye");
			textPanel.appendText("Goodbye\n");
		}
		
	}

}
