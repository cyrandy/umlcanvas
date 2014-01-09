package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class CompoLine extends LineObject {

	public CompoLine(ShapeObj start, ShapeObj end) {
		super(start, end);
	}
	
	@Override
	public void drawObjShape(Graphics g) {
		initLine();
		Graphics2D g2 = (Graphics2D)g;
		int srcX = startPort.getPosX(), 
				srcY = startPort.getPosY(),
				tarX = endPort.getPosX(),
				tarY = endPort.getPosY();
		
		double radius = 20;
		double theta = Math.atan2(srcY - tarY, srcX - tarX);
		double x1, y1, x2, y2, x3, y3, x4, y4;
		x1 = srcX; y1 = srcY;
		x2 = srcX - radius*Math.cos(theta - 30*Math.PI/180); y2 = srcY - radius*Math.sin(theta - 30*Math.PI/180);
		x3 = srcX - radius*Math.cos(theta + 30*Math.PI/180); y3 = srcY - radius*Math.sin(theta + 30*Math.PI/180);
		x4 = srcX - 2*radius*Math.cos(theta); y4 = srcY - 2*radius*Math.sin(theta);	
		int xArray[] = {(int)x1, (int)x2, (int)x4, (int)x3};
		int yArray[] = {(int)y1, (int)y2, (int)y4, (int)y3};
		g2.drawPolygon(xArray, yArray, 4);
		
		double lineEndX, lineEndY;
		lineEndX = srcX - 2*radius*Math.cos(theta);
		lineEndY = srcY - 2*radius*Math.sin(theta);	
		g.drawLine(tarX, tarY, (int)lineEndX, (int)lineEndY);
	}

}
