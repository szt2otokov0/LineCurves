import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class CurveDrawer {

    // ezt a részt nem kell módosítani
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("I'm here...");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        CurveDrawer.ImagePanel panel = new CurveDrawer.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    public static void drawRect(Graphics gfx){
        drawLineCurve(gfx, 0, 500);
        //drawLineCurve(gfx,500,-500);  //fixme:this should mirror it, but it doesn't :(
    }

    private static void drawLineCurve(Graphics gfx, int x, int y) {
        if(y < 0) {
            for(int i = y;i < 0;i += 10){
                gfx.drawLine(x+i,(int)Math.round(Math.log10(i)),x,y+i);
            }
        } else {
            for(int i = 0;i < y;i += 10){
                gfx.drawLine(x+i,(int)Math.round(Math.log10(i)),x,y-i);
            }
        }

    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawRect(graphics);
        }
    }
}
