package 多用户上传文件;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class ClientThread extends  Thread{
    private int index;
    public ClientThread(int index)
    {
        this.index=index;
    }
    @Override
    public void run() {
        Socket socket=null;
        try{
            socket=new Socket("locaalhost",9999);
            FileInputStream fileInputStream=new FileInputStream("F:\\jdbc程序\\java复习\\src\\多用户上传文件\\p3.txt");
            OutputStream outputStream=socket.getOutputStream();
            byte[]arr=new byte[1024*8];
            int len=0;
            System.out.println("客户开始上传文件");
            while((len=fileInputStream.read(arr))!=-1)
            {
                outputStream.write(arr,0,len);
            }
            socket.shutdownOutput();//向服务器发送一条标记
            System.out.println("客户端上传完毕");
            InputStream netIn=socket.getInputStream();
            len=netIn.read(arr);
            System.out.println("客户端收到反馈"+new String(arr,0,len));
            fileInputStream.close();
            socket.close();
            System.out.println("客户端结束");


        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
