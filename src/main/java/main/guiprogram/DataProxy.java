package main.guiprogram;
/**
 * @author Aurelijus Lukšas 5gr.
 * DataProxy class.
 * This class is a proxy for the Data class.
 * It implements the IData interface.
 */
public class DataProxy implements IData {
    private Data data;
    /**
     * Constructor for the DataProxy class.
     * @param builder - Data.Builder object.
     */
    public DataProxy(Data.Builder builder) {
        this.data = builder.build();
    }
    /**
     * Getter for the birthdate.
     * @return - birthdate.
     */
    @Override
    public String getBirthDate() {
        return data.getBirthDate();
    }
    /**
     * Getter for the height.
     * @return - height.
     */
    @Override
    public double getHeight() {
        return data.getHeight();
    }
    /**
     * Getter for the weight.
     * @return - weight.
     */
    @Override
    public double getWeight() {
        return data.getWeight();
    }
    /**
     * Getter for the income.
     * @return - income.
     */
    @Override
    public double getIncome() {
        return data.getIncome();
    }
}