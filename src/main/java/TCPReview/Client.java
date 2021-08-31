package TCPReview;

import java.io.*;
import java.net.*;

public class Client {

    private Socket sock;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public void start(){
        try{
            sock = new Socket("192.168.1.111", 8008);
            out = new ObjectOutputStream(sock.getOutputStream());
            in = new ObjectInputStream(sock.getInputStream());

            //get server message
            String msg = (String)in.readObject();
            System.out.println("SERVER SAYS: "+ msg);
            //respong to server
            out.writeObject("Thank you!");
            out.flush();
            sock.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}