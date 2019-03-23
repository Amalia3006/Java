public class Trio<T1, T2, T3> {

    private T1 firstParameterDay;
    private T2 secondParameterStartTime;
    private T3 thirdParameterEndTime;

    /**
     * create a trio made by day time time
     * it will help with the time table, visiting hours etc
     *
     * @param firstParameterDay        represent the day
     * @param secondParameterStartTime represent the a start time for that day
     * @param thirdParameterEndTime    represent the an end time for that day
     */
    public Trio(T1 firstParameterDay, T2 secondParameterStartTime, T3 thirdParameterEndTime) {
        this.firstParameterDay = firstParameterDay;
        this.secondParameterStartTime = secondParameterStartTime;
        this.thirdParameterEndTime = thirdParameterEndTime;
    }

    /**
     * @return the first parameter of a trio, always a day
     */
    public T1 getFirstParameterDay() {
        return firstParameterDay;
    }

    /**
     * set a day in trio
     *
     * @param firstParameterDay represent the day
     */
    public void setFirstParameterDay(T1 firstParameterDay) {
        this.firstParameterDay = firstParameterDay;
    }

    /**
     * @return the second parameter of a trio, always a time when something start
     */
    public T2 getSecondParameterStartTime() {
        return secondParameterStartTime;
    }

    /**
     * set the start time
     *
     * @param secondParameterStartTime represent a time when something start
     */
    public void setSecondParameterStartTime(T2 secondParameterStartTime) {
        this.secondParameterStartTime = secondParameterStartTime;
    }

    /**
     * @return the third parameter of a trio, always a time when something ends
     */
    public T3 getThirdParameterEndTime() {
        return thirdParameterEndTime;
    }

    /**
     * set the end time
     *
     * @param thirdParameterEndTime represent the time when something ends
     */
    public void setThirdParameterEndTime(T3 thirdParameterEndTime) {
        this.thirdParameterEndTime = thirdParameterEndTime;
    }
}
