package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class GenerLine extends LineObject {

	public GenerLine(ShapeObj start, ShapeObj end) {
		super(start, end);
	}
	
	@Override
	public void getPorts() {
		if (getObjRelat() == 1){
			if (startX-endX >= 0 ) {
				startPort = endObject.getPortRIGHT();
				endPort = startObject.getPortLEFT();
			}
			else {
				startPort = endObject.getPortLEFT();
				endPort = startObject.getPortRIGHT();
			}
		}
		else {
			if (startY-endY >= 0) {
				startPort = endObject.getPortDOWN();
				endPort = startObject.getPortUP();
			}
			else {
				startPort = endObject.getPortUP();
				endPort = startObject.getPortDOWN();
			}
		}
		
	}
	
	@Override
	public void drawObjShape(Graphics g) {
		initLine();
		Graphics2D g2 = (Graphics2D)g;
		int srcX =  startPort.getPosX(), 
				srcY = startPort.getPosY(), 
				tarX = endPort.getPosX(), 
				tarY = endPort.getPosY();
		
		//the Java Math is calculating Trigonometric functions by "ARC" not angle's degree
		double radius = 20;
		double theta = Math.atan2(tarY - srcY, tarX - srcX);
		double x1, y1, x2, y2, x3, y3;
		x1 = tarX; y1 = tarY;
		x2 = tarX - radius*Math.cos(theta - 30*Math.PI/180); y2 = tarY - radius*Math.sin(theta - 30*Math.PI/180);
		x3 = tarX - radius*Math.cos(theta + 30*Math.PI/180); y3 = tarY - radius*Math.sin(theta + 30*Math.PI/180);
		int xArray[] = {(int)x1, (int)x2, (int)x3};
		int yArray[] = {(int)y1, (int)y2, (int)y3};
		g2.drawPolygon(xArray, yArray, 3);
		
		double lineEndX, lineEndY;
		lineEndX = tarX - radius*Math.cos(theta);
		lineEndY = tarY - radius*Math.sin(theta);	
		g.drawLine(startPort.getPosX(), startPort.getPosY(), 
				(int)lineEndX, (int)lineEndY);
	}

}
