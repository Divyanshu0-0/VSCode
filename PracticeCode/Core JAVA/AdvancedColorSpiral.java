import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class AdvancedColorSpiral extends JPanel implements ActionListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    private static final int NUM_LINES = 2200;
    private static final double SPIRAL_TURNS = 8.5;
    private static final int CENTER_RADIUS = 38;
    private static final int PULSE_RADIUS = 22;
    private static final double LOG_SPIRAL_A = 8.0;
    private static final double LOG_SPIRAL_B = 0.22;
    private static final int GLOW_LAYERS = 18;
    private static final int FPS = 60;
    private static final double PULSE_PERIOD = 1.8; // seconds

    private long startTime;
    private Timer timer;
    private BufferedImage spiralImage;
    private float globalHueOffset = 0f;

    public AdvancedColorSpiral() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        timer = new Timer(1000 / FPS, this);
        timer.start();
        startTime = System.nanoTime();
        spiralImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        drawSpiralToImage();
    }

    private void drawSpiralToImage() {
        Graphics2D g2 = spiralImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.Src);
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, WIDTH, HEIGHT);

        double centerX = WIDTH / 2.0;
        double centerY = HEIGHT / 2.0;

        for (int i = 0; i < NUM_LINES; i++) {
            double t = (double) i / NUM_LINES;
            double angle = t * SPIRAL_TURNS * 2 * Math.PI;
            double radius = LOG_SPIRAL_A * Math.exp(LOG_SPIRAL_B * angle);

            double x1 = centerX + Math.cos(angle) * radius * 22;
            double y1 = centerY + Math.sin(angle) * radius * 22;

            double nextT = (double) (i + 1) / NUM_LINES;
            double nextAngle = nextT * SPIRAL_TURNS * 2 * Math.PI;
            double nextRadius = LOG_SPIRAL_A * Math.exp(LOG_SPIRAL_B * nextAngle);
            double x2 = centerX + Math.cos(nextAngle) * nextRadius * 22;
            double y2 = centerY + Math.sin(nextAngle) * nextRadius * 22;

            float hue = (float) ((t + globalHueOffset) % 1.0);
            Color color = Color.getHSBColor(hue, 1.0f, 1.0f);

            float thickness = (float) (1.8 - t * 1.3);
            g2.setStroke(new BasicStroke(thickness));
            g2.setColor(color);
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
        }
        g2.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long now = System.nanoTime();
        double elapsed = (now - startTime) / 1e9;

        // Animate color offset for spiral
        globalHueOffset = (float) ((elapsed * 0.13) % 1.0);

        // Redraw spiral only if color offset changed
        drawSpiralToImage();

        Graphics2D g2 = (Graphics2D) g.create();
        g2.drawImage(spiralImage, 0, 0, null);

        double centerX = WIDTH / 2.0;
        double centerY = HEIGHT / 2.0;

        // Pulsing effect
        double pulsePhase = Math.sin(2 * Math.PI * elapsed / PULSE_PERIOD) * 0.5 + 1.0;
        int glowRadius = (int) (CENTER_RADIUS + pulsePhase * PULSE_RADIUS);

        // Enhanced glow using radial gradients
        for (int i = GLOW_LAYERS; i >= 1; i--) {
            int r = glowRadius + i * 8;
            float alpha = 0.045f * i;
            RadialGradientPaint paint = new RadialGradientPaint(
                new Point2D.Double(centerX, centerY),
                r,
                new float[]{0f, 1f},
                new Color[]{new Color(255,255,255,(int)(255*alpha)), new Color(255,255,255,0)}
            );
            g2.setPaint(paint);
            g2.fillOval((int)(centerX - r), (int)(centerY - r), r * 2, r * 2);
        }

        // Bright pulsing center
        int pulseAlpha = (int)(180 + 75 * Math.sin(2 * Math.PI * elapsed / PULSE_PERIOD));
        g2.setColor(new Color(255,255,255,pulseAlpha));
        g2.fillOval((int)(centerX - glowRadius), (int)(centerY - glowRadius), glowRadius * 2, glowRadius * 2);

        g2.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mesmerizing Color Spiral - Advanced");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new AdvancedColorSpiral());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}