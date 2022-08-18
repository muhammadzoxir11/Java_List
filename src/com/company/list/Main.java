package com.company.list;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        Car car = new Car();

        while (true) {

            System.out.println("Car Add ->[1]");
            System.out.println("Car List ->[2]");
            System.out.println("Car Search ->[3]");
            System.out.print("= ");
            int n = scanner.nextInt();

            switch (n) {
                case 1 -> {
                    car.carAdd();
                }
                case 2 -> {
                    car.carList();
                }

                case 3 -> {
                    car.carSearch();
                }
            }
        }

    }
}
