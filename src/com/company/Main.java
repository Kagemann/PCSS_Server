package com.company;

public class Main {

    public static void main(String[] args) {
    	
    	InitServerNetwork lobby = new InitServerNetwork();
		
		lobby.initServer(InitServerNetwork.getPort());
		
		do {
			
			lobby.handleClient();
			
		} while(true);
    	
    }
}
