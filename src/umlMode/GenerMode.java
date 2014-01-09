package umlMode;


import java.awt.event.MouseEvent;

import shape.ShapeObj;
import shape.GenerLine;


public class GenerMode extends CreateLineObjMode {

	public GenerMode() {
		super();
	}
	@Override
	
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		if( isFromObj && isToObj ){
			addObj(new GenerLine((ShapeObj)startObject, (ShapeObj)endObject));
		}
		isFromObj = false;
		isToObj = false;
	}

}
