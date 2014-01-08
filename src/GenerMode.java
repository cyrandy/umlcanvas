import java.awt.event.MouseEvent;


public class GenerMode extends UMLMode {
	private UMLObject startObject = null;
	private UMLObject endObject = null;
	private boolean isFromObj = false ;
	private boolean isToObj = false;
	
	public GenerMode(UMLCanvas canvas) {
		super(canvas);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mousePressed(MouseEvent e) {
//		super.mouseClicked(e);
		// (left click mouse)
		if (e.getButton() == MouseEvent.BUTTON1) {
			//check if press from an obj
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
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1 ) {
			for(UMLObject obj : canvas.getObjList()) {
				if ( obj.isInObjRange(e.getX(), e.getY()) && obj != startObject ){
					endObject = obj;
					isToObj = true;
					break;
				}
			}
			if( isFromObj && isToObj ){
				System.out.println("add line");
				addGenerLine(startObject, endObject);
			}
		}
		isFromObj = false;
		isToObj = false;
	}
	private void addGenerLine(UMLObject startObject, UMLObject endObject) {
		GenerLine gen = new GenerLine(startObject, endObject);
		canvas.getObjList().add(gen);
		canvas.repaint();
	}

}
