package com.company;

public class Main {

    public static void main(String[] args) throws Exception {    	
    //	InitServerNetwork lobby = new InitServerNetwork();
		MultiEchoServer lobby = new MultiEchoServer();		
	//	lobby.initServer(InitServerNetwork.getPort());
		lobby.EchoServer(MultiEchoServer.getPort());		
		do {			
	//		lobby.handleClient();
		} while(true);   	
    }
}
