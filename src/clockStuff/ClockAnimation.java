package clockStuff;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockAnimation extends JFrame{
private StillClock clock = new StillClock();

	public ClockAnimation() {
		add(clock);
		
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			clock.setCurrentTime();
			clock.repaint();
			
		}
		
	}

	public static void main(String[] args) {
		JFrame frame = new ClockAnimation();
		frame.setTitle("working clock I swear");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}
}