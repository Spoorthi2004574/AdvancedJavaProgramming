//Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan
package SwingPrograms;

import javax.swing.*;
import java.awt.*;

public class ColorTabsCMY {

    public ColorTabsCMY() {
        // Create the main frame
        JFrame frame = new JFrame("CMY Color Tabs");

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Cyan panel
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        // Magenta panel
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        // Yellow panel
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabsCMY();
    }
}
