package 网络编程;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Demo3 {
    /*服务端*/
    public static void main(String[] args)throws Exception
    {
         System.out.println("服务端开始接收数据");
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket=serverSocket.accept();
        BufferedInputStream bufferedInputStream=new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("F:\\jdbc程序\\java复习\\src\\p3.txt"));
        byte[]arr=new byte[1024*8];
        int len;
        while ((len=bufferedInputStream.read(arr))!=-1)
        {
            bufferedOutputStream.write(arr,0,len);
            bufferedOutputStream.flush();
        }
        System.out.println("数据已经传输完毕");
        bufferedOutputStream.close();
        socket.close();
        System.out.println("数据已经保存");
    }
}
