package ru.timokhina.lesson14;

public enum Drinks {

    COLA(1,"Cola", 50),
    FANTA(2,"Fanta", 60),
    SPRITE(3,"Sprite", 70);

    private int number;
    private String description;
    private int cost;

    Drinks(int number, String description, int cost)  {
        this.number = number;
        this.description = description;
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }
}
