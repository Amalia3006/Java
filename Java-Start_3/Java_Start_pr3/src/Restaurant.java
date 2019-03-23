public class Restaurant extends Node implements Classifiable {

    private int rank;

    /**
     * create an object (Restaurant)
     *
     * @param nameOfLocation name of the object (Restaurant)
     */
    public Restaurant(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
    }

    /**
     * @return the rank
     */
    @Override
    public int getRank() {
        return rank;
    }

    /**
     * set a rank for an object (Restaurant)
     *
     * @param nota represent the note(rank) for the place (node)
     */
    @Override
    public void setRank(int nota) {
        rank = nota;
    }
}
