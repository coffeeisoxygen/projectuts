package AppViews;

import java.awt.*;
import javax.swing.*;

public class PanelMap extends JPanel {

    public PanelMap() {
        setLayout(new BorderLayout()); // Adjust layout as needed
        setBorder(BorderUtils.createCompoundBorder(1, 10)); // Use utility method

        // Add map components here
        // Example: add(new JLabel("Map goes here"), BorderLayout.CENTER);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600); // Adjust size as needed
    }
}
