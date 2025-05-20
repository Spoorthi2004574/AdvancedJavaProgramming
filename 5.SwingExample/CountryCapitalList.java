//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display the capital of the countries on console whenever the countries are selected on the list
package SwingPrograms;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class CountryCapitalList {

    public CountryCapitalList() {
        // Create the main frame
        JFrame frame = new JFrame("Country and Capital List");

        // Country array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain",
            "Japan", "Africa", "Greenland", "Singapore"
        };

        // Map countries to capitals
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Vietnam", "Hanoi");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Denmark", "Copenhagen");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Great Britain", "London");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Africa", "Varies (e.g., Pretoria, South Africa)");
        countryCapitals.put("Greenland", "Nuuk");
        countryCapitals.put("Singapore", "Singapore");

        // Create JList
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add scroll pane for the list
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected Capitals:");
                    for (String country : selected) {
                        String capital = countryCapitals.get(country);
                        System.out.println(country + " → " + capital);
                    }
                    System.out.println("--------------");
                }
            }
        });

        // Frame layout
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("Select countries:"), BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
