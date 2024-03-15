package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        permission(generateRandomAge(), 10);
        permission(generateRandomAge(), 20);
        permission(generateRandomAge(), 25);
        permission(generateRandomAge(), -5);
        permission(generateRandomAge(), 32);
    }

    public static void permission(int age, int temperature) {
        String result = "";
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            result = "Можно идти гулять";
        } else {
            result = "Оставайтесь дома";
        }
        System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + result);
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}