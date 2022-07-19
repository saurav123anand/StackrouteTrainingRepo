package interfacedemo;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator calculator=new IBMCalculator();
        int result1=calculator.add(3,4);
        System.out.println("result="+result1);
        IScientificCalculator scientificCalculator=(IScientificCalculator)calculator;
        String result2=scientificCalculator.add("hello","good night");
        System.out.println("result="+result2);

    }

}
