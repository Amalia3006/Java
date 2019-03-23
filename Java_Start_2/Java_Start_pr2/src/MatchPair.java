public class MatchPair extends Pair<Student, Project> {

    /**
     *
     * @param first the student object
     * @param second the project object
     */
    public MatchPair(Student first, Project second) {
        super(first, second);
    }

    /**
     *
     * @return he object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "Student=" + first.getName() + " -> project=" + second.getName() + "\n";
    }
}
