public class ReportGenerationTeam {
    School school;
    public ReportGenerationTeam(School school){
        this.school=school;
    }
    Student findTopScorerByStandard(int standard){
        Student[] students=school.findStudentsByStandard(standard);
        Student topScorer=students[0];
        for(Student student:students){
           if(student.getScore()>topScorer.getScore()){
               topScorer=student;
           }
        }
        return topScorer;
    }
    Student[] findSuccessfulStudents(int standard){
        Student[] students=school.findStudentsByStandard(standard);
        return null;
    }
    Student[] findFailedStudents(int standard){
        Student[] students=school.findStudentsByStandard(standard);
        return null;
    }

}
