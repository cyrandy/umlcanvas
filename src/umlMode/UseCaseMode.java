package umlMode;


import java.awt.event.MouseEvent;

import shape.UseCaseObj;
import umlEditorGui.UMLCanvas;


public class UseCaseMode extends CreateObjMode {

	public UseCaseMode() {
		super();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			addObj(new UseCaseObj(e.getX(),e.getY()));
		}
	}
}