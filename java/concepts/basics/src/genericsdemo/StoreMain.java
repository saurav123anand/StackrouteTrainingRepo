package genericsdemo;

public class StoreMain {
    public static void main(String[] args) {
        Store<String> store=new Store<>();
        store.setValue("apple");
        String fruit=store.getValue();
        System.out.println("fruit name is "+fruit);
    }

}
