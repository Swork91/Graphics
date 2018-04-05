import javax.swing.*;
import java.awt.Graphics;

public class GraphicsTest extends JFrame {

	public GraphicsTest() {
		add(new NewPanel());
	}

	public static void main(String[] args) {
		GraphicsTest frame = new GraphicsTest();
		frame.setTitle("Phone");
		frame.setSize(360, 640);
		//frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}

class NewPanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(0, 0, 50, 50);
		g.drawString("Banner", 0, 40);
		//g.fillRect(0, 0, 600, 600);
	}
}