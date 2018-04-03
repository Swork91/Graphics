package clockStuff;
import javax.swing.*;

import panels.TestFigurePanel;

import java.awt.*;

public class DisplayClock extends JFrame{

	public DisplayClock() {
		//create clock
		StillClock clock = new StillClock();
		
		//digital display
		MessagePanel messagePanel = new MessagePanel(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());
		messagePanel.setCentered(false);
		messagePanel.setForeground(Color.blue);
		messagePanel.setFont(new Font("courier", Font.BOLD, 16));
		
		//setLayout(new GridLayout(0,1,0,0)); //hacky fix TODO remove
		add(clock);
		add(messagePanel, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		DisplayClock frame = new DisplayClock();
		frame.setTitle("DisplayClock");
		frame.setSize(600, 650);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
