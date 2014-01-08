package menuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import main.UMLCanvas;
import shape.UMLObject;

public class UMLRenameMenuItem extends JMenuItem {
	private UMLCanvas umlCanvas;
	
	public UMLRenameMenuItem(UMLCanvas canvas){
		umlCanvas = canvas;
		this.setText("Rename");
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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