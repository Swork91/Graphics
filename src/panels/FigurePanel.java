package panels;
import javax.swing.*;
import java.awt.*;

public class FigurePanel extends JPanel{
	public static final int LINE = 1;
	public static final int RECTANGLE = 2;
	public static final int ROUND_RECTANGLE = 3;
	public static final int OVAL = 4;
	
	private int type = 1;
	private boolean filled = false;
	
	/** construct default FigurePanel */
	public FigurePanel() {
	}
	
	/** construct a FigurePanel with the specified type */
	public FigurePanel(int type) {
		this.type = type;
	}

	/** construct a FigurePanel with the specified type and filled*/
	public FigurePanel(int type, boolean filled) {
		this.type = type;
		this.filled = filled;
	}
	
	/** Draw the figure */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		switch (type) {
		case LINE:
			g.drawLine(10, 10, width-10, height-10);
			g.drawLine(10, height-10, width-10, 10);
			break;
		case RECTANGLE:
			g.setColor(Color.blue);
			if (filled) {
				g.fillRect((int) (width*0.1), (int) (height*0.1), (int) (width*0.8), (int) (height*0.8));
			}
			else {
				g.drawRect((int) (width*0.1), (int) (height*0.1), (int) (width*0.8), (int) (height*0.8));
			}
			break;
		case ROUND_RECTANGLE:
			g.setColor(Color.cyan);
			if (filled) {
				g.fillRoundRect((int) (width*0.1), (int) (height*0.1), (int) (width*0.8), (int) (height*0.8), 20, 20);
			}
			else {
				g.drawRoundRect((int) (width*0.1), (int) (height*0.1), (int) (width*0.8), (int) (height*0.8), 20, 20);
			}
			break;
		case OVAL:
			g.setColor(Color.GREEN);
			if (filled) {
				g.fillOval((int) (width*0.1), (int) (height*0.1), (int) (width*0.8), (int) (height*0.8));
			}
			else {
				g.drawOval((int) (width*0.1), (int) (height*0.1), (int) (width*0.8), (int) (height*0.8));
			}
			break;
		}
	}
}
