package melani.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 5000);
            Scanner tastiera= new Scanner(System.in);
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
    ) {
            System.out.println("Connesso al server");
            System.out.println("scrivi il messaggio...");
            String testo=tastiera.nextLine();
            output.println(testo);

            System.out.println("hai scritto:  "+testo);

            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );

            System.out.println("il server ha restituito:"+ input.readLine());

        } catch (IOException e) {
            System.out.println("Errore di connessione: " + e.getMessage());
        }
    }
    
}
