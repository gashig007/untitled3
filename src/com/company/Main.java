package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(concat(10,20));
        System.out.println(concat(20,30));
        System.out.println(concat(30,40));
        System.out.println(concat(40,50));
        System.out.println(concat(45,55));
    }
    public static String concat(int age, int temperature){
        String option = "Можно идти гулять";
        String option1 = "Оставайтесь дома";
        if(age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return option;
        }

        else if(age < 20 && temperature > 0 && temperature < 28){
            return option;
        }
        if(age > 45 && temperature > -10 && temperature < 25){
            return option;
        }
        else{
            return option1;
        }


    }
}

