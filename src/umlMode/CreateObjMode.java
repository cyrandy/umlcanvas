package umlMode;

import shape.UMLObject;

public class CreateObjMode extends UMLMode {
	public CreateObjMode() {
		super();
	}
	public void addObj(UMLObject obj) {
		canvas.getObjList().add(obj);
		canvas.repaint();
	}
}
