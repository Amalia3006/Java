public class Pair<T, V> {
    protected T first;
    protected V second;

    /**
     * @param first  parameter of the default pair
     * @param second parameter of the default pair
     */
    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    /**
     * @return the first parameter
     */
    public T getFirst() {
        return first;
    }

    /**
     * @param first sets the first parameter
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * @return get the second parameter
     */
    public V getSecond() {
        return second;
    }

    /**
     * @param second set the second object
     */
    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
