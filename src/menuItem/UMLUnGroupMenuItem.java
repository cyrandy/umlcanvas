package menuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import main.UMLCanvas;
import shape.UMLObject;


public class UMLUnGroupMenuItem extends JMenuItem {
	private UMLCanvas umlCanvas;
	
	public UMLUnGroupMenuItem(UMLCanvas canvas){
		umlCanvas = canvas;
		this.setText("Ungroup");
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int i=0;
				UMLObject tmpRemoveObj=null;
				if(umlCanvas.getMode() == "SelectMode") {
					for(i=umlCanvas.getObjList().size()-1 ; i >= 0 ; i--) {
						// to be modify - composite design pattern
						if(umlCanvas.getObjList().get(i).isSelected() && umlCanvas.getObjList().get(i).getClass().getName() == "GroupObj") {
							tmpRemoveObj = umlCanvas.getObjList().get(i);
							break;
						}
					}
				}
				umlCanvas.getObjList().remove(tmpRemoveObj);				
			}
		});
	}
}