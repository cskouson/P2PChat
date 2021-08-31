package TCPReview;

import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public void start(int port){
        try{
            //start server
            serverSocket = new ServerSocket(port);
            //setup client connection and input stream
            clientSocket = serverSocket.accept();
            out = new ObjectOutputStream(clientSocket.getOutputStream());

            //say something
            out.writeObject("Hey bro.");

            //get response
            in = new ObjectInputStream(clientSocket.getInputStream());
            String response = (String)in.readObject();

            System.out.println("CLIENT SAYS: "+ response);

            //close server down
            out.flush();
            serverSocket.close();
            clientSocket.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    } 
    
    public static void main(String[] args) {
        Server serv = new Server();
        serv.start(8008);
    }
}