import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Museum extends Node implements Visitable, Payable {

    private float price;
    private List<Trio<Day, Time, Time>> timeTable;

    /**
     * create an object (Museum)
     *
     * @param nameOfLocation name of object (Museum)
     */
    public Museum(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
        timeTable = new ArrayList<Trio<Day, Time, Time>>();
    }

    /**
     * @return the price for a fee
     */
    @Override
    public float getEntryFee() {
        return price;
    }

    /**
     * @param price the actual price for a ticket (fee)
     */
    @Override
    public void setEntryFee(float price) {
        this.price = price;
    }

    /**
     * get the visiting hours for a specific day
     *
     * @param dayVisiting the day I want to make the visit
     * @return the program for that day
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
     * set or change visiting hours for a day
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
