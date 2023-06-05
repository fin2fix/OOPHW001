package ru.geekbrains.lesson1;

public class Crisps extends Product {

  private int weight;
  private String typeOfCrisps;

  public Crisps(String brand, String name, double price, int weight, String typeOfCrisps) {
    super(brand, name, price);
    this.weight = weight;
    this.typeOfCrisps = typeOfCrisps;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getTypeOfCrisps() {
    return typeOfCrisps;
  }

  public void setTypeOfCrisps(String typeOfCrisps) {
    this.typeOfCrisps = typeOfCrisps;
  }

  @Override
  public String displayInfo() {
    return String.format("[Чипсы] %s - %s - %f [%s - вес %d гр]", brand, name, price, typeOfCrisps, weight);
  }

}
