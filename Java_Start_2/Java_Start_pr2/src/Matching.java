import java.util.ArrayList;
import java.util.List;


public class Matching {

    private Problem problem;
    private List<MatchPair> matchPairList;

    /**
     *
     * @param problem the problem given
     */
    public Matching(Problem problem) {
        this.problem = problem;
    }

    /**
     *
     * @return the list of matches
     */
    public List<MatchPair> getMatches() {
        if (matchPairList == null)
            generateMatches();
        return matchPairList;
    }

    /**
     * generate the matching between students and projects
     */
    private void generateMatches() {
        matchPairList = new ArrayList<>();
        int i = 0;
        while (i++ < 1000) {
            List<Student> catalog = problem.getStudents();
            for (Student actualStudent : catalog) {
                int index = (int) (Math.random() * actualStudent.getProjects().size());
                matchPairList.add(new MatchPair(actualStudent, actualStudent.getProject(index)));
            }
            if (validateSolution())
                return;
            else
                matchPairList.clear();
        }
    }

    /**
     *
     * @return true if the solution is valid (if every student has a unique project)or false if not
     */
    private boolean validateSolution() {
        for (int i = 0; i < matchPairList.size() - 1; i++) {
            for (int j = i + 1; j < matchPairList.size(); j++) {
                MatchPair matchPair1 = matchPairList.get(i);
                MatchPair matchPair2 = matchPairList.get(j);
                if (matchPair1.getSecond().getName().equals(matchPair2.getSecond().getName()))
                    return false;
            }
        }
        return true;
    }

}
