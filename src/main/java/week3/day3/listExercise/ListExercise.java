package week3.day3.listExercise;

import java.util.ArrayList;
import java.util.List;
public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("현");
    }
    public List<String> getStudents(){
        return students;
    }
}
