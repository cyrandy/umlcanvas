import java.awt.event.MouseEvent;


public class ClassObjMode extends UMLMode {

	public ClassObjMode(UMLCanvas canvas) {
		super(canvas);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mouseClicked(MouseEvent e) {
//		super.mouseClicked(e);
		// (left click mouse)
		if (e.getButton() == MouseEvent.BUTTON1) {
			//add a class unit while click a button
			addClassObj(e.getX(), e.getY());
			canvas.repaint();
		}
	}
	private void addClassObj(int posX, int posY){
		ClassObj newObj;
		newObj = new ClassObj(posX, posY, this.canvas);
		this.canvas.getObjList().add(newObj);
	}
}
