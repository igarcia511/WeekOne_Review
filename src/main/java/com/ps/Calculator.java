package com.ps;

class Calculator {
    public static void main(String[] args) {
       int sum = add(1,3);
        System.out.println(sum);
        int subtract = subtract(5, 3);
        System.out.println(subtract);
    }
    //static method add
    public static int add(int num1, int num2){
        return  num1 + num2;
    }
    //static subtract method
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    // static
}