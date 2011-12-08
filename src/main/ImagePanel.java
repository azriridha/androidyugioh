package main;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class ImagePanel extends JPanel{

    private BufferedImage image;
    private BufferedImage card;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("mat.jpg"));
            card = ImageIO.read(new File("images/SDY/SDY-001.jpg"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
        
        g.drawImage(card.getScaledInstance(121,176, 0), 35, 53,null);
       
    }

    
    public static void main(String[] args)
    {
        Frame pic = new Frame();
       pic.addMouseListener(new mouseListener());
        ImagePanel image = new ImagePanel();
        image.setVisible(true);
        pic.add(image);
        
        pic.setVisible(true);
        pic.setSize(1245, 726);
       
    }
    
    
}
class mouseListener implements MouseInputListener
{

    public mouseListener()
    {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void mouseClicked(MouseEvent paramMouseEvent)
    {
      System.out.println(paramMouseEvent.getComponent().getGraphics().);
    }

    @Override
    public void mousePressed(MouseEvent paramMouseEvent)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent paramMouseEvent)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent paramMouseEvent)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent paramMouseEvent)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent paramMouseEvent)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent paramMouseEvent)
    {
        // TODO Auto-generated method stub
        
    }
    
}