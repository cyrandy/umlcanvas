package umlMode;

import java.awt.event.MouseEvent;

import shape.ClassObj;


public class ClassObjMode extends CreateObjMode {

	public ClassObjMode() {
		super();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			addObj(new ClassObj(e.getX(), e.getY()));
		}
	}
}
