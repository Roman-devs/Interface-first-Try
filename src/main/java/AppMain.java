import student.*;

public class AppMain {

    public static void main(String[] args) {
        Student computerScienceStudent = new ComputerScienceStudent("CS","Horst");
        Student historyStudent = new HistoryStudent("History","Alma");
        Student dancingStudent = new DancingStudent("Dancing","Hartmut");
        OldStudentDB firstCommitToDatabase = new OldStudentDB(new Student[0]);
        firstCommitToDatabase.addStudentToArray(computerScienceStudent);
        firstCommitToDatabase.addStudentToArray(historyStudent);
        firstCommitToDatabase.addStudentToArray(dancingStudent);
        System.out.println(firstCommitToDatabase.getRandomStudent());
        printName(computerScienceStudent);
        printName(historyStudent);
        printName(dancingStudent);
    }

    public static void printName(Student student){
        System.out.println("The name of the student is: " + student.getName());
    }

}
