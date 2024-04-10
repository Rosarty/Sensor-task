package app;

public class ColorSensor implements Observer {
    @Override
    public void update(int temperature, int weight) {
        if (temperature <= 0) {
            System.out.println("Color: White");
        } else {
            System.out.println("Color: Black");
        }
    }
}
