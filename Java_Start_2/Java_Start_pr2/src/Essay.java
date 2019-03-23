import java.time.LocalDate;

public class Essay extends Project {

    public enum Topic {ALGORITHMS, DATA_STRUCTURES, WEB, DATABASES};
    private Topic topic;

    /**
     *
     * @param essayName this will be the current essay name which will be assigned as the name of the project (inheritated from Project class)
     * @param essayDeadline this will be the current essay deadline which will be assigned as the deadline of the project (inheritated from Project class)
     * @param topic the topic of the essay
     */
     Essay(String essayName, LocalDate essayDeadline, Topic topic) {
         this.projectName=essayName;
         this.projectDeadline=essayDeadline;
         topic=topic;
    }

    /**
     *
     * @return name of the topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     *
     * @param topic sets the name of the essay topic
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    /**
     *
     * @return the object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "Essay{" +
                "top=" + topic +
                ", name='" + projectName + '\'' +
                ", deadline=" + projectDeadline +
                '}';
    }
}