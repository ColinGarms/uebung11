package uebung11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.Graphics;
import java.awt.geom.Point2D;

public class DrawTriangles extends JPanel {
	static JFrame frame;
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static SierpinskiTriangle name;
	
   /* public void paintComponent(Graphics g) {
        Triangle_Shape triangleShape = new Triangle_Shape(new Point2D.Double(1905/2, 0),
        new Point2D.Double(1905, 1000), new Point2D.Double(0, 1000));
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.BLUE);
        g2d.draw(triangleShape);
        
    }
    */
    public static void main (String [] args){
       frameSetup();
      // drawTriangles();
    	
    	
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(screenSize.width,screenSize.height);

        DrawTriangles panel = new DrawTriangles();
        frame.add(panel);
        frame.setVisible(true);
    }
    
    
    private static void frameSetup() {
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	frame = new JFrame("Draw Triangle");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setBackground(Color.black);
    	frame.setSize(screenSize.width,screenSize.height);
    }
    
private static void drawTriangles() {
    	frame.add(new SierpinskiPanel());
    	frame.setVisible(true);
    }


}

/*
class Triangle_Shape extends Path2D.Double {
    public Triangle_Shape(Point2D... points) {
        moveTo(points[0].getX(), points[0].getY());
        lineTo(points[1].getX(), points[1].getY());
        lineTo(points[2].getX(), points[2].getY());
        closePath();
    }
}
*/