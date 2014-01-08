import java.awt.Canvas;

import javax.swing.JMenu;


public class UMLMenuEdit extends JMenu {
	private UMLCanvas umlCanvas;
	
	private UMLUnGroupMenuItem umlUnGroupMenuItem;
	private UMLGroupMenuItem umlGroupMenuItem;
	private UMLRenameMenuItem umlRenameMenuItem;
	
	public UMLMenuEdit(UMLCanvas canvas){
		umlCanvas = canvas;
		setText("Edit");
		
		umlUnGroupMenuItem = new UMLUnGroupMenuItem(umlCanvas);
		umlGroupMenuItem = new UMLGroupMenuItem(umlCanvas);
		umlRenameMenuItem = new UMLRenameMenuItem(umlCanvas);
		this.add(umlGroupMenuItem);
		this.add(umlUnGroupMenuItem);
		this.add(umlRenameMenuItem);
	}
}
