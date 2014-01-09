package umlMode;


import java.awt.event.MouseEvent;

import shape.ShapeObj;
import shape.CompoLine;
import shape.UMLObject;
import umlEditorGui.UMLCanvas;


public class CompoMode extends CreateLineObjMode {
	public CompoMode() {
		super();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		if( isFromObj && isToObj ){
			addObj(new CompoLine((ShapeObj)startObject, (ShapeObj)endObject));
		}
		isFromObj = false;
		isToObj = false;
	}
}
