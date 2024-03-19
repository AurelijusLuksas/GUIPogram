package main.guiprogram;

/**
 * @author Aurelijus Lukšas
 * Data class that holds the user's data.
 */
public class Data implements IData {
    private String birthDate;
    private double height;
    private double weight;
    private double income;
    /**
     * Constructor for the Data class.
     * @param builder Builder object that contains the user's data.
     */
    Data(Builder builder) {
        this.birthDate = builder.birthDate;
        this.height = builder.height;
        this.weight = builder.weight;
        this.income = builder.income;
    }
    /**
     * Builder class for the Data class.
     */
    public static class Builder {
        private String birthDate;
        private double height;
        private double weight;
        private double income;
        /**
         * Setter for the birthDate field.
         * @param birthDate String that represents the user's birthdate.
         * @return Builder object.
         */
        public Builder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        /**
         * Setter for the height field.
         * @param height double that represents the user's height.
         * @return Builder object.
         */
        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }
        /**
         * Setter for the weight field.
         * @param weight double that represents the user's weight.
         * @return Builder object.
         */
        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }
        /**
         * Setter for the income field.
         * @param income double that represents the user's income.
         * @return Builder object.
         */
        public Builder setIncome(double income) {
            this.income = income;
            return this;
        }
        /**
         * Builds the Data object.
         * @return Data object.
         */
        public Data build() {
            return new Data(this);
        }
    }

    /**
     * Getter for the birthDate field.
     * @return String that represents the user's birthdate.
     */
    public String getBirthDate() {
        return birthDate;
    }
    /**
     * Getter for the height field.
     * @return double that represents the user's height.
     */
    public double getHeight() {
        return height;
    }
    /**
     * Getter for the weight field.
     * @return double that represents the user's weight.
     */
    public double getWeight() {
        return weight;
    }
    /**
     * Getter for the income field.
     * @return double that represents the user's income.
     */
    public double getIncome() {
        return income;
    }
}
