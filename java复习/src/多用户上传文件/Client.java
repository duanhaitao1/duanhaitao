package 多用户上传文件;

public class Client {
    private  static int i=0;
    public static void main(String[] args)
    {
       for(i=1;i<=5;i++)
       {
           System.out.println("i="+i);
           new ClientThread(i).start();
       }

    }

}
