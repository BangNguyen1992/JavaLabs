/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		try 
		{
			final int PORT = 4444;
			ServerSocket server = new ServerSocket(PORT); 
			System.out.println("Waiting for clients...");
		
			while (true)
			{												
				Socket s = server.accept();
				
				System.out.println("Client connected from " + s.getLocalAddress().getHostName());	
				
				ChatServer chat = new ChatServer(s);//CREATE A NEW CLIENT OBJECT
				Thread t = new Thread(chat);//MAKE A NEW THREAD
				t.start();//START THE THREAD
			}
		} 
		catch (Exception e) 
		{
			System.out.println("An error occured.");//IF AN ERROR OCCURED THEN PRINT IT
                        e.printStackTrace();
		}
	}

}
