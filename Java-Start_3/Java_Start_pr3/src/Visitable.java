import java.sql.Time;
import java.time.Duration;

public interface Visitable {

    /**
     *this function calculate the duration of the visit for a specific day
     *
     * @param dayWanted the day I wanted to make the visit
     * @return the duration of the visit
     */
    static Duration getVisitingDuration(Trio<Day, Time, Time> dayWanted) {
        return Duration.between(dayWanted.getThirdParameterEndTime().toLocalTime(), dayWanted.getSecondParameterStartTime().toLocalTime());
    }

    /**
     * return visiting hours for a specific day
     *
     * @param dayVisiting the day I want to make the visit
     * @return the visiting hours for that day
     */
    default Trio<Day, Time, Time> getVisitingHours(Day dayVisiting) {
        return new Trio<>(dayVisiting, new Time(9, 30, 00), new Time(20, 00, 00));
    }

    /**
     * set the time table
     *
     * @param day       set a specific day in time table
     * @param startTime set a specific start of the program for the day
     * @param endTime   set a specific end of the program for the day
     */
    void setVisitingHours(Day day, Time startTime, Time endTime);
}
