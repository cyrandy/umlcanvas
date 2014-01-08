import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;


public class CompoBtn extends JButton {
	private UMLCanvas umlCanvas;
	
	public CompoBtn(UMLCanvas canvas, final ToolBar bar) {
		umlCanvas = canvas;
		Icon classIcon = new ImageIcon("icon/4.png");
	    this.setIcon(classIcon);
	    this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				umlCanvas.setMode(new CompoMode(umlCanvas));
				bar.setAllToWhite();
				setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
	    	 
	     });
	}
}
