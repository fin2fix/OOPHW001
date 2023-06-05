package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product();
        // product1.brand = "ООО Чистый Источник";
        // product1.name = "Бутылка с водой";
        // product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        // product2.brand = "ООО Чистый Источник";
        // product2.name = "__";
        // product2.price = -15;
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);
        System.out.println(bottleOfMilk.displayInfo());

        Product chocolate1 = new Chocolate("Красный октябрь", "Аленка", 95, "Молочный", 348);
        System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("Бабаевский", "Горький", 180, "Черный 75% какао", 260);
        System.out.println(chocolate2.displayInfo());

        Product crisps1 = new Crisps(null, "Estrella", 120, 90, "С сыром и луком");
        System.out.println(crisps1.displayInfo());

        Product crisps2 = new Crisps(null, "LAYS", 140, 90, "С зеленью");
        System.out.println(crisps2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(crisps1);
        products.add(crisps2);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null) {
            System.out.println("\n Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        } else {
            System.out.println("\n Такой бутылки с водой нет в автомате.");
        }

        Chocolate findChocolate = vendingMachine.getChocolate("Молочный");
        if (findChocolate != null) {
            System.out.println("\n Вы купили:");
            System.out.println(findChocolate.displayInfo());
        } else {
            System.out.println("\n Такого шоколада нет в автомате.");
        }

        Crisps findCrisps = vendingMachine.getCrisps(150);
        if (findCrisps != null) {
            System.out.println("\n Вы купили:");
            System.out.println(findCrisps.displayInfo());
        } else {
            System.out.println("\n Таких чипсов нет в автомате.");
        }

    }
}
