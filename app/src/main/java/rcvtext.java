import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class rcvtext {

    public static void main(String args[]) throws Exception{
        String fromClient;


        ServerSocket server = new ServerSocket(3040);
        System.out.println("wait for connection");

        boolean run = true;
        while (run){

            Socket client = server.accept();
            System.out.println("got connection");
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            fromClient = in.readLine();
            System.out.println(fromClient);


            if(fromClient.equals("Call")) {
                System.out.println(fromClient);


                if (fromClient.equals("Bye")) {
                    System.out.println("NO");
                    client.close();
                    run = false;
                }

            }



        } System.exit(0);





    }






}

