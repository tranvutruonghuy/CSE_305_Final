package utils;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Wunhh
 */
public class ScaleImages {
    public static ImageIcon scaleImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
    }
}
