public class UniqueVowels {
    public String uniqueVowelsFinder(String str) {
        String temp = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!temp.contains(Character.toString(str.charAt(i))) && (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')) {
                result += str.charAt(i);
            }
            temp += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "eyenose";
        UniqueVowels uniqueVowels = new UniqueVowels();
        System.out.println("unique vowels are " + uniqueVowels.uniqueVowelsFinder(str));
    }
}
