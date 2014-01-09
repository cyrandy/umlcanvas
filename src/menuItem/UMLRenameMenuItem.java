package menuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import shape.UMLObject;
import umlEditorGui.UMLCanvas;

public class UMLRenameMenuItem extends JMenuItem {
	private UMLCanvas umlCanvas = UMLCanvas.getInstance();
	
	public UMLRenameMenuItem(){
		this.setText("Rename");
		this.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(umlCanvas.isAnyObjSelected()){
					String newName = JOptionPane.showInputDialog("Please type in new name");
					for(UMLObject obj : umlCanvas.getObjList()){
						if(obj.isSelected() && newName != null) {
							obj.setName(newName);
						}
					}
					umlCanvas.repaint();
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a basic object");
				}
			}
		});
	}
}