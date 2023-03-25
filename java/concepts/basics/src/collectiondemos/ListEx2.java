package collectiondemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        ListEx2 listEx1=new ListEx2();
        List<String> fruits=new LinkedList<>();
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add(0,"pineapple");
        String fruitAtIndex2=fruits.get(2);
        System.out.println(fruitAtIndex2);

        System.out.println("getting all the fruits");
        listEx1.display(fruits);

        System.out.println("remove element");
        fruits.remove(1);
        fruits.remove("Apple");
        System.out.println("after removing elements");
        listEx1.display(fruits);

    }
    void display(Collection<String> fruits){
        for(String iterated:fruits){
            System.out.println("fruit="+iterated);
        }
    }

}
