package RPC_Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class RPCServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("RPC Server running on port 8080");

        while (true){
            try(Socket clientSocket = serverSocket.accept();
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream())){

                //read request
                String methodName = (String) in.readObject();
                int arg1 = in.readInt();
                int arg2 = in.readInt();

                //Execute Method
                if("add".equals(methodName)) {
                    int result = new CalculatorServiceImpl().add(arg1,arg2);
                    out.writeObject(result);
                } else {
                    out.writeObject(new UnsupportedOperationException("Method not supported"));
                }
                catch (e){
                    e.printStackTrace();
                }


            }
        }
    }
}
