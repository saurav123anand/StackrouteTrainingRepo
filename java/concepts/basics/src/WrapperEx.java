//java.lang package is automatically imported by java
public class WrapperEx {
    public static void main(String[] args) {
        // Auto boxing and unboxing became possible after jdk5
        // Auto Boxing
        int i1=13;
        Integer i2=i1;
        System.out.println(i2);
        // Auto unboxing
        Integer i3=new Integer(10);
        int i4=i3;
        System.out.println(i4);

        Integer num1=6; // here 6 primitive data type will be converted to wrapper type then it'll be assigned to num1
        Integer num2=7;
        int num=num1+num2; // here num1 and num2 will be converted into primitive data type(int)
        System.out.println(num);

        // now auto boxing can be dangerous also for example
        Integer n=null;
        int primitiveN=n; //now here it will produce null pointer exception



    }
}
