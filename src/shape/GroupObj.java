package shape;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import umlEditorGui.UMLCanvas;
import main.Main;

public class GroupObj extends BasicObject {
	
	int posX, posY; 
	int width, height;
		
	boolean selected = false;

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
		mostLeft = ((BasicObject)ObjectList.get(1)).getPortLEFT().getPosX();
		mostRight = ((BasicObject)ObjectList.get(1)).getPortRIGHT().getPosX();
		mostDown = ((BasicObject)ObjectList.get(1)).getPortDOWN().getPosY();
		mostUp = ((BasicObject)ObjectList.get(1)).getPortUP().getPosY();
		for(UMLObject basicObj : ObjectList){
			int left = ((BasicObject)basicObj).getPortLEFT().getPosX();
			if(left < mostLeft){
				mostLeft = left;
			}
			int right = ((BasicObject)basicObj).getPortRIGHT().getPosX();
			if(right > mostRight){
				mostRight = right;
			}
			int down = ((BasicObject)basicObj).getPortDOWN().getPosY();
			if(down > mostDown){
				mostDown = down;
			}
			int up = ((BasicObject)basicObj).getPortUP().getPosY();
			if(up < mostUp){
				mostUp = up;
			}
		}
		portUP = new Port((mostLeft + mostRight)/2,mostUp);
		portLEFT = new Port(mostLeft, (mostDown + mostUp)/2);
		portRIGHT = new Port(mostRight, (mostDown + mostUp)/2);
		portDOWN = new Port((mostLeft + mostRight)/2, mostDown);
		
		width = mostRight - mostLeft;
		height = mostDown - mostUp;
		
		posX = mostLeft;
		posY = mostUp;
	}

	@Override
	public int getPosX() {
		return posX;
	}

	@Override
	public int getPosY() {
		return posY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
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
		if ( (x >= getPosX() && x <= getPosX()+getWidth()) && (y >= getPosY() && y <= getPosY()+getHeight())){
			return true;
		}
		return false;
	}

	@Override
	public boolean isInObjRange(int x1, int y1, int x2, int y2) {
		if ( Main.isBetween(x1, getPosX(), x2) && Main.isBetween(y1, getPosY(), y2) ) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setSelectMode(boolean m) {
		for (UMLObject obj : ObjectList) {
			obj.setSelectMode(m);
		}
		selected = true;
	}

	@Override
	public boolean isSelected() {
		return selected;
	}

	@Override
	public ArrayList<UMLObject> getObjectList() {
		return ObjectList;
	}
	
	@Override
	public void unGroup(){
		canvas.unGroup(this);
	}

}
