package com.loton;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private final static int PORT = 12000;

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(PORT);
			Socket connection = null;
			while (true) {
				try {
					new ShotThread(server).start();
				} finally {
					try {
						if (connection != null)
							connection.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (IOException ee) {
			System.err.println(ee.getMessage());
		}
	} // end main
}

/**
 * 多线程的连接：
 * 
 */
class ShotThread extends Thread {
	ServerSocket server;

	Socket connection = null;

	public ShotThread(ServerSocket server) {
		try {
			this.connection = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		System.out.println("得到连接:");
		java.awt.image.BufferedImage image = (new ShotImage()).snapShot();
		if (image == null)
			try {
				throw new IOException();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		try {
			javax.imageio.ImageIO.write(image, "jpg",
					connection.getOutputStream());
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
