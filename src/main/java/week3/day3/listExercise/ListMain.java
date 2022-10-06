package week3.day3.listExercise;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ListExercise listEx = new ListExercise();

        List<String> students = listEx.getStudents();

        for (String student:
             students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
