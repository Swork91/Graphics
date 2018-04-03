package panels;
import javax.swing.*;
import java.awt.*;

public class TestFigurePanel extends JFrame{

	public TestFigurePanel() {
		setLayout(new GridLayout(2,3,5,5));
		add(new FigurePanel(FigurePanel.LINE));
		add(new FigurePanel(FigurePanel.RECTANGLE, true));
		add(new FigurePanel(FigurePanel.RECTANGLE));
		add(new FigurePanel(FigurePanel.ROUND_RECTANGLE));
		add(new FigurePanel(FigurePanel.ROUND_RECTANGLE, true));
		add(new FigurePanel(FigurePanel.OVAL));
	}

	public static void main(String[] args) {
		TestFigurePanel frame = new TestFigurePanel();
		frame.setTitle("Test Figure Panel");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
