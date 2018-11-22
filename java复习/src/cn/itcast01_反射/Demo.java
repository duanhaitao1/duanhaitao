package cn.itcast01_反射;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
/*获取一个类的方法*/
public class Demo {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
        properties.load(new FileReader("F:\\jdbc程序\\java复习\\src\\p2.txt"));
        Class clazz=Class.forName(properties.getProperty("classaddress"));
        //创建对象此时会加载无参构造
        Object object=clazz.getConstructor().newInstance();
        //加载有参构造
        Student student=(Student) clazz.getConstructor(String.class,int.class).newInstance("张三",90);
        /*获取对象属性*/
        Field field=clazz.getDeclaredField("name");
        field.set(student,"鞠子");
        System.out.println(student.name);
        //获取私有的属性
        Field field1=clazz.getDeclaredField("age");
        field1.setAccessible(true);
        student.setAge("90");
        System.out.println(student.getAge());
        //获取方法
        Method method=clazz.getDeclaredMethod("fun",String.class);
        method.invoke(student,"张三");
    }
}
/*  Properties properties = new Properties();
        properties.load(new FileReader("F:\\jdbc程序\\java复习\\src\\p2.txt"));
       *//*重一个文件中读取一个类名进行反射*//*
        Class classaddress = Class.forName(properties.getProperty("classaddress"));
        *//*创建一个对象时，会自动加载无参函数*//*
        Object object=classaddress.getConstructor().newInstance();
        Method method=classaddress.getDeclaredMethod(properties.getProperty("classmethod"),String.class);
        method.invoke(object,"张三");
        System.out.println("-------------------");
         Constructor constructor=classaddress.getDeclaredConstructor(String.class,int.class);
         *//*如果有参的构造方法得到对象时，就会进行加载，无参构造也是一样*//*
         Object object2=constructor.newInstance("王爷",78);
          System.out.println("----------------------");
          Student student= (Student) object;
        Field name = classaddress.getDeclaredField("name");
        name.set(student,"关羽");
        System.out.println(student.name);
        Field field=classaddress.getDeclaredField("age");
        field.setAccessible(true);
        field.set(student,"788999");
        System.out.println(student.getAge());*/