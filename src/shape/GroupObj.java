package shape;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import umlEditorGui.UMLCanvas;
import main.Main;

public class GroupObj implements BasicObj {
	
	//GroupComponent attributes
	int posX, posY; 
	//int posXInit, posYInit;
	int width, height;
	//GroupComponent attributes
	String name = "Untitled Group";
		
	boolean selected = false;
		
	Port upPort;
	Port downPort;
	Port leftPort;
	Port rightPort;
		
	UMLCanvas canvas = UMLCanvas.getInstance();
	ArrayList<UMLObject> ObjectList = new ArrayList<UMLObject>();
	
	public GroupObj(ArrayList<UMLObject> objList) {
		// TODO Auto-generated constructor stub
		ObjectList = objList;
		init();
	}
	
	public void init() {
		int mostLeft, mostRight, mostUp, mostDown;
		//initialize the variable
		mostLeft = ((BasicObj)ObjectList.get(1)).getPortLEFT().getPosX();
		mostRight = ((BasicObj)ObjectList.get(1)).getPortRIGHT().getPosX();
		mostDown = ((BasicObj)ObjectList.get(1)).getPortDOWN().getPosY();
		mostUp = ((BasicObj)ObjectList.get(1)).getPortUP().getPosY();
		for(UMLObject basicObj : ObjectList){
			int left = basicObj.getPortLEFT().getPosX();
			if(left < mostLeft){
				mostLeft = left;
			}
			int right = basicObj.getPortRIGHT().getPosX();
			if(right > mostRight){
				mostRight = right;
			}
			int down = basicObj.getPortDOWN().getPosY();
			if(down > mostDown){
				mostDown = down;
			}
			int up = basicObj.getPortUP().getPosY();
			if(up < mostUp){
				mostUp = up;
			}
		}
		upPort = new Port((mostLeft + mostRight)/2,mostUp);
		leftPort = new Port(mostLeft, (mostDown + mostUp)/2);
		rightPort = new Port(mostRight, (mostDown + mostUp)/2);
		downPort = new Port((mostLeft + mostRight)/2, mostDown);
		
		width = mostRight - mostLeft;
		height = mostDown - mostUp;
		
		posX = mostLeft;
		posY = mostUp;
	}
	
	@Override
	public void drawObjShape(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPosX() {
		// TODO Auto-generated method stub
		return posX;
	}

	@Override
	public int getPosY() {
		// TODO Auto-generated method stub
		return posY;
	}

	@Override
	public Port getPortUP() {
		// TODO Auto-generated method stub
		return upPort;
	}

	@Override
	public Port getPortDOWN() {
		// TODO Auto-generated method stub
		return downPort;
	}

	@Override
	public Port getPortRIGHT() {
		// TODO Auto-generated method stub
		return rightPort;
	}

	@Override
	public Port getPortLEFT() {
		// TODO Auto-generated method stub
		return leftPort;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public void setPosX(int x) {
		// TODO Auto-generated method stub
		for (UMLObject obj : ObjectList ) {
			obj.setPosX(obj.getPosX()+x-this.getPosX());
		}
		posX = x;
	}

	@Override
	public void setPosY(int y) {
		// TODO Auto-generated method stub
		
		for (UMLObject obj : ObjectList ) {
			obj.setPosY(obj.getPosY()+y-this.getPosY());
		}
		posY = y;
	}

	@Override
	public boolean isInObjRange(int x, int y) {
		// TODO Auto-generated method stub
		if ( (x >= getPosX() && x <= getPosX()+getWidth()) && (y >= getPosY() && y <= getPosY()+getHeight())){
			return true;
		}
		return false;
	}

	@Override
	public boolean isInObjRange(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		if ( Main.isBetween(x1, getPosX(), x2) && Main.isBetween(y1, getPosY(), y2) ) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setSelectMode(boolean m) {
		// TODO Auto-generated method stub
		for (UMLObject obj : ObjectList) {
			obj.setSelectMode(m);
		}
		selected = true;
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return selected;
	}

	@Override
	public void setName(String newName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<UMLObject> getObjectList() {
		// TODO Auto-generated method stub
		return ObjectList;
	}

	

}
