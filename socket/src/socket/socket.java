package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.*;

class socket {
   public static void main(String []args) {
      for (int port = 1; port <= 65535; port++) {
         try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", port), 1000);
            socket.close();
            System.out.println("Port " + port + " is open");
            File file = new File("c:\\test\\test.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Port " + port + " is open");
			fileWriter.flush();
			fileWriter.close();       
        } catch (Exception ex) {
        }
      }
   }
}