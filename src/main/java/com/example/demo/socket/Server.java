package com.example.demo.socket;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private final Integer PORT = 13;
	//ESTA ES UNA ESTRUCTURA CLASICA
	public Server() {
		Socket clientSocket;
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			while(true) {
				System.out.println("--------1 Iniciando serverSocket --------------");
				System.out.println("--------2 A la espera del clientSocket --------");
				clientSocket = serverSocket.accept();//LINEA DE ESPERA A UN CLIENTE
				System.out.println("--------3 Llegó el clientSocket ---------------");
				
				Thread.sleep(3000); //3 segundos
				
				System.out.println("--------4 Finaliza la atención clientSocket ---");
				clientSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
	
}