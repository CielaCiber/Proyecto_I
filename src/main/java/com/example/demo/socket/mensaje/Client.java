package com.example.demo.socket.mensaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;

public class Client {
	private final Integer PORT = 13;
	private final String IP = "localhost";
	
	//constructor
	public Client() {
		try {
			Socket clientSocket = new Socket(IP, PORT);
			System.out.println("---------1 iniciando comunicación-------");
			//flujos de comunicacion
			BufferedReader entrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter salida = new PrintWriter(clientSocket.getOutputStream(), true);
			
			salida.println("Platinium");
			
			String precio = entrada.readLine();
			System.out.println("El precio es ==>" + precio);
			
			System.out.println("---------2 finalizando comunicación-------");
			clientSocket.close();
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
