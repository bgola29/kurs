package com.kodillacourse.kalkulator;

public class Calculator {

    public void sumNumberOneAndTwo(int numberOne , int numberTwo) {
        int result = numberOne + numberTwo;
        System.out.println("Wnik dodawania : " + result );
    }
    public void subtractionNumberTwoAndOne(int numberOne , int numberTwo){
        int result = numberTwo - numberOne ;
        System.out.println("Wynik odejmowania : " + result );
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumNumberOneAndTwo(5 ,6);
        calculator.subtractionNumberTwoAndOne(6,3);
    }
}


