
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class UMLCanvas extends JPanel {
	private UMLMode currentMode;
	private UMLMouseListener mouseListener;
	private ArrayList<UMLObject> objList = new ArrayList<UMLObject>();
	
	public UMLCanvas() {
		// TODO Auto-generated constructor stub
		currentMode = new UMLMode(this);
		mouseListener = new UMLMouseListener(this, currentMode);
		addMouseMotionListener(mouseListener);
		addMouseListener(mouseListener);
		
        // Preferred height is irrelevant, since using WEST region
        this.setPreferredSize(new Dimension(650, 0));
        this.setBorder(BorderFactory.createLineBorder (Color.blue, 2));
        this.setBackground(Color.white);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		for (UMLObject obj : objList){
			obj.drawObjShape(g);
		}
	}
	
	public void setMode(UMLMode newMode) {
		currentMode = newMode;
		this.removeMouseListener(mouseListener);
		this.removeMouseMotionListener(mouseListener);
		mouseListener = new UMLMouseListener(this, currentMode);
		addMouseMotionListener(mouseListener);		 
	    addMouseListener(mouseListener);
	}
	
	public String getMode() {
		return currentMode.getClass().getName();
	}
	
	public ArrayList<UMLObject> getObjList() {
		return objList;
	}
	
	public boolean isAnyObjSelected() {
		for( UMLObject obj : this.getObjList() ) {
			if (obj.isSelected()){
				return true;
			}
		}
		return false;
	}
}
