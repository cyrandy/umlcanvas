package main;
import javax.swing.SwingUtilities;

import umlEditorGui.Gui;


public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Gui ui = new Gui();
                ui.setVisible(true);
            }
        });
    }
    public static boolean isBetween(int min, int value, int max) {
    	return ((value>min) && (value<max));
    }
}