package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class InitServerNetwork {
	
	private static final int PORT = 2000;
	
	public static ServerSocket lobbySocket;
	private static Socket lobbyLink;
	
	private static BufferedReader input;
	private static PrintWriter output;
	
	public InitServerNetwork() {
		
		
		
	}
	
	public void initServer(int port) {
		
		System.out.println("Opening port...");
		
		try{
			
			lobbySocket = new ServerSocket(port);
			
		} catch(IOException e) {
			
			System.out.println("Unable to attach to port.");
			
			e.printStackTrace();
			
			System.exit(1);
			
		}
		
	}
	
	public void handleClient() {
		
		lobbyLink = null;
		
		try {
			
			lobbyLink = lobbySocket.accept();
			
			input = new BufferedReader(new InputStreamReader(lobbyLink.getInputStream()));
			output = new PrintWriter(lobbyLink.getOutputStream());
			
			String message;
			
			while((message = input.readLine()) != null) {
				
				output.println(message);
				
				System.out.println(message);
				
			}
			
		} catch(IOException e) {
			
			System.out.println("Error in connection.");
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				System.out.println("Connection closing.");
				
				lobbyLink.close();
				
			} catch(IOException e) {
				
				System.out.println("Unable to disconnect.");
				
				System.exit(1);
				
			}
			
		}
		
	}

	public static int getPort() {
		
		return PORT;
		
	}
	
}
