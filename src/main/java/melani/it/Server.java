package melani.it;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try (
            ServerSocket serverSocket  = new ServerSocket(5000);
            
        
        
        ){
            System.out.println("il server è in ascolto");
            try(Socket client= serverSocket.accept()){
                System.out.println("Client connesso: " + client.getInetAddress());
            }
        } catch (IOException e) {
           e.getMessage();

        
        

    }
}
}