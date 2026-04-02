import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("text field");
        frame.setLayout(null);

        JLabel label = new JLabel("Masukan nama anda : ");
        label.setBounds(20, 20, 120, 30);

        JTextField textField = new JTextField();
        textField.setBounds(20, 60, 140, 30);

        JButton button = new JButton("submit");
        button.setBounds(20, 100, 140, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText().trim();
                if (name.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "nama tidak boleh ");
                } else {
                    JOptionPane.showMessageDialog(null, String.format("halo %s!", name));
                }
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}