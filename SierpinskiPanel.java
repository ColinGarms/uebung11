package uebung11;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.util.Map;

import javax.swing.JPanel;


public class SierpinskiPanel extends DrawTriangles{
	
	private static int maxDepth = 9;
	private static Color[] colors = {new Color(0x123456), new Color(0x123456), new Color(0x123456), new Color(0x123456), new Color(0x123456), new Color(0x123456)};
	
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static int[] xArray = {screenSize.width/2,screenSize.width/2-623,screenSize.width/2+623};
	private static int[] yArray = {0,screenSize.height,screenSize.height};
	
	
	/*
	public int getWidth() {
		Toolkit.getDefaultToolkit().getScreenSize();
		
	}
	
	public int getHeight() {
		Toolkit.getDefaultToolkit().getScreenHeight();
	}
	*/
	
	
	private void drawRecursively(Graphics g, int[] x, int[] y, int level) {
		
	}
	
	/*
	private Map<Integer, int[][]> getNewTriangles(int[] x, int[] y){
		int[] xneu = x1 ;
		int[] yneu = ;
		return; new Map((x[0] + x[1]) / 2, (y[0] + y[1]) / 2);
	}
	*/
	
	
	private void drawTriangle(Graphics g, int[] x, int[] y, int level) {
		Polygon p = new Polygon(x,y,3);
		g.fillPolygon(p);
		repaint();
		
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		draw(g, xArray,yArray);
	}
	
	
	
	
	private void draw(Graphics g, int[] x, int[] y) {
		drawTriangle(g, xArray,yArray,3);
		Polygon p = new Polygon(x,y,3);
		g.fillPolygon(p);
		repaint();
	}
	
	/*
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void paintComponent(Graphics g) {
		  super.paintComponent(g);
		  
		  Graphics2D g2 = (Graphics2D)g;
		  
		  g2.setStroke(new BasicStroke(5));
		  g2.setColor(Color.PINK);
		  g2.drawLine(10, 20, 100, 200);
}
*/
}


