package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import shape.UMLObject;
import umlMode.UMLMode;


public class UMLCanvas extends JPanel implements MouseListener, MouseMotionListener {
	private UMLMode currentMode;
//	private UMLMouseListener mouseListener;
	private ArrayList<UMLObject> objList = new ArrayList<UMLObject>();
	
	public UMLCanvas() {
		// TODO Auto-generated constructor stub
		currentMode = new UMLMode(this);
		addMouseMotionListener(this);
		addMouseListener(this);
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.mouseClicked(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.mouseExited(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.mouseReleased(e);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.mouseDragged(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.mouseMoved(e);
	}
}