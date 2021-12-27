
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {

	private JButton helloButton;
	private JButton goodbyeButton;

	private StringListener textListener; //this interface could be any kind of class, that will be override anywhere else
	
	public Toolbar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO method of ActionListener
		//System.out.println("A button has been clicked");
		JButton clicked =(JButton) e.getSource();
		
		if(clicked == helloButton ) {
			if (textListener != null) {
				textListener.textEmitted("Hello\n");
			}
		}
		else if (clicked == goodbyeButton){
			if (textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}
		}
		
	}

}
