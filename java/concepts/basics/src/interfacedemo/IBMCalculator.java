package interfacedemo;

public class IBMCalculator implements IScientificCalculator {
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
    public int sum(int num1,int num2){
        return num1+num2;
    }

    @Override
    public String add(String num1, String num2) {
        return num1+num2;
    }
}
