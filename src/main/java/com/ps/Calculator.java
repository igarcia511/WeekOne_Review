package com.ps;

class Calculator {
    public static void main(String[] args) {
       int sum = add(1,3);
        System.out.println(sum);
    }
    //static method add
    public static int add(int num1, int num2){
        return  num1 + num2;
    }
}