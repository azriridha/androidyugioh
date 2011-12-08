package main;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.border.TitledBorder;

public class MoveImage extends JFrame {
	ShowCanvas canvas;

	public MoveImage() {
		super();
		Container container = getContentPane();
		canvas = new ShowCanvas();
		container.add(canvas);
		setSize(1600, 900);
		setVisible(true);
	}

	public static void main(String arg[]) {
		new MoveImage();
	}
}

class ShowCanvas extends JPanel {
	int x, y;
	BufferedImage image;
	double i=0;

	ShowCanvas() {
		setBackground(Color.white);
		setSize(1600, 900);
		addMouseMotionListener(new MouseMotionHandler());
		

		Image img = getToolkit().getImage("images/SDY/SDY-001.jpg");

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img, 1);
		try {
			mt.waitForAll();
		} catch (Exception e) {
			System.out.println("Image not found.");
		}
		image = new BufferedImage(1600, 900,
//		image = new BufferedImage(img.getWidth(this), img.getHeight(this),
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();
		g2.drawImage(img, 250, 250, this);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(image, x, y, this);
	}

	class MouseMotionHandler extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			i+=0.01;
			x =(int)i;//250+(int) (Math.sin(i)*250);
			y= 250+(int) (Math.cos(i)*250);
//			x+y =250;
			
			System.out.println(i +" "+x+" "+y);
			
			repaint();
		}

		public void mouseMoved(MouseEvent e) {
		}
		
	}
}