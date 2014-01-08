package menuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import shape.UMLObject;
import umlEditorGui.UMLCanvas;


public class UMLUnGroupMenuItem extends JMenuItem {
	private UMLCanvas umlCanvas = UMLCanvas.getInstance();
	
	public UMLUnGroupMenuItem(){
		this.setText("Ungroup");
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int i=0;
				UMLObject tmpRemoveObj=null;
				for(i=umlCanvas.getObjList().size()-1 ; i >= 0 ; i--) {
					// to be modify - composite design pattern
					if(umlCanvas.getObjList().get(i).isSelected()) {
						tmpRemoveObj = umlCanvas.getObjList().get(i);
						tmpRemoveObj.unGroup();
						break;
					}
				}
			}
		});
	}
}
