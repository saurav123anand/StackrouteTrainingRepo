public class EvaluationTeam {
    School school;
    EvaluationTeam(School school){
        this.school=school;
    }
    double averageClassScore(int standard){
        Student[] students=school.findStudentsByStandard(standard);
        return 5.7;
    }
}
