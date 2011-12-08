package main;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.border.TitledBorder;
import javax.swing.event.MouseInputAdapter;

public class ImageMoveRotate extends JFrame {
	ShowCanvas canvas;
	

	public ImageMoveRotate() {
		super();
		Container container = getContentPane();
		canvas = new ShowCanvas();
		container.add(canvas);
		setSize(1245, 726);
		setVisible(true);
	}

	public static void main(String arg[]) {
		new ImageMoveRotate();
	}
}

class BackgroundPanel extends Panel
{
    // The Image to store the background image in.
    Image img;
    public BackgroundPanel()
    {
        // Loads the background image and stores in img object.
        img = Toolkit.getDefaultToolkit().createImage("mat.JPG");
    }

    public void paint(Graphics g)
    {
        // Draws the img to the BackgroundPanel.
        g.drawImage(img, 0, 0, null);
    }
}
class ShowCanvas extends JPanel {
	int x, y;
	BufferedImage image;
	double i=0;
	Thread mover;
	private static double currentAngle;
	private static boolean run = true;
	ShowCanvas() {
		setBackground(Color.white);
		setSize(1245, 726);
		addMouseListener(new MouseMotionHandler());

		Image img = getToolkit().getImage("mat.jpg");
		Image card = getToolkit().getImage("images/SDY/SDY-001.jpg");
		
		mover = new Thread(rep);
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img, 1);
		mt.addImage(card, 2);
		try {
			mt.waitForAll();
		} catch (Exception e) {
			System.out.println("Image not found.");
		}
		image = new BufferedImage(1245, 726,BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();
		g2.drawImage(img, 0, 0, this);
		g2.drawImage(card, 50, 50, this);
		
//		System.out.println(img.getHeight(null)+" "+img.getWidth(null));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		 AffineTransform origXform = g2D.getTransform();
	     AffineTransform newXform = (AffineTransform)(origXform.clone());
	     //center of rotation is center of the panel
	     int xRot = this.getWidth()/2;
	     int yRot = this.getHeight()/2;
	     newXform.rotate(Math.toRadians(currentAngle), xRot, yRot);
	     g2D.setTransform(newXform);
	     g2D.drawImage(image, x, y, this);
	     g2D.setTransform(origXform);
		
	}
	  public void rotate() {
	      currentAngle+=5.0;
	      if (currentAngle >= 360.0) {
	        currentAngle = 0;
	      }
	    }
	  
	class MouseMotionHandler extends MouseInputAdapter {

	    @Override
	    public void mouseEntered(MouseEvent paramMouseEvent)
	    {
//	        if (mover ==null)
//	        {
//	            mover = new Thread(rep);
//	        }
//	        run = true;
//	        mover.start();
	    }
	    @Override
	    public void mouseExited(MouseEvent paramMouseEvent)
	    {
//	     run = false;
//	     
//	     mover = null;
//	     x=0;
//	     y=0;
//	     repaint();
	    }
		public void mouseClicked(MouseEvent e)
		{
		    System.out.println(e.getComponent());
//		    mover.start();
		}
		
	}
	Runnable rep = new Runnable() {
        
        @Override
        public void run()
        {
            while(run)
            {
              
                try
                {
                    Thread.sleep(30);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                i+=0.1;
                x =((800-115)/2)+(int) (Math.sin(i)*50);
                y= ((450-162)/2)+(int) (Math.cos(i)*50);
    //          x+y =250;
                
                System.out.println(i +" "+x+" "+y);
                rotate();
                repaint();
            }
            System.out.println("thread ended");
            
        }
    };
    
    ImageObserver imageObserver = new ImageObserver(){

        @Override
        public boolean imageUpdate(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4,
                int paramInt5)
        {
            // TODO Auto-generated method stub
            return false;
        }
    };
    
}