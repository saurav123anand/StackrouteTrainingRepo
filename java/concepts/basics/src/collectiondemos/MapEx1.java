package collectiondemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        MapEx1 mapEx1=new MapEx1();
        Map<Integer,String> map=new HashMap<>();
        map.put(2,"two");
        map.put(3,"three");
        map.put(1,"one");
        Map<Integer,String> map2=new HashMap<>();
        map.put(5,"five");
        map.put(6,"six");
        map.putAll(map2);
        String valueForKey2=map.get(2);
        System.out.println("value for key2="+valueForKey2);

        System.out.println("entry removed for key 2");
        map.remove(2);

        System.out.println("iterating on keys");
        mapEx1.display(map);

        System.out.println("iterating on values");
        Collection<String> values=map.values();
        for(String value:values){
            System.out.println("value="+value);
        }
    }
    void display(Map<Integer,String> map){
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            String value=map.get(key);
            System.out.println("key is "+key+" value is "+value);
        }
    }
}
