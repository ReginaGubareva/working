package com.ifmo;

public class Mathematica {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++){
            task12(15, i);
        }


    }

    public static void task12(int a, int b){
        if(gcd(a, b) + lcm(a, b) == a + b +10){
            System.out.println((gcd(a, b) + lcm(a, b)) + " == " +  (a + b +10));
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static int lcm(int a, int b) {
        return a / gcd(a,b) * b;
    }


    public static void task1(){
        int sum = 0;
        for(int i = 1; i <=100; i++){
            sum += i*(i+1);
        }

        System.out.println(sum);
    }

    public static void task2(){
        //количество всех трехзначных цифр равно 900
        int countA = 0;
        int countB = 0;
        for(int i = 100; i <=999; i++ ){
            if(i % 3 == 0){
                countA++;
                if(i % 2 == 0){
                    countB++;
                }
            }
        }

        int countC = countA - countB;
        //Множество всех подмножеств данного множество = 2^countC = 2^150

        System.out.println("A: " + countA  +  " B: " + countB);
    }


    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
