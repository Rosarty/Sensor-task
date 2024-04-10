package app;

public class WeightSensor implements Observer {
    @Override
    public void update(int temperature, int weight) {
        if (temperature <= 0) {
            System.out.println("Weight: 1g");
        } else {
            System.out.println("Weight: " + (weight + (temperature * 2)) + "g");
        }
    }
}
