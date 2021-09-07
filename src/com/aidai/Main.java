package com.aidai;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String kluug ;
        final int NUM =12;
        String world = "a";
        kluug = NUM+world;
        System.out.println(kluug);
        if (NUM<0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM>0){
            System.out.println("Вы соохранили положиительное число");
        }else
            System.out.println("Вы сохранили нуль");

    }
}
