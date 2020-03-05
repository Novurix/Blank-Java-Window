import java.awt.Dimension;
import javax.swing.JFrame;

public class WindowDisplay {

    public WindowDisplay(String title, int width, int height) {
        JFrame mainFrame = new JFrame(title);
        mainFrame.setVisible(true);
        mainFrame.setPreferredSize(new Dimension(width,height));
        mainFrame.setMinimumSize(new Dimension(width,height));
        mainFrame.pack();
        mainFrame.setResizable(true); /* If you want you could set resizable to false */
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
    }
}