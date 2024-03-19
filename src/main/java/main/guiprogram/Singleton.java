package main.guiprogram;

/**
 * @author Aurelijus Lukšas 5 gr.
 * Singleton class to store the data.
 */
public class Singleton {
    private static Singleton instance = null;
    private Data data;
    /**
     * Constructor for Singleton class.
     */
    private Singleton() {
    }
    /**
     * Getter for data.
     * @return data
     */
    public Data getData() {
        return data;
    }
    /**
     * Setter for data.
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }
    /**
     * Getter for instance.
     * @return instance
     */
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
