//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display them on console whenever the countries are selected on the list.
package SwingPrograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class CountryList {

    public CountryList() {
        // Create JFrame
        JFrame frame = new JFrame("Country List Display");

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain",
            "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add a scroll pane in case of many entries
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add listener for selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                    System.out.println("-----------");
                }
            }
        });

        // Set up the frame
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("Select countries:"), BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  // Center on screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CountryList();
    }
}
