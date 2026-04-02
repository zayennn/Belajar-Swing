import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("aplikasi pertama");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// import javax.swing.JFrame;
// Ngambil class JFrame dari library Swing

// frame.setSize(400, 300);
// ukuran window :
// 400 = lebar
// 300 = tinggi

// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// tombol close