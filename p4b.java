package program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	

	public class p4b extends JFrame implements ActionListener {

	    JButton btnIndia, btnSrilanka;
	    JLabel label;

	    public p4b() {
	        // Set up the frame
	        setTitle("Country Button Press");
	        setSize(400, 200);
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create components
	        btnIndia = new JButton("India");
	        btnSrilanka = new JButton("Srilanka");
	        label = new JLabel("Press a button");

	        // Set font and color
	        label.setFont(new Font("Arial", Font.PLAIN, 20));
	        label.setForeground(Color.BLUE);

	        // Add action listeners
	        btnIndia.addActionListener(this);
	        btnSrilanka.addActionListener(this);

	        // Add components to the frame
	        add(btnIndia);
	        add(btnSrilanka);
	        add(label);

	        // Make the frame visible
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    // Handle button click events
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnIndia) {
	            label.setText("India is pressed");
	        } else if (e.getSource() == btnSrilanka) {
	            label.setText("Srilanka is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new p4b();
	    }
	}


