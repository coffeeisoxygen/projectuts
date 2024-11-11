package AppViews;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class PanelStatus extends JPanel {

    private JLabel playerNameLabel;
    private JLabel playerEnergyLabel;
    private JLabel playerMovementLabel;

    public PanelStatus() {
        setLayout(new GridLayout(1, 3, 10, 0)); // 10px jarak antar kolom
        setPreferredSize(new Dimension(0, 50)); // Adjusted height to 50
        setBorder(BorderUtils.createCompoundBorder(1, 5)); // Use utility method

        Border labelBorder = BorderFactory.createLineBorder(Color.GRAY, 1);

        playerNameLabel = new JLabel();
        playerNameLabel.setIcon(loadAndResizeIcon("images/player_icon.png", 30, 30)); // Adjusted icon size
        playerNameLabel.setBorder(labelBorder);

        playerEnergyLabel = new JLabel();
        playerEnergyLabel.setIcon(loadAndResizeIcon("images/player_energy_icon.png", 30, 30)); // Adjusted icon size
        playerEnergyLabel.setBorder(labelBorder);

        playerMovementLabel = new JLabel();
        playerMovementLabel.setIcon(loadAndResizeIcon("images/player_moveplan_icon.png", 30, 30)); // Adjusted icon size
        playerMovementLabel.setBorder(labelBorder);

        add(playerNameLabel);
        add(playerEnergyLabel);
        add(playerMovementLabel);

        setPlayerDetails("Sample Name", 100, "Sample Movement");
    }

    private ImageIcon loadAndResizeIcon(String path, int width, int height) {
        try {
            BufferedImage img = ImageIO.read(new File(path));
            Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImg);
        } catch (IOException e) {
            return null;
        }
    }

    public void setPlayerDetails(String name, int energy, String movement) {
        playerNameLabel.setText("Player Name: " + name);
        playerEnergyLabel.setText("Player Energy: " + energy);
        playerMovementLabel.setText("Player Movement: " + movement);
    }
}
