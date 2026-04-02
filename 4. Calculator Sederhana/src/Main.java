import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static class Aritmatika {
        int angka1;
        int angka2;

        Aritmatika(int angka1, int angka2) {
            this.angka1 = angka1;
            this.angka2 = angka2;
        }

        int Penjumlahan() {
            return angka1 + angka2;
        }
    }

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

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    char op = operator.getText().charAt(0);
                    int input1 = Integer.parseInt(angka1.getText());
                    int input2 = Integer.parseInt(angka2.getText());

                    if (op == '+') {
                        Aritmatika hasil = new Aritmatika(input1, input2);
                        JOptionPane.showMessageDialog(null, String.format("hasil dari %d %c %d = %d", input1, op, input2, hasil.Penjumlahan()));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "input harus berupa angka!",
                            "error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

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