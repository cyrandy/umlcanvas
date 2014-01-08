package umlEditorGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.UMLCanvas;
import umlMode.AssoMode;
import umlMode.UMLMode;

public class toolBtn extends JButton {
	private UMLMode mode;
	private UMLCanvas canvas;
	
	public toolBtn(ImageIcon imageIcon,  final UMLMode mode, final UMLCanvas canvas){
		this.mode = mode;
		this.canvas = canvas;
		this.setIcon(imageIcon);
		
		this.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				canvas.setMode(mode);
//				setAllToWhite();
				setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	     });
	}
}
