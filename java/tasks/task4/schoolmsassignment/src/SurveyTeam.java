public class SurveyTeam {
    School school;
    SurveyTeam(School school){
        this.school=school;
    }
    void grade(){
       Student allStudents[]= school.findAll();
       for(Student student:allStudents){
           String grade=calculateGrade(student.getScore(),student.getScoreFrom());
           student.setGrade(grade);
       }
    }
    String calculateGrade(int score,int scoreFrom){
        return null;
    }
    void display(){
        Student allStudents[]= school.findAll();
    }
}
