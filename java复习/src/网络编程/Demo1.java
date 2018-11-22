package 网络编程;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*服务器端*/
public class Demo1 {
    public static void main(String[] args)throws Exception
    {
     /*ServerSocket serverSocket=new ServerSocket(6666);
     Socket socket=serverSocket.accept();
     InputStream inputStream=socket.getInputStream();
     byte[]arr=new byte[1024];
     int len=inputStream.read(arr);
     String sp=new String(arr,0,len);
     System.out.println(sp);
     socket.close();
     inputStream.close();*/
     System.out.println("服务端开始接受数据了");
     ServerSocket  serverSocket=new ServerSocket(6666);
     Socket socket=serverSocket.accept();
     InputStream inputStream=socket.getInputStream();
     byte[]arr=new byte[1024];
     int len=inputStream.read(arr);
     String st=new String(arr,0,len);
     System.out.println(st);
     /*此时该处接受到了数据*/
    OutputStream outputStream=socket.getOutputStream();
    outputStream.write("你是个好人".getBytes());
    System.out.println("向客户端已经写回数据");
    socket.close();
    inputStream.close();
    outputStream.close();

    }
}
