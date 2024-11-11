package AppViews;

import java.awt.*;
import javax.swing.*;

public class PanelButton extends JPanel {

    public PanelButton() {
        setLayout(new FlowLayout(FlowLayout.CENTER)); // Adjust layout as needed
        setBorder(BorderUtils.createCompoundBorder(1, 10)); // Use utility method

        // Add buttons here
        add(createButton("Settings"));
        add(createButton("Randomize"));
        add(createButton("StartGame"));
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(100, 40)); // Adjust button size as needed
        return button;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 100); // Adjust size as needed
    }
}
