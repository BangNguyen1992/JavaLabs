/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Bang
 */
import java.io.IOException;
import java.net.Socket;


public class Main {

	private final static int PORT = 4444;
	private final static String HOST = "localhost";
	
	public static void main(String[] args) throws IOException
	{
		try 
		{
			
			Socket s = new Socket(HOST, PORT);
			
			System.out.println("You connected to " + HOST);
			
			ChatClient client = new ChatClient(s);
			
			Thread t = new Thread(client);
			t.start();
			
		} 
		catch (Exception noServer)
		{
			System.out.println("The server might not be up at this time.");
			System.out.println("Please try again later.");
		}
	}
}

