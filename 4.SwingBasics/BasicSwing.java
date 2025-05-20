//Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
//Programming in Blue color plain font with font size of 32 using Jframe and Jlabel
package Fourth;

import javax.swing.*;
import java.awt.*;

public class BasicSwing {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create a label with the desired message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: plain, size 32
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

        // Set the font color to blue
        label.setForeground(Color.BLUE);

        // Add label to the frame
        frame.add(label);

        // Set frame size
        frame.setSize(800, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
