package umlMode;


import java.awt.event.MouseEvent;

import main.UMLCanvas;
import shape.UseCaseObj;


public class UseCaseMode extends UMLMode {

	public UseCaseMode(UMLCanvas canvas) {
		super(canvas);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mouseClicked(MouseEvent e) {
//		super.mouseClicked(e);
		// (left click mouse)
		if (e.getButton() == MouseEvent.BUTTON1) {
			//add a class unit while click a button
//			System.out.println("add use case obj");
			addNewUseCase(e.getX(),e.getY());
			canvas.repaint();
		}
	}
	private void addNewUseCase(int x, int y) {
		// TODO Auto-generated method stub
		UseCaseObj newObj = new UseCaseObj(x, y, canvas);
		canvas.getObjList().add(newObj);
	}
}
