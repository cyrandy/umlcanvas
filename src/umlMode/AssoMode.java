package umlMode;


import java.awt.event.MouseEvent;

import shape.AssociationLine;
import shape.UMLObject;
import umlEditorGui.UMLCanvas;


public class AssoMode extends UMLMode {
	private UMLObject startObject = null;
	private UMLObject endObject = null;
	private boolean isFromObj = false ;
	private boolean isToObj = false;
	
	public AssoMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mousePressed(MouseEvent e) {
//		super.mouseClicked(e);
		// (left click mouse)
		if (e.getButton() == MouseEvent.BUTTON1) {
			//check if press from an obj
			for(UMLObject obj : canvas.getObjList()) {
				if ( obj.isInObjRange(e.getX(), e.getY()) ){
					startObject = obj;
					isFromObj = true;
					break;
				}
			}
			canvas.repaint();
		}
	}
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1 ) {
			for(UMLObject obj : canvas.getObjList()) {
				if ( obj.isInObjRange(e.getX(), e.getY()) && obj != startObject ){
					endObject = obj;
					isToObj = true;
					break;
				}
			}
			if( isFromObj && isToObj ){
				System.out.println("add line");
				addAssoLine(startObject, endObject);
			}
		}
		isFromObj = false;
		isToObj = false;
	}
	private void addAssoLine(UMLObject startObject, UMLObject endObject) {
		AssociationLine ass = new AssociationLine(startObject, endObject);
		canvas.getObjList().add(ass);
		canvas.repaint();
	}

}
