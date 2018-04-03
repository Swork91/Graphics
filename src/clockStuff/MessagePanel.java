package clockStuff;
import javax.swing.*;
import java.awt.*;

public class MessagePanel extends JPanel{
	private int xCoordinate = 0;
	private int yCoordinate = 0;
	private boolean centered;
	private String message = "Default Message";
	private int interval = 10;
	
	public MessagePanel() {
		
	}
	
	public MessagePanel(String message) {
		this.message = message;
	}
	
	public int getXCoordinate() {
		return xCoordinate;
	}
	
	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	
	public int getYCoordinate() {
		return yCoordinate;
	}
	
	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public boolean getCentered() {
		return centered;
	}
	
	public void setCentered(boolean centered) {
		this.centered = centered;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getInterval() {
		return interval;
	}
	
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	//draw messages
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (centered) {
			//get metrics
			FontMetrics fm = g.getFontMetrics();
			
			//get center of message
			int stringWidth = fm.stringWidth(message);
			int stringAscent = fm.getAscent();
			//get position of leftmost character
			xCoordinate = getWidth()/2 - stringWidth/2;
			yCoordinate = getHeight()/2 + stringAscent/2;
		}
		g.drawString(message, xCoordinate, yCoordinate);	
	}
	
	public void moveLeft() {
		xCoordinate-=interval;
		repaint();
	}
	
	public void moveRight() {
		xCoordinate+=interval;
		repaint();
	}
	
	public void moveUp() {
		yCoordinate-=interval;
		repaint();
	}
	
	public void moveDown() {
		yCoordinate+=interval;
		repaint();
	}
	
	public Dimension getPreferedSize() {
		return new Dimension(200,30); 
	}
}
