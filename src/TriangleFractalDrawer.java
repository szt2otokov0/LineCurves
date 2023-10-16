import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TriangleFractalDrawer {
        // ezt a részt nem kell módosítani
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void drawRect(Graphics gfx){
            drawFractal(gfx);
        }

        private static void drawFractal(Graphics gfx){
            int x = 0;
            int y = 0;
            gfx.drawLine(x,y,x+40,y+60);
            gfx.drawLine(x+40,y+60,x+80,y);
            gfx.drawLine(x+80,y,x,y);
        }

        public static void main(String[] args) {
            JFrame jFrame = new JFrame("Le epic fractal drawing");
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            TriangleFractalDrawer.ImagePanel panel = new TriangleFractalDrawer.ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.pack();
        }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawRect(graphics);
        }
    }
}
