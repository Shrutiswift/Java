//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHTTPServer {
    public static void main(String[] args) throws Exception {
        final ServerSocket server = new ServerSocket(8080);
            System.out.println("Listening for connection on port 8080....");
            while(true){
//                Socket clientSocket = server.accept();
//                InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
//                BufferedReader reader = new BufferedReader(isr);
//                String line = reader.readLine();
//                while(!line.isEmpty()){
//                    System.out.println(line);
//                    line = reader.readLine();
                try(Socket socket = server.accept()){
                    Date today = new Date();
                    String httpResponse = "Ok"+today;
                    socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
                }
            }
    }
}
