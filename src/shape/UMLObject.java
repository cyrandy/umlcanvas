package shape;
import java.awt.Graphics;
import java.util.ArrayList;


public class UMLObject {
	public void drawObjShape(Graphics g) {
	}
	public int getPosX() {
		return 0;
	}
	public int getPosY() {
		return 0;
	}
	public Port getPortUP() {
		return null;
	}
	public Port getPortDOWN() {
		return null;
	}
	public Port getPortRIGHT() {
		return null;
	}
	public Port getPortLEFT() {
		return null;
	}
	public int getWidth() {
		return 0;
	}
	public int getHeight() {
		return 0;
	}
	public void setPosX(int x) {
	}
	public void setPosY(int y) {
	}
	public boolean isInObjRange(int x, int y) {
		return false;
	}
	public void setSelectMode(boolean m) {
	}
	public boolean isSelected() {
		return false;
	}
	public	void setName(String newName) {
	}
	public boolean isInObjRange(int x1, int y1, int x2, int y2) {
		return false;
	}
	public ArrayList<UMLObject> getObjectList() {
		return null;
	}
	public void unGroup(){
		
	}
}
