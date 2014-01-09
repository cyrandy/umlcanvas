package umlEditorGui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class Gui extends JFrame {

    public Gui() {
        initUI();
    }

    public final void initUI() {
        
        UMLCanvas canvas = UMLCanvas.getInstance();
        canvas.setPreferredSize(new Dimension(650, 0));
        canvas.setBorder(BorderFactory.createLineBorder (Color.blue, 2));
        canvas.setBackground(Color.white);
        add(canvas, BorderLayout.EAST);
        
        //Add tool bar to JFrame
        ToolBar toolbar = ToolBar.getInstance();
        add(toolbar, BorderLayout.WEST);
        
        MenuBar menuBar = new MenuBar();
        setJMenuBar(menuBar);
        
        //set JFrame
        setTitle("UML Editor");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
}