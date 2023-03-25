public class Student {
    private String name;
    private int age;
    private int rollno;
    private int standard;
    private int score;
    private int scoreFrom;
    private String grade;
    public Student() {
    }

    public Student(String name, int age, int rollno, int standard, int score, int scoreFrom, String grade) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.standard = standard;
        this.score = score;
        this.scoreFrom = scoreFrom;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScoreFrom() {
        return scoreFrom;
    }

    public void setScoreFrom(int scoreFrom) {
        this.scoreFrom = scoreFrom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

