package main.guiprogram;

public class Data implements IData {
    private String birthDate;
    private double height;
    private double weight;
    private double income;

    Data(Builder builder) {
        this.birthDate = builder.birthDate;
        this.height = builder.height;
        this.weight = builder.weight;
        this.income = builder.income;
    }

    public static class Builder {
        private String birthDate;
        private double height;
        private double weight;
        private double income;

        public Builder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setIncome(double income) {
            this.income = income;
            return this;
        }

        public Data build() {
            return new Data(this);
        }
    }

    // getters
    public String getBirthDate() {
        return birthDate;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getIncome() {
        return income;
    }
}
