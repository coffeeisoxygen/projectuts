package AppViews;

import java.awt.*;
import javax.swing.*;

public class MainGameFrame extends JFrame {

    public MainGameFrame() {
        setTitle("Main Game View");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create and configure PanelStatus
        PanelStatus panelStatus = new PanelStatus();
        panelStatus.setPreferredSize(new Dimension(800, 60)); // Lebar penuh, tinggi 60px
        add(panelStatus, BorderLayout.NORTH);

        // Create and configure PanelMap
        PanelMap panelMap = new PanelMap();
        panelMap.setPreferredSize(new Dimension(600, 600)); // Lebar 600px, tinggi 600px
        add(panelMap, BorderLayout.CENTER);

        // Create and configure PanelButton
        PanelButton panelButton = new PanelButton();
        panelButton.setPreferredSize(new Dimension(800, 50)); // Lebar penuh, tinggi 50px
        add(panelButton, BorderLayout.SOUTH);

        // Create and configure PanelLegend
        PanelLegend panelLegend = new PanelLegend();
        panelLegend.setPreferredSize(new Dimension(200, 600)); // Lebar 200px, tinggi sama dengan PanelMap
        add(panelLegend, BorderLayout.EAST);

        // Adjust frame to fit components
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGameFrame());
    }
}
