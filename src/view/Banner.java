package view;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Class for resize the banner in a panel
 * @author Capa
 */
@SuppressWarnings("serial")
public class Banner extends javax.swing.JPanel {
    private static final ImageIcon defaultIcon =
            new ImageIcon(Banner.class.getResource("LargeBanner.jpg"));
    private static final int SIZEH = 1024;
    private static final int SIZEW = 100;
    @SuppressWarnings("unused")
	private ImageIcon icon;
    private Image rescaledIcon;

    public Banner(){
        this(defaultIcon);
    }
    /**
     * Creates new form AvatarPanel
     */
    public Banner(ImageIcon icon) {
        this.setPreferredSize(new Dimension(SIZEH, SIZEW));
        this.icon = icon;
        this.rescaledIcon = icon.getImage().getScaledInstance(SIZEH, SIZEW, Image.SCALE_DEFAULT);
    }
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        this.rescaledIcon = icon.getImage().getScaledInstance(SIZEH, SIZEW, Image.SCALE_DEFAULT);
        this.repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(rescaledIcon,0,0,this);
    }
}
