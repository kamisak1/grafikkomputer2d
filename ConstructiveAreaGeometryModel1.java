import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class ConstructiveAreaGeometryModel1 extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rectangle1 = new Rectangle2D.Double(70, 95, 20, 110);
        Rectangle2D rectangle2 = new Rectangle2D.Double(40, 100, 140, 20);
        Rectangle2D rectangle3 = new Rectangle2D.Double(130, 90, 20, 65);
        Rectangle2D rectangle4 = new Rectangle2D.Double(110, 130, 100, 20);
        Rectangle2D rectangle5 = new Rectangle2D.Double(110, 190, 100, 20);
        Rectangle2D rectangle6 = new Rectangle2D.Double(180, 125, 20, 90);
        
        Area a1 = new Area(rectangle1);
        Area a2 = new Area(rectangle2);
        Area a3 = new Area(rectangle3);
        Area a4 = new Area(rectangle4);
        Area a5 = new Area(rectangle5);
        Area a6 = new Area(rectangle6);
        
        a2.add(a1);
        a2.add(a3);
        a6.add(a4);
        a6.add(a5);
        a2.add(a6);
        
        Ellipse2D ellipse1 = new Ellipse2D.Double(40, 70, 20, 20);
        Ellipse2D ellipse2 = new Ellipse2D.Double(40, 175, 20, 20);
        Ellipse2D ellipse3 = new Ellipse2D.Double(100, 70, 20, 20);
        Ellipse2D ellipse4 = new Ellipse2D.Double(190, 80, 20, 20);
        
        g2.draw(a2);
        g2.draw(ellipse1);
        g2.draw(ellipse2);
        g2.draw(ellipse3);
        g2.draw(ellipse4);
    }
}