public abstract class Node {

    protected String nameOfLocation;
    protected double latitudeCoordinates;
    protected double longitudinalCoordinates;

    /**
     *
     * @param latitudeCoordinates set the latitude coordinates
     */
    public void setLatitudeCoordinates(double latitudeCoordinates) {
        this.latitudeCoordinates = latitudeCoordinates;
    }

    /**
     *
     * @param longitudinalCoordinates set the longitudinal coordinates
     */
    public void setLongitudinalCoordinates(double longitudinalCoordinates) {
        this.longitudinalCoordinates = longitudinalCoordinates;
    }

    /**
     *
     * @return the object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "Node{" +
                "nameOfLocation='" + nameOfLocation + '\'' +
                ", latitudeCoordinates=" + latitudeCoordinates +
                ", longitudinalCoordinates=" + longitudinalCoordinates +
                '}';
    }
}
