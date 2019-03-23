import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Project {
    String projectName;
    LocalDate projectDeadline;

    /**
     * @return the project name. This function will me inheritated by Essay and Application classes
     */
    public String getName() {
        return projectName;
    }

    /**
     * @param projectName sets the project name. This function will me inheritated by Essay and Application classes
     */
    public void setName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the project deadline. This function will me inheritated by Essay and Application classes
     */
    public LocalDate getDeadline() {
        return projectDeadline;
    }

    /**
     * @param projectDeadline sets the deadline of the project. This function will me inheritated by Essay and Application classes
     */
    public void setDeadline(LocalDate projectDeadline) {
        this.projectDeadline = projectDeadline;
    }

    /**
     * @return the object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "Project{" +
                "name='" + projectName + '\'' +
                ", deadline=" + projectDeadline +
                '}';
    }

    /**
     * @param o object
     * @return can not allow adding the same project twice.
     */
    @Override
    public boolean equals(Object o) {
        if( o==null) return false;
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return projectName.equals(project.projectName) &&
                Objects.equals(projectDeadline, project.projectDeadline);
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(projectName, projectDeadline);
    }


}


