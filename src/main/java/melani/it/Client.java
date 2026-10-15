package melani.it;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connesso al server");
        } catch (IOException e) {
            System.out.println("Errore di connessione: " + e.getMessage());
        }
    }
    
}
