package umlEditorGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import menuItem.UMLGroupMenuItem;
import menuItem.UMLRenameMenuItem;
import menuItem.UMLUnGroupMenuItem;


public class MenuBar extends JMenuBar {
	JMenu menuF;
    JMenu menuE;
    JMenuItem exitMenuItem;
    JMenuItem ungroupMenuItem;
    JMenuItem groupMenuItem;
    JMenuItem renameMenuItem;
	
	public MenuBar(){
	    menuF = new JMenu("File");
	    menuE = new JMenu("Edit");
	    
	    exitMenuItem = new JMenuItem("exit");
	    ungroupMenuItem = new UMLUnGroupMenuItem();
		groupMenuItem = new UMLGroupMenuItem();
		renameMenuItem = new UMLRenameMenuItem();
	    
	    exitMenuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	    
		menuF.add(exitMenuItem);
		menuE.add(groupMenuItem);
		menuE.add(ungroupMenuItem);
		menuE.add(renameMenuItem);
		
	    this.add(menuF);
	    this.add(menuE);
	}
}
