import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        zeichenEinlesenMitBufferedReader();
    }

    public static void zeichenEinlesenMitBufferedReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte geben Ihren Vornamen ein: ");

        try {
            String vorname = br.readLine();
            System.out.println("Bitte geben Ihren Nachnamen ein: ");
            String nachname = br.readLine();
            System.out.println("Bitte geben Sie Ihr Alter ein: ");
            int alter = Integer.parseInt(br.readLine());

            System.out.println("Ihr Name ist: " + vorname + " " + nachname +
                    " und Sie sind " + alter + " Jahre alt.");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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