package com;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo4 {
    public static void main(String[] args)throws Exception
    {
        /*System.out.println("客户端发送数据");
        Socket socket=new Socket("localhost",6666);
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("呵呵呵".getBytes());
        outputStream.close();
        socket.close();*/
        System.out.println("客户端发送数据");
        Socket socket=new Socket("localhost",6666);
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("呵呵呵".getBytes());
        System.out.println("数据发送完毕");
        InputStream inputStream = socket.getInputStream();
        byte[]arr=new byte[1024];
        int len=inputStream.read(arr);
        String s=new String(arr,0,len);
        System.out.println(s);
        inputStream.close();
        socket.close();
        outputStream.close();


    }
}
