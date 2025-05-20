// Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
//Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
//pressed by implementing the event handling mechanism with addActionListener( )
package Fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_ClockButtonPressed implements ActionListener {

    JFrame frame;
    JButton digitalClockButton, hourGlassButton;
    JLabel messageLabel;

    public Swing_ClockButtonPressed() {
        frame = new JFrame("Clock Image Button Demo");

        // Load original images
        ImageIcon originalDigital = new ImageIcon("C:\\Users\\spoor\\Downloads\\digital.jpeg");
        ImageIcon originalHourglass = new ImageIcon("C:\\Users\\spoor\\Downloads\\hour.jpeg");

        // Resize images to 100x100
        Image scaledDigitalImg = originalDigital.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image scaledHourglassImg = originalHourglass.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Create ImageIcons from scaled images
        ImageIcon digitalIcon = new ImageIcon(scaledDigitalImg);
        ImageIcon hourglassIcon = new ImageIcon(scaledHourglassImg);

        // Create buttons with resized images
        digitalClockButton = new JButton(digitalIcon);
        hourGlassButton = new JButton(hourglassIcon);

        // Set tooltips for buttons
        digitalClockButton.setToolTipText("Digital Clock");
        hourGlassButton.setToolTipText("Hour Glass");

        // Register action listeners
        digitalClockButton.addActionListener(this);
        hourGlassButton.addActionListener(this);

        // Label to display output message
        messageLabel = new JLabel("Press an icon", SwingConstants.CENTER);
        messageLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));

        // Frame layout setup
        frame.setLayout(new BorderLayout());

        // Panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(digitalClockButton);
        buttonPanel.add(hourGlassButton);

        // Add components to frame
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(messageLabel, BorderLayout.SOUTH);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }

    // Handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalClockButton) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == hourGlassButton) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new Swing_ClockButtonPressed();
    }
}
