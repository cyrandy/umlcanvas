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
import umlMode.UseCaseMode;
import main.UMLCanvas;


public class ToolBar extends JToolBar {
	private JButton selectBtn;
	private JButton classBtn;
	private JButton useCaseBtn;
	private JButton assoBtn;
	private JButton generBtn; 
	private JButton compoBtn;
	private UMLCanvas canvas;
	
	public ToolBar(UMLCanvas canvas) {
		this.canvas = canvas;
		// TODO Auto-generated constructor stub
		selectBtn = new JButton(new ImageIcon("icon/1.png"));
		classBtn = new JButton(new ImageIcon("icon/5.png"));
		useCaseBtn = new JButton(new ImageIcon("icon/6.png"));
		assoBtn = new JButton(new ImageIcon("icon/2.png"));
		generBtn = new JButton(new ImageIcon("icon/3.png"));
		compoBtn = new JButton(new ImageIcon("icon/4.png"));
		
		setButtonActions();
		setAllToWhite();
		
		this.setOrientation(VERTICAL);
		this.add(selectBtn);
		this.add(assoBtn);
		this.add(generBtn);
		this.add(compoBtn);
		this.add(classBtn);
		this.add(useCaseBtn);
		
	}
	private void setButtonActions() {
		// TODO Auto-generated method stub
		assoBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				canvas.setMode(new AssoMode(canvas));
				setAllToWhite();
				assoBtn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	     });
		classBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				canvas.setMode(new ClassObjMode(canvas));
				setAllToWhite();
				classBtn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	    	 
	     });
		compoBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				canvas.setMode(new CompoMode(canvas));
				setAllToWhite();
				compoBtn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	     });
		generBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				canvas.setMode(new GenerMode(canvas));
				setAllToWhite();
				generBtn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	     });
		selectBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				canvas.setMode(new SelectMode(canvas));
				setAllToWhite();
				selectBtn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	    	 
	     });
		useCaseBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				canvas.setMode(new UseCaseMode(canvas));  
				setAllToWhite();
				useCaseBtn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	     });
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
