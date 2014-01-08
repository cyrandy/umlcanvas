package shape;
import java.awt.Graphics;
import java.util.ArrayList;


public interface UMLObject {
	void drawObjShape(Graphics g);
	int getPosX();
	int getPosY();
	Port getPortUP();
	Port getPortDOWN();
	Port getPortRIGHT();
	Port getPortLEFT();
	int getWidth();
	int getHeight();
	void setPosX(int x);
	void setPosY(int y);
	boolean isInObjRange(int x, int y);
	void setSelectMode(boolean m);
	boolean isSelected();
	void setName(String newName);
	boolean isInObjRange(int x1, int y1, int x2, int y2);
	ArrayList<UMLObject> getObjectList();
}
