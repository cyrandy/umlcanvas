package shape;
import java.awt.Graphics;

public class AssociationLine extends LineObject {
	
	
	public AssociationLine(ShapeObj start, ShapeObj end) {
		super(start, end);
	}
	
	@Override
	public void drawObjShape(Graphics g) {
		initLine();
		g.drawLine(startPort.getPosX(), startPort.getPosY(), endPort.getPosX(), endPort.getPosY());
	}

}
