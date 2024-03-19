package main.guiprogram;

public class Singleton {
    private static Singleton instance = null;
    private Data data;
    private Singleton() {
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
