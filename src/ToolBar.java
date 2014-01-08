import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JToolBar;


public class ToolBar extends JToolBar {
	private SelectionBtn selectBtn;
	private ClassObjBtn classBtn;
	private UseCaseBtn useCaseBtn;
	private AssoBtn assoBtn;
	private GenerBtn generBtn; 
	private CompoBtn compoBtn;
	private UMLCanvas canvas;
	
	public ToolBar(UMLCanvas canvas) {
		this.canvas = canvas;
		// TODO Auto-generated constructor stub
		selectBtn = new SelectionBtn(canvas,this);
		classBtn = new ClassObjBtn(canvas,this);
		useCaseBtn = new UseCaseBtn(canvas,this);
		assoBtn = new AssoBtn(canvas, this);
		generBtn = new GenerBtn(canvas, this);
		compoBtn = new CompoBtn(canvas, this);
		
		setAllToWhite();
		
		this.setOrientation(VERTICAL);
		this.add(selectBtn);
		this.add(assoBtn);
		this.add(generBtn);
		this.add(compoBtn);
		this.add(classBtn);
		this.add(useCaseBtn);
		
	}
	public void setAllToWhite() {
		selectBtn.setBorder(null);
		classBtn.setBorder(null);
		useCaseBtn.setBorder(null);
		compoBtn.setBorder(null);
		assoBtn.setBorder(null);
		generBtn.setBorder(null);
	}
}
