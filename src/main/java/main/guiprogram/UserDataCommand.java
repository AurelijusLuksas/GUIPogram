package main.guiprogram;

public class UserDataCommand implements Command {
    private Data data;
    public UserDataCommand(Data data) {
        this.data = data;
    }

    @Override
    public void execute(OutputController controller) {
        controller.ageOutput.setText(Outputs.getAge(data.getBirthDate()) + " years");
        String bmi = Outputs.getBMI(String.valueOf(data.getHeight()), String.valueOf(data.getWeight()));
        String bmiClean = bmi.replace(",", ".");
        float bmiFloat = Float.parseFloat(bmiClean);
        controller.heightOutput.setText(Outputs.getHealth(bmiFloat));
        controller.weightOutput.setText(bmi);
        controller.wealthOutput.setText(Outputs.getWealth(String.valueOf(data.getIncome())));
        controller.OverallOutput.setText(Outputs.getStatus(bmiFloat, Outputs.getWealth(String.valueOf(data.getIncome())), Outputs.getAge(data.getBirthDate())));
    }
}
