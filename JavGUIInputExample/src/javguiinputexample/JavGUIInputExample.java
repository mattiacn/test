/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javguiinputexample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Bullet {
    private double vx;
    private double vy;
    private double px;
    private double py;

    /**
     * @return the vx
     */
    public double getVx() {
        return vx;
    }

    /**
     * @param vx the vx to set
     */
    public void setVx(double vx) {
        this.vx = vx;
    }

    /**
     * @return the vy
     */
    public double getVy() {
        return vy;
    }

    /**
     * @param vy the vy to set
     */
    public void setVy(double vy) {
        this.vy = vy;
    }

    /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }
}

class BulletPanel extends JPanel {
    
    ArrayList bullets = new ArrayList();
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 5000);
        g.setColor(Color.black);
        for (int i=0; i < bullets.size(); i++){
            Bullet b = (Bullet)bullets.get(i);
            g.drawOval((int)b.getPx(), (int)b.getPy(), 10, 10);
        }
            
    }
}
class PaintTask extends TimerTask {

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //b.repaint();
    }
    
}
/**
 *
 * @author Nick
 */
public class JavGUIInputExample implements MouseListener, MouseMotionListener, KeyListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame();
        f.setTitle("GUI Input Example");
        f.setSize(new Dimension(500,500));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(new JavGUIInputExample());
        f.addMouseMotionListener(new JavGUIInputExample());
        f.addKeyListener(new JavGUIInputExample());

        
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.exit(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nick is great: " + e.getX() + "x - " + e.getY() + "y");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(e.getKeyChar() + " is typed");
        //SoundPlayer sp = new SoundPlayer("./media/slap.wav");
        //sp.start();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println(e.getKeyChar() + " is pressed");
        SoundPlayer sp = new SoundPlayer("./media/slap.wav");
        sp.start();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println(e.getKeyChar() + " is released");
        
        SoundPlayer sp = new SoundPlayer("./media/sniper.wav");
        sp.start();
    }
    
}
