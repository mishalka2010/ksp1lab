package ru.mirea.pets.lab1;

import ru.mirea.pets.lab1.Item;

import java.util.Objects;

public class Pet implements Item {

    private String name;
    private String type;
    private int price;
    private int count;

    public Pet(String name, String type, int price, int count) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return price == pet.price &&
                count == pet.count &&
                Objects.equals(name, pet.name) &&
                Objects.equals(type, pet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price, count);
    }
}
