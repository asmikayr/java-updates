package com.cydeo.task;

import java.util.Comparator;
import java.util.List;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        System.out.println("Task1");

        DishData.getAll().stream()
                .filter(Dish -> Dish.getCalories() < 400)
                //.map(Dish -> Dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("Task2");

        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(Dish -> Dish.getName().length())
                .forEach(System.out::println);

        System.out.println("Task3");
        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(Dish -> Dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Task4");
        //Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(Dish -> Dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);







    }
}
