package program;
import javax.swing.*;
import java.awt.*;
	
	public class p5d extends JFrame {

	    public p5d() {
	        setTitle("CMY Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create a JTabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create color panels
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add panels as tabs
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add tabbedPane to frame
	        add(tabbedPane);

	        setLocationRelativeTo(null); // Center the window
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new p5d();
	    }
	}

