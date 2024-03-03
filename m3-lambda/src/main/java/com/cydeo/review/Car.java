package com.cydeo.review;

public class Car {

    private String make;
    private int topSpeed;
    private int year;

    public Car(String make, int topSpeed, int year) {
        this.make = make;
        this.topSpeed = topSpeed;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", topSpeed=" + topSpeed +
                ", year=" + year +
                '}';
    }

    /* int function1(int x) {
        return x+5;
    }

    int function2(int x) {
        return x+10;
    }

    //  f(x) = x + 5                f(g(x)) = g(x) +5 = x +10 + 5 = x + 15
    // (3) = 3 + 5 = 8              f(k(x)) = k(x) + 5 = x+1 + 5 = x + 6
    // (12) = 12 + 5 = 17
    // (g(3)) = g(3) + 5 = 13+5 =18

    // g(x) = x + 10
    // 3 = 3 + 10 = 13
    // 12 = 12 + 10 = 22

    //k(x) = x + 1

    //Functional Programming -> I want to  pass one method/function in another function/method
*/
}
