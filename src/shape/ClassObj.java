package shape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ClassObj extends ShapeObj{
	
	public ClassObj(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
		this.objWidth = 100;
		this.objHeight = 120;
		setPorts();
	}
	public void drawObjShape(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		ClassObj obj = ClassObj.this;
		obj.setPorts();
		
		g2d.setColor(new Color(200,200,200));
		g2d.fillRect(obj.posX, obj.posY, obj.objWidth, obj.objHeight);
		g2d.setColor(new Color(0,0,0));
        g2d.drawRect(obj.posX, obj.posY, obj.objWidth, obj.objHeight);
        
        g2d.drawLine(obj.posX, obj.posY+40, obj.posX+obj.objWidth, obj.posY+40);
        g2d.drawLine(obj.posX, obj.posY+80, obj.posX+obj.objWidth, obj.posY+80);
        g2d.drawString(name, obj.posX+10, obj.posY+20);
        
        if (isSelected()) {
        	g2d.fillRect(obj.getPortDOWN().getPosX()-3, obj.getPortDOWN().getPosY()-3, 6, 6);
			g2d.fillRect(obj.getPortUP().getPosX()-3, obj.getPortUP().getPosY()-3, 6, 6);
			g2d.fillRect(obj.getPortLEFT().getPosX()-3, obj.getPortLEFT().getPosY()-3, 6, 6);
			g2d.fillRect(obj.getPortRIGHT().getPosX()-3, obj.getPortRIGHT().getPosY()-3, 6, 6);
        }
	}
}
