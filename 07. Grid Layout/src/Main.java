import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Kalkulator");

        JTextField display = new JTextField();
        display.setEditable(false);

        frame.setLayout(new BorderLayout());
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());

        String[] tombol = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+",
        };

        for (String text : tombol) {
            JButton button = new JButton(text);
        }
    }
}