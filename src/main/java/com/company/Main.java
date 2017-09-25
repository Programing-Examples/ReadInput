package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int CENTIMETERS_PER_METER = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la cantidad en metros: ");
        double meters = scanner.nextDouble();

        System.out.println(meters + " metros son " + (meters * CENTIMETERS_PER_METER) + " centímetros");

    }
}
