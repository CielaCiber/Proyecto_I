package com.example.demo.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;

public class Client {
	private final Integer PORT = 13;
	private final String IP = "localhost";
	
	//constructor
	public Client() {
		try {
			Socket clientServer = new Socket(IP, PORT);
			System.out.println("---------1 iniciando comunicación-------");
			
			System.out.println("---------2 finalizando comunicación-------");
			clientServer.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public static void main(String[] args) throws Exception {
	new Client();
}

}
