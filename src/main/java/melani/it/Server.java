package melani.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket  = new ServerSocket(5000);){
            System.out.println("il server è in ascolto");
            try(Socket client= serverSocket.accept()){
                System.out.println("Client connesso: " + client.getInetAddress());
                BufferedReader input = new BufferedReader(
                    new InputStreamReader(client.getInputStream())
                );
                String messaggio = input.readLine();
                System.out.println("Messaggio ricevuto: " + messaggio);
                PrintWriter output = new PrintWriter(client.getOutputStream(), true);
                output.println(messaggio.toUpperCase());
            }
        } catch (IOException e) {
           e.getMessage();
    }
}
}