import java.util.Locale;
import java.util.Scanner;

public class CountVowels {
    public int countVowels(String str){
        str=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountVowels vowelsObj=new CountVowels();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("vowels count= "+vowelsObj.countVowels(str));
    }
}
