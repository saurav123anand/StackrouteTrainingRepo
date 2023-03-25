package enumdemo;

public class DemoMain {
    public static void main(String[] args) {
        DayBreak dayBreak1=DayBreak.LunchBreak;
        DayBreak dayBreak2=DayBreak.EveningTea;
        String dayBreak1Name= dayBreak1.name();
        int dayBreak1Ordinal=dayBreak1.ordinal();
        System.out.println("Name is "+dayBreak1Name+" ordinal is "+dayBreak1Ordinal);

        DayBreak[] dayBreaks=DayBreak.values();
        System.out.println("iterating on values");
        for(DayBreak dayBreak:dayBreaks){
            System.out.println("name is "+dayBreak.name()+" ordinal is "+dayBreak.ordinal());
        }

        // comparing two enums
        boolean isEquals=dayBreak1==dayBreak2;
        System.out.println("is equals "+isEquals);

    }
}
