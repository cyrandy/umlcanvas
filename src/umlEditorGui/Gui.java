package umlEditorGui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import main.UMLCanvas;

public class Gui extends JFrame {

    public Gui() {
        initUI();
    }

    public final void initUI() {
        
        UMLCanvas canvas = new UMLCanvas();
        canvas.setPreferredSize(new Dimension(650, 0));
        canvas.setBorder(BorderFactory.createLineBorder (Color.blue, 2));
        canvas.setBackground(Color.white);
        add(canvas, BorderLayout.EAST);
        
        //Add tool bar to JFrame
        ToolBar toolbar = new ToolBar(canvas);
        add(toolbar, BorderLayout.WEST);
        
        MenuBar menuBar = new MenuBar(canvas);
        setJMenuBar(menuBar);
        
        //set JFrame
        setTitle("UML Editor");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
}