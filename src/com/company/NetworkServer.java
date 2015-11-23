package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetworkServer {
	
	private static final int PORT = 0;
	
	private static String sentence;
	
	private static InetAddress hostAddress;
	private static String hostIp;
	
	private static ServerSocket serverSocket;
	private static Socket clientSocket;
	private static Scanner socketReader;
	
	private static PrintWriter serverOutput;
	
	public static void main(String args[]) throws IOException {
		
		serverSocket = new ServerSocket(PORT);
		System.out.println(serverSocket.getLocalPort());
		clientSocket = serverSocket.accept();
		
		System.out.println(hostIp);
		
		//Shows that the server has opened
		System.out.println("The server has now been opened.");
		System.out.println("Waiting for input...");
		
		//This gets the input from the client
		socketReader = new Scanner(clientSocket.getInputStream());
		sentence = socketReader.nextLine();
		
		//Prints the input
		System.out.println("The new sentence is now: " + sentence);
		
		//This gets the output from the server which is sent to the client
		serverOutput = new PrintWriter(clientSocket.getOutputStream());
		serverOutput.println(sentence);
		serverOutput.flush();
		
	}

}
