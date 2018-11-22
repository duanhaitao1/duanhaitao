package com;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo3 {
    public static void main(String[] args)throws  Exception
    {

        System.out.println("服务端开始接收数据");
        /*
        ServerSocket serverSocket=new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[]arr=new byte[1024];
        int length=inputStream.read(arr);
        String str=new String(arr,0,length);
        System.out.println(str);
        inputStream.close();*/
        ServerSocket serverSocket=new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[]arr=new byte[1024];
        int len=inputStream.read(arr);
        String str=new String(arr,0,len);
        System.out.println(str);
        OutputStream outputStream=accept.getOutputStream();
        outputStream.write("我已经收到数据了".getBytes());
        outputStream.close();
        inputStream.close();




    }
}
