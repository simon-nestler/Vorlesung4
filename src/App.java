import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // zeichenEinlesenMitBufferedReader();
        // beispielePrintWriter();
        dateiEinlesen();
    }

    public static void dateiEinlesen() {
        try {
            FileReader fr = new FileReader("abcde.txt");
            BufferedReader br = new BufferedReader(fr);

            String zeile = br.readLine();
            System.out.println(zeile);

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void zeichenEinlesenMitBufferedReader() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);
            System.out.println("Bitte geben Ihren Vornamen ein: ");

            String vorname = br.readLine();
            System.out.println("Bitte geben Ihren Nachnamen ein: ");
            String nachname = br.readLine();
            System.out.println("Bitte geben Sie Ihr Alter ein: ");
            int alter = Integer.parseInt(br.readLine());

            System.out.println("Ihr Name ist: " + vorname + " " + nachname +
                    " und Sie sind " + alter + " Jahre alt.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void beispielePrintWriter() {
        PrintWriter out;
        try {
            out = new PrintWriter("abcde.txt");

            out.println("Hallo");
            double price = 33.32499;
            out.printf("Das Buch kostet %.2f Euro\n", price);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
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