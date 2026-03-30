import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab10 extends JPanel implements ActionListener, MouseListener {

    JButton btn, red, green, blue;
    JTextField tf;

    String text = "";
    int count = 0;
    Color currentColor = Color.BLACK;

    int mouseX = -1, mouseY = -1;

    int x = 0;

    public Lab10() {
        setLayout(new FlowLayout());

        btn = new JButton("Нажми");
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        tf = new JTextField(15);

        add(btn);
        add(tf);
        add(red);
        add(green);
        add(blue);

        btn.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        addMouseListener(this);

        // Анимация
        new Timer(100, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        }).start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            count++;
            text = tf.getText();
        }

        if (e.getSource() == red) currentColor = Color.RED;
        if (e.getSource() == green) currentColor = Color.GREEN;
        if (e.getSource() == blue) currentColor = Color.BLUE;

        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Задание 1
        g.drawRect(20, 50, 80, 60);
        g.drawString("Прямоугольник", 20, 45);

        g.drawOval(120, 50, 60, 60);
        g.drawString("Круг", 120, 45);

        g.drawLine(20, 130, 150, 130);
        g.drawString("Линия", 20, 125);

        // Задание 2
        g.setColor(Color.RED);
        g.fillRect(200, 50, 40, 40);

        g.setColor(Color.GREEN);
        g.fillOval(250, 50, 40, 40);

        g.setColor(Color.BLUE);
        g.fillRect(300, 50, 40, 40);

        // Задание 3
        g.setColor(Color.MAGENTA);
        g.drawString("Hello Java Applet", 20, 180);

        // Задание 4-5
        g.setColor(Color.BLACK);
        g.drawString("Нажатий: " + count, 20, 200);

        // Задание 6
        g.drawString("Привет, " + text, 20, 220);

        // Задание 7
        g.setColor(currentColor);
        g.fillOval(200, 120, 60, 60);

        // Задание 8
        g.fillOval(x, 200, 30, 30);

        // Задание 9
        if (mouseX != -1) {
            g.fillOval(mouseX, mouseY, 10, 10);
        }

        // Задание 10
        g.setColor(currentColor);
        g.drawString(text, 200, 220);
        g.fillRect(200, 230, 80, 40);
    }

    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Лабораторная работа 10");
        Lab10 panel = new Lab10();

        frame.add(panel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}