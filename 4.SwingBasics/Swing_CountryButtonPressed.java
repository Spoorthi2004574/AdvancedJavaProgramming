//Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
//pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
//event handling mechanism with addActionListener( ).
package Fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_CountryButtonPressed implements ActionListener {

    // Declare components globally
    JFrame frame;
    JButton btnIndia, btnSrilanka;
    JLabel label;

    // Constructor to set up GUI
    public Swing_CountryButtonPressed() {
        // Create frame
        frame = new JFrame("Country Button Press Demo");

        // Create buttons
        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");

        // Create label
        label = new JLabel("Press a button", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.PLAIN, 24));

        // Set layout
        frame.setLayout(new GridLayout(3, 1, 10, 10));
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Register action listeners
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Event handler
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        } else if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        }
    }

    // Main method
    public static void main(String[] args) {
        new Swing_CountryButtonPressed();
    }
}

