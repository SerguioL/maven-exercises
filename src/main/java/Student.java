import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, long id, ArrayList<Integer> grades){
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

//    public double getGradeAverage(){
//        double total = 0;
//        for(int i = 0; i<grades.size(); i++ ){
//            total += grades.size(i);
//        }
//        return total/grades.size();
//    }
}
