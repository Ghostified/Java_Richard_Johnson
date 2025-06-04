package RPC_Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class RPCclient {
    private  final String host;
    private final int port;

    public RPCclient(String host, int port){
        this.host = host;
        this.port = port;
    }

    public  int add(int a, int b) throws IOException {
        try(Socket socket = new Socket(host, port));
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream())){

            //send Request
            out.writeObject("add");
            out.writeInt(a);
            out.writeInt(b);
            out.flush();

            //get Response
            return (int) in.readObject();
        } catch (ClassNotFoundException e){
            throw new IOException("Invalid Response Type", e);
        }
    }

    public static void main(String[] args) throws  IOException{
        RPCclient client = new RPCclient("localhost", 8080);
        System.out.println("RPC Client calling add(5,3)");
        int result = client.add(5,3);
        System.out.println("Result " + result);

    }
}
