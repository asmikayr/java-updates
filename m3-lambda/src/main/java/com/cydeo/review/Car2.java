package com.cydeo.review;

import lombok.Setter;

@Setter
public class Car2 {

    private String make;
    private int topSpeed;
    private int year;

    public static Car2Builder builder(){
        return new Car2Builder();
    }

    public static class Car2Builder{
        private String make;
        private int topSpeed;
        private int year;

        public Car2Builder(){

        }

        public Car2Builder make(String make){

            this.make = make;
            return this;
        }

        public Car2Builder topSpeed(int topSpeed){

            this.topSpeed = topSpeed;
            return this;
        }

        public Car2Builder year(int year){

            this.year = year;
            return this;
        }

        public Car2 build(){
            Car2 car2 = new Car2();
            if(this.make != null){
                car2.setMake(this.make);
            }

            if(this.topSpeed != topSpeed){
                car2.setTopSpeed(this.topSpeed);
            }
            if(this.year != year){
                car2.setYear(this.year);
            }
            return car2;
        }
        //car2Builder.setMake("BMW); car2Builder.setTopSpeed(150);
        //car2Builder.make("BMW").topSpeed(150).year(2020);

    }
}
