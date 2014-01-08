package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;


public class AssociationLine extends UMLObject {
	protected ShapeObj startObject;
	protected ShapeObj endObject;
	protected int startX;
	protected int startY;
	protected int endX;
	protected int endY;
	protected Port startPort;
	protected Port endPort;
	
	public AssociationLine(ShapeObj start, ShapeObj end) {
		// TODO Auto-generated constructor stub
		startObject = start;
		endObject = end;
		initLine();
	}
	
	public void initLine() {
		setStartX();
		setStartY();
		setEndX();
		setEndY();
		getPorts();
	}
	
	public int getObjRelat() {
		if (Math.abs(startX - endX) > Math.abs(startY-endY) ) {
			System.out.println("left-right");
			return 1;
		}
		else {
			System.out.println("up-down");
			return 2;
		}
	}
	
	public void getPorts() {
		if (getObjRelat() == 1){
			if (startX-endX >= 0 ) {
				startPort = startObject.getPortLEFT();
				endPort = endObject.getPortRIGHT();
			}
			else {
				startPort = endObject.getPortLEFT();
				endPort = startObject.getPortRIGHT();
			}
		}
		else {
			if (startY-endY >= 0) {
				startPort = startObject.getPortUP();
				endPort = endObject.getPortDOWN();
			}
			else {
				startPort = endObject.getPortUP();
				endPort = startObject.getPortDOWN();
			}
		}
	}
	public void setStartX(){
		startX = startObject.getPosX();
	}
	
	public void setStartY(){
		startY = startObject.getPosY();
	}
	
	public void setEndX(){
		endX = endObject.getPosX();
	}

	public void setEndY(){
		endY = endObject.getPosY();
	}
	
	@Override
	public void drawObjShape(Graphics g) {
		initLine();
		g.drawLine(startPort.getPosX(), startPort.getPosY(), endPort.getPosX(), endPort.getPosY());
	}

}
