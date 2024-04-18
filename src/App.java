import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        zeichenEinlesen();
    }

    public static void zeichenEinlesenMitGui() {

    }

    public static void zeichenEinlesen() throws IOException {
        int i = 0;

        while (i != 10) {
            i = System.in.read();
            System.out.print((char) i);
        }
    }
}