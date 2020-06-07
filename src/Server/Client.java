package Server;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jannat
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;

/**
 *
 * @author jannat
 */
public class Client {
    public static void main(String[] args) {
        Socket s1 = null;
        try{
            s1 = new Socket("localhost",5401);
            System.out.println("Client: Connection Extablished");
            BufferedWriter bw = new BufferedWriter(new
                    OutputStreamWriter(s1.getOutputStream()));
            for(int i = 0; i<5; i++)
            {
                bw.write("Hello:"+i);
                Thread.sleep(200);
                bw.newLine();
                bw.flush();
            }
            bw.close();
            if (!s1.isClosed()) s1.close();
        }catch(IOException | InterruptedException e)
        { }
    }
}
