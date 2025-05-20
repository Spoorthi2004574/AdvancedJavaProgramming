//Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
//display the concerned color whenever the specific tab is selected in the Pan
package SwingPrograms;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {

    public ColorTabbedPane() {
        // Create JFrame
        JFrame frame = new JFrame("Color Tabbed Pane");

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create color panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs to tabbed pane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add tabbedPane to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  // Center on screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}
