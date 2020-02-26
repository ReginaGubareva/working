package com.ifmo;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {

    public static void main(String[] args) {
	    task1();
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
