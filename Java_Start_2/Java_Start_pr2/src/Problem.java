import java.util.ArrayList;
import java.util.Arrays;

public class Problem {

    private ArrayList<Student> students;


    public Problem() {

        students = new ArrayList<Student>();
    }

    /**
     * @return list of students who will be allocated with a project
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * @param students stores unknown number of students in a list in order to be assigned with a project (SPA problem)
     */
    public void setStudents(Student... students) {
        for (Student s1 : students) {
            boolean ignore = false;
            for (Student s2 : this.students) {
                if (s1 == s2)
                    ignore = true;
            }
            if (!ignore)
                this.students.add(s1);
        }
    }

    /**
     * set the list of students
     *
     * @param students objects
     */
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * @return the object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "Problem{" +
                "students=" + students +
                '}';
    }

}
