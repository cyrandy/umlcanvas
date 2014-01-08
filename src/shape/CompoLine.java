package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class CompoLine extends AssociationLine {

	public CompoLine(UMLObject start, UMLObject end) {
		super(start, end);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getPorts() {
		if (getObjRelat() == 1){
				startPort = endObject.getPortRIGHT();
				endPort = startObject.getPortLEFT();
		}
		else {
				startPort = endObject.getPortDOWN();
				endPort = startObject.getPortUP();
		}
	}
	
	@Override
	public void drawObjShape(Graphics g) {
		initLine();
		Graphics2D g2 = (Graphics2D)g;
		int srcX = startPort.getPosX(), 
				srcY = startPort.getPosY(),
				tarX = endPort.getPosX(),
				tarY = endPort.getPosY();
		
		//the Java Math is calculating Trigonometric functions by "ARC" not angle's degree
		double radius = 20;
		double theta = Math.atan2(tarY - srcY, tarX - srcX);
		double x1, y1, x2, y2, x3, y3, x4, y4;
		x1 = tarX; y1 = tarY;
		x2 = tarX - radius*Math.cos(theta - 30*Math.PI/180); y2 = tarY - radius*Math.sin(theta - 30*Math.PI/180);
		x3 = tarX - radius*Math.cos(theta + 30*Math.PI/180); y3 = tarY - radius*Math.sin(theta + 30*Math.PI/180);
		x4 = tarX - 2*radius*Math.cos(theta); y4 = tarY - 2*radius*Math.sin(theta);	
		int xArray[] = {(int)x1, (int)x2, (int)x4, (int)x3};
		int yArray[] = {(int)y1, (int)y2, (int)y4, (int)y3};
		g2.drawPolygon(xArray, yArray, 4);
		
		double lineEndX, lineEndY;
		lineEndX = tarX - 2*radius*Math.cos(theta);
		lineEndY = tarY - 2*radius*Math.sin(theta);	
		g.drawLine(srcX, srcY, (int)lineEndX, (int)lineEndY);
	}

}
