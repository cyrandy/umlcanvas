package menuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

import shape.GroupObj;
import shape.UMLObject;
import umlEditorGui.UMLCanvas;


public class UMLGroupMenuItem extends JMenuItem {
	private UMLCanvas umlCanvas = UMLCanvas.getInstance();
	
	public UMLGroupMenuItem(){
		this.setText("Group");
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<UMLObject> objList = new ArrayList<UMLObject>();
				for (UMLObject object : umlCanvas.getObjList()) {
					if (object.isSelected()) {
						objList.add(object);
					}
				}
				if( objList.size() > 0 ) {
					GroupObj groupObj = new GroupObj(objList);
					umlCanvas.getObjList().add(groupObj);
					umlCanvas.repaint();
				}
			}
		});
	}
}
