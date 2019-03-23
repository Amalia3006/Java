import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Church extends Node implements Visitable {

    private List<Trio<Day, Time, Time>> timeTable;

    /**
     * creates an object (Church)
     * creats an ArrayList for tame table, using trio
     *
     * @param nameOfLocation name of object (Church)
     */
    public Church(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
        timeTable = new ArrayList<Trio<Day, Time, Time>>();
    }

    /**
     * return visiting hours for a specific day
     *
     * @param dayVisiting the day I want to make the visit
     * @return the visiting hours for that day
     */
    @Override
    public Trio<Day, Time, Time> getVisitingHours(Day dayVisiting) {
        for (Trio<Day, Time, Time> dayVerification : timeTable) {
            if (dayVerification.getFirstParameterDay() == dayVisiting) {
                return dayVerification;
            }
        }
        return null;
    }

    /**
     * set a time table for the node
     *
     * @param day       set a specific day in time table
     * @param startTime set a specific start of the program for the day
     * @param endTime   set a specific end of the program for the day
     */
    @Override
    public void setVisitingHours(Day day, Time startTime, Time endTime) {
        for (Trio<Day, Time, Time> dayVerification : timeTable) {
            if (day == dayVerification.getFirstParameterDay()) {
                dayVerification.setSecondParameterStartTime(startTime);
                dayVerification.setThirdParameterEndTime(endTime);
                return;
            }
        }
        timeTable.add(new Trio(day, startTime, endTime));
    }
}