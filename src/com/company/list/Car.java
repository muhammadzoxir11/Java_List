package com.company.list;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Car implements CarInt {

    String brand;
    String name;
    int price;
    boolean isHave = false;
    ArrayList<Car> carArrayList = new ArrayList<Car>();
    Scanner scanner = new Scanner(in);

    public Car() {
    }

    public Car(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    @Override
    public void carAdd() {
        System.out.println("Add Car ");
        scanner = new Scanner(in);
        System.out.print("Car Brand write: ");
        String brand = scanner.nextLine();

        System.out.print("Car Name write: ");
        String name = scanner.nextLine();

        System.out.print("Car Price write: ");
        int price = scanner.nextInt();

        carArrayList.add(new Car(brand, name, price));
        System.out.println();
        System.out.println("Success !!!");

    }

    @Override
    public void carList() {

        System.out.println("Car list");
        for (Car car : carArrayList) {
            System.out.print("|| " + car.brand + " " + car.name + " " + car.price + " $");
            System.out.println();
        }

    }

    @Override
    public void carSearch() {
        scanner = new Scanner(in);
        System.out.println("Search Car");
        System.out.print("Car name write: ");
        String name = scanner.nextLine();
        for (Car car : carArrayList) {
            if (car.name.equals(name)) {
                isHave = true;
                break;
            }

        }
        if (isHave) {
            for (Car car : carArrayList) {
                System.out.print("|| " + car.brand + " " + car.name + " " + car.price + " $");
            }
        } else {
            System.out.println("No car name");
        }
    }
}
