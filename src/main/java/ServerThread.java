/**
 *
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class ServerThread implements Runnable {
    protected ServerSocket ss;
    int id;
    int delay; //temp
    int port;
    

    public ServerThread(int id, int delay, int port){
        this.id = id;
        this.delay = delay;
        this.port = port;
    }


    public void run() {
        
    }



}//end class