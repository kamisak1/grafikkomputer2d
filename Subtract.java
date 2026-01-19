import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Area;

public class Subtract extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D ellipse1 = new Ellipse2D.Double(80, 60, 40, 40);
        Ellipse2D ellipse2 = new Ellipse2D.Double(100, 60, 40, 40);
        Ellipse2D ellipse3 = new Ellipse2D.Double(120, 60, 40, 40);
        Ellipse2D ellipse4 = new Ellipse2D.Double(140, 60, 40, 100);
        Ellipse2D ellipse5 = new Ellipse2D.Double(80, 120, 40, 40);
        Ellipse2D ellipse6 = new Ellipse2D.Double(160, 120, 40, 40);
        Ellipse2D ellipse7 = new Ellipse2D.Double(180, 120, 40, 40);
        Ellipse2D ellipse8 = new Ellipse2D.Double(200, 120, 40, 40);
        Ellipse2D ellipse9 = new Ellipse2D.Double(190, 60, 40, 40);
        
        Area a1 = new Area(ellipse1);
        Area a2 = new Area(ellipse2);
        Area a3 = new Area(ellipse3);
        Area a4 = new Area(ellipse4);
        Area a6 = new Area(ellipse6);
        Area a7 = new Area(ellipse7);
        Area a8 = new Area(ellipse8);
        
        a2.subtract(a1);
        g2.draw(a2);
        
        a4.subtract(a3);
        a4.subtract(a6);
        g2.draw(a4);
        
        g2.draw(ellipse9);
        g2.draw(ellipse5);
        
        a7.subtract(a8);
        g2.draw(a7);
    }
}