package day12.network;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass02 {
	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("https://github.com/dobby8282/JavaSE/blob/main/src/day12/network/MainClass01.java");

		String protocol = url.getProtocol();
		String host = url.getHost();
		String query = url.getQuery();
		

		System.out.println("Protocol " + protocol);
		System.out.println("host " + host);
		System.out.println("query " + query);

	}
}
