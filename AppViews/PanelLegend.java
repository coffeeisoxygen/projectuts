package AppViews;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PanelLegend extends JPanel {

    public PanelLegend() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Arrange items vertically
        setBorder(BorderUtils.createCompoundBorder(1, 10)); // Use utility method

        // Label title untuk legend
        JLabel titleLabel = new JLabel("Legend:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBorder(new EmptyBorder(0, 0, 10, 0)); // Add space below the title
        add(titleLabel);

        // Menambahkan item legend dengan border
        add(createLegendItem("Start Point", "images/map_startpoint.png"));
        add(createLegendItem("End Point", "images/map_endpoint.png"));
        add(createLegendItem("Checkpoint", "images/map_checkpoint.png"));
        add(createLegendItem("Obstacle", "images/map_obstaclepoint.png"));
        add(createLegendItem("Safe Route", "images/map_saferoute.png"));
    }

    private JPanel createLegendItem(String text, String iconPath) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Align icon and text to the left
        panel.setBorder(new LineBorder(Color.GRAY, 1, true)); // Add border to each legend item

        // Load icon image and set label
        JLabel iconLabel = new JLabel(loadIcon(iconPath, 30, 30)); // Ukuran ikon disesuaikan
        JLabel textLabel = new JLabel(text);

        // Menambahkan ikon dan teks ke panel
        panel.add(iconLabel);
        panel.add(textLabel);
        return panel;
    }

    private ImageIcon loadIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 400); // Adjust size as needed
    }
}
