import java.io.IOException;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        zeichenEinlesenMitGui();
    }

    public static void zeichenEinlesenMitGui() {
        String s = JOptionPane.showInputDialog("Bitte geben Sie einen Text ein: ");
        System.out.println(s);

    }

    public static void zeichenEinlesen() throws IOException {
        int i = 0;

        while (i != 10) {
            i = System.in.read();
            System.out.print((char) i);
        }
    }
}