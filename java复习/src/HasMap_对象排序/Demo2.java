package HasMap_对象排序;

import java.util.*;

public class Demo2 {
    public static void main(String[] args)
    {
        HashMap<Integer,User>users=new HashMap<>();
        users.put(1,new User("张三",23));
        users.put(2,new User("李四",10));
        users.put(3,new User("张丽",78));
        HashMap<Integer,User>sortHashMap=sortHashMap(users);
        System.out.println(sortHashMap);
    }
    public static HashMap<Integer,User>sortHashMap(HashMap<Integer,User>map)
    {
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        List<Map.Entry<Integer, User>> list = new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer,User> maps=new LinkedHashMap<Integer, User>();
        for(Map.Entry<Integer, User> entrys:list)
        {
            maps.put(entrys.getKey(),entrys.getValue());
        }

        return maps;
    }

}
