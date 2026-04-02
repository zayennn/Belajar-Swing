import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager");
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Masukan angka pertama : ");
        JTextField angka1 = new JTextField(10);

        JLabel label2 = new JLabel("Masukan angka pertama : ");
        JTextField angka2 = new JTextField(10);

        JButton button = new JButton("Hitung");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int x = Integer.parseInt(angka1.getText());
                    int y = Integer.parseInt(angka2.getText());

                    JOptionPane.showMessageDialog(null, String.format("Hasil dari %d + %d = %d", x, y, (x + y)));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Input harus berupa angka!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }
}