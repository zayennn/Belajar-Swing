import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("bikin button");
        JButton button = new JButton("click aku");

        frame.setLayout(null);

        button.setBounds(100, 100, 100, 50);

        button.addActionListener(new ActionListener() {
//            kalau tombol diklik, jalankan sesuatu
            @Override
            public void actionPerformed(ActionEvent e) {
//                Method yang dijalankan pas tombol diklik
//                e = info event
                JOptionPane.showMessageDialog(null, "button di click");
//                Ini buat munculin popup (JOptionPane)
//                null = muncul di tengah layar
//                teks = isi popup
            }
        });

        frame.add(button);
//        Masukin tombol ke dalam window

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}