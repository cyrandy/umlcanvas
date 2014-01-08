import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class MenuBar extends JMenuBar {
	private UMLCanvas umlCanvas;
	
    JMenu menuF;
    JMenu menuE;
	
	public MenuBar(UMLCanvas canvas){
		umlCanvas = canvas;
	    menuF = new UMLMenuFile(umlCanvas);
	    menuE = new UMLMenuEdit(umlCanvas);
	    this.add(menuF);
	    this.add(menuE);
	}
}
