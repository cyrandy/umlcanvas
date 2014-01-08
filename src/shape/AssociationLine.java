package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;


public class AssociationLine implements UMLObject {
	protected UMLObject startObject;
	protected UMLObject endObject;
	protected int startX;
	protected int startY;
	protected int endX;
	protected int endY;
	protected Port startPort;
	protected Port endPort;
	
	public AssociationLine(UMLObject start, UMLObject end) {
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

	@Override
	public int getPosX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPosY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPosX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInObjRange(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSelectMode(boolean m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setName(String newName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInObjRange(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Port getPortUP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getPortDOWN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getPortRIGHT() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getPortLEFT() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UMLObject> getObjectList() {
		// TODO Auto-generated method stub
		return null;
	}

}
