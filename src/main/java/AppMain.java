import Student.ComputerScienceStudent;
import Student.DancingStudent;
import Student.HistoryStudent;
import Student.Student;

public class AppMain {

    public static void main(String[] args) {
        Student computerScienceStudent = new DancingStudent("CS","Peter");
        Student historyStudent = new HistoryStudent("History","Alma");
        Student dancingStudent = new DancingStudent("Dancing","Hartmut");
        printSubject(computerScienceStudent);
        printSubject(historyStudent);
        printSubject(dancingStudent);
    }

    public static void printSubject(Student student){
        System.out.println("The name of the student is: " + student.getName());
    }

}
