package com.loton;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.telnet.TelnetClient;

public class TelnetTest {

	public static void main(String[] args) {
		TelnetClient telnet = new TelnetClient();
		String ip = "192.168.30.21";
		int port = 802;
		try {
			telnet.connect(ip, port);
			if ( telnet.isConnected() )
				System.out.println("connection to : " + ip + ":" + port);
			else {
				System.out.println("disconnection to : ");
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				telnet.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("close");
		}
	}
}
