package com.app.fruits;
import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;

        while (true) {
            System.out.println("\n0. Exit\n1. Add Mango\n2. Add Orange\n3. Add Apple");
            System.out.println("4. Display all fruit names\n5. Show all fresh fruit details");
            System.out.println("6. Show tastes of stale fruits\n7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits as stale");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 1: 
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Mango(name, weight, color);
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;

                case 2: 
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Orange(name, weight, color);
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;

                case 3: 
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Apple(name, weight, color);
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;

                case 4: 
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case 5: 
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                        }
                    }
                    break;

                case 6: 
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " taste: " + f.taste());
                        }
                    }
                    break;

                case 7: 
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 8: 
                    for (Fruit f : basket) {
                        if (f != null && f.taste().equalsIgnoreCase("sour")) {
                            f.setFresh(false);
                        }
                    }
                    System.out.println("All sour fruits marked as stale.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
