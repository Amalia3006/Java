public class Hotel extends Node implements Classifiable {

    private int rank;

    /**
     * create an object (Hotel)
     *
     * @param nameOfLocation name of object (Hotel)
     */
    public Hotel(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
    }

    /**
     * @return the rank for the Hotel
     */
    @Override
    public int getRank() {
        return rank;
    }

    /**
     * set the rank for a Hotel
     *
     * @param nota represent the note(rank) for the place (node)
     */
    @Override
    public void setRank(int nota) {
        rank = nota;
    }
}

