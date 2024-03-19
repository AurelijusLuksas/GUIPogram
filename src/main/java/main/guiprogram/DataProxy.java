package main.guiprogram;

public class DataProxy implements IData {
    private Data data;

    public DataProxy(Data.Builder builder) {
        this.data = builder.build();
    }

    @Override
    public String getBirthDate() {
        return data.getBirthDate();
    }

    @Override
    public double getHeight() {
        return data.getHeight();
    }

    @Override
    public double getWeight() {
        return data.getWeight();
    }

    @Override
    public double getIncome() {
        return data.getIncome();
    }
}