
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class RenameMenuItem extends JMenuItem {
	private UMLCanvas umlCanvas;
	
	public RenameMenuItem(UMLCanvas canvas){
		umlCanvas = canvas;
		this.setText("Rename");
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String newName = JOptionPane.showInputDialog("Set new name");
				for(UMLObject obj : umlCanvas.getObjList()){
					if(obj.isSelected() && newName != null){
						obj.setName(newName);
						
//						if(obj.getShapeObjLis() != null){
//							for(ShapeObj members : unit.getShapeObjLis()){
//								members.setName(newName);
//							}
//						}
					}
				}
				umlCanvas.repaint();	
			}
			
		});
	    
	}
}
