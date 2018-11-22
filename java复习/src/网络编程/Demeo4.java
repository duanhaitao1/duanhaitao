package 网络编程;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
public class Demeo4 {
    public static void main(String[] args)throws Exception
    {
        System.out.println("客户端开始发送数据");
        Socket socket=new Socket("localhost",8888);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("F:\\jdbc程序\\java复习\\src\\p2.txt"));
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(socket.getOutputStream());
        int len;
        byte[]arr=new byte[1024];
        while ((len=bufferedInputStream.read(arr))!=-1)
        {
            bufferedOutputStream.write(arr,0,len);
            bufferedOutputStream.flush();
        }
        //如果没有写入文件的内容，就会需要进行刷新
        socket.close();
        bufferedInputStream.close();
        System.out.println("数据已经上传");
    }
}
