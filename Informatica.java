package com.ifmo;

public class Informatica {

    public static void main(String[] args) {
        task2(17);
//        for(int i = 1; i < 100; i++) {
//            task2(17);
//            System.out.print(i + " ");
//        }
    }

    public static void task2(int N){
        int first = log(N, 2) * 7 - 7;
        int second = log(7*N, 2) - 7;

        System.out.println(first - second);
    }

    static int log(int x, int base)
    {
        return (int) (Math.log(x) / Math.log(base));
    }

    public static void task1(){
        int x = 1000;
        int count = 0;

        for(int i = 0; i < x; i++){
            String sevens = Converter.fromXtoY(String.valueOf(i), 10, 7);
            String fortheen = Converter.fromXtoY(String.valueOf(i), 10, 14);
            if(sevens.length() >= 2 & fortheen.length()>=2){
                if(sevens.charAt(sevens.length()-2) == fortheen.charAt(fortheen.length()-2)) {
                    count++;
                }
            }

        }

        System.out.println(count);
    }
}
