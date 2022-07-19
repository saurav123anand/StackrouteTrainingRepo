package schoolms;

public class StudentMain {
    public static void main(String[] args) {
        Student students[]=new Student[2];
        CseStudent student1=new CseStudent(1,"rohit",21,"java");
        student1.setName("somnath");
        students[0]=student1;
        EceStudent student2=new EceStudent(1,"mohit",22,"millimeter");
        students[1]=student2;

        for(Student iterated:students){
            int id=iterated.getId();
            String name=iterated.getName();
            int age=iterated.getAge();
            System.out.println(id+" "+name+" "+age);
            boolean isEce=iterated instanceof EceStudent;
            if(isEce){
                EceStudent eceStudent=(EceStudent) iterated;
                String device=eceStudent.getDevice();
                System.out.println("device= "+device);
            }
            boolean isCse=iterated instanceof CseStudent;
            if(isCse){
                CseStudent cseStudent= (CseStudent) iterated;
                String language=cseStudent.getProgrammingLanguage();
                System.out.println("language= "+language);
            }
        }

    }
}
