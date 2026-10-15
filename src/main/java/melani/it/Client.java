package melani.it;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 5000);
            Scanner tastiera= new Scanner(System.in);
    ) {
            System.out.println("Connesso al server");
            System.out.println("scrivi il messaggio...");
            String testo=tastiera.nextLine();

            System.out.println("hai scriutto:  "+testo);

        } catch (IOException e) {
            System.out.println("Errore di connessione: " + e.getMessage());
        }
    }
    
}
