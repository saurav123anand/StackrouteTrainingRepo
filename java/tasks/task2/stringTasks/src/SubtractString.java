public class SubtractString {
    public String subtractStrings(String str1,String str2){
        String min="";
        String max="";
        if(str1.length()<str2.length()){
            min=str1;
            max=str2;
        }
        else{
            min=str2;
            max=str1;
        }
        if(!max.contains(min)){
            return max+" doesn't contain "+min;
        }
        String diff=max.replace(min,"");
        return diff;
    }
    public static void main(String[] args) {
        SubtractString subtractString=new SubtractString();
        System.out.println(subtractString.subtractStrings("hello","le"));
    }
}
