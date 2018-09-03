import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("서버 대기 중...");
			socket = serverSocket.accept();
			System.out.println("client : " + socket);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
