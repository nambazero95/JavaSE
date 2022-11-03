package day12.network.server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * [[ 소켓 (Socket)]]
 * TCP/IP 기반 네트워크 통신에서 데이터 송수신의 마지막 접점을 달한다.
 * 소켓통신 => 서버 - 클라이언트간 데이터 주고받는 양방향 연결 지향성 통신.
 * 
 * 
 * 
 * 
 */
public class EchoServer {
public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			
			// 1. 3000번 port 로 SercerSocket 객체생성
			serverSocket = new ServerSocket(3000);
			
			System.out.println(" 클라이언트 요청 대기중....");
			
			//  acccept() 매서드는 클라이언트 요총이 들러오면
			// 클라이언트와 통신 할 수 없는 Socket 객체를 생성한다.
			Socket s = serverSocket.accept();
			
			System.out.println("클라이언트 요청 수락.....");
			
			// Socket 객체를 이용해서 InputStream 객체를 생성한다.
			InputStream in = s.getInputStream();
			
			byte[] b = new byte[1024];
			
			// 클라이언트에서 보낸 메세지를 읽어서 저장
			int readByteCnt = in.read(b);
			
			System.out.println(new String (b, 0, readByteCnt));
			
			OutputStream out = s.getOutputStream();
			
			out.write(b, 0, readByteCnt);
			
			
			out.close();
			in.close();
			s.close();
			serverSocket.close();
			
					
		} catch (Exception e) {
			// TODO: handle exception
		}
}
}
