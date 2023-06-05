package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {

        for (Product product : products) {
            if (product instanceof BottleOfWater)
                if (((BottleOfWater) product).getVolume() == volume)
                    return (BottleOfWater) product;
        }
        return null;
    }

    public Chocolate getChocolate(String typeOfChocolate) {

        for (Product product : products) {
            if (product instanceof Chocolate)
                if (((Chocolate) product).getTypeOfChocolate().equals(typeOfChocolate))
                    return (Chocolate) product;
        }
        return null;
    }

    public Crisps getCrisps(int weight) {

        for (Product product : products) {
            if (product instanceof Crisps)
                if (((Crisps) product).getWeight() == weight)
                    return (Crisps) product;
        }
        return null;
    }
}
