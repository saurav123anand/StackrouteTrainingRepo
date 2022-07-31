public class Wrapper {
    public static void main(String[] args) {
        Integer num1=12;
        Integer num2=13;
        Integer sum=num1+num2;  //here first num1 is converted to primitive(int) same for num2 internally then sum will
        // be primitive then it will be converted to wrapper(new Integer(result) and assigned and display result,all
        // will happen internally

        System.out.println(sum);
    }
}
