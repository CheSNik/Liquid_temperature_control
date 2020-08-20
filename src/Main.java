import java.util.Scanner;

/**
 * Assignment 2 lab 2 p4.14
 * @author Sergei Chekhonin
 * This program compute temerature of liquid in a pipe
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter resistance of the thermistor in ohms >");
        Scanner scanner = new Scanner(System.in);
        double resistance = Double.parseDouble(scanner. nextLine());
        Thermistor thermistor = new Thermistor(resistance);

        System.out.println("Temperature of liquid in pipe is " + thermistor.computeTemperature() +" Celcius");
    }
}
