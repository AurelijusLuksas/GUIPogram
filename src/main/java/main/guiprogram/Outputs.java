package main.guiprogram;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Outputs{

    public static int getAge(String birthDateInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public static String getBMI(String height, String weight) {
        double heightInMeters = Double.parseDouble(height) / 100;
        double weightInKg = Double.parseDouble(weight);
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        return String.format("%.2f", bmi);
    }
    public static String getWealth(String income) {
        double wealth = Double.parseDouble(income);
        if (wealth < 1000) {
            return "Poor";
        } else if (wealth < 10000) {
            return "Middle class";
        } else {
            return "Rich";
        }
    }
    public static String getHealth(float bmiValue) {
        if (bmiValue < 18.5) {
            return "Underweight";
        } else if (bmiValue < 25) {
            return "Normal";
        } else {
            return "Overweight";
        }
    }

    public static String getStatus(float bmiValue, String wealth, int age) {
        String status = null;

        if (age < 9) {
            if (bmiValue < 18.5) {
                status = "Go play roblox and eat some food";
                return status;
            } else if (bmiValue < 25) {
                status = "Go play roblox";
                return status;
            } else {
                status = "Go outside you fat kiddo";
                return status;
            }
        } else if (age < 18) {
            if (bmiValue < 18.5) {
                status = "Go to the gym you skinny minecraft player";
                return status;
            } else if (bmiValue < 25) {
                status = "Keep up the good work";
                return status;
            } else {
                status = "Look at the mirror you smelly skunk";
                return status;
            }
        } else if (age < 30) {
            if (bmiValue < 18.5) {
                if (Objects.equals(wealth, "Poor")) {
                    status = "Go gym and start working";
                    return status;
                } else if (Objects.equals(wealth, "Middle class")) {
                    status = "Get a live...";
                    return status;
                } else {
                    status = "Buy some protein with dads money";
                    return status;
                }
            } else if (bmiValue < 25) {
                if (Objects.equals(wealth, "Poor")) {
                    status = "Get a job you lazy bum";
                    return status;
                } else if (Objects.equals(wealth, "Middle class")) {
                    status = "Keep up the good work";
                    return status;
                } else {
                    status = "Be proud of yourself";
                    return status;
                }
            } else {
                status = "Loose some weight while its not too late";
                return status;
            }
        } else if (age < 50) {
            if (bmiValue < 18.5) {
                status = "Cure the cancer or something, idk";
                return status;
            } else if (bmiValue < 25) {
                status = "Enjoy your life";
                return status;
            } else {
                status = "You should unalive yourself";
                return status;
            }
        } else {
            if (bmiValue < 18.5) {
                status = "Hit the gym you old dude";
                return status;
            } else if (bmiValue < 25) {
                status = "Find a hobby and enjoy your life";
                return status;
            } else {
                status = "ask your self if you want to live like this";
                return status;
            }
        }

    }


}
