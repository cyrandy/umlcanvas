package menuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import main.UMLCanvas;


public class UMLExitMenuItem extends JMenuItem {
	private UMLCanvas umlCanvas;
	
	public UMLExitMenuItem(UMLCanvas canvas){
		umlCanvas = canvas;
		setText("exit");
		addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
	}
}
