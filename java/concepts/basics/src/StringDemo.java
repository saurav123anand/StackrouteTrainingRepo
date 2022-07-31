public class StringDemo {
    public static void main(String[] args) {
        StringBuilder builder1=new StringBuilder();
        for (int i=0;i<=10;i++){
            builder1.append(i);
        }
        String str=builder1.toString();
        System.out.println(str);

        StringBuilder builder2=new StringBuilder();
        //here we are able to do chaining coz append method return builder object
        builder2.append("hi").append("hello").append("good");
        System.out.println(builder2);

        StringBuilder builder3=new StringBuilder("hi");
        StringBuilder builder4=builder3.append("saurav").append("anand");
        System.out.println("builder3 "+builder3);
        System.out.println("builder4 "+builder4);

        StringBuffer buffer1=new StringBuffer("saurav");


    }
}
