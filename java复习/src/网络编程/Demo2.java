package 网络编程;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/*客户端*/
public class Demo2 {
    public static void main(String[] args)throws Exception
    {
     System.out.println("客户端开始发送数据");
     Socket socket=new Socket("localhost",6666);
     OutputStream outputStream=socket.getOutputStream();
     outputStream.write("你是个山水".getBytes());
     //开始接收服务端发送过来的的数据
    InputStream inputStream=socket.getInputStream();
    byte[]arr=new byte[1024];
    int len=inputStream.read(arr);
    String str=new String(arr,0,len);
    System.out.println(str);
    inputStream.close();
     socket.close();
     outputStream.close();

    }
}
