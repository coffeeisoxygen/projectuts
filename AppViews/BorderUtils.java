package AppViews;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class BorderUtils {

    public static Border createCompoundBorder(int lineThickness, int padding) {
        return BorderFactory.createCompoundBorder(
            new LineBorder(Color.BLACK, lineThickness, true),
            new EmptyBorder(padding, padding, padding, padding)
        );
    }
}
