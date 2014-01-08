import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class UMLMouseListener extends MouseAdapter {
	private UMLCanvas canvas;
	private UMLMode mode;
	public UMLMouseListener(UMLCanvas canvas, UMLMode mode) {
		this.canvas = canvas;
		this.mode = mode;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		mode.mouseDragged(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mode.mouseMoved(e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mode.mouseClicked(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		mode.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		mode.mouseEntered(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mode.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		mode.mouseReleased(e);
	}
}
