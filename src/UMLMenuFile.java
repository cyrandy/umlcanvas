import javax.swing.JMenu;


public class UMLMenuFile extends JMenu {
	private UMLCanvas umlCanvas;
	private UMLExitMenuItem umlExitMenuItem;
	
	public UMLMenuFile(UMLCanvas canvas) {
		// TODO Auto-generated constructor stub
		umlCanvas = canvas;
		setText("File");
		
		umlExitMenuItem = new UMLExitMenuItem(umlCanvas);
		this.add(umlExitMenuItem);
	}
}
