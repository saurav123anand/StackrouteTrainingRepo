package collectiondemos;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        SetEx1 listEx1=new SetEx1();
        Set<String> fruits=new HashSet<>();
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("apple");

        boolean contains=fruits.contains("mango");
        System.out.println("mango in collection "+contains);

        System.out.println("getting all the fruits");
        listEx1.display(fruits);

        System.out.println("remove element");
        fruits.remove("Apple");

        System.out.println("after removing elements");
        listEx1.display(fruits);

        int size=fruits.size();
        System.out.println("size="+size);

    }
    void display(Collection<String> fruits){
        for(String iterated:fruits){
            System.out.println("fruit="+iterated);
        }
    }

}
