import java.net.*;

/*
 * 服务器
 */




public class CS_Server 
{
    private static ServerSocket ss;

	public static void main(String[] args) throws Exception
    {
        ss = new ServerSocket(38380);
        System.out.println("服务器正在等待客户端的连接请求----");
        //用一个while循环可以同时响应多个客户端的请求
        while(true){
             Socket sk= ss.accept();//服务器监听对应端口的输入
             ServerThread  st = new ServerThread(sk);//创建一个线程，用线程创建一个套接字
             st.start();
        }
    }
}
