public class SchoolMain {
    public static void main(String[] args) {
       School school=new School(100);
       school.addStudent(student1);
       EvaluationTeam evaluationTeam=new EvaluationTeam(school);
       double avgScore=evaluationTeam.averageClassScore(6);

    }
}
