package ru.timokhina.lesson14;
import ru.timokhina.lesson7.Drinks;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) throws Exception {
        System.out.println(Drinks.COLA.getNumber() + " : " + Drinks.COLA.getDescription() + " : " + Drinks.COLA.getCost());
        System.out.println(Drinks.FANTA.getNumber() + " : " + Drinks.FANTA.getDescription() + " : " + Drinks.FANTA.getCost());
        System.out.println(Drinks.SPRITE.getNumber() + " : " + Drinks.SPRITE.getDescription() + " : " + Drinks.SPRITE.getCost());


        Scanner in = new Scanner(System.in);
        System.out.print("Выберите напиток:");
        int choice = in.nextInt();
        System.out.print("Внесите наличные:");
        int money = in.nextInt();
        System.out.print("Внесено " + money + " рублей.");


        switch (choice) {

            case 1:
                if (money >= Drinks.COLA.getCost()) {
                    System.out.println("Заберите Колу");
                    money = money - Drinks.COLA.getCost();
                } else {
                    System.out.println("Недостаточно денег");
                    System.setErr(new PrintStream("vending.log"));
                    System.err.println("Пользователь внёс недостаточно денег");
                    throw new Exception("Пользователь внёс недостаточно денег");
                }
                break;

            case 2:
                if (money >= Drinks.FANTA.getCost()) {
                    System.out.println("Заберите Фанту");
                    money = money - Drinks.FANTA.getCost();
                } else {
                    System.out.println("Недостаточно денег");
                    System.setErr(new PrintStream("vending.log"));
                    System.err.println("Пользователь внёс недостаточно денег");
                    throw new Exception("Пользователь внёс недостаточно денег");
                }
                break;

            case 3:
                if (money >= Drinks.SPRITE.getCost()) {
                    System.out.println("Заберите Спрайт");
                    money = money - Drinks.SPRITE.getCost();
                } else {
                    System.out.println("Недостаточно денег");
                    System.setErr(new PrintStream("vending.log"));
                    System.err.println("Пользователь внёс недостаточно денег");
                    throw new Exception("Пользователь внёс недостаточно денег");
                }
                break;
            default:
                System.out.println("Неверный выбор напитка");
        }
    }
}
