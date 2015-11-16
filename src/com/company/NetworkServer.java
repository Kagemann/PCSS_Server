package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetworkServer {
	
	private static final int PORT = 82;
	
	private static int num;
	private static int temp;
	
	private static ServerSocket serverSocket;
	private static Socket clientLink;
	private static Scanner socketReader;
	
	private static PrintWriter serverOutput;
	
	public static void main(String[] args) throws IOException {
		
		serverSocket = new ServerSocket(PORT);
		clientLink = serverSocket.accept();
		
		System.out.println("The server has now been opened.");
		
		socketReader = new Scanner(clientLink.getInputStream());
		num = socketReader.nextInt();
		
		System.out.println("A new number has been accepted from the client: " + num);
		System.out.println("Performing mathematical operation...");
		
		temp = num * 2;
		
		System.out.println("The new number is now: " + temp);
		
		serverOutput = new PrintWriter(clientLink.getOutputStream());
		serverOutput.println(temp);
		serverOutput.flush();
		
	}

}
