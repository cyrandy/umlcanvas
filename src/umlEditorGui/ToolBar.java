package umlEditorGui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import umlMode.AssoMode;
import umlMode.ClassObjMode;
import umlMode.CompoMode;
import umlMode.GenerMode;
import umlMode.SelectMode;
import umlMode.UMLMode;
import umlMode.UseCaseMode;
import main.UMLCanvas;


public class ToolBar extends JToolBar {
	private JButton selectBtn;
	private JButton classBtn;
	private JButton useCaseBtn;
	private JButton assoBtn;
	private JButton generBtn; 
	private JButton compoBtn;
	private static UMLCanvas canvas = UMLCanvas.getInstance();
	private static ToolBar instance = null;
	
	public static ToolBar getInstance(){
		if (instance == null) {
			instance = new ToolBar();
		}
		return instance;
	}
	
	private ToolBar() {
		// TODO Auto-generated constructor stub
		selectBtn = new toolBtn(new ImageIcon("icon/1.png"), new SelectMode());
		classBtn = new toolBtn(new ImageIcon("icon/5.png"),new ClassObjMode());
		useCaseBtn = new toolBtn(new ImageIcon("icon/6.png"), new UseCaseMode());
		assoBtn = new toolBtn(new ImageIcon("icon/2.png"), new AssoMode());
		generBtn = new toolBtn(new ImageIcon("icon/3.png"), new GenerMode());
		compoBtn = new toolBtn(new ImageIcon("icon/4.png"), new CompoMode());
		
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
