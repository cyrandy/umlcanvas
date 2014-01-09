package umlEditorGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import umlMode.UMLMode;

public class toolBtn extends JButton {
	private UMLMode mode;
	
	public toolBtn(ImageIcon imageIcon, UMLMode mode){
		this.mode = mode;
		this.setIcon(imageIcon);
		
		this.addActionListener(new ActionListener(){
			private UMLMode mode;
			private UMLCanvas canvas = UMLCanvas.getInstance();
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mode = toolBtn.this.mode;
				canvas.setMode(mode);
				ToolBar.getInstance().setAllToWhite();
				setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	     });
	}
}
