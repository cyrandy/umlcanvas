package shape;

import main.Main;

public class ShapeObj extends UMLObject {
	protected int posX;
	protected int posY;
	
	protected String name = "Untitled";
	protected boolean selected = false;
	protected int objWidth;
	protected int objHeight;
	protected Port portUP;
	protected Port portDOWN;
	protected Port portLEFT;
	protected Port portRIGHT;
	
	@Override
	public void setName(String newName){
		name = newName;
	}
	@Override
	public void setPosX(int x) {
		posX = x;
	}
	@Override
	public void setPosY(int y) {
		posY = y;
	}
	public void setPortUP(Port portUP) {
		this.portUP = portUP;
	}
	public void setPortDOWN(Port portDOWN) {
		this.portDOWN = portDOWN;
	}
	public void setPortLEFT(Port portLEFT) {
		this.portLEFT = portLEFT;
	}
	public void setPortRIGHT(Port portRIGHT) {
		this.portRIGHT = portRIGHT;
	}
	public void setPorts() {
		setPortUP(new Port(posX+objWidth/2, posY));
		setPortDOWN(new Port(posX+objWidth/2, posY+objHeight));
		setPortLEFT(new Port(posX, posY+objHeight/2));
		setPortRIGHT(new Port(posX+objWidth, posY+objHeight/2));
	}
	@Override
	public void setSelectMode(boolean m) {
		selected = m;
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
		return objWidth;
	}
	public int getHeight() {
		return objHeight;
	}
	public Port getPortUP() {
		return portUP;
	}
	public Port getPortDOWN() {
		return portDOWN;
	}
	public Port getPortLEFT() {
		return portLEFT;
	}
	public Port getPortRIGHT() {
		return portRIGHT;
	}
	@Override
	public boolean isSelected() {
		return selected;
	}
	@Override
	public boolean isInObjRange(int x, int y) {
		if ( (x >= getPosX() && x <= getPosX()+getWidth()) && Main.isBetween(getPosY(), y, getPosY()+getHeight())){
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
	
}
