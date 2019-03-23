import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private int yearOfStudy;
    private ArrayList<Project> projects;

    /**
     * This function assigns name and the year of study
     * And create the array for the project
     *
     * @param studentName name of student
     * @param yearOfStudy year of study for a specific student
     */
    Student(String studentName, int yearOfStudy) {
        this.studentName = studentName;
        this.yearOfStudy = yearOfStudy;
        projects = new ArrayList<Project>();
    }

    /**
     * @return return the name of the student
     */
    public String getName() {
        return studentName;
    }

    /**
     * sets the name of the student
     *
     * @param studentName name of the student
     */
    public void setName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the year of study
     */
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    /**
     * set the year of study
     *
     * @param yearOfStudy year of study
     */
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    /**
     * @return the object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", projects=" + projects +
                '}';
    }

    /**
     * @param projects add the project student's preferences
     */
    void setPreferences(Project... projects) {
        for (Project curentProject : projects) {
            boolean ignoreProjectRepeted = false;
            for (Project allreadyProjectsWrite : this.projects)
                if (curentProject == allreadyProjectsWrite)
                    ignoreProjectRepeted = true;
            if (ignoreProjectRepeted == false)
                this.projects.add(curentProject);
        }
    }

    /**
     * @return the array list
     */
    public ArrayList<Project> getProjects() {
        return projects;
    }

    /**
     * @param i index represeting the order of project
     * @return the project on the index position
     */
    public Project getProject(int i) {
        return projects.get(i);
    }

    /**
     * @param o object
     * @return can not allow adding the same student,
     */
    @Override
    public boolean equals(Object o) {
        if( o==null) return false;
        if (this == o) return true;
        System.out.print(this);
        System.out.println("=");
        System.out.print(o);
        System.out.println("");
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYearOfStudy() == student.getYearOfStudy() &&
                studentName.equals(student.studentName) &&
                Objects.equals(getProjects(), student.getProjects());
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(studentName, getYearOfStudy(), getProjects());
    }


}
