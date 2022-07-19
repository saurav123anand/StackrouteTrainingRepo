package schoolms;

public class CseStudent extends Student{
    private String programmingLanguage;
    public CseStudent(int id,String name,int age,String language){
        super(id, name, age);
        this.programmingLanguage=language;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
