public interface Payable {

    /**
     * @return the price of a ticket (fee)
     */
    public float getEntryFee();

    /**
     * set the price
     *
     * @param price the actual price for a ticket (fee)
     */
    public void setEntryFee(float price);

}
