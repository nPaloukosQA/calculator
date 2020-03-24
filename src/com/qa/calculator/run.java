package com.qa.calculator;

public class run {
    public static void main (String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 3));         //addition
        System.out.println(calc.substract(5, 7));   //subtraction
        System.out.println(calc.divide(10, 3));     //division
        System.out.println(calc.multiply(9, 9));    //multiplication
        System.out.println(calc.remain(15, 4));     //what remains after division
    }
}
