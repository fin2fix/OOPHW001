package ru.geekbrains.lesson1;

public class Chocolate extends Product {

  private String typeOfChocolate;
  private int calories;

  public Chocolate(String brand, String name, double price, String typeOfChocolate, int calories) {
    super(brand, name, price);
    this.typeOfChocolate = typeOfChocolate;
    this.calories = calories;
  }

  public String getTypeOfChocolate() {
    return typeOfChocolate;
  }

  public void setTypeOfChocolate(String typeOfChocolate) {
    this.typeOfChocolate = typeOfChocolate;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  @Override
  public String displayInfo() {
    return String.format("[Шоколад] %s - %s - %f [%s - %d калорий]", brand, name, price, typeOfChocolate, calories);
  }

}
