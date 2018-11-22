package cn.itcast01_反射;

public class Student {
    String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student()
    {
        System.out.println("你是个沙僧");
    }
    public Student(String name, int age)
    {
        System.out.println("你是个沙僧"+name+"--"+age);
    }
    public void fun(String name)
    {
        System.out.println("你的名字是"+name);
    }
}
