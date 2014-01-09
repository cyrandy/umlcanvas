package umlMode;

import java.awt.event.MouseEvent;

import shape.UMLObject;

public class CreateLineObjMode extends CreateObjMode {
	protected UMLObject startObject = null;
	protected UMLObject endObject = null;
	protected boolean isFromObj = false ;
	protected boolean isToObj = false;
	
	public CreateLineObjMode() {
		super();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
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
	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1 ) {
			for(UMLObject obj : canvas.getObjList()) {
				if ( obj.isInObjRange(e.getX(), e.getY()) && obj != startObject ){
					endObject = obj;
					isToObj = true;
					break;
				}
			}
		}
	}
			
}
