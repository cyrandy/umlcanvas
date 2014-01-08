package shape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import umlEditorGui.UMLCanvas;
import main.Main;


public class UseCaseObj extends ShapeObj {
	public UseCaseObj(int posX, int posY){
		this.objWidth = 120;
		this.objHeight = 80;
		this.posX = posX;
		this.posY = posY;
		setPorts();
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
}
