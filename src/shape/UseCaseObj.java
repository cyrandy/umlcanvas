package shape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import umlEditorGui.UMLCanvas;
import main.Main;


public class UseCaseObj extends UMLObject {
	private int posX;
	private int posY;
	private Port portUP;
	private Port portDOWN;
	private Port portLEFT;
	private Port portRIGHT;
	
	private UMLCanvas umlCanvas = UMLCanvas.getInstance();
	private int objWidth = 120;
	private int objHeight = 80;
	private String name = "Untitled";
	private boolean selected = false;
	
	public UseCaseObj(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
		setPorts();
	}
	public void setPorts() {
		setPortUP(new Port(posX+objWidth/2, posY));
		setPortDOWN(new Port(posX+objWidth/2, posY+objHeight));
		setPortLEFT(new Port(posX, posY+objHeight/2));
		setPortRIGHT(new Port(posX+objWidth, posY+objHeight/2));
	}
	public void drawObjShape(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		
		UseCaseObj obj = UseCaseObj.this;
		obj.setPorts();
		
		g2d.setColor(new Color(200,200,200));
		g2d.fillOval(obj.posX, obj.posY, obj.objWidth, obj.objHeight);
		g2d.setColor(new Color(0,0,0));
        g2d.drawOval(obj.posX, obj.posY, obj.objWidth, obj.objHeight);
        
        g2d.drawString(name, obj.posX+55, obj.posY+20);
        
        if(isSelected()) {
        	g2d.fillRect(obj.getPortDOWN().getPosX()-3, obj.getPortDOWN().getPosY()-3, 6, 6);
			g2d.fillRect(obj.getPortUP().getPosX()-3, obj.getPortUP().getPosY()-3, 6, 6);
			g2d.fillRect(obj.getPortLEFT().getPosX()-3, obj.getPortLEFT().getPosY()-3, 6, 6);
			g2d.fillRect(obj.getPortRIGHT().getPosX()-3, obj.getPortRIGHT().getPosY()-3, 6, 6);
        }
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
	public void setPosX(int x) {
		// TODO Auto-generated method stub
		posX = x;
	}
	@Override
	public void setPosY(int y) {
		// TODO Auto-generated method stub
		posY = y;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return objWidth;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return objHeight;
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
		selected = m;
	}
	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return selected;
	}
	public Port getPortUP() {
		return portUP;
	}
	public void setPortUP(Port portUP) {
		this.portUP = portUP;
	}
	public Port getPortDOWN() {
		return portDOWN;
	}
	public void setPortDOWN(Port portDOWN) {
		this.portDOWN = portDOWN;
	}
	public Port getPortLEFT() {
		return portLEFT;
	}
	public void setPortLEFT(Port portLEFT) {
		this.portLEFT = portLEFT;
	}
	public Port getPortRIGHT() {
		return portRIGHT;
	}
	public void setPortRIGHT(Port portRIGHT) {
		this.portRIGHT = portRIGHT;
	}
	public void setName(String newName){
		name = newName;
	}
	@Override
	public ArrayList<UMLObject> getObjectList() {
		// TODO Auto-generated method stub
		return null;
	}

}
