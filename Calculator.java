import javax.swing.*;
import java.awt.Image;
import java.awt.Graphics;

public class Calculator extends JFrame{
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
    }
    private Image offScreenImage = null;
    public Calculator(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Calculator");
    }
    @Override
    public void paint(Graphics g) {
        if(offScreenImage == null){
            offScreenImage = createImage(800, 600);
        }
        Graphics graphics = offScreenImage.getGraphics();
        graphics.fillRect(0, 0, 800, 600);
    }
}
