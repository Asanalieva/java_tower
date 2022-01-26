package com.company;

import java.util.Scanner;

public class third_hw {
    public static void main(String[]args){
        //3-1 hw
//        Scanner time = new Scanner(System.in);
//        int hour = time.nextInt();
//        int minutes = time.nextInt();
//        int seconds = time.nextInt();
//        System.out.println((hour*3600)+(minutes*60)+seconds);

        //3-2 hw
        Scanner scanner = new Scanner(System.in);
        int digits = scanner.nextInt();
        int a = digits/100;
        int b = digits/10%10; //to get last 2 digits and % to get second number only
        int c = digits%10;
        System.out.println(a+","+b+","+c); //321==3,2,1

    }
}
