package umlMode;


import java.awt.event.MouseEvent;
import java.util.ArrayList;

import main.UMLCanvas;
import shape.UMLObject;


public class SelectMode extends UMLMode {
	private int start_point_X;
	private int start_point_Y;
	private int end_point_X;
	private int end_point_Y;
	private boolean multi_select_mode=false;
	private boolean select_an_obj = false;
	private boolean move_an_obj = false;
	private UMLObject selectedObject = null;
	
	public SelectMode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			unselectAll();
			selectedObject = getSelectedObj(e.getX(), e.getY());
			start_point_X = e.getX();
			start_point_Y = e.getY();
			if (selectedObject != null) {
				selectedObject.setSelectMode(true);
				select_an_obj = true;
				canvas.repaint();
			}
			else {
				multi_select_mode = true;
				
			}
//			System.out.println("pressed"+e.getX()+","+e.getY());
			
		}
	}
	public void mouseDragged(MouseEvent e) {
		if (select_an_obj) {
			move_an_obj = true;
			System.out.println("move it!");
			selectedObject.setPosX(selectedObject.getPosX()+(e.getX()-start_point_X));
			selectedObject.setPosY(selectedObject.getPosY()+(e.getY()-start_point_Y));
			start_point_X = e.getX();
			start_point_Y = e.getY();
			canvas.repaint();
		}
	}
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1 && multi_select_mode ) {
			System.out.println("release:"+e.getX()+","+e.getY());
			end_point_X = e.getX();
			end_point_Y = e.getY();
			ArrayList<UMLObject> selectedObjects = new ArrayList<UMLObject>();
			selectedObjects = getSelectedObj(start_point_X, start_point_Y, end_point_X, end_point_Y);
			if (selectedObjects != null) {
				canvas.repaint();
			}
		}
		multi_select_mode = false;
		select_an_obj = false;
	}
	private ArrayList<UMLObject> getSelectedObj(int x1,	int y1, int x2, int y2) {
		ArrayList<UMLObject> selectedObjects = new ArrayList<UMLObject>();
		for(UMLObject object : canvas.getObjList()) {
			if (object.isInObjRange(x1, y1, x2, y2)){
				object.setSelectMode(true);
				selectedObjects.add(object);
			}
			
		}
		return selectedObjects;
	}

	private void unselectAll() {
		for(UMLObject object : canvas.getObjList()) {
			object.setSelectMode(false);
		}
		canvas.repaint();
	}
	private UMLObject getSelectedObj(int x, int y) {
		// TODO Auto-generated method stub
		UMLObject selectedObj = null;
		int i=0;
		for(i=canvas.getObjList().size()-1 ; i >= 0 ; i-- ) {
			if (canvas.getObjList().get(i).isInObjRange(x, y)){
				selectedObj = canvas.getObjList().get(i);
				System.out.println("get:"+selectedObj.getWidth()+","+selectedObj.getHeight());
				break;
			}
		}
		return selectedObj;
	}
}
