/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.*;
import java.net.*;

/**
 *
 * @author jannat
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket s = null;
        Socket s1 = null;
        try {
            s = new ServerSocket(5401);
            s1 = s.accept();
            System.out.println("Connection Extablished");
            BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            String inp = br.readLine();
            while (inp != null && !inp.equals("exit")) {
                System.out.println("Read:" + inp );
                inp = br.readLine();
            }
            System.out.println("Read:" + inp );
            br.close();
            if (!s1.isClosed()) s1.close();
        }
        catch(IOException e) {
        }
    }

}
    
