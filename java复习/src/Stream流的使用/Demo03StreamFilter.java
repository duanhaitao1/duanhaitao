package Stream流的使用;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo03StreamFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        /*stream流进行过滤*/
       /* list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3)
      .forEach(System.out::println);*/
       list.stream().filter(s ->s.startsWith("张")).filter(s->s.length()==3);
       System.out.println("--------------Collection-----------------");
        List<String> list1 = new ArrayList<>();
        // ...Stream<String> stream1 = list.stream();
        // Set<String> set = new HashSet<>();
        // ...Stream<String> stream2 = set.stream();
        // Vector<String> vector = new Vector<>();
        // ...Stream<String> stream3 = vector.stream
        //用集合来获取stream流
        Stream<String>p1 =list.stream();
        Set<String>set=new HashSet<>();
        Stream<String> stream=set.stream();
        String []arr={"张三丰","关羽"};
        Stream<String>stream1=Stream.of(arr);
     //   stream1.filter(s1 ->s1.startsWith("张")).forEach(System.out::println);
       Stream<String> stream2= stream1.filter(s1 ->s1.startsWith("张"));
       System.out.println(stream2.count());
       Map<String,String>map=new HashMap<>();
       map.put("张三","12");
        map.put("张三1","12");
        map.put("张三3","12");
        /*两个流的拼接*/
       Stream<String> keystream3=map.keySet().stream();
       Stream<String>valuestream=map.values().stream();
       Stream<String> stream3=Stream.of("脏","子");
       Stream<String> stream4=Stream.of("脏","子");
       Stream<String>stream5=Stream.concat(stream3,stream4);
       stream5.forEach(System.out::println);
       //并发流的使用,有利于处理并发问题
        Stream<String> stream6=Stream.of("90","78").parallel();
        //直接获取并发就
        ArrayList list2=new ArrayList();
        Stream stream7 = list2.parallelStream();
        Stream.of(20,30,40,50).forEach(System.out::println);
        System.out.println("--------------");
        Stream<String> streamp= Stream.of("10", "20", "30", "40", "50");
        //把流转换为集合
        List<String>list3=streamp.collect(Collectors.toList());
        //转换为set集合
        Set<String>set1=streamp.collect(Collectors.toSet());
        Object[]arrs=streamp.toArray();
        String[]arr4={"i","p","io"};

        List<String> collect = Stream.of(arr4).collect(Collectors.toList());
        Stream<String> stream9=Stream.of("90","78");
        Stream<Integer>p=stream9.map(Integer::parseInt);


    }
}
