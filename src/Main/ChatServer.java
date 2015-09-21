/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author Bang
 */
public class ChatServer implements Runnable{

	private Socket socket;
	
	public ChatServer(Socket s)
	{
		socket = s;
	}
	
	@Override
	public void run() 
	{
		try //FOR THE in AND out VARIABLES
		{
			Scanner in = new Scanner(socket.getInputStream());//GET THE SOCKETS INPUT STREAM 
			PrintWriter out = new PrintWriter(socket.getOutputStream());//GET THE SOCKETS OUTPUT STREAM
			
			while (true)
			{		
				if (in.hasNext())
				{
					String input = in.nextLine();//READ WHAT THEY TYPED
					System.out.println("Client Said: " + input);//PRINT IT OUT TO THE SCREEN
					out.println("You Said: " + input);//RESEND IT TO THE CLIENT
					out.flush();//FLUSH THE STREAM
				}
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}

}

