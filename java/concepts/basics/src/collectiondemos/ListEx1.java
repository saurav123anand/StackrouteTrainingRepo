package collectiondemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        ListEx1 listEx1=new ListEx1();
        List<String> fruits=new ArrayList<>();
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("Apple");
        fruits.add("banana");
        String fruitAtIndex2=fruits.get(2);
        System.out.println(fruitAtIndex2);

        System.out.println("getting all the fruits");
        listEx1.display(fruits);

        System.out.println("remove element");
        fruits.remove(1);
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
