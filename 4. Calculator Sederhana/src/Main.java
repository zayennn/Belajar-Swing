import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("kalkulator sederhana");
        frame.setLayout(null);

        JLabel label1 = new JLabel("Masukan angka pertama : ");
        label1.setBounds(20, 0, 150, 50);

        JTextField angka1 = new JTextField();
        angka1.setBounds(20, 40, 150, 30);

        JLabel label2 = new JLabel("Masukan angka kedua : ");
        label2.setBounds(20, 60, 150, 50);

        JTextField angka2 = new JTextField();
        angka2.setBounds(20, 100, 150, 30);

        JLabel label3 = new JLabel("Pilih operator (+, -, *, /) : ");
        label3.setBounds(20, 120, 150, 50);

        JTextField operator = new JTextField();
        operator.setBounds(20, 160, 150, 30);

        JButton button = new JButton("hitung");
        button.setBounds(20, 200, 150, 30);

        frame.add(label1);
        frame.add(angka1);
        frame.add(label2);
        frame.add(angka2);
        frame.add(label3);
        frame.add(operator);
        frame.add(button);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}