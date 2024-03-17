package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), 20));
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), -5));
        System.out.println(permission(generateRandomAge(), 32));
    }

    public static String permission(int age, int temperature) {
        String result = "";
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            result = "Можно идти гулять";
        } else {
            result = "Оставайтесь дома";
        }
        return "Возраст: " + age + ", Температура: " + temperature + " - " + result;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}