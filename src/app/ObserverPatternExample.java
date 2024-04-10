package app;

import java.util.Scanner;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Substance substance = new Substance();
        Observer colorSensor = new ColorSensor();
        Observer weightSensor = new WeightSensor();

        substance.addObserver(colorSensor);
        substance.addObserver(weightSensor);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();

        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();

        substance.setState(temperature, weight);

        scanner.close();
    }
}
