package umlMode;


import java.awt.event.MouseEvent;

import shape.AssociationLine;
import shape.ShapeObj;


public class AssoMode extends CreateLineObjMode {
	
	
	public AssoMode() {
		super();
	}
	
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		if( isFromObj && isToObj ){
			addObj(new AssociationLine((ShapeObj)startObject, (ShapeObj)endObject));
		}
		isFromObj = false;
		isToObj = false;
	}
}
