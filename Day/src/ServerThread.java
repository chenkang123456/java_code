import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class ServerThread extends Thread
{
    Socket sk;
    public ServerThread(Socket sk){
    this.sk= sk;
    }
    public void run() {     
        BufferedReader br=null;
        try{
        br  = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String line = br.readLine();
        System.out.println("来自客户端的数据："+line);
       
        br.close();
        sk.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
