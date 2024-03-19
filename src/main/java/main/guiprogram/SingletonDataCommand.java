package main.guiprogram;

/**
 * @author Aurelijus Lukšas 5 gr.
 * class that gets data from Singleton and sets it to the output fields
 */
public class SingletonDataCommand implements Command{
    private Singleton singleton;
    /**
     * @param singleton Singleton object
     */
    public SingletonDataCommand(Singleton singleton) {
        this.singleton = singleton;
    }
    /**
     * @param controller OutputController object
     */
    @Override
    public void execute(OutputController controller) {
        Singleton singleton = Singleton.getInstance();
        Data dataSingleton = singleton.getData();

        controller.ageOutput.setText(Outputs.getAge(dataSingleton.getBirthDate()) + " years");
        String bmi = Outputs.getBMI(String.valueOf(dataSingleton.getHeight()), String.valueOf(dataSingleton.getWeight()));
        String bmiClean = bmi.replace(",", ".");
        float bmiFloat = Float.parseFloat(bmiClean);
        controller.heightOutput.setText(Outputs.getHealth(bmiFloat));
        controller.weightOutput.setText(bmi);
        controller.wealthOutput.setText(Outputs.getWealth(String.valueOf(dataSingleton.getIncome())));
        controller.OverallOutput.setText(Outputs.getStatus(bmiFloat, Outputs.getWealth(String.valueOf(dataSingleton.getIncome())), Outputs.getAge(dataSingleton.getBirthDate())));
    }
}
